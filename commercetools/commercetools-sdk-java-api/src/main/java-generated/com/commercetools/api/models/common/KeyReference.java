package com.commercetools.api.models.common;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.store.StoreKeyReference;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreKeyReferenceImpl.class, name = "store")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "typeId",
    defaultImpl = KeyReferenceImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface KeyReference  {

    
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();
    
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);




    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }
}
