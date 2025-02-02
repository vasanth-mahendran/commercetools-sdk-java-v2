
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListStoreSetMessagePayloadBuilder
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
public class ShoppingListStoreSetMessagePayloadBuilder implements Builder<ShoppingListStoreSetMessagePayload> {

    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>Reference to a Store by its key.</p>
     */

    public ShoppingListStoreSetMessagePayloadBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Store by its key.</p>
     */

    public ShoppingListStoreSetMessagePayloadBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public ShoppingListStoreSetMessagePayload build() {
        Objects.requireNonNull(store, ShoppingListStoreSetMessagePayload.class + ": store is missing");
        return new ShoppingListStoreSetMessagePayloadImpl(store);
    }

    /**
     * builds ShoppingListStoreSetMessagePayload without checking for non null required values
     */
    public ShoppingListStoreSetMessagePayload buildUnchecked() {
        return new ShoppingListStoreSetMessagePayloadImpl(store);
    }

    public static ShoppingListStoreSetMessagePayloadBuilder of() {
        return new ShoppingListStoreSetMessagePayloadBuilder();
    }

    public static ShoppingListStoreSetMessagePayloadBuilder of(final ShoppingListStoreSetMessagePayload template) {
        ShoppingListStoreSetMessagePayloadBuilder builder = new ShoppingListStoreSetMessagePayloadBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
