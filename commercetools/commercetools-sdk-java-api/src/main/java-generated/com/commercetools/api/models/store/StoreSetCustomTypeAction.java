
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCustomTypeAction storeSetCustomTypeAction = StoreSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCustomTypeActionImpl.class)
public interface StoreSetCustomTypeAction extends StoreUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Store with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Store.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StoreSetCustomTypeAction of() {
        return new StoreSetCustomTypeActionImpl();
    }

    public static StoreSetCustomTypeAction of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionImpl instance = new StoreSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StoreSetCustomTypeActionBuilder builder() {
        return StoreSetCustomTypeActionBuilder.of();
    }

    public static StoreSetCustomTypeActionBuilder builder(final StoreSetCustomTypeAction template) {
        return StoreSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withStoreSetCustomTypeAction(Function<StoreSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCustomTypeAction>";
            }
        };
    }
}
