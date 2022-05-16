
package com.commercetools.sdk.examples.spring.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;
import com.newrelic.api.agent.*;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@Component
public class ProductsRepository {
    private final ProjectApiRoot apiRoot;
    public ProductsRepository(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public Mono<List<ProductProjection>> products() {
        Token t = NewRelic.getAgent().getTransaction().getToken();
        final CompletableFuture<List<ProductProjection>> products = apiRoot.productProjections()
                .search()
                .get()
                .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                .execute()
                .thenApply(ApiHttpResponse::getBody)
                .thenApply(ProductProjectionPagedSearchResponse::getResults);
        return Mono.fromFuture(products).doAfterTerminate(t::expire);
    }

}
