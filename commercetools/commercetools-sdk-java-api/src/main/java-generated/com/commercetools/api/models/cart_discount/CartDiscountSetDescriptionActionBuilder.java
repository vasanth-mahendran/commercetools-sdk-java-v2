
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetDescriptionAction cartDiscountSetDescriptionAction = CartDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetDescriptionActionBuilder implements Builder<CartDiscountSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public CartDiscountSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public CartDiscountSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public CartDiscountSetDescriptionAction build() {
        return new CartDiscountSetDescriptionActionImpl(description);
    }

    /**
     * builds CartDiscountSetDescriptionAction without checking for non null required values
     */
    public CartDiscountSetDescriptionAction buildUnchecked() {
        return new CartDiscountSetDescriptionActionImpl(description);
    }

    public static CartDiscountSetDescriptionActionBuilder of() {
        return new CartDiscountSetDescriptionActionBuilder();
    }

    public static CartDiscountSetDescriptionActionBuilder of(final CartDiscountSetDescriptionAction template) {
        CartDiscountSetDescriptionActionBuilder builder = new CartDiscountSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
