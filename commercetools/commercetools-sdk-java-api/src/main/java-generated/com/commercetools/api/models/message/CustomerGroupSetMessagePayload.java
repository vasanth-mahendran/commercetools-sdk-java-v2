
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetMessagePayload customerGroupSetMessagePayload = CustomerGroupSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetMessagePayloadImpl.class)
public interface CustomerGroupSetMessagePayload extends MessagePayload {

    String CUSTOMER_GROUP_SET = "CustomerGroupSet";

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public static CustomerGroupSetMessagePayload of() {
        return new CustomerGroupSetMessagePayloadImpl();
    }

    public static CustomerGroupSetMessagePayload of(final CustomerGroupSetMessagePayload template) {
        CustomerGroupSetMessagePayloadImpl instance = new CustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public static CustomerGroupSetMessagePayloadBuilder builder() {
        return CustomerGroupSetMessagePayloadBuilder.of();
    }

    public static CustomerGroupSetMessagePayloadBuilder builder(final CustomerGroupSetMessagePayload template) {
        return CustomerGroupSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerGroupSetMessagePayload(Function<CustomerGroupSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetMessagePayload>";
            }
        };
    }
}
