package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxAmountDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxAmountActionImpl.class)
public interface StagedOrderSetShippingMethodTaxAmountAction extends StagedOrderUpdateAction {

   
   @Valid
   @JsonProperty("externalTaxAmount")
   public ExternalTaxAmountDraft getExternalTaxAmount();

   public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);
   
   public static StagedOrderSetShippingMethodTaxAmountActionImpl of(){
      return new StagedOrderSetShippingMethodTaxAmountActionImpl();
   }
   

   public static StagedOrderSetShippingMethodTaxAmountActionImpl of(final StagedOrderSetShippingMethodTaxAmountAction template) {
      StagedOrderSetShippingMethodTaxAmountActionImpl instance = new StagedOrderSetShippingMethodTaxAmountActionImpl();
      instance.setExternalTaxAmount(template.getExternalTaxAmount());
      return instance;
   }

}