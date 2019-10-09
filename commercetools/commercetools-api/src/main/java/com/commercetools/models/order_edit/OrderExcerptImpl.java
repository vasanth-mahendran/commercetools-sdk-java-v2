package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.common.TypedMoney;
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
public final class OrderExcerptImpl implements OrderExcerpt {

   private com.commercetools.models.common.TypedMoney totalPrice;
   
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   private Integer version;

   @JsonCreator
   OrderExcerptImpl(@JsonProperty("totalPrice") final com.commercetools.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedPrice taxedPrice, @JsonProperty("version") final Integer version) {
      this.totalPrice = totalPrice;
      this.taxedPrice = taxedPrice;
      this.version = version;
   }
   public OrderExcerptImpl() {
      
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public Integer getVersion(){
      return this.version;
   }

   public void setTotalPrice(final com.commercetools.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setVersion(final Integer version){
      this.version = version;
   }

}