package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderDiscountCodeRemovedMessagePayloadImpl.class)
public interface OrderDiscountCodeRemovedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static OrderDiscountCodeRemovedMessagePayload of(){
        return new OrderDiscountCodeRemovedMessagePayloadImpl();
    }
    

    public static OrderDiscountCodeRemovedMessagePayload of(final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadImpl instance = new OrderDiscountCodeRemovedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder builder(){
        return OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }
    
    public static OrderDiscountCodeRemovedMessagePayloadBuilder builder(final OrderDiscountCodeRemovedMessagePayload template){
        return OrderDiscountCodeRemovedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withOrderDiscountCodeRemovedMessagePayload(Function<OrderDiscountCodeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
