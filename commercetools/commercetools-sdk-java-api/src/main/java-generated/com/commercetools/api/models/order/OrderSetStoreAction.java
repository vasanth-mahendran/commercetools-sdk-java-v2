package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.order.OrderSetStoreActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetStoreActionImpl.class)
public interface OrderSetStoreAction extends OrderUpdateAction {

    
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static OrderSetStoreAction of(){
        return new OrderSetStoreActionImpl();
    }
    

    public static OrderSetStoreAction of(final OrderSetStoreAction template) {
        OrderSetStoreActionImpl instance = new OrderSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static OrderSetStoreActionBuilder builder(){
        return OrderSetStoreActionBuilder.of();
    }
    
    public static OrderSetStoreActionBuilder builder(final OrderSetStoreAction template){
        return OrderSetStoreActionBuilder.of(template);
    }
    

    default <T> T withOrderSetStoreAction(Function<OrderSetStoreAction, T> helper) {
        return helper.apply(this);
    }
}
