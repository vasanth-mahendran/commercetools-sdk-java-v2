package com.commercetools.rxjava;

import com.commercetools.api.client.ProjectApiRoot;
import io.reactivex.rxjava3.core.Single;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

import java.util.function.Function;

public class SingleProjectApiRootImpl implements SingleProjectApiRoot {
    private final ProjectApiRoot apiRoot;

    public SingleProjectApiRootImpl(final ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public <O> Single<ApiHttpResponse<O>> with(Function<ProjectApiRoot, RequestCommand<O>> op) {
        return Single.fromCompletionStage(op.apply(apiRoot).execute());
    }
}
