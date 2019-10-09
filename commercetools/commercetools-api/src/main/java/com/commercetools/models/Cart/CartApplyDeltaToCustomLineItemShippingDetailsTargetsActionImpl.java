package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingTarget;
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
public final class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl implements CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction {

   private String action;
   
   private String customLineItemId;
   
   private java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta;

   @JsonCreator
   CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta) {
      this.customLineItemId = customLineItemId;
      this.targetsDelta = targetsDelta;
      this.action = "applyDeltaToCustomLineItemShippingDetailsTargets";
   }
   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setTargetsDelta(final java.util.List<com.commercetools.models.cart.ItemShippingTarget> targetsDelta){
      this.targetsDelta = targetsDelta;
   }

}