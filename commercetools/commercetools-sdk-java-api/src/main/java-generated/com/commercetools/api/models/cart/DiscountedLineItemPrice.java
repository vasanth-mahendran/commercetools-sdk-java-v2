
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPrice discountedLineItemPrice = DiscountedLineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceImpl.class)
public interface DiscountedLineItemPrice {

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    public void setValue(final TypedMoney value);

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion... includedDiscounts);

    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    public static DiscountedLineItemPrice of() {
        return new DiscountedLineItemPriceImpl();
    }

    public static DiscountedLineItemPrice of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    public static DiscountedLineItemPriceBuilder builder() {
        return DiscountedLineItemPriceBuilder.of();
    }

    public static DiscountedLineItemPriceBuilder builder(final DiscountedLineItemPrice template) {
        return DiscountedLineItemPriceBuilder.of(template);
    }

    default <T> T withDiscountedLineItemPrice(Function<DiscountedLineItemPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPrice>";
            }
        };
    }
}
