
package com.commercetools.ml.models.general_category_recommendations;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralCategoryRecommendationPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralCategoryRecommendationPagedQueryResponse generalCategoryRecommendationPagedQueryResponse = GeneralCategoryRecommendationPagedQueryResponse.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeneralCategoryRecommendationPagedQueryResponseBuilder
        implements Builder<GeneralCategoryRecommendationPagedQueryResponse> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> results;

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder results(
            final com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> results) {
        this.results = results;
        return this;
    }

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder plusResults(
            final com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder
                .apply(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder
                        .of())
                .build());
        return this;
    }

    /**
     *
     */

    public GeneralCategoryRecommendationPagedQueryResponseBuilder withResults(
            Function<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder, com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder
                .apply(com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationBuilder
                        .of())
                .build());
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

    public java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> getResults() {
        return this.results;
    }

    public GeneralCategoryRecommendationPagedQueryResponse build() {
        Objects.requireNonNull(count, GeneralCategoryRecommendationPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(total, GeneralCategoryRecommendationPagedQueryResponse.class + ": total is missing");
        Objects.requireNonNull(offset, GeneralCategoryRecommendationPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, GeneralCategoryRecommendationPagedQueryResponse.class + ": results is missing");
        return new GeneralCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results);
    }

    /**
     * builds GeneralCategoryRecommendationPagedQueryResponse without checking for non null required values
     */
    public GeneralCategoryRecommendationPagedQueryResponse buildUnchecked() {
        return new GeneralCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results);
    }

    public static GeneralCategoryRecommendationPagedQueryResponseBuilder of() {
        return new GeneralCategoryRecommendationPagedQueryResponseBuilder();
    }

    public static GeneralCategoryRecommendationPagedQueryResponseBuilder of(
            final GeneralCategoryRecommendationPagedQueryResponse template) {
        GeneralCategoryRecommendationPagedQueryResponseBuilder builder = new GeneralCategoryRecommendationPagedQueryResponseBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
