
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ShoppingList.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListResourceIdentifier shoppingListResourceIdentifier = ShoppingListResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListResourceIdentifierImpl.class)
public interface ShoppingListResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ShoppingList> {

    String SHOPPING_LIST = "shopping-list";

    /**
     *  <p>Unique identifier of the referenced ShoppingList. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ShoppingList. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ShoppingListResourceIdentifier of() {
        return new ShoppingListResourceIdentifierImpl();
    }

    public static ShoppingListResourceIdentifier of(final ShoppingListResourceIdentifier template) {
        ShoppingListResourceIdentifierImpl instance = new ShoppingListResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShoppingListResourceIdentifierBuilder builder() {
        return ShoppingListResourceIdentifierBuilder.of();
    }

    public static ShoppingListResourceIdentifierBuilder builder(final ShoppingListResourceIdentifier template) {
        return ShoppingListResourceIdentifierBuilder.of(template);
    }

    default <T> T withShoppingListResourceIdentifier(Function<ShoppingListResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListResourceIdentifier>";
            }
        };
    }
}
