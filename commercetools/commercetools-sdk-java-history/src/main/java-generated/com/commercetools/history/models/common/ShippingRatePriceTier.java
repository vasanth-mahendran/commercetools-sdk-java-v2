
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRatePriceTier
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRatePriceTier shippingRatePriceTier = ShippingRatePriceTier.builder()
 *             .type(ShippingRateTierType.CART_VALUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingRatePriceTierImpl.class)
public interface ShippingRatePriceTier {

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    public void setType(final ShippingRateTierType type);

    public static ShippingRatePriceTier of() {
        return new ShippingRatePriceTierImpl();
    }

    public static ShippingRatePriceTier of(final ShippingRatePriceTier template) {
        ShippingRatePriceTierImpl instance = new ShippingRatePriceTierImpl();
        instance.setType(template.getType());
        return instance;
    }

    public static ShippingRatePriceTierBuilder builder() {
        return ShippingRatePriceTierBuilder.of();
    }

    public static ShippingRatePriceTierBuilder builder(final ShippingRatePriceTier template) {
        return ShippingRatePriceTierBuilder.of(template);
    }

    default <T> T withShippingRatePriceTier(Function<ShippingRatePriceTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRatePriceTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRatePriceTier>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRatePriceTier>";
            }
        };
    }
}
