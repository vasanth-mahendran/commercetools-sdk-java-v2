
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPagedQueryResponse orderPagedQueryResponse = OrderPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPagedQueryResponseImpl.class)
public interface OrderPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Order> {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Order> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Order... results);

    public void setResults(final List<Order> results);

    public static OrderPagedQueryResponse of() {
        return new OrderPagedQueryResponseImpl();
    }

    public static OrderPagedQueryResponse of(final OrderPagedQueryResponse template) {
        OrderPagedQueryResponseImpl instance = new OrderPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static OrderPagedQueryResponseBuilder builder() {
        return OrderPagedQueryResponseBuilder.of();
    }

    public static OrderPagedQueryResponseBuilder builder(final OrderPagedQueryResponse template) {
        return OrderPagedQueryResponseBuilder.of(template);
    }

    default <T> T withOrderPagedQueryResponse(Function<OrderPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPagedQueryResponse>";
            }
        };
    }
}
