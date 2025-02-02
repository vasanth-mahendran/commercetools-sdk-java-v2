
package com.commercetools.api.models.cart;

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
 * CartSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomTypeAction cartSetCustomTypeAction = CartSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomTypeActionImpl.class)
public interface CartSetCustomTypeAction extends CartUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Cart with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Cart.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetCustomTypeAction of() {
        return new CartSetCustomTypeActionImpl();
    }

    public static CartSetCustomTypeAction of(final CartSetCustomTypeAction template) {
        CartSetCustomTypeActionImpl instance = new CartSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetCustomTypeActionBuilder builder() {
        return CartSetCustomTypeActionBuilder.of();
    }

    public static CartSetCustomTypeActionBuilder builder(final CartSetCustomTypeAction template) {
        return CartSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetCustomTypeAction(Function<CartSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomTypeAction>";
            }
        };
    }
}
