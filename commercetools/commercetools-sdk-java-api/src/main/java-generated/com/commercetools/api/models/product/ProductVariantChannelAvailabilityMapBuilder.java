
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantChannelAvailabilityMapBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailabilityMap productVariantChannelAvailabilityMap = ProductVariantChannelAvailabilityMap.builder()
 *             .//(//Builder -> //Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantChannelAvailabilityMapBuilder implements Builder<ProductVariantChannelAvailabilityMap> {

    private Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values = new HashMap<>();

    /**
     *
     */

    public ProductVariantChannelAvailabilityMapBuilder values(
            final Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public ProductVariantChannelAvailabilityMapBuilder addValue(final String key,
            final com.commercetools.api.models.product.ProductVariantChannelAvailability value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> getValues() {
        return this.values;
    }

    public ProductVariantChannelAvailabilityMap build() {
        Objects.requireNonNull(values, ProductVariantChannelAvailabilityMap.class + ": values are missing");
        return new ProductVariantChannelAvailabilityMapImpl(values);
    }

    /**
     * builds ProductVariantChannelAvailabilityMap without checking for non null required values
     */
    public ProductVariantChannelAvailabilityMap buildUnchecked() {
        return new ProductVariantChannelAvailabilityMapImpl(values);
    }

    public static ProductVariantChannelAvailabilityMapBuilder of() {
        return new ProductVariantChannelAvailabilityMapBuilder();
    }

    public static ProductVariantChannelAvailabilityMapBuilder of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapBuilder builder = new ProductVariantChannelAvailabilityMapBuilder();
        builder.values = template.values();
        return builder;
    }

}
