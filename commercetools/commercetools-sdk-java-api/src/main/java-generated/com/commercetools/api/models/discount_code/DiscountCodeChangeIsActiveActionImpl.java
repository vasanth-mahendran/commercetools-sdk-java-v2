
package com.commercetools.api.models.discount_code;

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
 * DiscountCodeChangeIsActiveAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeChangeIsActiveActionImpl implements DiscountCodeChangeIsActiveAction, ModelBase {

    private String action;

    private Boolean isActive;

    @JsonCreator
    DiscountCodeChangeIsActiveActionImpl(@JsonProperty("isActive") final Boolean isActive) {
        this.isActive = isActive;
        this.action = CHANGE_IS_ACTIVE;
    }

    public DiscountCodeChangeIsActiveActionImpl() {
        this.action = CHANGE_IS_ACTIVE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeChangeIsActiveActionImpl that = (DiscountCodeChangeIsActiveActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(isActive, that.isActive).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(isActive).toHashCode();
    }

}
