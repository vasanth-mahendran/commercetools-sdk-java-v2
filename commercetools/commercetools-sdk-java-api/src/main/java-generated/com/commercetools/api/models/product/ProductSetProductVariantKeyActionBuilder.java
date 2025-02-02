
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetProductVariantKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductVariantKeyAction productSetProductVariantKeyAction = ProductSetProductVariantKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetProductVariantKeyActionBuilder implements Builder<ProductSetProductVariantKeyAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private Boolean staged;

    /**
     *
     */

    public ProductSetProductVariantKeyActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *
     */

    public ProductSetProductVariantKeyActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If left blank or set to <code>null</code>, the key is unset/removed.</p>
     */

    public ProductSetProductVariantKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public ProductSetProductVariantKeyActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetProductVariantKeyAction build() {
        return new ProductSetProductVariantKeyActionImpl(variantId, sku, key, staged);
    }

    /**
     * builds ProductSetProductVariantKeyAction without checking for non null required values
     */
    public ProductSetProductVariantKeyAction buildUnchecked() {
        return new ProductSetProductVariantKeyActionImpl(variantId, sku, key, staged);
    }

    public static ProductSetProductVariantKeyActionBuilder of() {
        return new ProductSetProductVariantKeyActionBuilder();
    }

    public static ProductSetProductVariantKeyActionBuilder of(final ProductSetProductVariantKeyAction template) {
        ProductSetProductVariantKeyActionBuilder builder = new ProductSetProductVariantKeyActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.staged = template.getStaged();
        return builder;
    }

}
