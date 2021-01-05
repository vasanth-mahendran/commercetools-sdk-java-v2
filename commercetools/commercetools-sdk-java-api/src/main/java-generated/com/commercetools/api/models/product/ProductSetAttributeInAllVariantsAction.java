package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionImpl;

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
@JsonDeserialize(as = ProductSetAttributeInAllVariantsActionImpl.class)
public interface ProductSetAttributeInAllVariantsAction extends ProductUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
    *  <p>The same update behavior as for Set Attribute applies.</p>
    */
    
    @JsonProperty("value")
    public JsonNode getValue();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);
    
    public void setStaged(final Boolean staged);

    public static ProductSetAttributeInAllVariantsAction of(){
        return new ProductSetAttributeInAllVariantsActionImpl();
    }
    

    public static ProductSetAttributeInAllVariantsAction of(final ProductSetAttributeInAllVariantsAction template) {
        ProductSetAttributeInAllVariantsActionImpl instance = new ProductSetAttributeInAllVariantsActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetAttributeInAllVariantsActionBuilder builder(){
        return ProductSetAttributeInAllVariantsActionBuilder.of();
    }
    
    public static ProductSetAttributeInAllVariantsActionBuilder builder(final ProductSetAttributeInAllVariantsAction template){
        return ProductSetAttributeInAllVariantsActionBuilder.of(template);
    }
    

    default <T> T withProductSetAttributeInAllVariantsAction(Function<ProductSetAttributeInAllVariantsAction, T> helper) {
        return helper.apply(this);
    }
}
