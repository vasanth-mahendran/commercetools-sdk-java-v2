
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemMoneyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemMoneyAction cartChangeCustomLineItemMoneyAction = CartChangeCustomLineItemMoneyAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemMoneyActionBuilder implements Builder<CartChangeCustomLineItemMoneyAction> {

    private String customLineItemId;

    private com.commercetools.api.models.common.Money money;

    /**
     *
     */

    public CartChangeCustomLineItemMoneyActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public CartChangeCustomLineItemMoneyActionBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public CartChangeCustomLineItemMoneyActionBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public CartChangeCustomLineItemMoneyAction build() {
        Objects.requireNonNull(customLineItemId,
            CartChangeCustomLineItemMoneyAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(money, CartChangeCustomLineItemMoneyAction.class + ": money is missing");
        return new CartChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    /**
     * builds CartChangeCustomLineItemMoneyAction without checking for non null required values
     */
    public CartChangeCustomLineItemMoneyAction buildUnchecked() {
        return new CartChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    public static CartChangeCustomLineItemMoneyActionBuilder of() {
        return new CartChangeCustomLineItemMoneyActionBuilder();
    }

    public static CartChangeCustomLineItemMoneyActionBuilder of(final CartChangeCustomLineItemMoneyAction template) {
        CartChangeCustomLineItemMoneyActionBuilder builder = new CartChangeCustomLineItemMoneyActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.money = template.getMoney();
        return builder;
    }

}
