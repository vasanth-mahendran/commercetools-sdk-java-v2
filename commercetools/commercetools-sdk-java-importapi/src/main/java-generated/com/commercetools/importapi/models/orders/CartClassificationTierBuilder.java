
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartClassificationTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationTier cartClassificationTier = CartClassificationTier.builder()
 *             .value("{value}")
 *             .price(priceBuilder -> priceBuilder)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartClassificationTierBuilder implements Builder<CartClassificationTier> {

    private String value;

    private com.commercetools.importapi.models.common.Money price;

    private java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers;

    @Nullable
    private Boolean isMatching;

    /**
     *
     */

    public CartClassificationTierBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder price(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder price(final com.commercetools.importapi.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder tiers(
            final com.commercetools.importapi.models.orders.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder tiers(
            final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder plusTiers(
            final com.commercetools.importapi.models.orders.ShippingRatePriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder plusTiers(
            Function<com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.importapi.models.orders.ShippingRatePriceTier>> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(
            builder.apply(com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder withTiers(
            Function<com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.importapi.models.orders.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(
            builder.apply(com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public CartClassificationTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public com.commercetools.importapi.models.common.Money getPrice() {
        return this.price;
    }

    public java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public CartClassificationTier build() {
        Objects.requireNonNull(value, CartClassificationTier.class + ": value is missing");
        Objects.requireNonNull(price, CartClassificationTier.class + ": price is missing");
        Objects.requireNonNull(tiers, CartClassificationTier.class + ": tiers is missing");
        return new CartClassificationTierImpl(value, price, tiers, isMatching);
    }

    /**
     * builds CartClassificationTier without checking for non null required values
     */
    public CartClassificationTier buildUnchecked() {
        return new CartClassificationTierImpl(value, price, tiers, isMatching);
    }

    public static CartClassificationTierBuilder of() {
        return new CartClassificationTierBuilder();
    }

    public static CartClassificationTierBuilder of(final CartClassificationTier template) {
        CartClassificationTierBuilder builder = new CartClassificationTierBuilder();
        builder.value = template.getValue();
        builder.price = template.getPrice();
        builder.tiers = template.getTiers();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
