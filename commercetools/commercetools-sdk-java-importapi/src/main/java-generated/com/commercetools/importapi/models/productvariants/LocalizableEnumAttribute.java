package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>This type represents an attribute which value is a localized enum.
*  The attribute value refers to the key of the enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizableEnumAttributeImpl.class)
public interface LocalizableEnumAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static LocalizableEnumAttribute of(){
        return new LocalizableEnumAttributeImpl();
    }
    

    public static LocalizableEnumAttribute of(final LocalizableEnumAttribute template) {
        LocalizableEnumAttributeImpl instance = new LocalizableEnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizableEnumAttributeBuilder builder(){
        return LocalizableEnumAttributeBuilder.of();
    }
    
    public static LocalizableEnumAttributeBuilder builder(final LocalizableEnumAttribute template){
        return LocalizableEnumAttributeBuilder.of(template);
    }
    

    default <T> T withLocalizableEnumAttribute(Function<LocalizableEnumAttribute, T> helper) {
        return helper.apply(this);
    }
}
