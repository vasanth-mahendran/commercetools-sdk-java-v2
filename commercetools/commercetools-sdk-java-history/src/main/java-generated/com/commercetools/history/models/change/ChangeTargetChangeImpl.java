
package com.commercetools.history.models.change;

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
 * ChangeTargetChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetChangeImpl implements ChangeTargetChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue;

    private com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue;

    @JsonCreator
    ChangeTargetChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = CHANGE_TARGET_CHANGE;
    }

    public ChangeTargetChangeImpl() {
        this.type = CHANGE_TARGET_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>changeTarget</code> on cart discounts</p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     *
     */

    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTargetChangeImpl that = (ChangeTargetChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
