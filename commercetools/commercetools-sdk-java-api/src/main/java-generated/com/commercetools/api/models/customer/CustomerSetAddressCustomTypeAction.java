
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAddressCustomTypeAction customerSetAddressCustomTypeAction = CustomerSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetAddressCustomTypeActionImpl.class)
public interface CustomerSetAddressCustomTypeAction extends CustomerUpdateAction {

    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public void setAddressId(final String addressId);

    public static CustomerSetAddressCustomTypeAction of() {
        return new CustomerSetAddressCustomTypeActionImpl();
    }

    public static CustomerSetAddressCustomTypeAction of(final CustomerSetAddressCustomTypeAction template) {
        CustomerSetAddressCustomTypeActionImpl instance = new CustomerSetAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public static CustomerSetAddressCustomTypeActionBuilder builder() {
        return CustomerSetAddressCustomTypeActionBuilder.of();
    }

    public static CustomerSetAddressCustomTypeActionBuilder builder(final CustomerSetAddressCustomTypeAction template) {
        return CustomerSetAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCustomerSetAddressCustomTypeAction(Function<CustomerSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAddressCustomTypeAction>";
            }
        };
    }
}
