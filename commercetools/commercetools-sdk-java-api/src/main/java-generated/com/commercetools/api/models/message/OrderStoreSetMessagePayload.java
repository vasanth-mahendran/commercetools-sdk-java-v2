
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
 * OrderStoreSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStoreSetMessagePayload orderStoreSetMessagePayload = OrderStoreSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderStoreSetMessagePayloadImpl.class)
public interface OrderStoreSetMessagePayload extends OrderMessagePayload {

    String ORDER_STORE_SET = "OrderStoreSet";

    /**
     *  <p>Reference to a Store by its key.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static OrderStoreSetMessagePayload of() {
        return new OrderStoreSetMessagePayloadImpl();
    }

    public static OrderStoreSetMessagePayload of(final OrderStoreSetMessagePayload template) {
        OrderStoreSetMessagePayloadImpl instance = new OrderStoreSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static OrderStoreSetMessagePayloadBuilder builder() {
        return OrderStoreSetMessagePayloadBuilder.of();
    }

    public static OrderStoreSetMessagePayloadBuilder builder(final OrderStoreSetMessagePayload template) {
        return OrderStoreSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderStoreSetMessagePayload(Function<OrderStoreSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStoreSetMessagePayload>";
            }
        };
    }
}
