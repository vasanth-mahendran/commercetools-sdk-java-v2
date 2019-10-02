package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.models.shopping_list.TextLineItemDraft;
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
public final class ShoppingListDraftImpl implements ShoppingListDraft {

   private java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItemDraft> lineItems;
   
   private String anonymousId;
   
   private java.util.List<com.commercetools.models.shopping_list.TextLineItemDraft> textLineItems;
   
   private Long deleteDaysAfterLastModification;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private com.commercetools.models.common.LocalizedString slug;
   
   private String key;
   
   private com.commercetools.models.customer.CustomerResourceIdentifier customer;

   @JsonCreator
   ShoppingListDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItemDraft> lineItems, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("textLineItems") final java.util.List<com.commercetools.models.shopping_list.TextLineItemDraft> textLineItems, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug, @JsonProperty("key") final String key, @JsonProperty("customer") final com.commercetools.models.customer.CustomerResourceIdentifier customer) {
      this.lineItems = lineItems;
      this.anonymousId = anonymousId;
      this.textLineItems = textLineItems;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.name = name;
      this.description = description;
      this.slug = slug;
      this.key = key;
      this.customer = customer;
   }
   public ShoppingListDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.util.List<com.commercetools.models.shopping_list.TextLineItemDraft> getTextLineItems(){
      return this.textLineItems;
   }
   
   
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setLineItems(final java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setTextLineItems(final java.util.List<com.commercetools.models.shopping_list.TextLineItemDraft> textLineItems){
      this.textLineItems = textLineItems;
   }
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setCustomer(final com.commercetools.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}