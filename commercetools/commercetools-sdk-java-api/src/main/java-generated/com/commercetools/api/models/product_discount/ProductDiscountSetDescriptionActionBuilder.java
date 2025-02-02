
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetDescriptionAction productDiscountSetDescriptionAction = ProductDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetDescriptionActionBuilder implements Builder<ProductDiscountSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductDiscountSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductDiscountSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ProductDiscountSetDescriptionAction build() {
        return new ProductDiscountSetDescriptionActionImpl(description);
    }

    /**
     * builds ProductDiscountSetDescriptionAction without checking for non null required values
     */
    public ProductDiscountSetDescriptionAction buildUnchecked() {
        return new ProductDiscountSetDescriptionActionImpl(description);
    }

    public static ProductDiscountSetDescriptionActionBuilder of() {
        return new ProductDiscountSetDescriptionActionBuilder();
    }

    public static ProductDiscountSetDescriptionActionBuilder of(final ProductDiscountSetDescriptionAction template) {
        ProductDiscountSetDescriptionActionBuilder builder = new ProductDiscountSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
