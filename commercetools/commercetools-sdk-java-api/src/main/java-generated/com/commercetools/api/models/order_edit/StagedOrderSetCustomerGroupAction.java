
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerGroupAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerGroupAction stagedOrderSetCustomerGroupAction = StagedOrderSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerGroupActionImpl.class)
public interface StagedOrderSetCustomerGroupAction extends StagedOrderUpdateAction {

    String SET_CUSTOMER_GROUP = "setCustomerGroup";

    /**
     *  <p>ResourceIdentifier to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public static StagedOrderSetCustomerGroupAction of() {
        return new StagedOrderSetCustomerGroupActionImpl();
    }

    public static StagedOrderSetCustomerGroupAction of(final StagedOrderSetCustomerGroupAction template) {
        StagedOrderSetCustomerGroupActionImpl instance = new StagedOrderSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public static StagedOrderSetCustomerGroupActionBuilder builder() {
        return StagedOrderSetCustomerGroupActionBuilder.of();
    }

    public static StagedOrderSetCustomerGroupActionBuilder builder(final StagedOrderSetCustomerGroupAction template) {
        return StagedOrderSetCustomerGroupActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomerGroupAction(Function<StagedOrderSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomerGroupAction>";
            }
        };
    }
}
