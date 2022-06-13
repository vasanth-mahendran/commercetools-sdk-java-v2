package com.commercetools.rxjava;

import com.commercetools.api.client.ProjectApiRoot;
import io.reactivex.rxjava3.core.Single;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.RequestCommand;

import java.util.function.Function;

public interface SingleProjectApiRoot {
    public static SingleProjectApiRoot of(ProjectApiRoot apiRoot) {
        return new SingleProjectApiRootImpl(apiRoot);
    }

    public <O> Single<ApiHttpResponse<O>> with(Function<ProjectApiRoot, RequestCommand<O>> op);
}
