
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveDiscountCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveDiscountCodeAction cartRemoveDiscountCodeAction = CartRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveDiscountCodeActionBuilder implements Builder<CartRemoveDiscountCodeAction> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public CartRemoveDiscountCodeActionBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public CartRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public CartRemoveDiscountCodeAction build() {
        Objects.requireNonNull(discountCode, CartRemoveDiscountCodeAction.class + ": discountCode is missing");
        return new CartRemoveDiscountCodeActionImpl(discountCode);
    }

    /**
     * builds CartRemoveDiscountCodeAction without checking for non null required values
     */
    public CartRemoveDiscountCodeAction buildUnchecked() {
        return new CartRemoveDiscountCodeActionImpl(discountCode);
    }

    public static CartRemoveDiscountCodeActionBuilder of() {
        return new CartRemoveDiscountCodeActionBuilder();
    }

    public static CartRemoveDiscountCodeActionBuilder of(final CartRemoveDiscountCodeAction template) {
        CartRemoveDiscountCodeActionBuilder builder = new CartRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
