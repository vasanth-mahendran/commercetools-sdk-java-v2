package com.commercetools.models.order_edit;

import com.commercetools.models.order.OrderState;
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
public final class StagedOrderChangeOrderStateActionImpl implements StagedOrderChangeOrderStateAction {

   private String action;
   
   private com.commercetools.models.order.OrderState orderState;

   @JsonCreator
   StagedOrderChangeOrderStateActionImpl(@JsonProperty("orderState") final com.commercetools.models.order.OrderState orderState) {
      this.orderState = orderState;
      this.action = "changeOrderState";
   }
   public StagedOrderChangeOrderStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   public void setOrderState(final com.commercetools.models.order.OrderState orderState){
      this.orderState = orderState;
   }

}