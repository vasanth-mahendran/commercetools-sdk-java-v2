
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategorySetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategorySetKeyAction taxCategorySetKeyAction = TaxCategorySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategorySetKeyActionBuilder implements Builder<TaxCategorySetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public TaxCategorySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public TaxCategorySetKeyAction build() {
        return new TaxCategorySetKeyActionImpl(key);
    }

    /**
     * builds TaxCategorySetKeyAction without checking for non null required values
     */
    public TaxCategorySetKeyAction buildUnchecked() {
        return new TaxCategorySetKeyActionImpl(key);
    }

    public static TaxCategorySetKeyActionBuilder of() {
        return new TaxCategorySetKeyActionBuilder();
    }

    public static TaxCategorySetKeyActionBuilder of(final TaxCategorySetKeyAction template) {
        TaxCategorySetKeyActionBuilder builder = new TaxCategorySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
