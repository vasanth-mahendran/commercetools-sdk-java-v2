
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchRequest orderSearchRequest = OrderSearchRequest.builder()
 *             .query(queryBuilder -> queryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchRequestBuilder implements Builder<OrderSearchRequest> {

    private com.commercetools.api.models.order.OrderSearchQuery query;

    @Nullable
    private List<Sort> sort;

    @Nullable
    private Integer limit;

    @Nullable
    private Integer offset;

    /**
     *  <p>The Order search query.</p>
     */

    public OrderSearchRequestBuilder query(
            Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        this.query = builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Order search query.</p>
     */

    public OrderSearchRequestBuilder query(final com.commercetools.api.models.order.OrderSearchQuery query) {
        this.query = query;
        return this;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     */

    public OrderSearchRequestBuilder sort(@Nullable final List<Sort> sort) {
        this.sort = sort;
        return this;
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     */

    public OrderSearchRequestBuilder limit(@Nullable final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     */

    public OrderSearchRequestBuilder offset(@Nullable final Integer offset) {
        this.offset = offset;
        return this;
    }

    public com.commercetools.api.models.order.OrderSearchQuery getQuery() {
        return this.query;
    }

    @Nullable
    public List<Sort> getSort() {
        return this.sort;
    }

    @Nullable
    public Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    public OrderSearchRequestBuilder plusSort(Sort sort){
        if(this.sort==null)
            this.sort = new ArrayList<>();
        this.sort.add(sort);
        return this;
    }

    public OrderSearchRequest build() {
        Objects.requireNonNull(query, OrderSearchRequest.class + ": query is missing");
        return new OrderSearchRequestImpl(query, sort, limit, offset);
    }

    /**
     * builds OrderSearchRequest without checking for non null required values
     */
    public OrderSearchRequest buildUnchecked() {
        return new OrderSearchRequestImpl(query, sort, limit, offset);
    }

    public static OrderSearchRequestBuilder of() {
        return new OrderSearchRequestBuilder();
    }

    public static OrderSearchRequestBuilder of(final OrderSearchRequest template) {
        OrderSearchRequestBuilder builder = new OrderSearchRequestBuilder();
        builder.query = template.getQuery();
        builder.sort = template.getSort();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        return builder;
    }

}
