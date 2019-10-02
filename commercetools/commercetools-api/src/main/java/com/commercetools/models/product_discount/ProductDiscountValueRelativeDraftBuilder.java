package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.models.product_discount.ProductDiscountValueRelativeDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountValueRelativeDraftBuilder {
   
   
   private Long permyriad;
   
   public ProductDiscountValueRelativeDraftBuilder permyriad( final Long permyriad) {
      this.permyriad = permyriad;
      return this;
   }
   
   
   public Long getPermyriad(){
      return this.permyriad;
   }

   public ProductDiscountValueRelativeDraft build() {
       return new ProductDiscountValueRelativeDraftImpl(permyriad);
   }
   
   public static ProductDiscountValueRelativeDraftBuilder of() {
      return new ProductDiscountValueRelativeDraftBuilder();
   }
   
   public static ProductDiscountValueRelativeDraftBuilder of(final ProductDiscountValueRelativeDraft template) {
      ProductDiscountValueRelativeDraftBuilder builder = new ProductDiscountValueRelativeDraftBuilder();
      builder.permyriad = template.getPermyriad();
      return builder;
   }
   
}