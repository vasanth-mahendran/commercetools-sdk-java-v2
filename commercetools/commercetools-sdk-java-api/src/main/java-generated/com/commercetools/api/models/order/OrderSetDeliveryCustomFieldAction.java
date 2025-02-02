
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryCustomFieldAction orderSetDeliveryCustomFieldAction = OrderSetDeliveryCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryCustomFieldActionImpl.class)
public interface OrderSetDeliveryCustomFieldAction extends OrderUpdateAction {

    String SET_DELIVERY_CUSTOM_FIELD = "setDeliveryCustomField";

    /**
     *
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setDeliveryId(final String deliveryId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetDeliveryCustomFieldAction of() {
        return new OrderSetDeliveryCustomFieldActionImpl();
    }

    public static OrderSetDeliveryCustomFieldAction of(final OrderSetDeliveryCustomFieldAction template) {
        OrderSetDeliveryCustomFieldActionImpl instance = new OrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetDeliveryCustomFieldActionBuilder builder() {
        return OrderSetDeliveryCustomFieldActionBuilder.of();
    }

    public static OrderSetDeliveryCustomFieldActionBuilder builder(final OrderSetDeliveryCustomFieldAction template) {
        return OrderSetDeliveryCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryCustomFieldAction(Function<OrderSetDeliveryCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryCustomFieldAction>";
            }
        };
    }
}
