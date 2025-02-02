
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListRemoveTextLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListRemoveTextLineItemAction shoppingListRemoveTextLineItemAction = ShoppingListRemoveTextLineItemAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListRemoveTextLineItemActionBuilder implements Builder<ShoppingListRemoveTextLineItemAction> {

    private String textLineItemId;

    @Nullable
    private Long quantity;

    /**
     *
     */

    public ShoppingListRemoveTextLineItemActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *
     */

    public ShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public ShoppingListRemoveTextLineItemAction build() {
        Objects.requireNonNull(textLineItemId,
            ShoppingListRemoveTextLineItemAction.class + ": textLineItemId is missing");
        return new ShoppingListRemoveTextLineItemActionImpl(textLineItemId, quantity);
    }

    /**
     * builds ShoppingListRemoveTextLineItemAction without checking for non null required values
     */
    public ShoppingListRemoveTextLineItemAction buildUnchecked() {
        return new ShoppingListRemoveTextLineItemActionImpl(textLineItemId, quantity);
    }

    public static ShoppingListRemoveTextLineItemActionBuilder of() {
        return new ShoppingListRemoveTextLineItemActionBuilder();
    }

    public static ShoppingListRemoveTextLineItemActionBuilder of(final ShoppingListRemoveTextLineItemAction template) {
        ShoppingListRemoveTextLineItemActionBuilder builder = new ShoppingListRemoveTextLineItemActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
