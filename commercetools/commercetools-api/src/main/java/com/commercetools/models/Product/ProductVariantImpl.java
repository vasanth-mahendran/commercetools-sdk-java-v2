package com.commercetools.models.product;

import com.commercetools.models.common.Asset;
import com.commercetools.models.common.Image;
import com.commercetools.models.common.Price;
import com.commercetools.models.common.ScopedPrice;
import com.commercetools.models.product.Attribute;
import com.commercetools.models.product.ProductVariantAvailability;
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
public final class ProductVariantImpl implements ProductVariant {

   private com.commercetools.models.common.ScopedPrice scopedPrice;
   
   private java.util.List<com.commercetools.models.common.Image> images;
   
   private java.util.List<com.commercetools.models.common.Asset> assets;
   
   private Boolean isMatchingVariant;
   
   private com.commercetools.models.common.Price price;
   
   private Boolean scopedPriceDiscounted;
   
   private java.util.List<com.commercetools.models.product.Attribute> attributes;
   
   private com.commercetools.models.product.ProductVariantAvailability availability;
   
   private Long id;
   
   private java.util.List<com.commercetools.models.common.Price> prices;
   
   private String sku;
   
   private String key;

   @JsonCreator
   ProductVariantImpl(@JsonProperty("scopedPrice") final com.commercetools.models.common.ScopedPrice scopedPrice, @JsonProperty("images") final java.util.List<com.commercetools.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.models.common.Asset> assets, @JsonProperty("isMatchingVariant") final Boolean isMatchingVariant, @JsonProperty("price") final com.commercetools.models.common.Price price, @JsonProperty("scopedPriceDiscounted") final Boolean scopedPriceDiscounted, @JsonProperty("attributes") final java.util.List<com.commercetools.models.product.Attribute> attributes, @JsonProperty("availability") final com.commercetools.models.product.ProductVariantAvailability availability, @JsonProperty("id") final Long id, @JsonProperty("prices") final java.util.List<com.commercetools.models.common.Price> prices, @JsonProperty("sku") final String sku, @JsonProperty("key") final String key) {
      this.scopedPrice = scopedPrice;
      this.images = images;
      this.assets = assets;
      this.isMatchingVariant = isMatchingVariant;
      this.price = price;
      this.scopedPriceDiscounted = scopedPriceDiscounted;
      this.attributes = attributes;
      this.availability = availability;
      this.id = id;
      this.prices = prices;
      this.sku = sku;
      this.key = key;
   }
   public ProductVariantImpl() {
      
   }
   
   
   public com.commercetools.models.common.ScopedPrice getScopedPrice(){
      return this.scopedPrice;
   }
   
   
   public java.util.List<com.commercetools.models.common.Image> getImages(){
      return this.images;
   }
   
   
   public java.util.List<com.commercetools.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   
   public Boolean getIsMatchingVariant(){
      return this.isMatchingVariant;
   }
   
   
   public com.commercetools.models.common.Price getPrice(){
      return this.price;
   }
   
   
   public Boolean getScopedPriceDiscounted(){
      return this.scopedPriceDiscounted;
   }
   
   
   public java.util.List<com.commercetools.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public com.commercetools.models.product.ProductVariantAvailability getAvailability(){
      return this.availability;
   }
   
   
   public Long getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.common.Price> getPrices(){
      return this.prices;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setScopedPrice(final com.commercetools.models.common.ScopedPrice scopedPrice){
      this.scopedPrice = scopedPrice;
   }
   
   public void setImages(final java.util.List<com.commercetools.models.common.Image> images){
      this.images = images;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setIsMatchingVariant(final Boolean isMatchingVariant){
      this.isMatchingVariant = isMatchingVariant;
   }
   
   public void setPrice(final com.commercetools.models.common.Price price){
      this.price = price;
   }
   
   public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted){
      this.scopedPriceDiscounted = scopedPriceDiscounted;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.models.product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setAvailability(final com.commercetools.models.product.ProductVariantAvailability availability){
      this.availability = availability;
   }
   
   public void setId(final Long id){
      this.id = id;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.common.Price> prices){
      this.prices = prices;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}