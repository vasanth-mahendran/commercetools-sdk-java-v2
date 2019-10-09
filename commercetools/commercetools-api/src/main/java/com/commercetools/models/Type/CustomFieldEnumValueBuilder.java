package com.commercetools.models.type;


import com.commercetools.models.type.CustomFieldEnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldEnumValueBuilder {
   
   
   private String label;
   
   
   private String key;
   
   public CustomFieldEnumValueBuilder label( final String label) {
      this.label = label;
      return this;
   }
   
   public CustomFieldEnumValueBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public CustomFieldEnumValue build() {
       return new CustomFieldEnumValueImpl(label, key);
   }
   
   public static CustomFieldEnumValueBuilder of() {
      return new CustomFieldEnumValueBuilder();
   }
   
   public static CustomFieldEnumValueBuilder of(final CustomFieldEnumValue template) {
      CustomFieldEnumValueBuilder builder = new CustomFieldEnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}