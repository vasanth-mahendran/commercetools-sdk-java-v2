
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentChangeAmountPlannedActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentChangeAmountPlannedAction myPaymentChangeAmountPlannedAction = MyPaymentChangeAmountPlannedAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentChangeAmountPlannedActionBuilder implements Builder<MyPaymentChangeAmountPlannedAction> {

    private com.commercetools.api.models.common.Money amount;

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public MyPaymentChangeAmountPlannedActionBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public MyPaymentChangeAmountPlannedActionBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public MyPaymentChangeAmountPlannedAction build() {
        Objects.requireNonNull(amount, MyPaymentChangeAmountPlannedAction.class + ": amount is missing");
        return new MyPaymentChangeAmountPlannedActionImpl(amount);
    }

    /**
     * builds MyPaymentChangeAmountPlannedAction without checking for non null required values
     */
    public MyPaymentChangeAmountPlannedAction buildUnchecked() {
        return new MyPaymentChangeAmountPlannedActionImpl(amount);
    }

    public static MyPaymentChangeAmountPlannedActionBuilder of() {
        return new MyPaymentChangeAmountPlannedActionBuilder();
    }

    public static MyPaymentChangeAmountPlannedActionBuilder of(final MyPaymentChangeAmountPlannedAction template) {
        MyPaymentChangeAmountPlannedActionBuilder builder = new MyPaymentChangeAmountPlannedActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
