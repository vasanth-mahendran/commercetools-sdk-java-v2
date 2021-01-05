package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodActionImpl;

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
@JsonDeserialize(as = StagedOrderSetShippingMethodActionImpl.class)
public interface StagedOrderSetShippingMethodAction extends StagedOrderUpdateAction {

    
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();
    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingMethodAction of(){
        return new StagedOrderSetShippingMethodActionImpl();
    }
    

    public static StagedOrderSetShippingMethodAction of(final StagedOrderSetShippingMethodAction template) {
        StagedOrderSetShippingMethodActionImpl instance = new StagedOrderSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetShippingMethodActionBuilder builder(){
        return StagedOrderSetShippingMethodActionBuilder.of();
    }
    
    public static StagedOrderSetShippingMethodActionBuilder builder(final StagedOrderSetShippingMethodAction template){
        return StagedOrderSetShippingMethodActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetShippingMethodAction(Function<StagedOrderSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
}
