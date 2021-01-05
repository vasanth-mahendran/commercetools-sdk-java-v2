package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionImpl;

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
@JsonDeserialize(as = CustomerRemoveShippingAddressIdActionImpl.class)
public interface CustomerRemoveShippingAddressIdAction extends CustomerUpdateAction {

    
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);
    
    public void setAddressKey(final String addressKey);

    public static CustomerRemoveShippingAddressIdAction of(){
        return new CustomerRemoveShippingAddressIdActionImpl();
    }
    

    public static CustomerRemoveShippingAddressIdAction of(final CustomerRemoveShippingAddressIdAction template) {
        CustomerRemoveShippingAddressIdActionImpl instance = new CustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerRemoveShippingAddressIdActionBuilder builder(){
        return CustomerRemoveShippingAddressIdActionBuilder.of();
    }
    
    public static CustomerRemoveShippingAddressIdActionBuilder builder(final CustomerRemoveShippingAddressIdAction template){
        return CustomerRemoveShippingAddressIdActionBuilder.of(template);
    }
    

    default <T> T withCustomerRemoveShippingAddressIdAction(Function<CustomerRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
