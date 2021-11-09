
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.oauth2.ErrorResponse;
import net.jodah.failsafe.*;
import net.jodah.failsafe.event.ExecutionAttemptedEvent;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.UnauthorizedException;
import io.vrap.rmf.base.client.oauth2.AuthException;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

/**
 * Default implementation for the {@link OAuthMiddleware} with automatic retry upon expired access
 */
class OAuthMiddlewareImpl implements AutoCloseable, OAuthMiddleware {
    private final OAuthHandler authHandler;
    private static final InternalLogger logger = InternalLogger.getLogger(TokenSupplier.LOGGER_AUTH);
    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    public OAuthMiddlewareImpl(final OAuthHandler oAuthHandler) {
        this(oAuthHandler, 1, false);
    }

    public OAuthMiddlewareImpl(final OAuthHandler oauthHandler, final int maxRetries, final boolean useCircuitBreaker) {
        this.authHandler = oauthHandler;

        RetryPolicy<ApiHttpResponse<byte[]>> retry = new RetryPolicy<ApiHttpResponse<byte[]>>()
                .handleIf((response, throwable) -> {
                    if (throwable != null) {
                        return throwable instanceof UnauthorizedException;
                    }
                    return response.getStatusCode() == 401;
                })
                .onRetry(event -> {
                    logger.debug(() -> "Refresh Bearer token #" + event.getAttemptCount());
                    authHandler.refreshToken();
                })
                .withMaxRetries(maxRetries);
        if (useCircuitBreaker) {
            final Fallback<ApiHttpResponse<byte[]>> fallback = Fallback
                    .ofException((ExecutionAttemptedEvent<? extends ApiHttpResponse<byte[]>> event) -> {
                        logger.debug(() -> "Convert CircuitBreakerOpenException to AuthException");
                        logger.trace(event::getLastFailure);
                        return new AuthException(400, "", null, "Project suspended", null, event.getLastFailure());
                    })
                    .handleIf(throwable -> throwable instanceof CircuitBreakerOpenException);

            final CircuitBreaker<ApiHttpResponse<byte[]>> circuitBreaker = new CircuitBreaker<ApiHttpResponse<byte[]>>();
            circuitBreaker.handleIf((response, throwable) -> {
                final Throwable cause = throwable.getCause();
                if (cause instanceof AuthException &&  ((AuthException) cause).getResponse().getStatusCode() == 400) {
                    final ApiHttpResponse<ErrorResponse> errorResponse = ResponseSerializer.of()
                            .convertResponse(((AuthException) cause).getResponse(), ErrorResponse.class);
                    return errorResponse.getBody().getErrorDescription().endsWith("suspended");
                }
                if (response.getStatusCode() == 400) {
                    final ApiHttpResponse<ErrorResponse> errorResponse = ResponseSerializer.of()
                            .convertResponse(response, ErrorResponse.class);
                    return errorResponse.getBody().getErrorDescription().endsWith("suspended");
                }
                return false;
            })
                    .withDelay((result, failure, context) -> Duration
                            .ofMillis(Math.min(100 * context.getAttemptCount() * context.getAttemptCount(), 15000)))
                    .withFailureThreshold(5, Duration.ofMinutes(1))
                    .withSuccessThreshold(2)
                    .onClose(() -> logger.debug(() -> "The authentication circuit breaker was closed"))
                    .onOpen(() -> logger.debug(() -> "The authentication circuit breaker was opened"))
                    .onHalfOpen(() -> logger.debug(() -> "The authentication circuit breaker was half-opened"))
                    .onFailure(event -> logger.trace(() -> "Authentication failed", event.getFailure()));
            this.failsafeExecutor = Failsafe.with(fallback, retry, circuitBreaker);
        }
        else {
            this.failsafeExecutor = Failsafe.with(retry);
        }
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> {
            AuthenticationToken token = authHandler.getToken();
            return next.apply(request.addHeader(ApiHttpHeaders.AUTHORIZATION, OAuthHandler.authHeader(token)));
        });
    }

    @Override
    public void close() {
        authHandler.close();
    }
}
