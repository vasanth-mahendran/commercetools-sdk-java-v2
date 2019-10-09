package com.commercetools.models.customer_group;

import com.commercetools.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.models.customer_group.CustomerGroupSetKeyActionImpl;

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
@JsonDeserialize(as = CustomerGroupSetKeyActionImpl.class)
public interface CustomerGroupSetKeyAction extends CustomerGroupUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static CustomerGroupSetKeyActionImpl of(){
      return new CustomerGroupSetKeyActionImpl();
   }
   

   public static CustomerGroupSetKeyActionImpl of(final CustomerGroupSetKeyAction template) {
      CustomerGroupSetKeyActionImpl instance = new CustomerGroupSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}