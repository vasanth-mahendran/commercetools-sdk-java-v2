
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxPortionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortion taxPortion = TaxPortion.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxPortionBuilder implements Builder<TaxPortion> {

    @Nullable
    private String name;

    private Double rate;

    private com.commercetools.importapi.models.common.TypedMoney amount;

    /**
     *
     */

    public TaxPortionBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public TaxPortionBuilder rate(final Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     *
     */

    public TaxPortionBuilder amount(final com.commercetools.importapi.models.common.TypedMoney amount) {
        this.amount = amount;
        return this;
    }

    /**
     *
     */

    public TaxPortionBuilder amount(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.amount = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public Double getRate() {
        return this.rate;
    }

    public com.commercetools.importapi.models.common.TypedMoney getAmount() {
        return this.amount;
    }

    public TaxPortion build() {
        Objects.requireNonNull(rate, TaxPortion.class + ": rate is missing");
        Objects.requireNonNull(amount, TaxPortion.class + ": amount is missing");
        return new TaxPortionImpl(name, rate, amount);
    }

    /**
     * builds TaxPortion without checking for non null required values
     */
    public TaxPortion buildUnchecked() {
        return new TaxPortionImpl(name, rate, amount);
    }

    public static TaxPortionBuilder of() {
        return new TaxPortionBuilder();
    }

    public static TaxPortionBuilder of(final TaxPortion template) {
        TaxPortionBuilder builder = new TaxPortionBuilder();
        builder.name = template.getName();
        builder.rate = template.getRate();
        builder.amount = template.getAmount();
        return builder;
    }

}
