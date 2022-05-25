
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypePagedQueryResponse typePagedQueryResponse = TypePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypePagedQueryResponseBuilder implements Builder<TypePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.type.Type> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public TypePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public TypePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public TypePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public TypePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Types matching the query.</p>
     */

    public TypePagedQueryResponseBuilder results(final com.commercetools.api.models.type.Type... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Types matching the query.</p>
     */

    public TypePagedQueryResponseBuilder results(final java.util.List<com.commercetools.api.models.type.Type> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Types matching the query.</p>
     */

    public TypePagedQueryResponseBuilder plusResults(final com.commercetools.api.models.type.Type... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Types matching the query.</p>
     */

    public TypePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.type.TypeBuilder, com.commercetools.api.models.type.TypeBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.type.TypeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Types matching the query.</p>
     */

    public TypePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.type.TypeBuilder, com.commercetools.api.models.type.TypeBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.type.TypeBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.api.models.type.Type> getResults() {
        return this.results;
    }

    public TypePagedQueryResponse build() {
        Objects.requireNonNull(limit, TypePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, TypePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, TypePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, TypePagedQueryResponse.class + ": results is missing");
        return new TypePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds TypePagedQueryResponse without checking for non null required values
     */
    public TypePagedQueryResponse buildUnchecked() {
        return new TypePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static TypePagedQueryResponseBuilder of() {
        return new TypePagedQueryResponseBuilder();
    }

    public static TypePagedQueryResponseBuilder of(final TypePagedQueryResponse template) {
        TypePagedQueryResponseBuilder builder = new TypePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
