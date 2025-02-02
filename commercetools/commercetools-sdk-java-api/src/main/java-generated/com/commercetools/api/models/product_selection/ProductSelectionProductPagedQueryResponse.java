
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult containing an array of AssignedProductReference.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductPagedQueryResponse productSelectionProductPagedQueryResponse = ProductSelectionProductPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductPagedQueryResponseImpl.class)
public interface ProductSelectionProductPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<AssignedProductReference> {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<AssignedProductReference> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final AssignedProductReference... results);

    public void setResults(final List<AssignedProductReference> results);

    public static ProductSelectionProductPagedQueryResponse of() {
        return new ProductSelectionProductPagedQueryResponseImpl();
    }

    public static ProductSelectionProductPagedQueryResponse of(
            final ProductSelectionProductPagedQueryResponse template) {
        ProductSelectionProductPagedQueryResponseImpl instance = new ProductSelectionProductPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductSelectionProductPagedQueryResponseBuilder builder() {
        return ProductSelectionProductPagedQueryResponseBuilder.of();
    }

    public static ProductSelectionProductPagedQueryResponseBuilder builder(
            final ProductSelectionProductPagedQueryResponse template) {
        return ProductSelectionProductPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductSelectionProductPagedQueryResponse(
            Function<ProductSelectionProductPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductPagedQueryResponse>";
            }
        };
    }
}
