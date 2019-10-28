package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductData;
import com.commercetools.api.generated.models.product.ProductCatalogData;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductCatalogDataBuilder {
   
   
   private com.commercetools.api.generated.models.product.ProductData current;
   
   
   private com.commercetools.api.generated.models.product.ProductData staged;
   
   
   private Boolean published;
   
   
   private Boolean hasStagedChanges;
   
   public ProductCatalogDataBuilder current( final com.commercetools.api.generated.models.product.ProductData current) {
      this.current = current;
      return this;
   }
   
   public ProductCatalogDataBuilder staged( final com.commercetools.api.generated.models.product.ProductData staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductCatalogDataBuilder published( final Boolean published) {
      this.published = published;
      return this;
   }
   
   public ProductCatalogDataBuilder hasStagedChanges( final Boolean hasStagedChanges) {
      this.hasStagedChanges = hasStagedChanges;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductData getCurrent(){
      return this.current;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductData getStaged(){
      return this.staged;
   }
   
   
   public Boolean getPublished(){
      return this.published;
   }
   
   
   public Boolean getHasStagedChanges(){
      return this.hasStagedChanges;
   }

   public ProductCatalogData build() {
       return new ProductCatalogDataImpl(current, staged, published, hasStagedChanges);
   }
   
   public static ProductCatalogDataBuilder of() {
      return new ProductCatalogDataBuilder();
   }
   
   public static ProductCatalogDataBuilder of(final ProductCatalogData template) {
      ProductCatalogDataBuilder builder = new ProductCatalogDataBuilder();
      builder.current = template.getCurrent();
      builder.staged = template.getStaged();
      builder.published = template.getPublished();
      builder.hasStagedChanges = template.getHasStagedChanges();
      return builder;
   }
   
}