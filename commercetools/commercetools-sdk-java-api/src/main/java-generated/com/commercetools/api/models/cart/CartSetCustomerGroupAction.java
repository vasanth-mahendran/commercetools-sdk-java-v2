
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomerGroupAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerGroupAction cartSetCustomerGroupAction = CartSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomerGroupActionImpl.class)
public interface CartSetCustomerGroupAction extends CartUpdateAction {

    String SET_CUSTOMER_GROUP = "setCustomerGroup";

    /**
     *  <p>ResourceIdentifier to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public static CartSetCustomerGroupAction of() {
        return new CartSetCustomerGroupActionImpl();
    }

    public static CartSetCustomerGroupAction of(final CartSetCustomerGroupAction template) {
        CartSetCustomerGroupActionImpl instance = new CartSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public static CartSetCustomerGroupActionBuilder builder() {
        return CartSetCustomerGroupActionBuilder.of();
    }

    public static CartSetCustomerGroupActionBuilder builder(final CartSetCustomerGroupAction template) {
        return CartSetCustomerGroupActionBuilder.of(template);
    }

    default <T> T withCartSetCustomerGroupAction(Function<CartSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomerGroupAction>";
            }
        };
    }
}
