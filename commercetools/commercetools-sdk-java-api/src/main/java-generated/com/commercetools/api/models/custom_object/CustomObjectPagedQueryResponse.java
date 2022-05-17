
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> with <code>results</code> containing an array of <a href="ctp:api:type:CustomObject">CustomObject</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectPagedQueryResponseImpl.class)
public interface CustomObjectPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<CustomObject> {

    /**
    *  <p>Number of <a href="/../api/general-concepts#limit">results requested</a>.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Number of <a href="/../api/general-concepts#offset">elements skipped</a>.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>Actual number of results returned.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
    *  <p>The total number of results matching the query.
    *  This number is an estimation that is not <a href="/../api/general-concepts#strong-consistency">strongly consistent</a>.
    *  This field is returned by default.
    *  For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>.
    *  When the results are filtered with a <a href="/../api/predicates/query">Query Predicate</a>, <code>total</code> is subject to a <a href="/../api/limits#queries">limit</a>.</p>
    */

    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p><a href="ctp:api:type:CustomObject">CustomObjects</a> matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<CustomObject> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final CustomObject... results);

    public void setResults(final List<CustomObject> results);

    public static CustomObjectPagedQueryResponse of() {
        return new CustomObjectPagedQueryResponseImpl();
    }

    public static CustomObjectPagedQueryResponse of(final CustomObjectPagedQueryResponse template) {
        CustomObjectPagedQueryResponseImpl instance = new CustomObjectPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CustomObjectPagedQueryResponseBuilder builder() {
        return CustomObjectPagedQueryResponseBuilder.of();
    }

    public static CustomObjectPagedQueryResponseBuilder builder(final CustomObjectPagedQueryResponse template) {
        return CustomObjectPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCustomObjectPagedQueryResponse(Function<CustomObjectPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectPagedQueryResponse>";
            }
        };
    }
}
