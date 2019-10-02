package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeDefinition;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
import com.commercetools.models.product_type.ProductTypeChangeAttributeOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeOrderActionBuilder {
   
   
   private java.util.List<com.commercetools.models.product_type.AttributeDefinition> attributes;
   
   public ProductTypeChangeAttributeOrderActionBuilder attributes( final java.util.List<com.commercetools.models.product_type.AttributeDefinition> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.product_type.AttributeDefinition> getAttributes(){
      return this.attributes;
   }

   public ProductTypeChangeAttributeOrderAction build() {
       return new ProductTypeChangeAttributeOrderActionImpl(attributes);
   }
   
   public static ProductTypeChangeAttributeOrderActionBuilder of() {
      return new ProductTypeChangeAttributeOrderActionBuilder();
   }
   
   public static ProductTypeChangeAttributeOrderActionBuilder of(final ProductTypeChangeAttributeOrderAction template) {
      ProductTypeChangeAttributeOrderActionBuilder builder = new ProductTypeChangeAttributeOrderActionBuilder();
      builder.attributes = template.getAttributes();
      return builder;
   }
   
}