
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingMethodTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxAmountAction cartSetShippingMethodTaxAmountAction = CartSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodTaxAmountActionBuilder implements Builder<CartSetShippingMethodTaxAmountAction> {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     *
     */

    public CartSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public CartSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public CartSetShippingMethodTaxAmountAction build() {
        return new CartSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
    }

    /**
     * builds CartSetShippingMethodTaxAmountAction without checking for non null required values
     */
    public CartSetShippingMethodTaxAmountAction buildUnchecked() {
        return new CartSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
    }

    public static CartSetShippingMethodTaxAmountActionBuilder of() {
        return new CartSetShippingMethodTaxAmountActionBuilder();
    }

    public static CartSetShippingMethodTaxAmountActionBuilder of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionBuilder builder = new CartSetShippingMethodTaxAmountActionBuilder();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
