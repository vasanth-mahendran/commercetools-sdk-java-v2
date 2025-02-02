
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupChangeNameAction customerGroupChangeNameAction = CustomerGroupChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupChangeNameActionImpl.class)
public interface CustomerGroupChangeNameAction extends CustomerGroupUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
     *  <p>New name of the CustomerGroup.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static CustomerGroupChangeNameAction of() {
        return new CustomerGroupChangeNameActionImpl();
    }

    public static CustomerGroupChangeNameAction of(final CustomerGroupChangeNameAction template) {
        CustomerGroupChangeNameActionImpl instance = new CustomerGroupChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static CustomerGroupChangeNameActionBuilder builder() {
        return CustomerGroupChangeNameActionBuilder.of();
    }

    public static CustomerGroupChangeNameActionBuilder builder(final CustomerGroupChangeNameAction template) {
        return CustomerGroupChangeNameActionBuilder.of(template);
    }

    default <T> T withCustomerGroupChangeNameAction(Function<CustomerGroupChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupChangeNameAction>";
            }
        };
    }
}
