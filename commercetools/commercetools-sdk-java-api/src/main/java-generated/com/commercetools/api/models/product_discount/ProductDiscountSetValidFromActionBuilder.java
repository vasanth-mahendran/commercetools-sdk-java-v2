
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAction productDiscountSetValidFromAction = ProductDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountSetValidFromActionBuilder implements Builder<ProductDiscountSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     */

    public ProductDiscountSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public ProductDiscountSetValidFromAction build() {
        return new ProductDiscountSetValidFromActionImpl(validFrom);
    }

    /**
     * builds ProductDiscountSetValidFromAction without checking for non null required values
     */
    public ProductDiscountSetValidFromAction buildUnchecked() {
        return new ProductDiscountSetValidFromActionImpl(validFrom);
    }

    public static ProductDiscountSetValidFromActionBuilder of() {
        return new ProductDiscountSetValidFromActionBuilder();
    }

    public static ProductDiscountSetValidFromActionBuilder of(final ProductDiscountSetValidFromAction template) {
        ProductDiscountSetValidFromActionBuilder builder = new ProductDiscountSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
