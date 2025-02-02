
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetCustomFieldAction inventoryEntrySetCustomFieldAction = InventoryEntrySetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetCustomFieldActionImpl.class)
public interface InventoryEntrySetCustomFieldAction extends InventoryEntryUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

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

    public static InventoryEntrySetCustomFieldAction of() {
        return new InventoryEntrySetCustomFieldActionImpl();
    }

    public static InventoryEntrySetCustomFieldAction of(final InventoryEntrySetCustomFieldAction template) {
        InventoryEntrySetCustomFieldActionImpl instance = new InventoryEntrySetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static InventoryEntrySetCustomFieldActionBuilder builder() {
        return InventoryEntrySetCustomFieldActionBuilder.of();
    }

    public static InventoryEntrySetCustomFieldActionBuilder builder(final InventoryEntrySetCustomFieldAction template) {
        return InventoryEntrySetCustomFieldActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetCustomFieldAction(Function<InventoryEntrySetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetCustomFieldAction>";
            }
        };
    }
}
