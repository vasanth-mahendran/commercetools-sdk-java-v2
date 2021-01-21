/* (C)2021 */
package com.commercetools;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.example.ProdQuery;
import com.example.ProductIdQuery;
import com.example.TMutation;
import com.example.WMutation;
import io.vrap.rmf.base.client.utils.Utils;
import java.io.IOException;
import okio.ByteString;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestQuery {
    @Test
    public void t() throws IOException {
        final ByProjectKeyRequestBuilder projectRoot = CommercetoolsTestUtils.getProjectRoot();

        final ProductIdQuery query = ProductIdQuery.builder().build();

        final WMutation m = WMutation.builder().build();

        final ProdQuery t;
        final TMutation u;
        GraphQLRequestBuilder.of(m);

        final ByteString byteString = query.composeRequestBody();

        byteString.toByteArray();

        ApolloClient.builder().build();

        byte[] body = projectRoot.graphql().post(GraphQLRequestBuilder.of(query)).sendBlocking().getBody();

        String b = Utils.bytesToUTF8String(body);
        final Response<ProductIdQuery.Data> response = query.parse(ByteString.of(body));

        final String id = response.getData().products().results().stream().findFirst().get().id();

        Assertions.assertThat(id).isNotNull();
    }
}
