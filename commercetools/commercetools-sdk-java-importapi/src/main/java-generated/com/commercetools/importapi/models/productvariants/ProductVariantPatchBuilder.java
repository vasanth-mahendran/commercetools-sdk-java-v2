
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantPatchBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatch productVariantPatch = ProductVariantPatch.builder()
 *             .productVariant(productVariantBuilder -> productVariantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantPatchBuilder implements Builder<ProductVariantPatch> {

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    @Nullable
    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The ProductVariant to which this patch is applied. The Reference to the ProductVariant with which the ProductVariantPatch is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     */

    public ProductVariantPatchBuilder productVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The ProductVariant to which this patch is applied. The Reference to the ProductVariant with which the ProductVariantPatch is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     */

    public ProductVariantPatchBuilder productVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the Project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     */

    public ProductVariantPatchBuilder attributes(
            Function<com.commercetools.importapi.models.productvariants.AttributesBuilder, com.commercetools.importapi.models.productvariants.AttributesBuilder> builder) {
        this.attributes = builder.apply(com.commercetools.importapi.models.productvariants.AttributesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the Project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     */

    public ProductVariantPatchBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both current and staged projected representations of the Product.</p>
     */

    public ProductVariantPatchBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    @Nullable
    public com.commercetools.importapi.models.productvariants.Attributes getAttributes() {
        return this.attributes;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductVariantPatch build() {
        Objects.requireNonNull(productVariant, ProductVariantPatch.class + ": productVariant is missing");
        return new ProductVariantPatchImpl(productVariant, attributes, staged);
    }

    /**
     * builds ProductVariantPatch without checking for non null required values
     */
    public ProductVariantPatch buildUnchecked() {
        return new ProductVariantPatchImpl(productVariant, attributes, staged);
    }

    public static ProductVariantPatchBuilder of() {
        return new ProductVariantPatchBuilder();
    }

    public static ProductVariantPatchBuilder of(final ProductVariantPatch template) {
        ProductVariantPatchBuilder builder = new ProductVariantPatchBuilder();
        builder.productVariant = template.getProductVariant();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        return builder;
    }

}
