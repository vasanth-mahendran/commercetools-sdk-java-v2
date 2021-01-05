package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeMoneyTypeImpl;

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
@JsonDeserialize(as = AttributeMoneyTypeImpl.class)
public interface AttributeMoneyType extends AttributeType {



    public static AttributeMoneyType of(){
        return new AttributeMoneyTypeImpl();
    }
    

    public static AttributeMoneyType of(final AttributeMoneyType template) {
        AttributeMoneyTypeImpl instance = new AttributeMoneyTypeImpl();
        return instance;
    }

    public static AttributeMoneyTypeBuilder builder(){
        return AttributeMoneyTypeBuilder.of();
    }
    
    public static AttributeMoneyTypeBuilder builder(final AttributeMoneyType template){
        return AttributeMoneyTypeBuilder.of(template);
    }
    

    default <T> T withAttributeMoneyType(Function<AttributeMoneyType, T> helper) {
        return helper.apply(this);
    }
}
