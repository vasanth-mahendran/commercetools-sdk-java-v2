package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
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
public final class ShoppingListSetTextLineItemDescriptionActionImpl implements ShoppingListSetTextLineItemDescriptionAction {

   private String action;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private String textLineItemId;

   @JsonCreator
   ShoppingListSetTextLineItemDescriptionActionImpl(@JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("textLineItemId") final String textLineItemId) {
      this.description = description;
      this.textLineItemId = textLineItemId;
      this.action = "setTextLineItemDescription";
   }
   public ShoppingListSetTextLineItemDescriptionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setTextLineItemId(final String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}