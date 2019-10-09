package com.commercetools.models.cart;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.Money;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.models.type.CustomFields;
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
public final class CustomLineItemDraftImpl implements CustomLineItemDraft {

   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private Integer quantity;
   
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private com.commercetools.models.common.Money money;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private String slug;
   
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   CustomLineItemDraftImpl(@JsonProperty("externalTaxRate") final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("money") final com.commercetools.models.common.Money money, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.money = money;
      this.custom = custom;
      this.name = name;
      this.slug = slug;
      this.taxCategory = taxCategory;
   }
   public CustomLineItemDraftImpl() {
      
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.common.Money getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setExternalTaxRate(final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setMoney(final com.commercetools.models.common.Money money){
      this.money = money;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSlug(final String slug){
      this.slug = slug;
   }
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}