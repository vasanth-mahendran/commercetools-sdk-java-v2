
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetBillingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBillingAddressCustomFieldAction orderSetBillingAddressCustomFieldAction = OrderSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressCustomFieldActionImpl.class)
public interface OrderSetBillingAddressCustomFieldAction extends OrderUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

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

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetBillingAddressCustomFieldAction of() {
        return new OrderSetBillingAddressCustomFieldActionImpl();
    }

    public static OrderSetBillingAddressCustomFieldAction of(final OrderSetBillingAddressCustomFieldAction template) {
        OrderSetBillingAddressCustomFieldActionImpl instance = new OrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder builder() {
        return OrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder builder(
            final OrderSetBillingAddressCustomFieldAction template) {
        return OrderSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetBillingAddressCustomFieldAction(
            Function<OrderSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetBillingAddressCustomFieldAction>";
            }
        };
    }
}
