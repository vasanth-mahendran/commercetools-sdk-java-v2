
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemoveImageActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveImageAction productRemoveImageAction = ProductRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveImageActionBuilder implements Builder<ProductRemoveImageAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private String imageUrl;

    @Nullable
    private Boolean staged;

    /**
     *
     */

    public ProductRemoveImageActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *
     */

    public ProductRemoveImageActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The URL of the image.</p>
     */

    public ProductRemoveImageActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *
     */

    public ProductRemoveImageActionBuilder staged(@Nullable final Boolean staged) {
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

    public String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemoveImageAction build() {
        Objects.requireNonNull(imageUrl, ProductRemoveImageAction.class + ": imageUrl is missing");
        return new ProductRemoveImageActionImpl(variantId, sku, imageUrl, staged);
    }

    /**
     * builds ProductRemoveImageAction without checking for non null required values
     */
    public ProductRemoveImageAction buildUnchecked() {
        return new ProductRemoveImageActionImpl(variantId, sku, imageUrl, staged);
    }

    public static ProductRemoveImageActionBuilder of() {
        return new ProductRemoveImageActionBuilder();
    }

    public static ProductRemoveImageActionBuilder of(final ProductRemoveImageAction template) {
        ProductRemoveImageActionBuilder builder = new ProductRemoveImageActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.imageUrl = template.getImageUrl();
        builder.staged = template.getStaged();
        return builder;
    }

}
