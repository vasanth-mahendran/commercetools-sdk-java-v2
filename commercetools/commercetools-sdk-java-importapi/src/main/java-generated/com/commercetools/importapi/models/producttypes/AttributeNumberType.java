package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeNumberTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeNumberTypeImpl.class)
public interface AttributeNumberType extends AttributeType {



    public static AttributeNumberTypeImpl of(){
        return new AttributeNumberTypeImpl();
    }
    

    public static AttributeNumberTypeImpl of(final AttributeNumberType template) {
        AttributeNumberTypeImpl instance = new AttributeNumberTypeImpl();
        return instance;
    }

    default <T> T withAttributeNumberType(Function<AttributeNumberType, T> helper) {
        return helper.apply(this);
    }
}
