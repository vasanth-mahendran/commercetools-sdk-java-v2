
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a customer by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerKeyReference customerKeyReference = CustomerKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerKeyReferenceImpl.class)
public interface CustomerKeyReference extends KeyReference {

    String CUSTOMER = "customer";

    public static CustomerKeyReference of() {
        return new CustomerKeyReferenceImpl();
    }

    public static CustomerKeyReference of(final CustomerKeyReference template) {
        CustomerKeyReferenceImpl instance = new CustomerKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerKeyReferenceBuilder builder() {
        return CustomerKeyReferenceBuilder.of();
    }

    public static CustomerKeyReferenceBuilder builder(final CustomerKeyReference template) {
        return CustomerKeyReferenceBuilder.of(template);
    }

    default <T> T withCustomerKeyReference(Function<CustomerKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerKeyReference>";
            }
        };
    }
}
