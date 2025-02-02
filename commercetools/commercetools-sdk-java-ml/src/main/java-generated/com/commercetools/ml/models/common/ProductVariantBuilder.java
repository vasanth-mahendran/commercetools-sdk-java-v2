
package com.commercetools.ml.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariant productVariant = ProductVariant.builder()
 *             .product(productBuilder -> productBuilder)
 *             .staged(true)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantBuilder implements Builder<ProductVariant> {

    private com.commercetools.ml.models.common.ProductReference product;

    private Boolean staged;

    private Integer variantId;

    /**
     *  <p>The product that contains this variant.</p>
     */

    public ProductVariantBuilder product(
            Function<com.commercetools.ml.models.common.ProductReferenceBuilder, com.commercetools.ml.models.common.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.ml.models.common.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The product that contains this variant.</p>
     */

    public ProductVariantBuilder product(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The state of the product variant.</p>
     */

    public ProductVariantBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The id of the product variant.</p>
     */

    public ProductVariantBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public ProductVariant build() {
        Objects.requireNonNull(product, ProductVariant.class + ": product is missing");
        Objects.requireNonNull(staged, ProductVariant.class + ": staged is missing");
        Objects.requireNonNull(variantId, ProductVariant.class + ": variantId is missing");
        return new ProductVariantImpl(product, staged, variantId);
    }

    /**
     * builds ProductVariant without checking for non null required values
     */
    public ProductVariant buildUnchecked() {
        return new ProductVariantImpl(product, staged, variantId);
    }

    public static ProductVariantBuilder of() {
        return new ProductVariantBuilder();
    }

    public static ProductVariantBuilder of(final ProductVariant template) {
        ProductVariantBuilder builder = new ProductVariantBuilder();
        builder.product = template.getProduct();
        builder.staged = template.getStaged();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
