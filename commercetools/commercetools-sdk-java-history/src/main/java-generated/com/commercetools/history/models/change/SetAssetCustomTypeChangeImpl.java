
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
 * SetAssetCustomTypeChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetCustomTypeChangeImpl implements SetAssetCustomTypeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    @JsonCreator
    SetAssetCustomTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("asset") final com.commercetools.history.models.change_value.AssetChangeValue asset,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue) {
        this.change = change;
        this.asset = asset;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_ASSET_CUSTOM_TYPE_CHANGE;
    }

    public SetAssetCustomTypeChangeImpl() {
        this.type = SET_ASSET_CUSTOM_TYPE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Update action for <code>setAssetCustomType</code></p>
     */

    public String getChange() {
        return this.change;
    }

    /**
     *
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
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

    public void setAsset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
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

        SetAssetCustomTypeChangeImpl that = (SetAssetCustomTypeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(asset, that.asset)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(asset)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
