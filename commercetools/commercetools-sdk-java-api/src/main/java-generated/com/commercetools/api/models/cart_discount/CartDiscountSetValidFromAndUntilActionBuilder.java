
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidFromAndUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAndUntilAction cartDiscountSetValidFromAndUntilAction = CartDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetValidFromAndUntilActionBuilder implements Builder<CartDiscountSetValidFromAndUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public CartDiscountSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public CartDiscountSetValidFromAndUntilActionBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public CartDiscountSetValidFromAndUntilAction build() {
        return new CartDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * builds CartDiscountSetValidFromAndUntilAction without checking for non null required values
     */
    public CartDiscountSetValidFromAndUntilAction buildUnchecked() {
        return new CartDiscountSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    public static CartDiscountSetValidFromAndUntilActionBuilder of() {
        return new CartDiscountSetValidFromAndUntilActionBuilder();
    }

    public static CartDiscountSetValidFromAndUntilActionBuilder of(
            final CartDiscountSetValidFromAndUntilAction template) {
        CartDiscountSetValidFromAndUntilActionBuilder builder = new CartDiscountSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
