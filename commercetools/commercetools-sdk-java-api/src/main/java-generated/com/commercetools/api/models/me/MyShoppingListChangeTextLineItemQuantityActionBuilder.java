
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeTextLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemQuantityAction myShoppingListChangeTextLineItemQuantityAction = MyShoppingListChangeTextLineItemQuantityAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListChangeTextLineItemQuantityActionBuilder
        implements Builder<MyShoppingListChangeTextLineItemQuantityAction> {

    private String textLineItemId;

    private Long quantity;

    /**
     *
     */

    public MyShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *
     */

    public MyShoppingListChangeTextLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public MyShoppingListChangeTextLineItemQuantityAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListChangeTextLineItemQuantityAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(quantity,
            MyShoppingListChangeTextLineItemQuantityAction.class + ": quantity is missing");
        return new MyShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, quantity);
    }

    /**
     * builds MyShoppingListChangeTextLineItemQuantityAction without checking for non null required values
     */
    public MyShoppingListChangeTextLineItemQuantityAction buildUnchecked() {
        return new MyShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, quantity);
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder of() {
        return new MyShoppingListChangeTextLineItemQuantityActionBuilder();
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder of(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        MyShoppingListChangeTextLineItemQuantityActionBuilder builder = new MyShoppingListChangeTextLineItemQuantityActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
