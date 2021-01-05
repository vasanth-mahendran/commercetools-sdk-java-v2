package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerEmailVerifiedMessagePayloadImpl.class)
public interface CustomerEmailVerifiedMessagePayload extends MessagePayload {



    public static CustomerEmailVerifiedMessagePayload of(){
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }
    

    public static CustomerEmailVerifiedMessagePayload of(final CustomerEmailVerifiedMessagePayload template) {
        CustomerEmailVerifiedMessagePayloadImpl instance = new CustomerEmailVerifiedMessagePayloadImpl();
        return instance;
    }

    public static CustomerEmailVerifiedMessagePayloadBuilder builder(){
        return CustomerEmailVerifiedMessagePayloadBuilder.of();
    }
    
    public static CustomerEmailVerifiedMessagePayloadBuilder builder(final CustomerEmailVerifiedMessagePayload template){
        return CustomerEmailVerifiedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withCustomerEmailVerifiedMessagePayload(Function<CustomerEmailVerifiedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
