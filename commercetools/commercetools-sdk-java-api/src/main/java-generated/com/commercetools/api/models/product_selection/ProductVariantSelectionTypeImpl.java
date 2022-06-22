
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
 * ProductVariantSelectionType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionTypeImpl implements ProductVariantSelectionType, ModelBase {

    private com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum type;

    @JsonCreator
    ProductVariantSelectionTypeImpl(
            @JsonProperty("type") final com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum type) {
        this.type = type;
    }

    public ProductVariantSelectionTypeImpl() {
    }

    /**
     *  <p>The following type of Product Variant Selections is supported:</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantSelectionTypeImpl that = (ProductVariantSelectionTypeImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
