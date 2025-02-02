
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderFromCartDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderFromCartDraft orderFromCartDraft = OrderFromCartDraft.builder()
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderFromCartDraftImpl.class)
public interface OrderFromCartDraft {

    /**
     *  <p>Unique identifier of the Cart from which you can create an Order.</p>
     */
    @Deprecated
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>ResourceIdentifier to the Cart from which this order is created.</p>
     */
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();

    /**
     *
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Custom Fields for the Order. The Custom Field type must match the type of the Custom Fields in the referenced Cart. If specified, the Custom Fields are merged with the Custom Fields on the referenced Cart and added to the Order. If empty, the Custom Fields on the referenced Cart are added to the Order automatically.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Deprecated
    public void setId(final String id);

    public void setCart(final CartResourceIdentifier cart);

    public void setVersion(final Long version);

    public void setOrderNumber(final String orderNumber);

    public void setPaymentState(final PaymentState paymentState);

    public void setShipmentState(final ShipmentState shipmentState);

    public void setOrderState(final OrderState orderState);

    public void setState(final StateResourceIdentifier state);

    public void setCustom(final CustomFieldsDraft custom);

    public static OrderFromCartDraft of() {
        return new OrderFromCartDraftImpl();
    }

    public static OrderFromCartDraft of(final OrderFromCartDraft template) {
        OrderFromCartDraftImpl instance = new OrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setCart(template.getCart());
        instance.setVersion(template.getVersion());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static OrderFromCartDraftBuilder builder() {
        return OrderFromCartDraftBuilder.of();
    }

    public static OrderFromCartDraftBuilder builder(final OrderFromCartDraft template) {
        return OrderFromCartDraftBuilder.of(template);
    }

    default <T> T withOrderFromCartDraft(Function<OrderFromCartDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderFromCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderFromCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderFromCartDraft>";
            }
        };
    }
}
