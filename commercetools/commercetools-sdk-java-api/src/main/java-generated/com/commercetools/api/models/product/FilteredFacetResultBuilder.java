
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FilteredFacetResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FilteredFacetResult filteredFacetResult = FilteredFacetResult.builder()
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FilteredFacetResultBuilder implements Builder<FilteredFacetResult> {

    private Long count;

    @Nullable
    private Long productCount;

    /**
     *
     */

    public FilteredFacetResultBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *
     */

    public FilteredFacetResultBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getProductCount() {
        return this.productCount;
    }

    public FilteredFacetResult build() {
        Objects.requireNonNull(count, FilteredFacetResult.class + ": count is missing");
        return new FilteredFacetResultImpl(count, productCount);
    }

    /**
     * builds FilteredFacetResult without checking for non null required values
     */
    public FilteredFacetResult buildUnchecked() {
        return new FilteredFacetResultImpl(count, productCount);
    }

    public static FilteredFacetResultBuilder of() {
        return new FilteredFacetResultBuilder();
    }

    public static FilteredFacetResultBuilder of(final FilteredFacetResult template) {
        FilteredFacetResultBuilder builder = new FilteredFacetResultBuilder();
        builder.count = template.getCount();
        builder.productCount = template.getProductCount();
        return builder;
    }

}
