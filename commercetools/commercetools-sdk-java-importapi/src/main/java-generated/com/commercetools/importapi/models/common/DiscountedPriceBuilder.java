
package com.commercetools.importapi.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPrice discountedPrice = DiscountedPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedPriceBuilder implements Builder<DiscountedPrice> {

    private com.commercetools.importapi.models.common.TypedMoney value;

    private com.commercetools.importapi.models.common.ProductDiscountKeyReference discount;

    /**
     *
     */

    public DiscountedPriceBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public DiscountedPriceBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a ProductDiscount.</p>
     */

    public DiscountedPriceBuilder discount(
            Function<com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder> builder) {
        this.discount = builder.apply(com.commercetools.importapi.models.common.ProductDiscountKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a ProductDiscount.</p>
     */

    public DiscountedPriceBuilder discount(
            final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount) {
        this.discount = discount;
        return this;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    public com.commercetools.importapi.models.common.ProductDiscountKeyReference getDiscount() {
        return this.discount;
    }

    public DiscountedPrice build() {
        Objects.requireNonNull(value, DiscountedPrice.class + ": value is missing");
        Objects.requireNonNull(discount, DiscountedPrice.class + ": discount is missing");
        return new DiscountedPriceImpl(value, discount);
    }

    /**
     * builds DiscountedPrice without checking for non null required values
     */
    public DiscountedPrice buildUnchecked() {
        return new DiscountedPriceImpl(value, discount);
    }

    public static DiscountedPriceBuilder of() {
        return new DiscountedPriceBuilder();
    }

    public static DiscountedPriceBuilder of(final DiscountedPrice template) {
        DiscountedPriceBuilder builder = new DiscountedPriceBuilder();
        builder.value = template.getValue();
        builder.discount = template.getDiscount();
        return builder;
    }

}
