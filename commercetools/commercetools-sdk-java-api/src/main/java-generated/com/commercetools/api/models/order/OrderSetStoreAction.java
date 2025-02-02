
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetStoreAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetStoreAction orderSetStoreAction = OrderSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetStoreActionImpl.class)
public interface OrderSetStoreAction extends OrderUpdateAction {

    String SET_STORE = "setStore";

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static OrderSetStoreAction of() {
        return new OrderSetStoreActionImpl();
    }

    public static OrderSetStoreAction of(final OrderSetStoreAction template) {
        OrderSetStoreActionImpl instance = new OrderSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static OrderSetStoreActionBuilder builder() {
        return OrderSetStoreActionBuilder.of();
    }

    public static OrderSetStoreActionBuilder builder(final OrderSetStoreAction template) {
        return OrderSetStoreActionBuilder.of(template);
    }

    default <T> T withOrderSetStoreAction(Function<OrderSetStoreAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetStoreAction>";
            }
        };
    }
}
