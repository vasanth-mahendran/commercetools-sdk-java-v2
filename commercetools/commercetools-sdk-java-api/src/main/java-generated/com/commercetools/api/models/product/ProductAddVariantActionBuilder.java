
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddVariantAction productAddVariantAction = ProductAddVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddVariantActionBuilder implements Builder<ProductAddVariantAction> {

    @Nullable
    private String sku;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> prices;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Image> images;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @Nullable
    private Boolean staged;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    public ProductAddVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    public ProductAddVariantActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>EmbeddedPrices for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder prices(
            @Nullable final com.commercetools.api.models.product.EmbeddedPriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>EmbeddedPrices for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder prices(
            @Nullable final java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>EmbeddedPrices for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusPrices(
            @Nullable final com.commercetools.api.models.product.EmbeddedPriceDraft... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>EmbeddedPrices for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusPrices(
            Function<com.commercetools.api.models.product.EmbeddedPriceDraftBuilder, com.commercetools.api.models.product.EmbeddedPriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.product.EmbeddedPriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>EmbeddedPrices for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder withPrices(
            Function<com.commercetools.api.models.product.EmbeddedPriceDraftBuilder, com.commercetools.api.models.product.EmbeddedPriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.product.EmbeddedPriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder images(@Nullable final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder images(
            @Nullable final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
        return this;
    }

    /**
     *  <p>Images for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusImages(
            @Nullable final com.commercetools.api.models.common.Image... images) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.addAll(Arrays.asList(images));
        return this;
    }

    /**
     *  <p>Images for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Images for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder withImages(
            Function<com.commercetools.api.models.common.ImageBuilder, com.commercetools.api.models.common.ImageBuilder> builder) {
        this.images = new ArrayList<>();
        this.images.add(builder.apply(com.commercetools.api.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder attributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>If <code>true</code> the new ProductVariant is only staged. If <code>false</code> the new ProductVariant is both current and staged.</p>
     */

    public ProductAddVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Media assets for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media assets for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusAssets(
            @Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media assets for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media assets for the ProductVariant.</p>
     */

    public ProductAddVariantActionBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
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
    public java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> getPrices() {
        return this.prices;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    public ProductAddVariantAction build() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    /**
     * builds ProductAddVariantAction without checking for non null required values
     */
    public ProductAddVariantAction buildUnchecked() {
        return new ProductAddVariantActionImpl(sku, key, prices, images, attributes, staged, assets);
    }

    public static ProductAddVariantActionBuilder of() {
        return new ProductAddVariantActionBuilder();
    }

    public static ProductAddVariantActionBuilder of(final ProductAddVariantAction template) {
        ProductAddVariantActionBuilder builder = new ProductAddVariantActionBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.prices = template.getPrices();
        builder.images = template.getImages();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        builder.assets = template.getAssets();
        return builder;
    }

}
