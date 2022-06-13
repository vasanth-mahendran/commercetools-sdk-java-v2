package com.commercetools.rxjava;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import io.reactivex.rxjava3.core.Single;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ClientRequestCommand;

public interface SingleApiHttpClient {
    public static SingleApiHttpClient of(final ApiHttpClient apiHttpClient) {
        return new SingleApiHttpClientImpl(apiHttpClient);
    }

    public <O> Single<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final Class<O> outputType);

    public <O> Single<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final TypeReference<O> outputType);

    public <O> Single<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final JavaType outputType);

    public <O> Single<ApiHttpResponse<O>> execute(final ClientRequestCommand<O> method);
}
