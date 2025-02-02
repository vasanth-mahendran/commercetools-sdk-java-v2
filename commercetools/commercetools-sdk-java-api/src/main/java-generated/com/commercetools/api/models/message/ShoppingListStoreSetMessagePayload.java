
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListStoreSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListStoreSetMessagePayload shoppingListStoreSetMessagePayload = ShoppingListStoreSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListStoreSetMessagePayloadImpl.class)
public interface ShoppingListStoreSetMessagePayload extends MessagePayload {

    String SHOPPING_LIST_STORE_SET = "ShoppingListStoreSet";

    /**
     *  <p>Reference to a Store by its key.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static ShoppingListStoreSetMessagePayload of() {
        return new ShoppingListStoreSetMessagePayloadImpl();
    }

    public static ShoppingListStoreSetMessagePayload of(final ShoppingListStoreSetMessagePayload template) {
        ShoppingListStoreSetMessagePayloadImpl instance = new ShoppingListStoreSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static ShoppingListStoreSetMessagePayloadBuilder builder() {
        return ShoppingListStoreSetMessagePayloadBuilder.of();
    }

    public static ShoppingListStoreSetMessagePayloadBuilder builder(final ShoppingListStoreSetMessagePayload template) {
        return ShoppingListStoreSetMessagePayloadBuilder.of(template);
    }

    default <T> T withShoppingListStoreSetMessagePayload(Function<ShoppingListStoreSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListStoreSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListStoreSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListStoreSetMessagePayload>";
            }
        };
    }
}
