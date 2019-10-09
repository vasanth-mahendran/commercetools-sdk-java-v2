package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.category.CategorySetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public CategorySetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public CategorySetKeyAction build() {
       return new CategorySetKeyActionImpl(key);
   }
   
   public static CategorySetKeyActionBuilder of() {
      return new CategorySetKeyActionBuilder();
   }
   
   public static CategorySetKeyActionBuilder of(final CategorySetKeyAction template) {
      CategorySetKeyActionBuilder builder = new CategorySetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}