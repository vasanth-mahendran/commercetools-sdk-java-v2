
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPagedQueryResponse productPagedQueryResponse = ProductPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPagedQueryResponseBuilder implements Builder<ProductPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.product.Product> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public ProductPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public ProductPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder results(final com.commercetools.api.models.product.Product... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.product.Product> results) {
        this.results = results;
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.product.Product... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.product.Product> getResults() {
        return this.results;
    }

    public ProductPagedQueryResponse build() {
        Objects.requireNonNull(limit, ProductPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ProductPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ProductPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProductPagedQueryResponse.class + ": results is missing");
        return new ProductPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ProductPagedQueryResponse without checking for non null required values
     */
    public ProductPagedQueryResponse buildUnchecked() {
        return new ProductPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ProductPagedQueryResponseBuilder of() {
        return new ProductPagedQueryResponseBuilder();
    }

    public static ProductPagedQueryResponseBuilder of(final ProductPagedQueryResponse template) {
        ProductPagedQueryResponseBuilder builder = new ProductPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
