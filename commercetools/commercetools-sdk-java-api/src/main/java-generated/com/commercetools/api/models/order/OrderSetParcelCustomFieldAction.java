
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = OrderSetParcelCustomFieldAction.builder()
 *             .parcelId("{parcelId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelCustomFieldActionImpl.class)
public interface OrderSetParcelCustomFieldAction extends OrderUpdateAction {

    String SET_PARCEL_CUSTOM_FIELD = "setParcelCustomField";

    /**
     *
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

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

    public void setParcelId(final String parcelId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetParcelCustomFieldAction of() {
        return new OrderSetParcelCustomFieldActionImpl();
    }

    public static OrderSetParcelCustomFieldAction of(final OrderSetParcelCustomFieldAction template) {
        OrderSetParcelCustomFieldActionImpl instance = new OrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetParcelCustomFieldActionBuilder builder() {
        return OrderSetParcelCustomFieldActionBuilder.of();
    }

    public static OrderSetParcelCustomFieldActionBuilder builder(final OrderSetParcelCustomFieldAction template) {
        return OrderSetParcelCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetParcelCustomFieldAction(Function<OrderSetParcelCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelCustomFieldAction>";
            }
        };
    }
}
