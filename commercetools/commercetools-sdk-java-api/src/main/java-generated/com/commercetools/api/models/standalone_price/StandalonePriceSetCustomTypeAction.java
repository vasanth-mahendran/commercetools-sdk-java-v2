
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetCustomTypeActionImpl.class)
public interface StandalonePriceSetCustomTypeAction extends StandalonePriceUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the StandalonePrice with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the StandalonePrice.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the StandalonePrice.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StandalonePriceSetCustomTypeAction of() {
        return new StandalonePriceSetCustomTypeActionImpl();
    }

    public static StandalonePriceSetCustomTypeAction of(final StandalonePriceSetCustomTypeAction template) {
        StandalonePriceSetCustomTypeActionImpl instance = new StandalonePriceSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StandalonePriceSetCustomTypeActionBuilder builder() {
        return StandalonePriceSetCustomTypeActionBuilder.of();
    }

    public static StandalonePriceSetCustomTypeActionBuilder builder(final StandalonePriceSetCustomTypeAction template) {
        return StandalonePriceSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withStandalonePriceSetCustomTypeAction(Function<StandalonePriceSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetCustomTypeAction>";
            }
        };
    }
}
