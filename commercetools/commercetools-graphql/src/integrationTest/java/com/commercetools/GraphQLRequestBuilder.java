/* (C)2021 */
package com.commercetools;

import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.commercetools.api.models.graph_ql.GraphQLRequest;

public interface GraphQLRequestBuilder {

    public static <D extends Operation.Data, T, V extends Operation.Variables> GraphQLRequest of(
            Query<D, T, V> query) {
        GraphQLRequest request = GraphQLRequest.of();
        request.setQuery(query.queryDocument());
        request.setOperationName(query.name().name());
//        request.setVariables(query.variables().valueMap());
        return request;
    }

    public static <D extends Operation.Data, T, V extends Operation.Variables> GraphQLRequest of(
            Mutation<D, T, V> mutation) {
        GraphQLRequest request = GraphQLRequest.of();
        request.setQuery(mutation.queryDocument());
        request.setOperationName(mutation.name().name());
//        request.setVariables(mutation.variables().valueMap());
        return request;
    }
}
