package com.commercetools.rxjava;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import io.reactivex.rxjava3.core.Single;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ClientRequestCommand;

public class SingleApiHttpClientImpl implements SingleApiHttpClient {
    private final ApiHttpClient apiHttpClient;

    public SingleApiHttpClientImpl(final ApiHttpClient apiHttpClient) {
        this.apiHttpClient = apiHttpClient;
    }

    @Override
    public <O> Single<ApiHttpResponse<O>> execute(ApiHttpRequest request, Class<O> outputType) {
        return Single.fromCompletionStage(apiHttpClient.execute(request, outputType));
    }

    @Override
    public <O> Single<ApiHttpResponse<O>> execute(ApiHttpRequest request, TypeReference<O> outputType) {
        return Single.fromCompletionStage(apiHttpClient.execute(request, outputType));
    }

    @Override
    public <O> Single<ApiHttpResponse<O>> execute(ApiHttpRequest request, JavaType outputType) {
        return Single.fromCompletionStage(apiHttpClient.execute(request, outputType));
    }

    @Override
    public <O> Single<ApiHttpResponse<O>> execute(ClientRequestCommand<O> method) {
        return Single.fromCompletionStage(apiHttpClient.execute(method));
    }
}
