package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
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
public final class CartAddDiscountCodeActionImpl implements CartAddDiscountCodeAction {

   private String action;
   
   private String code;

   @JsonCreator
   CartAddDiscountCodeActionImpl(@JsonProperty("code") final String code) {
      this.code = code;
      this.action = "addDiscountCode";
   }
   public CartAddDiscountCodeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCode(){
      return this.code;
   }

   public void setCode(final String code){
      this.code = code;
   }

}