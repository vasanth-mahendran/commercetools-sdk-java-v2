
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
 * ProductUpdate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductUpdateImpl implements ProductUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions;

    @JsonCreator
    ProductUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    public ProductUpdateImpl() {
    }

    /**
     *  <p>Expected version of the Product on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Product.</p>
     */

    public java.util.List<com.commercetools.api.models.product.ProductUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.product.ProductUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(final java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductUpdateImpl that = (ProductUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version).append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

}
