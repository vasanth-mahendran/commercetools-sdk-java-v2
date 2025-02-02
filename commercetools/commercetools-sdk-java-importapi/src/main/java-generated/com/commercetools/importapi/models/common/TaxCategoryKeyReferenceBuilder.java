
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryKeyReference taxCategoryKeyReference = TaxCategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryKeyReferenceBuilder implements Builder<TaxCategoryKeyReference> {

    private String key;

    /**
     *
     */

    public TaxCategoryKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public TaxCategoryKeyReference build() {
        Objects.requireNonNull(key, TaxCategoryKeyReference.class + ": key is missing");
        return new TaxCategoryKeyReferenceImpl(key);
    }

    /**
     * builds TaxCategoryKeyReference without checking for non null required values
     */
    public TaxCategoryKeyReference buildUnchecked() {
        return new TaxCategoryKeyReferenceImpl(key);
    }

    public static TaxCategoryKeyReferenceBuilder of() {
        return new TaxCategoryKeyReferenceBuilder();
    }

    public static TaxCategoryKeyReferenceBuilder of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceBuilder builder = new TaxCategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
