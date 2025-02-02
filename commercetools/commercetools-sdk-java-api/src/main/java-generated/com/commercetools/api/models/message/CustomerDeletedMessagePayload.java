
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDeletedMessagePayload customerDeletedMessagePayload = CustomerDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDeletedMessagePayloadImpl.class)
public interface CustomerDeletedMessagePayload extends MessagePayload {

    String CUSTOMER_DELETED = "CustomerDeleted";

    public static CustomerDeletedMessagePayload of() {
        return new CustomerDeletedMessagePayloadImpl();
    }

    public static CustomerDeletedMessagePayload of(final CustomerDeletedMessagePayload template) {
        CustomerDeletedMessagePayloadImpl instance = new CustomerDeletedMessagePayloadImpl();
        return instance;
    }

    public static CustomerDeletedMessagePayloadBuilder builder() {
        return CustomerDeletedMessagePayloadBuilder.of();
    }

    public static CustomerDeletedMessagePayloadBuilder builder(final CustomerDeletedMessagePayload template) {
        return CustomerDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerDeletedMessagePayload(Function<CustomerDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDeletedMessagePayload>";
            }
        };
    }
}
