
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueFixedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixed cartDiscountValueFixed = CartDiscountValueFixed.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueFixedBuilder implements Builder<CartDiscountValueFixed> {

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueFixedBuilder money(final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueFixedBuilder money(
            final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueFixedBuilder plusMoney(
            final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueFixedBuilder plusMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public CartDiscountValueFixedBuilder withMoney(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    public CartDiscountValueFixed build() {
        Objects.requireNonNull(money, CartDiscountValueFixed.class + ": money is missing");
        return new CartDiscountValueFixedImpl(money);
    }

    /**
     * builds CartDiscountValueFixed without checking for non null required values
     */
    public CartDiscountValueFixed buildUnchecked() {
        return new CartDiscountValueFixedImpl(money);
    }

    public static CartDiscountValueFixedBuilder of() {
        return new CartDiscountValueFixedBuilder();
    }

    public static CartDiscountValueFixedBuilder of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedBuilder builder = new CartDiscountValueFixedBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
