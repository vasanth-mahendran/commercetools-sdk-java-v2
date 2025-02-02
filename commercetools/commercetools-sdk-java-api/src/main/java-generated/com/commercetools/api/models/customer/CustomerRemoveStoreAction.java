
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerRemoveStoreAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveStoreAction customerRemoveStoreAction = CustomerRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveStoreActionImpl.class)
public interface CustomerRemoveStoreAction extends CustomerUpdateAction {

    String REMOVE_STORE = "removeStore";

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static CustomerRemoveStoreAction of() {
        return new CustomerRemoveStoreActionImpl();
    }

    public static CustomerRemoveStoreAction of(final CustomerRemoveStoreAction template) {
        CustomerRemoveStoreActionImpl instance = new CustomerRemoveStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static CustomerRemoveStoreActionBuilder builder() {
        return CustomerRemoveStoreActionBuilder.of();
    }

    public static CustomerRemoveStoreActionBuilder builder(final CustomerRemoveStoreAction template) {
        return CustomerRemoveStoreActionBuilder.of(template);
    }

    default <T> T withCustomerRemoveStoreAction(Function<CustomerRemoveStoreAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveStoreAction>";
            }
        };
    }
}
