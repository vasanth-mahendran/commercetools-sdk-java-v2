
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidFromAction discountCodeSetValidFromAction = DiscountCodeSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetValidFromActionBuilder implements Builder<DiscountCodeSetValidFromAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     */

    public DiscountCodeSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public DiscountCodeSetValidFromAction build() {
        return new DiscountCodeSetValidFromActionImpl(validFrom);
    }

    /**
     * builds DiscountCodeSetValidFromAction without checking for non null required values
     */
    public DiscountCodeSetValidFromAction buildUnchecked() {
        return new DiscountCodeSetValidFromActionImpl(validFrom);
    }

    public static DiscountCodeSetValidFromActionBuilder of() {
        return new DiscountCodeSetValidFromActionBuilder();
    }

    public static DiscountCodeSetValidFromActionBuilder of(final DiscountCodeSetValidFromAction template) {
        DiscountCodeSetValidFromActionBuilder builder = new DiscountCodeSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
