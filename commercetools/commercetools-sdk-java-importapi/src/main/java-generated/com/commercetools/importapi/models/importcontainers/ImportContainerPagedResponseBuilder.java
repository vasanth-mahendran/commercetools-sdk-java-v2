
package com.commercetools.importapi.models.importcontainers;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerPagedResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerPagedResponse importContainerPagedResponse = ImportContainerPagedResponse.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .total(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerPagedResponseBuilder implements Builder<ImportContainerPagedResponse> {

    private Integer limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.importapi.models.importcontainers.ImportContainer> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public ImportContainerPagedResponseBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public ImportContainerPagedResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>The actual number of results returned.</p>
     */

    public ImportContainerPagedResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>The total number of results matching the query.</p>
     */

    public ImportContainerPagedResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>The array of Import Containers matching the query.</p>
     */

    public ImportContainerPagedResponseBuilder results(
            final com.commercetools.importapi.models.importcontainers.ImportContainer... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>The array of Import Containers matching the query.</p>
     */

    public ImportContainerPagedResponseBuilder results(
            final java.util.List<com.commercetools.importapi.models.importcontainers.ImportContainer> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>The array of Import Containers matching the query.</p>
     */

    public ImportContainerPagedResponseBuilder plusResults(
            final com.commercetools.importapi.models.importcontainers.ImportContainer... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>The array of Import Containers matching the query.</p>
     */

    public ImportContainerPagedResponseBuilder plusResults(
            Function<com.commercetools.importapi.models.importcontainers.ImportContainerBuilder, com.commercetools.importapi.models.importcontainers.ImportContainerBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importcontainers.ImportContainerBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The array of Import Containers matching the query.</p>
     */

    public ImportContainerPagedResponseBuilder withResults(
            Function<com.commercetools.importapi.models.importcontainers.ImportContainerBuilder, com.commercetools.importapi.models.importcontainers.ImportContainerBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(
            builder.apply(com.commercetools.importapi.models.importcontainers.ImportContainerBuilder.of()).build());
        return this;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.importapi.models.importcontainers.ImportContainer> getResults() {
        return this.results;
    }

    public ImportContainerPagedResponse build() {
        Objects.requireNonNull(limit, ImportContainerPagedResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ImportContainerPagedResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ImportContainerPagedResponse.class + ": count is missing");
        Objects.requireNonNull(total, ImportContainerPagedResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImportContainerPagedResponse.class + ": results is missing");
        return new ImportContainerPagedResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ImportContainerPagedResponse without checking for non null required values
     */
    public ImportContainerPagedResponse buildUnchecked() {
        return new ImportContainerPagedResponseImpl(limit, offset, count, total, results);
    }

    public static ImportContainerPagedResponseBuilder of() {
        return new ImportContainerPagedResponseBuilder();
    }

    public static ImportContainerPagedResponseBuilder of(final ImportContainerPagedResponse template) {
        ImportContainerPagedResponseBuilder builder = new ImportContainerPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
