package com.commercetools.models.type;

import com.commercetools.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.type.TypeUpdateAction;
import com.commercetools.models.type.TypeAddLocalizedEnumValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeAddLocalizedEnumValueActionBuilder {
   
   
   private String fieldName;
   
   
   private com.commercetools.models.type.CustomFieldLocalizedEnumValue value;
   
   public TypeAddLocalizedEnumValueActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeAddLocalizedEnumValueActionBuilder value( final com.commercetools.models.type.CustomFieldLocalizedEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.type.CustomFieldLocalizedEnumValue getValue(){
      return this.value;
   }

   public TypeAddLocalizedEnumValueAction build() {
       return new TypeAddLocalizedEnumValueActionImpl(fieldName, value);
   }
   
   public static TypeAddLocalizedEnumValueActionBuilder of() {
      return new TypeAddLocalizedEnumValueActionBuilder();
   }
   
   public static TypeAddLocalizedEnumValueActionBuilder of(final TypeAddLocalizedEnumValueAction template) {
      TypeAddLocalizedEnumValueActionBuilder builder = new TypeAddLocalizedEnumValueActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}