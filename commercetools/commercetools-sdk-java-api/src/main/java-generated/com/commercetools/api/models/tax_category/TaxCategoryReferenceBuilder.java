
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReference taxCategoryReference = TaxCategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryReferenceBuilder implements Builder<TaxCategoryReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategory obj;

    /**
     *  <p>Unique identifier of the referenced TaxCategory.</p>
     */

    public TaxCategoryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded TaxCategory. Only present in responses to requests with Reference Expansion for TaxCategories.</p>
     */

    public TaxCategoryReferenceBuilder obj(
            Function<com.commercetools.api.models.tax_category.TaxCategoryBuilder, com.commercetools.api.models.tax_category.TaxCategoryBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded TaxCategory. Only present in responses to requests with Reference Expansion for TaxCategories.</p>
     */

    public TaxCategoryReferenceBuilder obj(@Nullable final com.commercetools.api.models.tax_category.TaxCategory obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategory getObj() {
        return this.obj;
    }

    public TaxCategoryReference build() {
        Objects.requireNonNull(id, TaxCategoryReference.class + ": id is missing");
        return new TaxCategoryReferenceImpl(id, obj);
    }

    /**
     * builds TaxCategoryReference without checking for non null required values
     */
    public TaxCategoryReference buildUnchecked() {
        return new TaxCategoryReferenceImpl(id, obj);
    }

    public static TaxCategoryReferenceBuilder of() {
        return new TaxCategoryReferenceBuilder();
    }

    public static TaxCategoryReferenceBuilder of(final TaxCategoryReference template) {
        TaxCategoryReferenceBuilder builder = new TaxCategoryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
