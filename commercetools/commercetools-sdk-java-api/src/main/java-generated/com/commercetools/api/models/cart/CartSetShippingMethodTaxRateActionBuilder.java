
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingMethodTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxRateAction cartSetShippingMethodTaxRateAction = CartSetShippingMethodTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodTaxRateActionBuilder implements Builder<CartSetShippingMethodTaxRateAction> {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *
     */

    public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public CartSetShippingMethodTaxRateAction build() {
        return new CartSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    /**
     * builds CartSetShippingMethodTaxRateAction without checking for non null required values
     */
    public CartSetShippingMethodTaxRateAction buildUnchecked() {
        return new CartSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    public static CartSetShippingMethodTaxRateActionBuilder of() {
        return new CartSetShippingMethodTaxRateActionBuilder();
    }

    public static CartSetShippingMethodTaxRateActionBuilder of(final CartSetShippingMethodTaxRateAction template) {
        CartSetShippingMethodTaxRateActionBuilder builder = new CartSetShippingMethodTaxRateActionBuilder();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
