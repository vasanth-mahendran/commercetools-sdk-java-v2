
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddedToCategoryMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddedToCategoryMessagePayload productAddedToCategoryMessagePayload = ProductAddedToCategoryMessagePayload.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddedToCategoryMessagePayloadBuilder implements Builder<ProductAddedToCategoryMessagePayload> {

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    /**
     *  <p>Reference to a Category.</p>
     */

    public ProductAddedToCategoryMessagePayloadBuilder category(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Category.</p>
     */

    public ProductAddedToCategoryMessagePayloadBuilder category(
            final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }

    /**
     *
     */

    public ProductAddedToCategoryMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddedToCategoryMessagePayload build() {
        Objects.requireNonNull(category, ProductAddedToCategoryMessagePayload.class + ": category is missing");
        Objects.requireNonNull(staged, ProductAddedToCategoryMessagePayload.class + ": staged is missing");
        return new ProductAddedToCategoryMessagePayloadImpl(category, staged);
    }

    /**
     * builds ProductAddedToCategoryMessagePayload without checking for non null required values
     */
    public ProductAddedToCategoryMessagePayload buildUnchecked() {
        return new ProductAddedToCategoryMessagePayloadImpl(category, staged);
    }

    public static ProductAddedToCategoryMessagePayloadBuilder of() {
        return new ProductAddedToCategoryMessagePayloadBuilder();
    }

    public static ProductAddedToCategoryMessagePayloadBuilder of(final ProductAddedToCategoryMessagePayload template) {
        ProductAddedToCategoryMessagePayloadBuilder builder = new ProductAddedToCategoryMessagePayloadBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
