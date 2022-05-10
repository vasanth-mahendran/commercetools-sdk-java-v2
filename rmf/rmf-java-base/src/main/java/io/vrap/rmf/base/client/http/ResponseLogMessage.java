
package io.vrap.rmf.base.client.http;

import java.net.URL;
import java.util.Optional;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.apache.logging.log4j.message.Message;

public class ResponseLogMessage implements Message {
    private final ApiHttpMethod method;
    private final URL uri;
    private final int statusCode;
    private final long executionTime;
    private final String serverTiming;

    private final String correlationId;

    private final Throwable throwable;

    public ResponseLogMessage(ApiHttpRequest request, ApiHttpResponse<?> response, long executionTime) {
        this(request, response, executionTime, null);
    }

    public ResponseLogMessage(ApiHttpRequest request, ApiHttpResponse<?> response, long executionTime,
            Throwable throwable) {
        this.method = request.getMethod();
        this.uri = request.getUrl();
        this.statusCode = response.getStatusCode();
        this.executionTime = executionTime;
        this.serverTiming = Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.SERVER_TIMING))
                .orElse("-");
        this.correlationId = Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID))
                .orElse("-");
        this.throwable = throwable;
    }

    @Override
    public String getFormattedMessage() {
        return String
                .format("%s %s %s %s %s %s", method.name(), uri, statusCode, executionTime, serverTiming, correlationId)
                .trim();
    }

    @Override
    public String getFormat() {
        return getFormattedMessage();
    }

    @Override
    public Object[] getParameters() {
        return new Object[0];
    }

    @Override
    public Throwable getThrowable() {
        return throwable;
    }
}
