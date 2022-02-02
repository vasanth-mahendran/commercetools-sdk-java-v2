
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssignedProductSelectionImpl implements AssignedProductSelection, ModelBase {

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    @JsonCreator
    AssignedProductSelectionImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.createdAt = createdAt;
        this.productSelection = productSelection;
    }

    public AssignedProductSelectionImpl() {
    }

    /**
    *  <p>Date and time (UTC) the <a href="ctp:api:type:ProductSelectionAssignment">ProductSelectionAssignment</a> was initially created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>Reference to the Product Selection that this assignment is part of.</p>
    */
    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssignedProductSelectionImpl that = (AssignedProductSelectionImpl) o;

        return new EqualsBuilder().append(createdAt, that.createdAt)
                .append(productSelection, that.productSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(createdAt).append(productSelection).toHashCode();
    }

}
