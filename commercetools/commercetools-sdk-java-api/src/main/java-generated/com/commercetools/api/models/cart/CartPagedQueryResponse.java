
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartPagedQueryResponse cartPagedQueryResponse = CartPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartPagedQueryResponseImpl.class)
public interface CartPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Cart> {

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
    public List<Cart> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Cart... results);

    public void setResults(final List<Cart> results);

    public static CartPagedQueryResponse of() {
        return new CartPagedQueryResponseImpl();
    }

    public static CartPagedQueryResponse of(final CartPagedQueryResponse template) {
        CartPagedQueryResponseImpl instance = new CartPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CartPagedQueryResponseBuilder builder() {
        return CartPagedQueryResponseBuilder.of();
    }

    public static CartPagedQueryResponseBuilder builder(final CartPagedQueryResponse template) {
        return CartPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCartPagedQueryResponse(Function<CartPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<CartPagedQueryResponse>";
            }
        };
    }
}
