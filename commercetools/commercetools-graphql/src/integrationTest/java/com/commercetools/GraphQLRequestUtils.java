/* (C)2021 */
package com.commercetools;

import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Response;
import com.commercetools.api.models.graph_ql.GraphQLRequest;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import io.vrap.rmf.base.client.ApiHttpResponse;
import okio.ByteString;

import java.io.IOException;

public interface GraphQLRequestUtils {

    public static <D extends Operation.Data, T, V extends Operation.Variables> GraphQLRequest ofQuery(
            Query<D, T, V> query) {
        GraphQLRequest request = GraphQLRequest.of();
        request.setQuery(query.queryDocument());
        request.setOperationName(query.name().name());
        request.setVariables(GraphQLVariablesMap.builder().values(query.variables().valueMap()).build());
        return request;
    }

    public static <D extends Operation.Data, T, V extends Operation.Variables> GraphQLRequest ofMutation(
            Mutation<D, T, V> mutation) {
        GraphQLRequest request = GraphQLRequest.of();
        request.setQuery(mutation.queryDocument());
        request.setOperationName(mutation.name().name());
        request.setVariables(GraphQLVariablesMap.builder().values(mutation.variables().valueMap()).build());
        return request;
    }

    public static <D extends Operation.Data, T, V extends Operation.Variables> Response<T> map(ApiHttpResponse<byte[]> response, Query<D,T,V> query)
    {
        try {
            return query.parse(ByteString.of(response.getBody()));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
