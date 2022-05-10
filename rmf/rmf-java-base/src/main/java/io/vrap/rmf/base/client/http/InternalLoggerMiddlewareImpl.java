
package io.vrap.rmf.base.client.http;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default implementation for the {@link InternalLoggerMiddleware}
 */
class InternalLoggerMiddlewareImpl implements InternalLoggerMiddleware {
    private static final Logger classLogger = LogManager.getLogger(InternalLoggerMiddlewareImpl.class);
    private final InternalLoggerFactory factory;
    private final Level deprecationLogEvent;
    private final Level responseLogEvent;
    private final Level defaultExceptionLogEvent;
    private final Map<Class<? extends Throwable>, Level> exceptionLogEvents;

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory) {
        this(factory, Level.INFO, Level.INFO);
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory,
            final org.slf4j.event.Level responseLogEvent, org.slf4j.event.Level deprecationLogEvent) {
        this(factory, Level.forName(responseLogEvent.name(), responseLogEvent.toInt()),
            Level.forName(deprecationLogEvent.name(), deprecationLogEvent.toInt()), Level.ERROR,
            Collections.singletonMap(ConcurrentModificationException.class, Level.INFO));
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory,
            final org.slf4j.event.Level responseLogEvent, final org.slf4j.event.Level deprecationLogEvent,
            final org.slf4j.event.Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, org.slf4j.event.Level> exceptionLogEvents) {
        this.factory = factory;
        this.responseLogEvent = Level.forName(responseLogEvent.name(), responseLogEvent.toInt());
        this.deprecationLogEvent = Level.forName(deprecationLogEvent.name(), deprecationLogEvent.toInt());
        this.defaultExceptionLogEvent = Level.forName(defaultExceptionLogEvent.name(),
            defaultExceptionLogEvent.toInt());
        this.exceptionLogEvents = exceptionLogEvents.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                    entry -> Level.forName(entry.getValue().toString(), entry.getValue().toInt())));
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            Level deprecationLogEvent) {
        this(factory, responseLogEvent, deprecationLogEvent, Level.ERROR,
            Collections.singletonMap(ConcurrentModificationException.class, Level.INFO));
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        this.factory = factory;
        this.responseLogEvent = responseLogEvent;
        this.deprecationLogEvent = deprecationLogEvent;
        this.defaultExceptionLogEvent = defaultExceptionLogEvent;
        this.exceptionLogEvents = exceptionLogEvents;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        InternalLogger logger = factory.createFor(request, InternalLogger.TOPIC_REQUEST);
        logger.debug(() -> request);
        logger.trace(() -> {
            final String output;
            final String httpMethodAndUrl = request.getMethod().name() + " " + request.getUrl().toString();
            if (request.getBody() != null) {
                final String unformattedBody = request.getSecuredBody();
                final boolean isJsonRequest = request.getHeaders()
                        .getHeaders(ApiHttpHeaders.CONTENT_TYPE)
                        .stream()
                        .findFirst()
                        .map(ct -> ct.getValue().toLowerCase().contains("json"))
                        .orElse(true);
                if (isJsonRequest) {
                    String prettyPrint;
                    try {

                        prettyPrint = JsonUtils.prettyPrint(unformattedBody);
                    }
                    catch (final JsonException e) {
                        classLogger.warn("pretty print failed", e);
                        prettyPrint = unformattedBody;
                    }
                    output = "send: " + httpMethodAndUrl + "\nformatted: " + prettyPrint;
                }
                else {
                    output = "send: " + request.getMethod().name() + " " + request.getUrl() + " " + unformattedBody;
                }
            }
            else {
                output = httpMethodAndUrl + " <no body>";
            }
            return output;
        });
        final long startTime = System.currentTimeMillis();
        return next.apply(request).whenComplete((response, throwable) -> {
            final long executionTime = System.currentTimeMillis() - startTime;
            InternalLogger responseLogger = factory.createFor(request, InternalLogger.TOPIC_RESPONSE);
            if (throwable != null) {
                if (throwable.getCause() instanceof ApiHttpException) {
                    final ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException) throwable.getCause())
                            .getResponse();
                    final Level level = Optional.ofNullable(exceptionLogEvents.get(throwable.getCause().getClass()))
                            .orElse(defaultExceptionLogEvent);
                    responseLogger.log(level, new ResponseLogMessage(request, errorResponse, executionTime));
                    Optional.ofNullable(response.getHeaders().getHeaders(ApiHttpHeaders.X_DEPRECATION_NOTICE))
                            .ifPresent(notices -> notices.forEach(
                                message -> logger.log(deprecationLogEvent, () -> "Deprecation notice: " + message)));
                    responseLogger.debug(() -> errorResponse, throwable);
                    responseLogger.trace(() -> errorResponse.getStatusCode() + "\n"
                            + Optional.ofNullable(errorResponse.getBody())
                                    .map(body -> JsonUtils.prettyPrint(errorResponse.getBodyAsString().orElse("")))
                                    .orElse("<no body>"));
                }
                else {
                    final Level level = Optional.ofNullable(exceptionLogEvents.get(throwable.getCause().getClass()))
                            .orElse(defaultExceptionLogEvent);
                    responseLogger.log(level, throwable::getCause, throwable);
                }
            }
            else {
                responseLogger.log(responseLogEvent, () -> new ResponseLogMessage(request, response, executionTime));
                Optional.ofNullable(response.getHeaders().getHeaders(ApiHttpHeaders.X_DEPRECATION_NOTICE))
                        .ifPresent(notices -> notices.forEach(
                            message -> logger.log(deprecationLogEvent, () -> "Deprecation notice: " + message)));

                responseLogger.debug(() -> response);
                responseLogger.trace(() -> response.getStatusCode() + "\n"
                        + Optional.ofNullable(response.getBody())
                                .map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse("")))
                                .orElse("<no body>"));
            }
        });
    }
}
