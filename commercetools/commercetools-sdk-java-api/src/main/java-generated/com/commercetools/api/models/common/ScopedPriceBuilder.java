
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScopedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScopedPrice scopedPrice = ScopedPrice.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .currentValue(currentValueBuilder -> currentValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScopedPriceBuilder implements Builder<ScopedPrice> {

    private String id;

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.common.TypedMoney currentValue;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *
     */

    public ScopedPriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
     */

    public ScopedPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
     */

    public ScopedPriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
     */

    public ScopedPriceBuilder currentValue(final com.commercetools.api.models.common.TypedMoney currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
     */

    public ScopedPriceBuilder currentValue(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.currentValue = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public ScopedPriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */

    public ScopedPriceBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */

    public ScopedPriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     */

    public ScopedPriceBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     */

    public ScopedPriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *
     */

    public ScopedPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *
     */

    public ScopedPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *
     */

    public ScopedPriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ScopedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */

    public ScopedPriceBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */

    public ScopedPriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public com.commercetools.api.models.common.TypedMoney getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public ScopedPrice build() {
        Objects.requireNonNull(id, ScopedPrice.class + ": id is missing");
        Objects.requireNonNull(value, ScopedPrice.class + ": value is missing");
        Objects.requireNonNull(currentValue, ScopedPrice.class + ": currentValue is missing");
        return new ScopedPriceImpl(id, value, currentValue, country, customerGroup, channel, validFrom, validUntil,
            discounted, custom);
    }

    /**
     * builds ScopedPrice without checking for non null required values
     */
    public ScopedPrice buildUnchecked() {
        return new ScopedPriceImpl(id, value, currentValue, country, customerGroup, channel, validFrom, validUntil,
            discounted, custom);
    }

    public static ScopedPriceBuilder of() {
        return new ScopedPriceBuilder();
    }

    public static ScopedPriceBuilder of(final ScopedPrice template) {
        ScopedPriceBuilder builder = new ScopedPriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.currentValue = template.getCurrentValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.discounted = template.getDiscounted();
        builder.custom = template.getCustom();
        return builder;
    }

}
