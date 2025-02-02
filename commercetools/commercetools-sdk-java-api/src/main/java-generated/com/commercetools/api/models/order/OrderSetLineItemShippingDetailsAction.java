
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetLineItemShippingDetailsAction orderSetLineItemShippingDetailsAction = OrderSetLineItemShippingDetailsAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetLineItemShippingDetailsActionImpl.class)
public interface OrderSetLineItemShippingDetailsAction extends OrderUpdateAction {

    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setLineItemId(final String lineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static OrderSetLineItemShippingDetailsAction of() {
        return new OrderSetLineItemShippingDetailsActionImpl();
    }

    public static OrderSetLineItemShippingDetailsAction of(final OrderSetLineItemShippingDetailsAction template) {
        OrderSetLineItemShippingDetailsActionImpl instance = new OrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static OrderSetLineItemShippingDetailsActionBuilder builder() {
        return OrderSetLineItemShippingDetailsActionBuilder.of();
    }

    public static OrderSetLineItemShippingDetailsActionBuilder builder(
            final OrderSetLineItemShippingDetailsAction template) {
        return OrderSetLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withOrderSetLineItemShippingDetailsAction(Function<OrderSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetLineItemShippingDetailsAction>";
            }
        };
    }
}
