
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductMetaBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductMeta similarProductMeta = SimilarProductMeta.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductMetaBuilder implements Builder<SimilarProductMeta> {

    @Nullable
    private com.commercetools.ml.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.ml.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.ml.models.common.Money price;

    @Nullable
    private Long variantCount;

    /**
     *  <p>Localized product name used for similarity estimation.</p>
     */

    public SimilarProductMetaBuilder name(
            Function<com.commercetools.ml.models.common.LocalizedStringBuilder, com.commercetools.ml.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.ml.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Localized product name used for similarity estimation.</p>
     */

    public SimilarProductMetaBuilder name(@Nullable final com.commercetools.ml.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Localized product description used for similarity estimation.</p>
     */

    public SimilarProductMetaBuilder description(
            Function<com.commercetools.ml.models.common.LocalizedStringBuilder, com.commercetools.ml.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.ml.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Localized product description used for similarity estimation.</p>
     */

    public SimilarProductMetaBuilder description(
            @Nullable final com.commercetools.ml.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     */

    public SimilarProductMetaBuilder price(
            Function<com.commercetools.ml.models.common.MoneyBuilder, com.commercetools.ml.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.ml.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     */

    public SimilarProductMetaBuilder price(@Nullable final com.commercetools.ml.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Total number of variants associated with the product.</p>
     */

    public SimilarProductMetaBuilder variantCount(@Nullable final Long variantCount) {
        this.variantCount = variantCount;
        return this;
    }

    @Nullable
    public com.commercetools.ml.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.ml.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public com.commercetools.ml.models.common.Money getPrice() {
        return this.price;
    }

    @Nullable
    public Long getVariantCount() {
        return this.variantCount;
    }

    public SimilarProductMeta build() {
        return new SimilarProductMetaImpl(name, description, price, variantCount);
    }

    /**
     * builds SimilarProductMeta without checking for non null required values
     */
    public SimilarProductMeta buildUnchecked() {
        return new SimilarProductMetaImpl(name, description, price, variantCount);
    }

    public static SimilarProductMetaBuilder of() {
        return new SimilarProductMetaBuilder();
    }

    public static SimilarProductMetaBuilder of(final SimilarProductMeta template) {
        SimilarProductMetaBuilder builder = new SimilarProductMetaBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.price = template.getPrice();
        builder.variantCount = template.getVariantCount();
        return builder;
    }

}
