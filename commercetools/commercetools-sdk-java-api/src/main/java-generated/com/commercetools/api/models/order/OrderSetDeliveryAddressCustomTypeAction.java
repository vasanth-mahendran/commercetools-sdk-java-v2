
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressCustomTypeAction orderSetDeliveryAddressCustomTypeAction = OrderSetDeliveryAddressCustomTypeAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryAddressCustomTypeActionImpl.class)
public interface OrderSetDeliveryAddressCustomTypeAction extends OrderUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    /**
     *
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetDeliveryAddressCustomTypeAction of() {
        return new OrderSetDeliveryAddressCustomTypeActionImpl();
    }

    public static OrderSetDeliveryAddressCustomTypeAction of(final OrderSetDeliveryAddressCustomTypeAction template) {
        OrderSetDeliveryAddressCustomTypeActionImpl instance = new OrderSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder builder() {
        return OrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder builder(
            final OrderSetDeliveryAddressCustomTypeAction template) {
        return OrderSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryAddressCustomTypeAction(
            Function<OrderSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryAddressCustomTypeAction>";
            }
        };
    }
}
