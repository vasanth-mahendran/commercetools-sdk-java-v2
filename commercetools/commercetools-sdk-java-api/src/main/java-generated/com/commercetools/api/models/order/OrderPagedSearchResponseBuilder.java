
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPagedSearchResponseBuilder
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
public class OrderPagedSearchResponseBuilder implements Builder<OrderPagedSearchResponse> {

    private Long total;

    @Nullable
    private Long offset;

    @Nullable
    private Long limit;

    private java.util.List<com.commercetools.api.models.order.Hit> hits;

    /**
     *  <p>Total number of results matching the query.</p>
     */

    public OrderPagedSearchResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public OrderPagedSearchResponseBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Number of results requested.</p>
     */

    public OrderPagedSearchResponseBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual results.</p>
     */

    public OrderPagedSearchResponseBuilder hits(final com.commercetools.api.models.order.Hit... hits) {
        this.hits = new ArrayList<>(Arrays.asList(hits));
        return this;
    }

    /**
     *  <p>Actual results.</p>
     */

    public OrderPagedSearchResponseBuilder hits(final java.util.List<com.commercetools.api.models.order.Hit> hits) {
        this.hits = hits;
        return this;
    }

    /**
     *  <p>Actual results.</p>
     */

    public OrderPagedSearchResponseBuilder plusHits(final com.commercetools.api.models.order.Hit... hits) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.addAll(Arrays.asList(hits));
        return this;
    }

    /**
     *  <p>Actual results.</p>
     */

    public OrderPagedSearchResponseBuilder plusHits(
            Function<com.commercetools.api.models.order.HitBuilder, com.commercetools.api.models.order.HitBuilder> builder) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.add(builder.apply(com.commercetools.api.models.order.HitBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Actual results.</p>
     */

    public OrderPagedSearchResponseBuilder withHits(
            Function<com.commercetools.api.models.order.HitBuilder, com.commercetools.api.models.order.HitBuilder> builder) {
        this.hits = new ArrayList<>();
        this.hits.add(builder.apply(com.commercetools.api.models.order.HitBuilder.of()).build());
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    public java.util.List<com.commercetools.api.models.order.Hit> getHits() {
        return this.hits;
    }

    public OrderPagedSearchResponse build() {
        Objects.requireNonNull(total, OrderPagedSearchResponse.class + ": total is missing");
        Objects.requireNonNull(hits, OrderPagedSearchResponse.class + ": hits is missing");
        return new OrderPagedSearchResponseImpl(total, offset, limit, hits);
    }

    /**
     * builds OrderPagedSearchResponse without checking for non null required values
     */
    public OrderPagedSearchResponse buildUnchecked() {
        return new OrderPagedSearchResponseImpl(total, offset, limit, hits);
    }

    public static OrderPagedSearchResponseBuilder of() {
        return new OrderPagedSearchResponseBuilder();
    }

    public static OrderPagedSearchResponseBuilder of(final OrderPagedSearchResponse template) {
        OrderPagedSearchResponseBuilder builder = new OrderPagedSearchResponseBuilder();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.limit = template.getLimit();
        builder.hits = template.getHits();
        return builder;
    }

}
