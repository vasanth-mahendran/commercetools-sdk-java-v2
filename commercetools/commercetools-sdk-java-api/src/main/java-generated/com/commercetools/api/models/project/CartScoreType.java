package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.project.CartScoreTypeImpl;

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
@JsonDeserialize(as = CartScoreTypeImpl.class)
public interface CartScoreType extends ShippingRateInputType {



    public static CartScoreType of(){
        return new CartScoreTypeImpl();
    }
    

    public static CartScoreType of(final CartScoreType template) {
        CartScoreTypeImpl instance = new CartScoreTypeImpl();
        return instance;
    }

    public static CartScoreTypeBuilder builder(){
        return CartScoreTypeBuilder.of();
    }
    
    public static CartScoreTypeBuilder builder(final CartScoreType template){
        return CartScoreTypeBuilder.of(template);
    }
    

    default <T> T withCartScoreType(Function<CartScoreType, T> helper) {
        return helper.apply(this);
    }
}
