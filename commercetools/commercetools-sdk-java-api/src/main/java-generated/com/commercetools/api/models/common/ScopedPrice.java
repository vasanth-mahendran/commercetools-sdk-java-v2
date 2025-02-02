
package com.commercetools.api.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScopedPrice
 *
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
@JsonDeserialize(as = ScopedPriceImpl.class)
public interface ScopedPrice extends com.commercetools.api.models.Customizable<ScopedPrice> {

    /**
     *
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("currentValue")
    public TypedMoney getCurrentValue();

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Reference to a Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setValue(final TypedMoney value);

    public void setCurrentValue(final TypedMoney currentValue);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setCustom(final CustomFields custom);

    public static ScopedPrice of() {
        return new ScopedPriceImpl();
    }

    public static ScopedPrice of(final ScopedPrice template) {
        ScopedPriceImpl instance = new ScopedPriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setCurrentValue(template.getCurrentValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ScopedPriceBuilder builder() {
        return ScopedPriceBuilder.of();
    }

    public static ScopedPriceBuilder builder(final ScopedPrice template) {
        return ScopedPriceBuilder.of(template);
    }

    default <T> T withScopedPrice(Function<ScopedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ScopedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScopedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<ScopedPrice>";
            }
        };
    }
}
