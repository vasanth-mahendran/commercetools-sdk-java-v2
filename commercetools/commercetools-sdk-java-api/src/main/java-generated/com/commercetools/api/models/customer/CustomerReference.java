
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerReference customerReference = CustomerReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerReferenceImpl.class)
public interface CustomerReference extends Reference, com.commercetools.api.models.Identifiable<Customer> {

    String CUSTOMER = "customer";

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     */
    @Valid
    @JsonProperty("obj")
    public Customer getObj();

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Customer obj);

    public void setId(final String id);

    public static CustomerReference of() {
        return new CustomerReferenceImpl();
    }

    public static CustomerReference of(final CustomerReference template) {
        CustomerReferenceImpl instance = new CustomerReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CustomerReferenceBuilder builder() {
        return CustomerReferenceBuilder.of();
    }

    public static CustomerReferenceBuilder builder(final CustomerReference template) {
        return CustomerReferenceBuilder.of(template);
    }

    default <T> T withCustomerReference(Function<CustomerReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerReference>";
            }
        };
    }
}
