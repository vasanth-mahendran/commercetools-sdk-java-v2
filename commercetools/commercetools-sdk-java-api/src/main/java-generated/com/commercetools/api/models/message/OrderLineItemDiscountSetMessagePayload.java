
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemDiscountSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemDiscountSetMessagePayload orderLineItemDiscountSetMessagePayload = OrderLineItemDiscountSetMessagePayload.builder()
 *             .lineItemId("{lineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderLineItemDiscountSetMessagePayload extends OrderMessagePayload {

    String ORDER_LINE_ITEM_DISCOUNT_SET = "OrderLineItemDiscountSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
     *
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    public void setLineItemId(final String lineItemId);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setTotalPrice(final Money totalPrice);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public static OrderLineItemDiscountSetMessagePayload of() {
        return new OrderLineItemDiscountSetMessagePayloadImpl();
    }

    public static OrderLineItemDiscountSetMessagePayload of(final OrderLineItemDiscountSetMessagePayload template) {
        OrderLineItemDiscountSetMessagePayloadImpl instance = new OrderLineItemDiscountSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    public static OrderLineItemDiscountSetMessagePayloadBuilder builder() {
        return OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }

    public static OrderLineItemDiscountSetMessagePayloadBuilder builder(
            final OrderLineItemDiscountSetMessagePayload template) {
        return OrderLineItemDiscountSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderLineItemDiscountSetMessagePayload(
            Function<OrderLineItemDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDiscountSetMessagePayload>";
            }
        };
    }
}
