/* (C)2021 */
package com.commercetools;

import com.apollographql.apollo.api.Response;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.example.ProductIdQuery;
import com.example.WMutation;
import java.util.concurrent.ExecutionException;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.commercetools.GraphQLRequestUtils.*;
public class TestQuery {
    @Test
    public void t() throws ExecutionException, InterruptedException {
        final ByProjectKeyRequestBuilder projectRoot = CommercetoolsTestUtils.getProjectRoot();

        final ProductIdQuery query = ProductIdQuery.builder().build();

        Response<ProductIdQuery.Data> response = projectRoot.graphql().post(ofQuery(query)).send()
                .thenApply(apiHttpResponse -> map(apiHttpResponse, query)).get();

        final String id = response.getData().products().results().stream().findFirst().get().id();

        Assertions.assertThat(id).isNotNull();

        final WMutation m = WMutation.builder().build();
        ofMutation(m);


    }
}
