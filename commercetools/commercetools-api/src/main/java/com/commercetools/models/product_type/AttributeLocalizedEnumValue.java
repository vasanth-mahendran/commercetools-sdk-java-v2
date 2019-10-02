package com.commercetools.models.product_type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_type.AttributeLocalizedEnumValueImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeLocalizedEnumValueImpl.class)
public interface AttributeLocalizedEnumValue  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();

   public void setKey(final String key);
   
   public void setLabel(final LocalizedString label);
   
   public static AttributeLocalizedEnumValueImpl of(){
      return new AttributeLocalizedEnumValueImpl();
   }
   

   public static AttributeLocalizedEnumValueImpl of(final AttributeLocalizedEnumValue template) {
      AttributeLocalizedEnumValueImpl instance = new AttributeLocalizedEnumValueImpl();
      instance.setLabel(template.getLabel());
      instance.setKey(template.getKey());
      return instance;
   }

}