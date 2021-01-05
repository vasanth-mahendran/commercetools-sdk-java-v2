package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategoryChangeNameActionImpl;

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
@JsonDeserialize(as = CategoryChangeNameActionImpl.class)
public interface CategoryChangeNameAction extends CategoryUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static CategoryChangeNameAction of(){
        return new CategoryChangeNameActionImpl();
    }
    

    public static CategoryChangeNameAction of(final CategoryChangeNameAction template) {
        CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static CategoryChangeNameActionBuilder builder(){
        return CategoryChangeNameActionBuilder.of();
    }
    
    public static CategoryChangeNameActionBuilder builder(final CategoryChangeNameAction template){
        return CategoryChangeNameActionBuilder.of(template);
    }
    

    default <T> T withCategoryChangeNameAction(Function<CategoryChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
