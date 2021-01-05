package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SyntaxErrorErrorImpl;

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
@JsonDeserialize(as = SyntaxErrorErrorImpl.class)
public interface SyntaxErrorError extends ErrorObject {



    public static SyntaxErrorError of(){
        return new SyntaxErrorErrorImpl();
    }
    

    public static SyntaxErrorError of(final SyntaxErrorError template) {
        SyntaxErrorErrorImpl instance = new SyntaxErrorErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SyntaxErrorErrorBuilder builder(){
        return SyntaxErrorErrorBuilder.of();
    }
    
    public static SyntaxErrorErrorBuilder builder(final SyntaxErrorError template){
        return SyntaxErrorErrorBuilder.of(template);
    }
    

    default <T> T withSyntaxErrorError(Function<SyntaxErrorError, T> helper) {
        return helper.apply(this);
    }
}
