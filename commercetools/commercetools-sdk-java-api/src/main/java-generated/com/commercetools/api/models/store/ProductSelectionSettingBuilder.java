
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSettingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetting productSelectionSetting = ProductSelectionSetting.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSettingBuilder implements Builder<ProductSelectionSetting> {

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    private Boolean active;

    /**
     *  <p>Reference to a ProductSelection.</p>
     */

    public ProductSelectionSettingBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder, com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a ProductSelection.</p>
     */

    public ProductSelectionSettingBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     */

    public ProductSelectionSettingBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    public Boolean getActive() {
        return this.active;
    }

    public ProductSelectionSetting build() {
        Objects.requireNonNull(productSelection, ProductSelectionSetting.class + ": productSelection is missing");
        Objects.requireNonNull(active, ProductSelectionSetting.class + ": active is missing");
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    /**
     * builds ProductSelectionSetting without checking for non null required values
     */
    public ProductSelectionSetting buildUnchecked() {
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    public static ProductSelectionSettingBuilder of() {
        return new ProductSelectionSettingBuilder();
    }

    public static ProductSelectionSettingBuilder of(final ProductSelectionSetting template) {
        ProductSelectionSettingBuilder builder = new ProductSelectionSettingBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
