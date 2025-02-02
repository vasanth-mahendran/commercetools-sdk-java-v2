
package com.commercetools.api.models.me;

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
 * MyCartChangeTaxModeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeTaxModeActionImpl implements MyCartChangeTaxModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    @JsonCreator
    MyCartChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        this.action = CHANGE_TAX_MODE;
    }

    public MyCartChangeTaxModeActionImpl() {
        this.action = CHANGE_TAX_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartChangeTaxModeActionImpl that = (MyCartChangeTaxModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(taxMode, that.taxMode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxMode).toHashCode();
    }

}
