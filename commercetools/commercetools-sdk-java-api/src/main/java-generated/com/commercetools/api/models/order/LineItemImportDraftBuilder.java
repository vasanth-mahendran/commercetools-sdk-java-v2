
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemImportDraft lineItemImportDraft = LineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .price(priceBuilder -> priceBuilder)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImportDraftBuilder implements Builder<LineItemImportDraft> {

    @Nullable
    private String productId;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.order.ProductVariantImportDraft variant;

    private com.commercetools.api.models.common.PriceDraft price;

    private Long quantity;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p>ID of the existing product. You also need to specify the ID of the variant if this property is set or alternatively you can just specify SKU of the product variant.</p>
     */

    public LineItemImportDraftBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>The product name.</p>
     */

    public LineItemImportDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The product name.</p>
     */

    public LineItemImportDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder variant(
            Function<com.commercetools.api.models.order.ProductVariantImportDraftBuilder, com.commercetools.api.models.order.ProductVariantImportDraftBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.order.ProductVariantImportDraftBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder variant(
            final com.commercetools.api.models.order.ProductVariantImportDraft variant) {
        this.variant = variant;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder price(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder price(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder state(@Nullable final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder plusState(@Nullable final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Connection to a particular supplier. By providing supply channel information, you can uniquely identify inventory entries that should be reserved. The provided channel should have the InventorySupply role.</p>
     */

    public LineItemImportDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Connection to a particular supplier. By providing supply channel information, you can uniquely identify inventory entries that should be reserved. The provided channel should have the InventorySupply role.</p>
     */

    public LineItemImportDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The channel is used to select a ProductPrice. The provided channel should have the ProductDistribution role.</p>
     */

    public LineItemImportDraftBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The channel is used to select a ProductPrice. The provided channel should have the ProductDistribution role.</p>
     */

    public LineItemImportDraftBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public LineItemImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public LineItemImportDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Inventory mode specific to the line item only, valid for the entire <code>quantity</code> of the line item. Set only if inventory mode should be different from the <code>inventoryMode</code> specified on the OrderImportDraft.</p>
     */

    public LineItemImportDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public LineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.order.ProductVariantImportDraft getVariant() {
        return this.variant;
    }

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public LineItemImportDraft build() {
        Objects.requireNonNull(name, LineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(variant, LineItemImportDraft.class + ": variant is missing");
        Objects.requireNonNull(price, LineItemImportDraft.class + ": price is missing");
        Objects.requireNonNull(quantity, LineItemImportDraft.class + ": quantity is missing");
        return new LineItemImportDraftImpl(productId, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, custom, inventoryMode, shippingDetails);
    }

    /**
     * builds LineItemImportDraft without checking for non null required values
     */
    public LineItemImportDraft buildUnchecked() {
        return new LineItemImportDraftImpl(productId, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, custom, inventoryMode, shippingDetails);
    }

    public static LineItemImportDraftBuilder of() {
        return new LineItemImportDraftBuilder();
    }

    public static LineItemImportDraftBuilder of(final LineItemImportDraft template) {
        LineItemImportDraftBuilder builder = new LineItemImportDraftBuilder();
        builder.productId = template.getProductId();
        builder.name = template.getName();
        builder.variant = template.getVariant();
        builder.price = template.getPrice();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.taxRate = template.getTaxRate();
        builder.custom = template.getCustom();
        builder.inventoryMode = template.getInventoryMode();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
