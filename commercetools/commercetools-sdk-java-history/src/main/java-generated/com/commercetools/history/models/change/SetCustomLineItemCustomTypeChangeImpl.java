
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
 * SetCustomLineItemCustomTypeChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemCustomTypeChangeImpl implements SetCustomLineItemCustomTypeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    @JsonCreator
    SetCustomLineItemCustomTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("customLineItem") final com.commercetools.history.models.common.LocalizedString customLineItem,
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue) {
        this.change = change;
        this.customLineItem = customLineItem;
        this.customLineItemId = customLineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE_CHANGE;
    }

    public SetCustomLineItemCustomTypeChangeImpl() {
        this.type = SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>setCustomLineItemCustomType</code></p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCustomLineItem(final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setNextValue(final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomLineItemCustomTypeChangeImpl that = (SetCustomLineItemCustomTypeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(customLineItem)
                .append(customLineItemId)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
