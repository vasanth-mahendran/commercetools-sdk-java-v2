
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
 * RemoveEnumValuesChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveEnumValuesChangeImpl implements RemoveEnumValuesChange, ModelBase {

    private String type;

    private String change;

    private String attributeName;

    private com.commercetools.history.models.change_value.EnumValue previousValue;

    @JsonCreator
    RemoveEnumValuesChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("previousValue") final com.commercetools.history.models.change_value.EnumValue previousValue) {
        this.change = change;
        this.attributeName = attributeName;
        this.previousValue = previousValue;
        this.type = REMOVE_ENUM_VALUES_CHANGE;
    }

    public RemoveEnumValuesChangeImpl() {
        this.type = REMOVE_ENUM_VALUES_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>removeEnumValues</code> on product types</p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *
     */

    public com.commercetools.history.models.change_value.EnumValue getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setPreviousValue(final com.commercetools.history.models.change_value.EnumValue previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveEnumValuesChangeImpl that = (RemoveEnumValuesChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(attributeName, that.attributeName)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(attributeName)
                .append(previousValue)
                .toHashCode();
    }

}
