
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetCustomTypeAction shoppingListSetCustomTypeAction = ShoppingListSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetCustomTypeActionImpl.class)
public interface ShoppingListSetCustomTypeAction extends ShoppingListUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the ShoppingList with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShoppingList.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ShoppingList.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ShoppingListSetCustomTypeAction of() {
        return new ShoppingListSetCustomTypeActionImpl();
    }

    public static ShoppingListSetCustomTypeAction of(final ShoppingListSetCustomTypeAction template) {
        ShoppingListSetCustomTypeActionImpl instance = new ShoppingListSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ShoppingListSetCustomTypeActionBuilder builder() {
        return ShoppingListSetCustomTypeActionBuilder.of();
    }

    public static ShoppingListSetCustomTypeActionBuilder builder(final ShoppingListSetCustomTypeAction template) {
        return ShoppingListSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withShoppingListSetCustomTypeAction(Function<ShoppingListSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetCustomTypeAction>";
            }
        };
    }
}
