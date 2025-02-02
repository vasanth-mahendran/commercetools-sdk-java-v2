
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupUpdate customerGroupUpdate = CustomerGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupUpdateBuilder implements Builder<CustomerGroupUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions;

    /**
     *  <p>Expected version of the CustomerGroup on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */

    public CustomerGroupUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     */

    public CustomerGroupUpdateBuilder actions(
            final com.commercetools.api.models.customer_group.CustomerGroupUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     */

    public CustomerGroupUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     */

    public CustomerGroupUpdateBuilder plusActions(
            final com.commercetools.api.models.customer_group.CustomerGroupUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     */

    public CustomerGroupUpdateBuilder plusActions(
            Function<com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder, Builder<? extends com.commercetools.api.models.customer_group.CustomerGroupUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     */

    public CustomerGroupUpdateBuilder withActions(
            Function<com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder, Builder<? extends com.commercetools.api.models.customer_group.CustomerGroupUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> getActions() {
        return this.actions;
    }

    public CustomerGroupUpdate build() {
        Objects.requireNonNull(version, CustomerGroupUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CustomerGroupUpdate.class + ": actions is missing");
        return new CustomerGroupUpdateImpl(version, actions);
    }

    /**
     * builds CustomerGroupUpdate without checking for non null required values
     */
    public CustomerGroupUpdate buildUnchecked() {
        return new CustomerGroupUpdateImpl(version, actions);
    }

    public static CustomerGroupUpdateBuilder of() {
        return new CustomerGroupUpdateBuilder();
    }

    public static CustomerGroupUpdateBuilder of(final CustomerGroupUpdate template) {
        CustomerGroupUpdateBuilder builder = new CustomerGroupUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
