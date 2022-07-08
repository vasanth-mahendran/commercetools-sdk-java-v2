
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The representation sent to the server when creating a new Product.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDraftImpl implements ProductDraft, ModelBase {

    private com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    private String key;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories;

    private com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private com.commercetools.api.models.product.ProductVariantDraft masterVariant;

    private java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants;

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private Boolean publish;

    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    @JsonCreator
    ProductDraftImpl(
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("key") final String key,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("categories") final java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories,
            @JsonProperty("categoryOrderHints") final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints,
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("masterVariant") final com.commercetools.api.models.product.ProductVariantDraft masterVariant,
            @JsonProperty("variants") final java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory,
            @JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("priceMode") final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.productType = productType;
        this.name = name;
        this.slug = slug;
        this.key = key;
        this.description = description;
        this.categories = categories;
        this.categoryOrderHints = categoryOrderHints;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.masterVariant = masterVariant;
        this.variants = variants;
        this.taxCategory = taxCategory;
        this.searchKeywords = searchKeywords;
        this.state = state;
        this.publish = publish;
        this.priceMode = priceMode;
    }

    public ProductDraftImpl() {
    }

    /**
     *  <p>ProductType of the Product.</p>
     */

    public com.commercetools.api.models.product_type.ProductTypeResourceIdentifier getProductType() {
        return this.productType;
    }

    /**
     *  <p>Name of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product. It must be unique across a Project, but a Product can have the same slug in different locales. It must match the pattern <code>[a-zA-Z0-9_\-]{2,256}</code>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>User-defined unique identifier for the Product.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Categories assigned to the Product.</p>
     */

    public java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> getCategories() {
        return this.categories;
    }

    /**
     *  <p>Controls the order of Products in Categories.</p>
     */

    public com.commercetools.api.models.product.CategoryOrderHints getCategoryOrderHints() {
        return this.categoryOrderHints;
    }

    /**
     *  <p>Title of the Product displayed in search results.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the Product displayed in search results.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords that give additional information about the Product to search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Master ProductVariant. This field is required if <code>variants</code> is not empty.</p>
     */

    public com.commercetools.api.models.product.ProductVariantDraft getMasterVariant() {
        return this.masterVariant;
    }

    /**
     *  <p>ProductVariants of the Product.</p>
     */

    public java.util.List<com.commercetools.api.models.product.ProductVariantDraft> getVariants() {
        return this.variants;
    }

    /**
     *  <p>TaxCategory assigned to the Product.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Used by Product Suggestions, but is also considered for a full text search.</p>
     */

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>State assigned to the Product.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>If <code>true</code>, the Product is published immediately to the current projection.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Specifies the type of prices used when looking up a price for the Product.</p>
     */

    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public void setProductType(
            final com.commercetools.api.models.product_type.ProductTypeResourceIdentifier productType) {
        this.productType = productType;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setCategories(final com.commercetools.api.models.category.CategoryResourceIdentifier... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
    }

    public void setCategories(
            final java.util.List<com.commercetools.api.models.category.CategoryResourceIdentifier> categories) {
        this.categories = categories;
    }

    public void setCategoryOrderHints(
            final com.commercetools.api.models.product.CategoryOrderHints categoryOrderHints) {
        this.categoryOrderHints = categoryOrderHints;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setMasterVariant(final com.commercetools.api.models.product.ProductVariantDraft masterVariant) {
        this.masterVariant = masterVariant;
    }

    public void setVariants(final com.commercetools.api.models.product.ProductVariantDraft... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(final java.util.List<com.commercetools.api.models.product.ProductVariantDraft> variants) {
        this.variants = variants;
    }

    public void setTaxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setPriceMode(final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDraftImpl that = (ProductDraftImpl) o;

        return new EqualsBuilder().append(productType, that.productType)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(key, that.key)
                .append(description, that.description)
                .append(categories, that.categories)
                .append(categoryOrderHints, that.categoryOrderHints)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(masterVariant, that.masterVariant)
                .append(variants, that.variants)
                .append(taxCategory, that.taxCategory)
                .append(searchKeywords, that.searchKeywords)
                .append(state, that.state)
                .append(publish, that.publish)
                .append(priceMode, that.priceMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productType)
                .append(name)
                .append(slug)
                .append(key)
                .append(description)
                .append(categories)
                .append(categoryOrderHints)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(masterVariant)
                .append(variants)
                .append(taxCategory)
                .append(searchKeywords)
                .append(state)
                .append(publish)
                .append(priceMode)
                .toHashCode();
    }

}
