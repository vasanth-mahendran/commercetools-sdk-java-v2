
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryCustomFieldAction stagedOrderSetDeliveryCustomFieldAction = StagedOrderSetDeliveryCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryCustomFieldActionImpl.class)
public interface StagedOrderSetDeliveryCustomFieldAction extends StagedOrderUpdateAction {

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

    public static StagedOrderSetDeliveryCustomFieldAction of() {
        return new StagedOrderSetDeliveryCustomFieldActionImpl();
    }

    public static StagedOrderSetDeliveryCustomFieldAction of(final StagedOrderSetDeliveryCustomFieldAction template) {
        StagedOrderSetDeliveryCustomFieldActionImpl instance = new StagedOrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder builder() {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of();
    }

    public static StagedOrderSetDeliveryCustomFieldActionBuilder builder(
            final StagedOrderSetDeliveryCustomFieldAction template) {
        return StagedOrderSetDeliveryCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryCustomFieldAction(
            Function<StagedOrderSetDeliveryCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryCustomFieldAction>";
            }
        };
    }
}
