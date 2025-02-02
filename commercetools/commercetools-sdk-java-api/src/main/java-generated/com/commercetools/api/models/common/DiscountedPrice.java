
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPrice discountedPrice = DiscountedPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice {

    /**
     *  <p>Money value of the discounted price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>ProductDiscount related to the discounted price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountReference getDiscount();

    public void setValue(final TypedMoney value);

    public void setDiscount(final ProductDiscountReference discount);

    public static DiscountedPrice of() {
        return new DiscountedPriceImpl();
    }

    public static DiscountedPrice of(final DiscountedPrice template) {
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    public static DiscountedPriceBuilder builder() {
        return DiscountedPriceBuilder.of();
    }

    public static DiscountedPriceBuilder builder(final DiscountedPrice template) {
        return DiscountedPriceBuilder.of(template);
    }

    default <T> T withDiscountedPrice(Function<DiscountedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedPrice>";
            }
        };
    }
}
