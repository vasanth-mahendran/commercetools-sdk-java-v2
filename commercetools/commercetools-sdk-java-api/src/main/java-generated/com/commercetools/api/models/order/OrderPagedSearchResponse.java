
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
 * OrderPagedSearchResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPagedSearchResponse orderPagedSearchResponse = OrderPagedSearchResponse.builder()
 *             .total(0.3)
 *             .plusHits(hitsBuilder -> hitsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPagedSearchResponseImpl.class)
public interface OrderPagedSearchResponse {

    /**
     *  <p>Total number of results matching the query.</p>
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     */

    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Number of results requested.</p>
     */

    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Actual results.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("hits")
    public List<Hit> getHits();

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    public void setLimit(final Long limit);

    @JsonIgnore
    public void setHits(final Hit... hits);

    public void setHits(final List<Hit> hits);

    public static OrderPagedSearchResponse of() {
        return new OrderPagedSearchResponseImpl();
    }

    public static OrderPagedSearchResponse of(final OrderPagedSearchResponse template) {
        OrderPagedSearchResponseImpl instance = new OrderPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setLimit(template.getLimit());
        instance.setHits(template.getHits());
        return instance;
    }

    public static OrderPagedSearchResponseBuilder builder() {
        return OrderPagedSearchResponseBuilder.of();
    }

    public static OrderPagedSearchResponseBuilder builder(final OrderPagedSearchResponse template) {
        return OrderPagedSearchResponseBuilder.of(template);
    }

    default <T> T withOrderPagedSearchResponse(Function<OrderPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPagedSearchResponse>";
            }
        };
    }
}
