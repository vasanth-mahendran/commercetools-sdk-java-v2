
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetLineItemCustomFieldAction shoppingListSetLineItemCustomFieldAction = ShoppingListSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetLineItemCustomFieldActionImpl.class)
public interface ShoppingListSetLineItemCustomFieldAction extends ShoppingListUpdateAction {

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static ShoppingListSetLineItemCustomFieldAction of() {
        return new ShoppingListSetLineItemCustomFieldActionImpl();
    }

    public static ShoppingListSetLineItemCustomFieldAction of(final ShoppingListSetLineItemCustomFieldAction template) {
        ShoppingListSetLineItemCustomFieldActionImpl instance = new ShoppingListSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder builder() {
        return ShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder builder(
            final ShoppingListSetLineItemCustomFieldAction template) {
        return ShoppingListSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withShoppingListSetLineItemCustomFieldAction(
            Function<ShoppingListSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetLineItemCustomFieldAction>";
            }
        };
    }
}
