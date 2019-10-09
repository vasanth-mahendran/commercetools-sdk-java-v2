package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetOrderNumberAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetOrderNumberActionBuilder {
   
   @Nullable
   private String orderNumber;
   
   public StagedOrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }

   public StagedOrderSetOrderNumberAction build() {
       return new StagedOrderSetOrderNumberActionImpl(orderNumber);
   }
   
   public static StagedOrderSetOrderNumberActionBuilder of() {
      return new StagedOrderSetOrderNumberActionBuilder();
   }
   
   public static StagedOrderSetOrderNumberActionBuilder of(final StagedOrderSetOrderNumberAction template) {
      StagedOrderSetOrderNumberActionBuilder builder = new StagedOrderSetOrderNumberActionBuilder();
      builder.orderNumber = template.getOrderNumber();
      return builder;
   }
   
}