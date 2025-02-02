
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductLegacySetSkuActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductLegacySetSkuAction productLegacySetSkuAction = ProductLegacySetSkuAction.builder()
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductLegacySetSkuActionBuilder implements Builder<ProductLegacySetSkuAction> {

    @Nullable
    private String sku;

    private Integer variantId;

    /**
     *
     */

    public ProductLegacySetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *
     */

    public ProductLegacySetSkuActionBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public ProductLegacySetSkuAction build() {
        Objects.requireNonNull(variantId, ProductLegacySetSkuAction.class + ": variantId is missing");
        return new ProductLegacySetSkuActionImpl(sku, variantId);
    }

    /**
     * builds ProductLegacySetSkuAction without checking for non null required values
     */
    public ProductLegacySetSkuAction buildUnchecked() {
        return new ProductLegacySetSkuActionImpl(sku, variantId);
    }

    public static ProductLegacySetSkuActionBuilder of() {
        return new ProductLegacySetSkuActionBuilder();
    }

    public static ProductLegacySetSkuActionBuilder of(final ProductLegacySetSkuAction template) {
        ProductLegacySetSkuActionBuilder builder = new ProductLegacySetSkuActionBuilder();
        builder.sku = template.getSku();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
