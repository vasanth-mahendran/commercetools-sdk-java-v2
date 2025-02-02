
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a customer group by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupKeyReference customerGroupKeyReference = CustomerGroupKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupKeyReferenceImpl.class)
public interface CustomerGroupKeyReference extends KeyReference {

    String CUSTOMER_GROUP = "customer-group";

    public static CustomerGroupKeyReference of() {
        return new CustomerGroupKeyReferenceImpl();
    }

    public static CustomerGroupKeyReference of(final CustomerGroupKeyReference template) {
        CustomerGroupKeyReferenceImpl instance = new CustomerGroupKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerGroupKeyReferenceBuilder builder() {
        return CustomerGroupKeyReferenceBuilder.of();
    }

    public static CustomerGroupKeyReferenceBuilder builder(final CustomerGroupKeyReference template) {
        return CustomerGroupKeyReferenceBuilder.of(template);
    }

    default <T> T withCustomerGroupKeyReference(Function<CustomerGroupKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupKeyReference>";
            }
        };
    }
}
