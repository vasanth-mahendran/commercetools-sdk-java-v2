package com.commercetools.graphql;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import java.util.concurrent.ExecutionException;

import com.commercetools.graphql.client.ProductProjectionRoot;
import org.assertj.core.api.Assertions;
import org.junit.Test;

//import static com.commercetools.GraphQLRequestUtils.*;
public class TestQuery {
    @Test
    public void t() throws ExecutionException, InterruptedException {
        final ByProjectKeyRequestBuilder projectRoot = CommercetoolsTestUtils.getProjectRoot();

        final ProductProjectionRoot query = new ProductProjectionRoot()
                .id()
                .key()
                .productType()
                    .key().getRoot()
                .state().key().root();

        final String s = query.toString();

        Assertions.assertThat(s).isNotEmpty();
    }
}
