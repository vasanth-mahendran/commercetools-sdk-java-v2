
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeSortOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeSortOrderAction cartDiscountChangeSortOrderAction = CartDiscountChangeSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeSortOrderActionBuilder implements Builder<CartDiscountChangeSortOrderAction> {

    private String sortOrder;

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A Discount with a higher sortOrder is prioritized.</p>
     */

    public CartDiscountChangeSortOrderActionBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public CartDiscountChangeSortOrderAction build() {
        Objects.requireNonNull(sortOrder, CartDiscountChangeSortOrderAction.class + ": sortOrder is missing");
        return new CartDiscountChangeSortOrderActionImpl(sortOrder);
    }

    /**
     * builds CartDiscountChangeSortOrderAction without checking for non null required values
     */
    public CartDiscountChangeSortOrderAction buildUnchecked() {
        return new CartDiscountChangeSortOrderActionImpl(sortOrder);
    }

    public static CartDiscountChangeSortOrderActionBuilder of() {
        return new CartDiscountChangeSortOrderActionBuilder();
    }

    public static CartDiscountChangeSortOrderActionBuilder of(final CartDiscountChangeSortOrderAction template) {
        CartDiscountChangeSortOrderActionBuilder builder = new CartDiscountChangeSortOrderActionBuilder();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
