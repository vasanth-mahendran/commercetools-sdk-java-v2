package com.commercetools.models.me;

import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.common.Money;
import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.me.MyCartChangeLineItemQuantityActionImpl;

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
@JsonDeserialize(as = MyCartChangeLineItemQuantityActionImpl.class)
public interface MyCartChangeLineItemQuantityAction extends MyCartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();
   
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Integer quantity);
   
   public void setExternalPrice(final Money externalPrice);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public static MyCartChangeLineItemQuantityActionImpl of(){
      return new MyCartChangeLineItemQuantityActionImpl();
   }
   

   public static MyCartChangeLineItemQuantityActionImpl of(final MyCartChangeLineItemQuantityAction template) {
      MyCartChangeLineItemQuantityActionImpl instance = new MyCartChangeLineItemQuantityActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setLineItemId(template.getLineItemId());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}