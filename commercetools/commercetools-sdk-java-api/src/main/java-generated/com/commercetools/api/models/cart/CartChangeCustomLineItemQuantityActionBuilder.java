
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemQuantityAction cartChangeCustomLineItemQuantityAction = CartChangeCustomLineItemQuantityAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemQuantityActionBuilder implements Builder<CartChangeCustomLineItemQuantityAction> {

    private String customLineItemId;

    private Long quantity;

    /**
     *
     */

    public CartChangeCustomLineItemQuantityActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     */

    public CartChangeCustomLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public CartChangeCustomLineItemQuantityAction build() {
        Objects.requireNonNull(customLineItemId,
            CartChangeCustomLineItemQuantityAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, CartChangeCustomLineItemQuantityAction.class + ": quantity is missing");
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    /**
     * builds CartChangeCustomLineItemQuantityAction without checking for non null required values
     */
    public CartChangeCustomLineItemQuantityAction buildUnchecked() {
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    public static CartChangeCustomLineItemQuantityActionBuilder of() {
        return new CartChangeCustomLineItemQuantityActionBuilder();
    }

    public static CartChangeCustomLineItemQuantityActionBuilder of(
            final CartChangeCustomLineItemQuantityAction template) {
        CartChangeCustomLineItemQuantityActionBuilder builder = new CartChangeCustomLineItemQuantityActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
