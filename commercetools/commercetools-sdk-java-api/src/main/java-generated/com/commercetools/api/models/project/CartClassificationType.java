package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.models.project.CartClassificationTypeImpl;

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
@JsonDeserialize(as = CartClassificationTypeImpl.class)
public interface CartClassificationType extends ShippingRateInputType {

    
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldLocalizedEnumValue> getValues();

    @JsonIgnore
    public void setValues(final CustomFieldLocalizedEnumValue ...values);
    public void setValues(final List<CustomFieldLocalizedEnumValue> values);

    public static CartClassificationType of(){
        return new CartClassificationTypeImpl();
    }
    

    public static CartClassificationType of(final CartClassificationType template) {
        CartClassificationTypeImpl instance = new CartClassificationTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static CartClassificationTypeBuilder builder(){
        return CartClassificationTypeBuilder.of();
    }
    
    public static CartClassificationTypeBuilder builder(final CartClassificationType template){
        return CartClassificationTypeBuilder.of(template);
    }
    

    default <T> T withCartClassificationType(Function<CartClassificationType, T> helper) {
        return helper.apply(this);
    }
}
