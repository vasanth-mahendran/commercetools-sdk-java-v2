
package com.commercetools.sdk.examples.spring.service;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.newrelic.api.agent.*;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class CtpClientBeanService {

    @Value(value = "${ctp.client.id}")
    private String clientId;

    @Value(value = "${ctp.client.secret}")
    private String clientSecret;

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    private ClientCredentials credentials() {
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ApiHttpClient client() {
        return ApiRootBuilder.of().defaultClient(credentials()).buildClient();
    }

    public static class NewRelicMiddleware implements Middleware {

        @Trace(dispatcher = true)
        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
                Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
            if (request.getContext() instanceof Token) {
                ((Token) request.getContext()).link();
            }
            Segment segment = NewRelic.getAgent().getTransaction().startSegment("commercetools");
            List<String> pathInfo = Arrays.stream(request.getUri().getPath().replaceFirst("/", "").split("/"))
                    .collect(Collectors.toList());
            String projectKey = pathInfo.size() > 0 ? pathInfo.get(0) : "-";
            String domainEndpoint = pathInfo.size() > 1 ? pathInfo.get(1) : "-";
            String op = "-";
            switch (pathInfo.size()) {
                case 2:
                    if (request.getMethod() == ApiHttpMethod.GET) {
                        op = "query";
                    }
                    else if (request.getMethod() == ApiHttpMethod.POST) {
                        op = "create";
                    }
                    break;
                case 3:
                    if (pathInfo.get(1).equals("me")) {
                        if (request.getMethod() == ApiHttpMethod.GET) {
                            op = "get";
                        }
                        else if (request.getMethod() == ApiHttpMethod.POST) {
                            op = "create";
                        }
                    }
                    else if (request.getMethod() == ApiHttpMethod.GET) {
                        op = "get";
                    }
                    else if (request.getMethod() == ApiHttpMethod.POST) {
                        op = "update";
                    }
                    else if (request.getMethod() == ApiHttpMethod.DELETE) {
                        op = "delete";
                    }
                    break;
                case 4:
                    if (pathInfo.get(1).equals("me")) {
                        if (request.getMethod() == ApiHttpMethod.GET) {
                            op = "get";
                        }
                        else if (request.getMethod() == ApiHttpMethod.POST) {
                            op = "update";
                        }
                        else if (request.getMethod() == ApiHttpMethod.DELETE) {
                            op = "delete";
                        }
                    }
                    break;
            }
            final String operation = op;
            segment.addCustomAttribute("projectKey", projectKey);
            segment.addCustomAttribute("domainEndpoint", domainEndpoint);
            segment.addCustomAttribute("domainOperation", operation);

            return next.apply(request).whenComplete((response, throwable) -> {
                if (throwable != null) {
                    if (throwable.getCause() instanceof ApiHttpException) {
                        final ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException) throwable.getCause())
                                .getResponse();

                        final ExternalParameters p = HttpParameters.library("commercetools")
                                .uri(request.getUri())
                                .procedure(request.getMethod().name())
                                .noInboundHeaders()
                                .status(errorResponse.getStatusCode(), errorResponse.getMessage())
                                .build();
                        segment.addCustomAttribute("serverTiming",
                            Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.SERVER_TIMING))
                                    .orElse("-"));
                        segment.addCustomAttribute("correlationId",
                            Optional.ofNullable(errorResponse.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID))
                                    .orElse("-"));
                        segment.reportAsExternal(p);
                        segment.endAsync();
                    }
                    return;
                }

                final ExternalParameters p = HttpParameters.library("commercetools")
                        .uri(request.getUri())
                        .procedure(request.getMethod().name())
                        .noInboundHeaders()
                        .status(response.getStatusCode(), response.getMessage())
                        .build();
                segment.addCustomAttribute("serverTiming",
                    Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.SERVER_TIMING)).orElse("-"));
                segment.addCustomAttribute("correlationId",
                    Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID)).orElse("-"));
                segment.reportAsExternal(p);
                segment.endAsync();
            });
        }
    }

    @Bean
    @Autowired
    public ProjectApiRoot apiRoot(ApiHttpClient client) {

        final ProjectApiRoot apiRoot = ApiRootBuilder.of(client)
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withMiddleware(new NewRelicMiddleware())
                .build(projectKey);

        return apiRoot;
    }
}
