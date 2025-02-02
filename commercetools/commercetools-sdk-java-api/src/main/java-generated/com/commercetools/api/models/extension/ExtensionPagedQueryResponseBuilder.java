
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionPagedQueryResponse extensionPagedQueryResponse = ExtensionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionPagedQueryResponseBuilder implements Builder<ExtensionPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.extension.Extension> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public ExtensionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public ExtensionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public ExtensionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public ExtensionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Extensions matching the query.</p>
     */

    public ExtensionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.extension.Extension... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Extensions matching the query.</p>
     */

    public ExtensionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.extension.Extension> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Extensions matching the query.</p>
     */

    public ExtensionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.extension.Extension... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Extensions matching the query.</p>
     */

    public ExtensionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.extension.ExtensionBuilder, com.commercetools.api.models.extension.ExtensionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.extension.ExtensionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Extensions matching the query.</p>
     */

    public ExtensionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.extension.ExtensionBuilder, com.commercetools.api.models.extension.ExtensionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.extension.ExtensionBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.extension.Extension> getResults() {
        return this.results;
    }

    public ExtensionPagedQueryResponse build() {
        Objects.requireNonNull(limit, ExtensionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ExtensionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ExtensionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ExtensionPagedQueryResponse.class + ": results is missing");
        return new ExtensionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ExtensionPagedQueryResponse without checking for non null required values
     */
    public ExtensionPagedQueryResponse buildUnchecked() {
        return new ExtensionPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static ExtensionPagedQueryResponseBuilder of() {
        return new ExtensionPagedQueryResponseBuilder();
    }

    public static ExtensionPagedQueryResponseBuilder of(final ExtensionPagedQueryResponse template) {
        ExtensionPagedQueryResponseBuilder builder = new ExtensionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
