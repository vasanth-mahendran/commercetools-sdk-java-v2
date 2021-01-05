package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeLocalizableTextTypeImpl.class)
public interface AttributeLocalizableTextType extends AttributeType {



    public static AttributeLocalizableTextType of(){
        return new AttributeLocalizableTextTypeImpl();
    }
    

    public static AttributeLocalizableTextType of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
        return instance;
    }

    public static AttributeLocalizableTextTypeBuilder builder(){
        return AttributeLocalizableTextTypeBuilder.of();
    }
    
    public static AttributeLocalizableTextTypeBuilder builder(final AttributeLocalizableTextType template){
        return AttributeLocalizableTextTypeBuilder.of(template);
    }
    

    default <T> T withAttributeLocalizableTextType(Function<AttributeLocalizableTextType, T> helper) {
        return helper.apply(this);
    }
}
