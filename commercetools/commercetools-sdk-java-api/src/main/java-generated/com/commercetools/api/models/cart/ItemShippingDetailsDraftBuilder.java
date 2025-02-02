
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingDetailsDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetailsDraft itemShippingDetailsDraft = ItemShippingDetailsDraft.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingDetailsDraftBuilder implements Builder<ItemShippingDetailsDraft> {

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    /**
     *  <p>Used to capture one or more (custom) line item specific shipping addresses. By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item. A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item. For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
     */

    public ItemShippingDetailsDraftBuilder targets(
            final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    /**
     *  <p>Used to capture one or more (custom) line item specific shipping addresses. By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item. A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item. For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
     */

    public ItemShippingDetailsDraftBuilder targets(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    /**
     *  <p>Used to capture one or more (custom) line item specific shipping addresses. By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item. A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item. For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
     */

    public ItemShippingDetailsDraftBuilder plusTargets(
            final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.addAll(Arrays.asList(targets));
        return this;
    }

    /**
     *  <p>Used to capture one or more (custom) line item specific shipping addresses. By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item. A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item. For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
     */

    public ItemShippingDetailsDraftBuilder plusTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Used to capture one or more (custom) line item specific shipping addresses. By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item. A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item. For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
     */

    public ItemShippingDetailsDraftBuilder withTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targets = new ArrayList<>();
        this.targets.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public ItemShippingDetailsDraft build() {
        Objects.requireNonNull(targets, ItemShippingDetailsDraft.class + ": targets is missing");
        return new ItemShippingDetailsDraftImpl(targets);
    }

    /**
     * builds ItemShippingDetailsDraft without checking for non null required values
     */
    public ItemShippingDetailsDraft buildUnchecked() {
        return new ItemShippingDetailsDraftImpl(targets);
    }

    public static ItemShippingDetailsDraftBuilder of() {
        return new ItemShippingDetailsDraftBuilder();
    }

    public static ItemShippingDetailsDraftBuilder of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftBuilder builder = new ItemShippingDetailsDraftBuilder();
        builder.targets = template.getTargets();
        return builder;
    }

}
