package com.commercetools.models.shipping_method;

import com.commercetools.models.common.Money;
import com.commercetools.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.models.shipping_method.ShippingRateTierType;
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
public final class CartClassificationTierImpl implements CartClassificationTier {

   private com.commercetools.models.shipping_method.ShippingRateTierType type;
   
   private com.commercetools.models.common.Money price;
   
   private Boolean isMatching;
   
   private String value;

   @JsonCreator
   CartClassificationTierImpl(@JsonProperty("price") final com.commercetools.models.common.Money price, @JsonProperty("isMatching") final Boolean isMatching, @JsonProperty("value") final String value) {
      this.price = price;
      this.isMatching = isMatching;
      this.value = value;
      this.type = ShippingRateTierType.findEnumViaJsonName("CartClassification").get();
   }
   public CartClassificationTierImpl() {
      
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRateTierType getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.common.Money getPrice(){
      return this.price;
   }
   
   
   public Boolean getIsMatching(){
      return this.isMatching;
   }
   
   
   public String getValue(){
      return this.value;
   }

   public void setPrice(final com.commercetools.models.common.Money price){
      this.price = price;
   }
   
   public void setIsMatching(final Boolean isMatching){
      this.isMatching = isMatching;
   }
   
   public void setValue(final String value){
      this.value = value;
   }

}