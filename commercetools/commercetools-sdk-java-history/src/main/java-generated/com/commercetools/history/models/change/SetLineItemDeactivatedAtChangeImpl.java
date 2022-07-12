
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
 * SetLineItemDeactivatedAtChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemDeactivatedAtChangeImpl implements SetLineItemDeactivatedAtChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private String previousValue;

    private String nextValue;

    @JsonCreator
    SetLineItemDeactivatedAtChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItem") final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_LINE_ITEM_DEACTIVATED_AT_CHANGE;
    }

    public SetLineItemDeactivatedAtChangeImpl() {
        this.type = SET_LINE_ITEM_DEACTIVATED_AT_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    /**
     *
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *
     */

    public String getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItem(final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
    }

    public void setPreviousValue(final String previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemDeactivatedAtChangeImpl that = (SetLineItemDeactivatedAtChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItem)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
