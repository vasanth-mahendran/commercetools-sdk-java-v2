
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraft productDraft = ProductDraft.builder()
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDraftBuilder implements Builder<ProductDraft> {

    private com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories;

    @Nullable
    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.api.models.product.ProductVariantDraft masterVariant;

    @Nullable
    private java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean publish;

    @Nullable
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    /**
     *  <p>A predefined product type assigned to the product. All products must have a product type.</p>
     */

    public ProductDraftBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder, com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder> builder) {
        this.productType = builder
                .apply(com.commercetools.api.models.product_type.ProductTypeResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>A predefined product type assigned to the product. All products must have a product type.</p>
     */

    public ProductDraftBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType) {
        this.productType = productType;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URLs for the product. A slug must be unique across a project, but a product can have the same slug for different languages. Slugs have a maximum size of 256. Valid characters are: alphabetic characters (<code>A-Z, a-z</code>), numeric characters (<code>0-9</code>), underscores (<code>_</code>) and hyphens (<code>-</code>).</p>
     */

    public ProductDraftBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URLs for the product. A slug must be unique across a project, but a product can have the same slug for different languages. Slugs have a maximum size of 256. Valid characters are: alphabetic characters (<code>A-Z, a-z</code>), numeric characters (<code>0-9</code>), underscores (<code>_</code>) and hyphens (<code>-</code>).</p>
     */

    public ProductDraftBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     */

    public ProductDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Categories assigned to the product.</p>
     */

    public ProductDraftBuilder categories(
            @Nullable final com.commercetools.api.models.category.CategoryResourceIdentifier... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Categories assigned to the product.</p>
     */

    public ProductDraftBuilder categories(
            @Nullable final java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *  <p>Categories assigned to the product.</p>
     */

    public ProductDraftBuilder plusCategories(
            @Nullable final com.commercetools.api.models.category.CategoryResourceIdentifier... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Categories assigned to the product.</p>
     */

    public ProductDraftBuilder plusCategories(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(
            builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Categories assigned to the product.</p>
     */

    public ProductDraftBuilder withCategories(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories.add(
            builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder categoryOrderHints(
            Function<com.commercetools.api.models.product.CategoryOrderHintsBuilder, com.commercetools.api.models.product.CategoryOrderHintsBuilder> builder) {
        this.categoryOrderHints = builder.apply(com.commercetools.api.models.product.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder categoryOrderHints(
            @Nullable final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>The master product variant. Required if the <code>variants</code> array has product variants.</p>
     */

    public ProductDraftBuilder masterVariant(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraftBuilder> builder) {
        this.masterVariant = builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The master product variant. Required if the <code>variants</code> array has product variants.</p>
     */

    public ProductDraftBuilder masterVariant(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft masterVariant) {
        this.masterVariant = masterVariant;
        return this;
    }

    /**
     *  <p>An array of related product variants.</p>
     */

    public ProductDraftBuilder variants(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>An array of related product variants.</p>
     */

    public ProductDraftBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>An array of related product variants.</p>
     */

    public ProductDraftBuilder plusVariants(
            @Nullable final com.commercetools.api.models.product.ProductVariantDraft... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>An array of related product variants.</p>
     */

    public ProductDraftBuilder plusVariants(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraftBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>An array of related product variants.</p>
     */

    public ProductDraftBuilder withVariants(
            Function<com.commercetools.api.models.product.ProductVariantDraftBuilder, com.commercetools.api.models.product.ProductVariantDraftBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(builder.apply(com.commercetools.api.models.product.ProductVariantDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder searchKeywords(
            Function<com.commercetools.api.models.product.SearchKeywordsBuilder, com.commercetools.api.models.product.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.api.models.product.SearchKeywordsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder searchKeywords(
            @Nullable final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the product is published immediately.</p>
     */

    public ProductDraftBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Specifies which type of prices should be used when looking up a price for this product. If not set, <code>Embedded</code> ProductPriceMode is used.</p>
     */

    public ProductDraftBuilder priceMode(
            @Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    public com.commercetools.api.models.product_type.ProductTypeResourceIdentifier getProductType() {
        return this.productType;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> getCategories() {
        return this.categories;
    }

    @Nullable
    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductVariantDraft getMasterVariant() {
        return this.masterVariant;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product.ProductVariantDraft> getVariants() {
        return this.variants;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public ProductDraft build() {
        Objects.requireNonNull(productType, ProductDraft.class + ": productType is missing");
        Objects.requireNonNull(name, ProductDraft.class + ": name is missing");
        Objects.requireNonNull(slug, ProductDraft.class + ": slug is missing");
        return new ProductDraftImpl(productType, name, slug, key, description, categories, categoryOrderHints,
            metaTitle, metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state,
            publish, priceMode);
    }

    /**
     * builds ProductDraft without checking for non null required values
     */
    public ProductDraft buildUnchecked() {
        return new ProductDraftImpl(productType, name, slug, key, description, categories, categoryOrderHints,
            metaTitle, metaDescription, metaKeywords, masterVariant, variants, taxCategory, searchKeywords, state,
            publish, priceMode);
    }

    public static ProductDraftBuilder of() {
        return new ProductDraftBuilder();
    }

    public static ProductDraftBuilder of(final ProductDraft template) {
        ProductDraftBuilder builder = new ProductDraftBuilder();
        builder.productType = template.getProductType();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.categories = template.getCategories();
        builder.categoryOrderHints = template.getCategoryOrderHints();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.masterVariant = template.getMasterVariant();
        builder.variants = template.getVariants();
        builder.taxCategory = template.getTaxCategory();
        builder.searchKeywords = template.getSearchKeywords();
        builder.state = template.getState();
        builder.publish = template.getPublish();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
