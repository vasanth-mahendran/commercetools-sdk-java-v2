
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveLineItemAction myShoppingListRemoveLineItemAction = MyShoppingListRemoveLineItemAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListRemoveLineItemActionBuilder implements Builder<MyShoppingListRemoveLineItemAction> {

    private String lineItemId;

    @Nullable
    private Long quantity;

    /**
     *
     */

    public MyShoppingListRemoveLineItemActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     */

    public MyShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public MyShoppingListRemoveLineItemAction build() {
        Objects.requireNonNull(lineItemId, MyShoppingListRemoveLineItemAction.class + ": lineItemId is missing");
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    /**
     * builds MyShoppingListRemoveLineItemAction without checking for non null required values
     */
    public MyShoppingListRemoveLineItemAction buildUnchecked() {
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    public static MyShoppingListRemoveLineItemActionBuilder of() {
        return new MyShoppingListRemoveLineItemActionBuilder();
    }

    public static MyShoppingListRemoveLineItemActionBuilder of(final MyShoppingListRemoveLineItemAction template) {
        MyShoppingListRemoveLineItemActionBuilder builder = new MyShoppingListRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
