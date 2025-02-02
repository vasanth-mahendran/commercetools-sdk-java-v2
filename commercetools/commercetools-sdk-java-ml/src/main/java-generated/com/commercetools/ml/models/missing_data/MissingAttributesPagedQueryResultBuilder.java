
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingAttributesPagedQueryResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingAttributesPagedQueryResult missingAttributesPagedQueryResult = MissingAttributesPagedQueryResult.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .meta(metaBuilder -> metaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingAttributesPagedQueryResultBuilder implements Builder<MissingAttributesPagedQueryResult> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.missing_data.MissingAttributes> results;

    private com.commercetools.ml.models.missing_data.MissingAttributesMeta meta;

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public MissingAttributesPagedQueryResultBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder results(
            final com.commercetools.ml.models.missing_data.MissingAttributes... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder results(
            final java.util.List<com.commercetools.ml.models.missing_data.MissingAttributes> results) {
        this.results = results;
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder plusResults(
            final com.commercetools.ml.models.missing_data.MissingAttributes... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder plusResults(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesBuilder, com.commercetools.ml.models.missing_data.MissingAttributesBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.ml.models.missing_data.MissingAttributesBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder withResults(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesBuilder, com.commercetools.ml.models.missing_data.MissingAttributesBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.ml.models.missing_data.MissingAttributesBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder meta(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesMetaBuilder, com.commercetools.ml.models.missing_data.MissingAttributesMetaBuilder> builder) {
        this.meta = builder.apply(com.commercetools.ml.models.missing_data.MissingAttributesMetaBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MissingAttributesPagedQueryResultBuilder meta(
            final com.commercetools.ml.models.missing_data.MissingAttributesMeta meta) {
        this.meta = meta;
        return this;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.ml.models.missing_data.MissingAttributes> getResults() {
        return this.results;
    }

    public com.commercetools.ml.models.missing_data.MissingAttributesMeta getMeta() {
        return this.meta;
    }

    public MissingAttributesPagedQueryResult build() {
        Objects.requireNonNull(count, MissingAttributesPagedQueryResult.class + ": count is missing");
        Objects.requireNonNull(total, MissingAttributesPagedQueryResult.class + ": total is missing");
        Objects.requireNonNull(offset, MissingAttributesPagedQueryResult.class + ": offset is missing");
        Objects.requireNonNull(results, MissingAttributesPagedQueryResult.class + ": results is missing");
        Objects.requireNonNull(meta, MissingAttributesPagedQueryResult.class + ": meta is missing");
        return new MissingAttributesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    /**
     * builds MissingAttributesPagedQueryResult without checking for non null required values
     */
    public MissingAttributesPagedQueryResult buildUnchecked() {
        return new MissingAttributesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    public static MissingAttributesPagedQueryResultBuilder of() {
        return new MissingAttributesPagedQueryResultBuilder();
    }

    public static MissingAttributesPagedQueryResultBuilder of(final MissingAttributesPagedQueryResult template) {
        MissingAttributesPagedQueryResultBuilder builder = new MissingAttributesPagedQueryResultBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
