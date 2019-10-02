package com.commercetools.models.me;

import com.commercetools.models.me.MyPaymentUpdateAction;
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
public final class MyPaymentUpdateImpl implements MyPaymentUpdate {

   private java.util.List<com.commercetools.models.me.MyPaymentUpdateAction> actions;
   
   private Long version;

   @JsonCreator
   MyPaymentUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.models.me.MyPaymentUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public MyPaymentUpdateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.me.MyPaymentUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.models.me.MyPaymentUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}