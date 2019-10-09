package com.commercetools.models.product;

import com.commercetools.models.product.FacetResult;
import com.commercetools.models.product.FacetTypes;
import com.commercetools.models.product.FilteredFacetResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FilteredFacetResultBuilder {
   
   
   private Long count;
   
   @Nullable
   private Long productCount;
   
   public FilteredFacetResultBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public FilteredFacetResultBuilder productCount(@Nullable final Long productCount) {
      this.productCount = productCount;
      return this;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   @Nullable
   public Long getProductCount(){
      return this.productCount;
   }

   public FilteredFacetResult build() {
       return new FilteredFacetResultImpl(count, productCount);
   }
   
   public static FilteredFacetResultBuilder of() {
      return new FilteredFacetResultBuilder();
   }
   
   public static FilteredFacetResultBuilder of(final FilteredFacetResult template) {
      FilteredFacetResultBuilder builder = new FilteredFacetResultBuilder();
      builder.count = template.getCount();
      builder.productCount = template.getProductCount();
      return builder;
   }
   
}