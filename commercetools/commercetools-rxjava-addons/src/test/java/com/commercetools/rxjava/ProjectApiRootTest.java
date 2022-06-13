package com.commercetools.rxjava;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.CartPagedQueryResponse;
import io.reactivex.rxjava3.core.Single;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.junit.jupiter.api.Test;

public class ProjectApiRootTest {
    @Test
    public void usage() {
        final ProjectApiRoot t = ProjectApiRoot.of("t");
        final Single<ApiHttpResponse<CartPagedQueryResponse>> result = SingleProjectApiRoot.of(t)
                .with(apiRoot -> apiRoot.carts().get());
    }
}
