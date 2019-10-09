package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLocaleActionBuilder {
   
   @Nullable
   private String locale;
   
   public StagedOrderSetLocaleActionBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }

   public StagedOrderSetLocaleAction build() {
       return new StagedOrderSetLocaleActionImpl(locale);
   }
   
   public static StagedOrderSetLocaleActionBuilder of() {
      return new StagedOrderSetLocaleActionBuilder();
   }
   
   public static StagedOrderSetLocaleActionBuilder of(final StagedOrderSetLocaleAction template) {
      StagedOrderSetLocaleActionBuilder builder = new StagedOrderSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}