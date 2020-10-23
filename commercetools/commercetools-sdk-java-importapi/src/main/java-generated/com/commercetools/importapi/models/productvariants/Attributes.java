package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.AttributesImpl;

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
@JsonDeserialize(as = AttributesImpl.class)
public interface Attributes  {

    /**
    *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself.
    *  And since this property will be represented as a map, we can set individual attributes to null
    *  to delete them (which follows JSON Merge Patch semantics).</p>
    */
    @NotNull
    @JsonAnyGetter
    public Map<String, Attribute> values();

    @JsonAnySetter
    public void setValue(String key, Attribute value);

    public static AttributesImpl of(){
        return new AttributesImpl();
    }
    

    public static AttributesImpl of(final Attributes template) {
        AttributesImpl instance = new AttributesImpl();
        return instance;
    }

    default <T> T withAttributes(Function<Attributes, T> helper) {
        return helper.apply(this);
    }
}
