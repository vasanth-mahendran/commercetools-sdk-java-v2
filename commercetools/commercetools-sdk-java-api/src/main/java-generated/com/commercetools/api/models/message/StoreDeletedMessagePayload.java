
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDeletedMessagePayload storeDeletedMessagePayload = StoreDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreDeletedMessagePayloadImpl.class)
public interface StoreDeletedMessagePayload extends MessagePayload {

    String STORE_DELETED = "StoreDeleted";

    public static StoreDeletedMessagePayload of() {
        return new StoreDeletedMessagePayloadImpl();
    }

    public static StoreDeletedMessagePayload of(final StoreDeletedMessagePayload template) {
        StoreDeletedMessagePayloadImpl instance = new StoreDeletedMessagePayloadImpl();
        return instance;
    }

    public static StoreDeletedMessagePayloadBuilder builder() {
        return StoreDeletedMessagePayloadBuilder.of();
    }

    public static StoreDeletedMessagePayloadBuilder builder(final StoreDeletedMessagePayload template) {
        return StoreDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreDeletedMessagePayload(Function<StoreDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDeletedMessagePayload>";
            }
        };
    }
}
