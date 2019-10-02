package com.commercetools.models.order_edit;

import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetLineItemPriceActionImpl implements StagedOrderSetLineItemPriceAction {

   private String action;
   
   private String lineItemId;
   
   private com.commercetools.models.common.Money externalPrice;

   @JsonCreator
   StagedOrderSetLineItemPriceActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("externalPrice") final com.commercetools.models.common.Money externalPrice) {
      this.lineItemId = lineItemId;
      this.externalPrice = externalPrice;
      this.action = "setLineItemPrice";
   }
   public StagedOrderSetLineItemPriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setExternalPrice(final com.commercetools.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}