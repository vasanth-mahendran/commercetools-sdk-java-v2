
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeLineItemsOrderAction shoppingListChangeLineItemsOrderAction = ShoppingListChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeLineItemsOrderActionBuilder implements Builder<ShoppingListChangeLineItemsOrderAction> {

    private java.util.List<String> lineItemOrder;

    /**
     *
     */

    public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }

    /**
     *
     */

    public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }

    /**
     *
     */

    public ShoppingListChangeLineItemsOrderActionBuilder plusLineItemOrder(final String... lineItemOrder) {
        if (this.lineItemOrder == null) {
            this.lineItemOrder = new ArrayList<>();
        }
        this.lineItemOrder.addAll(Arrays.asList(lineItemOrder));
        return this;
    }

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    public ShoppingListChangeLineItemsOrderAction build() {
        Objects.requireNonNull(lineItemOrder,
            ShoppingListChangeLineItemsOrderAction.class + ": lineItemOrder is missing");
        return new ShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * builds ShoppingListChangeLineItemsOrderAction without checking for non null required values
     */
    public ShoppingListChangeLineItemsOrderAction buildUnchecked() {
        return new ShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    public static ShoppingListChangeLineItemsOrderActionBuilder of() {
        return new ShoppingListChangeLineItemsOrderActionBuilder();
    }

    public static ShoppingListChangeLineItemsOrderActionBuilder of(
            final ShoppingListChangeLineItemsOrderAction template) {
        ShoppingListChangeLineItemsOrderActionBuilder builder = new ShoppingListChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
