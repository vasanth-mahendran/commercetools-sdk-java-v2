package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeConstraintEnumDraft;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeAttributeConstraintActionImpl.class)
public interface ProductTypeChangeAttributeConstraintAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @NotNull
    @JsonProperty("newValue")
    public AttributeConstraintEnumDraft getNewValue();

    public void setAttributeName(final String attributeName);
    
    public void setNewValue(final AttributeConstraintEnumDraft newValue);

    public static ProductTypeChangeAttributeConstraintAction of(){
        return new ProductTypeChangeAttributeConstraintActionImpl();
    }
    

    public static ProductTypeChangeAttributeConstraintAction of(final ProductTypeChangeAttributeConstraintAction template) {
        ProductTypeChangeAttributeConstraintActionImpl instance = new ProductTypeChangeAttributeConstraintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder builder(){
        return ProductTypeChangeAttributeConstraintActionBuilder.of();
    }
    
    public static ProductTypeChangeAttributeConstraintActionBuilder builder(final ProductTypeChangeAttributeConstraintAction template){
        return ProductTypeChangeAttributeConstraintActionBuilder.of(template);
    }
    

    default <T> T withProductTypeChangeAttributeConstraintAction(Function<ProductTypeChangeAttributeConstraintAction, T> helper) {
        return helper.apply(this);
    }
}
