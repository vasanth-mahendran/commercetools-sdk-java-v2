
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelection productVariantSelection = ProductVariantSelection.builder()
 *             .type("{type}")
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionBuilder implements Builder<ProductVariantSelection> {

    private String type;

    private java.util.List<String> skus;

    /**
     *  <p>One of the values <code>inclusion</code>, or <code>exclusion</code>, that determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     */

    public ProductVariantSelectionBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs</p>
     */

    public ProductVariantSelectionBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs</p>
     */

    public ProductVariantSelectionBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>Non-empty array of SKUs</p>
     */

    public ProductVariantSelectionBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public ProductVariantSelection build() {
        Objects.requireNonNull(type, ProductVariantSelection.class + ": type is missing");
        Objects.requireNonNull(skus, ProductVariantSelection.class + ": skus is missing");
        return new ProductVariantSelectionImpl(type, skus);
    }

    /**
     * builds ProductVariantSelection without checking for non null required values
     */
    public ProductVariantSelection buildUnchecked() {
        return new ProductVariantSelectionImpl(type, skus);
    }

    public static ProductVariantSelectionBuilder of() {
        return new ProductVariantSelectionBuilder();
    }

    public static ProductVariantSelectionBuilder of(final ProductVariantSelection template) {
        ProductVariantSelectionBuilder builder = new ProductVariantSelectionBuilder();
        builder.type = template.getType();
        builder.skus = template.getSkus();
        return builder;
    }

}
