
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a CustomerGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupResourceIdentifier customerGroupResourceIdentifier = CustomerGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupResourceIdentifierImpl.class)
public interface CustomerGroupResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<CustomerGroup> {

    String CUSTOMER_GROUP = "customer-group";

    /**
     *  <p>Unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static CustomerGroupResourceIdentifier of() {
        return new CustomerGroupResourceIdentifierImpl();
    }

    public static CustomerGroupResourceIdentifier of(final CustomerGroupResourceIdentifier template) {
        CustomerGroupResourceIdentifierImpl instance = new CustomerGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerGroupResourceIdentifierBuilder builder() {
        return CustomerGroupResourceIdentifierBuilder.of();
    }

    public static CustomerGroupResourceIdentifierBuilder builder(final CustomerGroupResourceIdentifier template) {
        return CustomerGroupResourceIdentifierBuilder.of(template);
    }

    default <T> T withCustomerGroupResourceIdentifier(Function<CustomerGroupResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupResourceIdentifier>";
            }
        };
    }
}
