
package com.commercetools.api.models.product_selection;

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
 * ProductVariantSelection
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionImpl implements ProductVariantSelection, ModelBase {

    private String type;

    private java.util.List<String> skus;

    @JsonCreator
    ProductVariantSelectionImpl(@JsonProperty("type") final String type,
            @JsonProperty("skus") final java.util.List<String> skus) {
        this.type = type;
        this.skus = skus;
    }

    public ProductVariantSelectionImpl() {
    }

    /**
     *  <p>One of the values <code>inclusion</code>, or <code>exclusion</code>, that determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Non-empty array of SKUs</p>
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setSkus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
    }

    public void setSkus(final java.util.List<String> skus) {
        this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantSelectionImpl that = (ProductVariantSelectionImpl) o;

        return new EqualsBuilder().append(type, that.type).append(skus, that.skus).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(skus).toHashCode();
    }

}
