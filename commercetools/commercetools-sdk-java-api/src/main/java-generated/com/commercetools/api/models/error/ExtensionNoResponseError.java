package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ExtensionNoResponseErrorImpl;

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
@JsonDeserialize(as = ExtensionNoResponseErrorImpl.class)
public interface ExtensionNoResponseError extends ErrorObject {

    
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();
    
    
    @JsonProperty("extensionKey")
    public String getExtensionKey();

    public void setExtensionId(final String extensionId);
    
    public void setExtensionKey(final String extensionKey);

    public static ExtensionNoResponseError of(){
        return new ExtensionNoResponseErrorImpl();
    }
    

    public static ExtensionNoResponseError of(final ExtensionNoResponseError template) {
        ExtensionNoResponseErrorImpl instance = new ExtensionNoResponseErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    public static ExtensionNoResponseErrorBuilder builder(){
        return ExtensionNoResponseErrorBuilder.of();
    }
    
    public static ExtensionNoResponseErrorBuilder builder(final ExtensionNoResponseError template){
        return ExtensionNoResponseErrorBuilder.of(template);
    }
    

    default <T> T withExtensionNoResponseError(Function<ExtensionNoResponseError, T> helper) {
        return helper.apply(this);
    }
}
