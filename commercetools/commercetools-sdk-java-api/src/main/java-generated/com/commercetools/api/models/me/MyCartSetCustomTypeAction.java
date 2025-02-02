
package com.commercetools.api.models.me;

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
 * MyCartSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomTypeAction myCartSetCustomTypeAction = MyCartSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetCustomTypeActionImpl.class)
public interface MyCartSetCustomTypeAction extends MyCartUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the MyCart with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyCart.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the MyCart.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyCartSetCustomTypeAction of() {
        return new MyCartSetCustomTypeActionImpl();
    }

    public static MyCartSetCustomTypeAction of(final MyCartSetCustomTypeAction template) {
        MyCartSetCustomTypeActionImpl instance = new MyCartSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyCartSetCustomTypeActionBuilder builder() {
        return MyCartSetCustomTypeActionBuilder.of();
    }

    public static MyCartSetCustomTypeActionBuilder builder(final MyCartSetCustomTypeAction template) {
        return MyCartSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyCartSetCustomTypeAction(Function<MyCartSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetCustomTypeAction>";
            }
        };
    }
}
