
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextLineItemImpl implements TextLineItem {

    private String addedAt;

    private com.commercetools.history.models.common.CustomFields custom;

    private com.commercetools.history.models.common.LocalizedString description;

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private Integer quantity;

    @JsonCreator
    TextLineItemImpl(@JsonProperty("addedAt") final String addedAt,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom,
            @JsonProperty("description") final com.commercetools.history.models.common.LocalizedString description,
            @JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("quantity") final Integer quantity) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.description = description;
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public TextLineItemImpl() {
    }

    public String getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.history.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setAddedAt(final String addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
    }

    public void setDescription(final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TextLineItemImpl that = (TextLineItemImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(description, that.description)
                .append(id, that.id)
                .append(name, that.name)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt)
                .append(custom)
                .append(description)
                .append(id)
                .append(name)
                .append(quantity)
                .toHashCode();
    }

}
