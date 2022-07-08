
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
 *  <p>Creates a ProductVariant when included in the <code>masterVariant</code> and <code>variants</code> fields of the ProductDraft.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantDraftImpl implements ProductVariantDraft, ModelBase {

    private String sku;

    private String key;

    private java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> prices;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    private java.util.List<com.commercetools.api.models.common.Image> images;

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    @JsonCreator
    ProductVariantDraftImpl(@JsonProperty("sku") final String sku, @JsonProperty("key") final String key,
            @JsonProperty("prices") final java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> prices,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes,
            @JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
    }

    public ProductVariantDraftImpl() {
    }

    /**
     *  <p>User-defined unique SKU of the ProductVariant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>EmbeddedPrices for the ProductVariant.</p>
     */

    public java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For AttributeEnumType and AttributeLocalizedEnumType Attributes, use the <code>key</code> of the AttributePlainEnumValue or AttributeLocalizedEnumValue objects, or the complete objects as <code>value</code>.</li>
     *   <li>For AttributeLocalizableTextType Attributes, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For AttributeMoneyType Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For AttributeSetType Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For AttributeNestedType Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For AttributeReferenceType Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     */

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Images for the ProductVariant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Image> getImages() {
        return this.images;
    }

    /**
     *  <p>Media assets for the ProductVariant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setPrices(final com.commercetools.api.models.product.EmbeddedPriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.api.models.product.EmbeddedPriceDraft> prices) {
        this.prices = prices;
    }

    public void setAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setImages(final com.commercetools.api.models.common.Image... images) {
        this.images = new ArrayList<>(Arrays.asList(images));
    }

    public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images) {
        this.images = images;
    }

    public void setAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantDraftImpl that = (ProductVariantDraftImpl) o;

        return new EqualsBuilder().append(sku, that.sku)
                .append(key, that.key)
                .append(prices, that.prices)
                .append(attributes, that.attributes)
                .append(images, that.images)
                .append(assets, that.assets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sku)
                .append(key)
                .append(prices)
                .append(attributes)
                .append(images)
                .append(assets)
                .toHashCode();
    }

}
