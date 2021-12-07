
package com.commercetools.http.javahttp;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.AutoCloseInputStream;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

public class CtJavaHttpClient implements VrapHttpClient, AutoCloseable {
    private final HttpClient javaHttpClient;

    private final Supplier<HttpClient.Builder> clientBuilder = HttpClient::newBuilder;

    public CtJavaHttpClient() {
        javaHttpClient = clientBuilder.get().build();
    }

    public CtJavaHttpClient(final BuilderOptions options) {
        javaHttpClient = options.plus(clientBuilder.get()).build();
    }

    public CtJavaHttpClient(final Supplier<HttpClient.Builder> builderSupplier) {
        javaHttpClient = builderSupplier.get().build();
    }

    private HttpRequest toApacheRequest(final ApiHttpRequest httpRequest) {
        final HttpRequest.Builder builder = HttpRequest.newBuilder();

        final String method = httpRequest.getMethod().toString();
        builder.uri(httpRequest.getUri());
        httpRequest.getHeaders().getHeaders().forEach((entry) -> builder.header(entry.getKey(), entry.getValue()));

        if (httpRequest.getBody() != null) {
            builder.method(method, HttpRequest.BodyPublishers.ofByteArray(httpRequest.getBody()));
        } else {
            builder.method(method, HttpRequest.BodyPublishers.noBody());
        }
        return builder.build();
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        return javaHttpClient.sendAsync(toApacheRequest(request), HttpResponse.BodyHandlers.ofByteArray())
                .thenApply(CtJavaHttpClient::toResponse);
    }

    private static ApiHttpResponse<byte[]> toResponse(final HttpResponse<byte[]> response) {

        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(response.headers().map().entrySet()
                .stream()
                .flatMap(
                    e -> e.getValue().stream().map(value -> ApiHttpHeaders.headerEntry(e.getKey(), value)))
                .collect(Collectors.toList()));

        final byte[] bodyNullable = Optional.ofNullable(response.body()).map((entity) -> {
            try {
                final boolean gzipEncoded = response.headers().firstValue(ApiHttpHeaders.CONTENT_ENCODING)
                        .map(v -> v.equalsIgnoreCase("gzip"))
                        .orElse(false);
                final InputStream body = new ByteArrayInputStream(entity);
                final InputStream content = gzipEncoded ? new GZIPInputStream(body) : body;
                final AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(content);
                return IOUtils.toByteArray(autoCloseInputStream);
            }
            catch (final IOException e) {
                throw new HttpException(e);
            }
        }).orElse(null);

        return new ApiHttpResponse<>(response.statusCode(), apiHttpHeaders, bodyNullable);
    }

    @Override
    public void close() throws Exception {
    }
}
