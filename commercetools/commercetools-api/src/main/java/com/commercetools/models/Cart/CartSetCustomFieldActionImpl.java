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
public final class CartSetCustomFieldActionImpl implements CartSetCustomFieldAction {

   private String action;
   
   private String name;
   
   private Object value;

   @JsonCreator
   CartSetCustomFieldActionImpl(@JsonProperty("name") final String name, @JsonProperty("value") final Object value) {
      this.name = name;
      this.value = value;
      this.action = "setCustomField";
   }
   public CartSetCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Object getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final Object value){
      this.value = value;
   }

}