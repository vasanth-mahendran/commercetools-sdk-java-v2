package com.commercetools.models.order_edit;

import com.commercetools.models.order.OrderReference;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.type.CustomFieldsDraft;
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
public final class OrderEditDraftImpl implements OrderEditDraft {

   private Boolean dryRun;
   
   private com.commercetools.models.order.OrderReference resource;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private String comment;
   
   private java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions;
   
   private String key;

   @JsonCreator
   OrderEditDraftImpl(@JsonProperty("dryRun") final Boolean dryRun, @JsonProperty("resource") final com.commercetools.models.order.OrderReference resource, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("comment") final String comment, @JsonProperty("stagedActions") final java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions, @JsonProperty("key") final String key) {
      this.dryRun = dryRun;
      this.resource = resource;
      this.custom = custom;
      this.comment = comment;
      this.stagedActions = stagedActions;
      this.key = key;
   }
   public OrderEditDraftImpl() {
      
   }
   
   
   public Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public com.commercetools.models.order.OrderReference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public String getComment(){
      return this.comment;
   }
   
   
   public java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setDryRun(final Boolean dryRun){
      this.dryRun = dryRun;
   }
   
   public void setResource(final com.commercetools.models.order.OrderReference resource){
      this.resource = resource;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setComment(final String comment){
      this.comment = comment;
   }
   
   public void setStagedActions(final java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions){
      this.stagedActions = stagedActions;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}