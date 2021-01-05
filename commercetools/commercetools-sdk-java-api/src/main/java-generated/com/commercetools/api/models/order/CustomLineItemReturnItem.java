package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import com.commercetools.api.models.order.CustomLineItemReturnItemImpl;

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
@JsonDeserialize(as = CustomLineItemReturnItemImpl.class)
public interface CustomLineItemReturnItem extends ReturnItem {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    public void setCustomLineItemId(final String customLineItemId);

    public static CustomLineItemReturnItem of(){
        return new CustomLineItemReturnItemImpl();
    }
    

    public static CustomLineItemReturnItem of(final CustomLineItemReturnItem template) {
        CustomLineItemReturnItemImpl instance = new CustomLineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    public static CustomLineItemReturnItemBuilder builder(){
        return CustomLineItemReturnItemBuilder.of();
    }
    
    public static CustomLineItemReturnItemBuilder builder(final CustomLineItemReturnItem template){
        return CustomLineItemReturnItemBuilder.of(template);
    }
    

    default <T> T withCustomLineItemReturnItem(Function<CustomLineItemReturnItem, T> helper) {
        return helper.apply(this);
    }
}
