
package com.commercetools.api.models.error;

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
 * DuplicateFieldWithConflictingResourceError
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateFieldWithConflictingResourceErrorImpl
        implements DuplicateFieldWithConflictingResourceError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String field;

    private java.lang.Object duplicateValue;

    private com.commercetools.api.models.common.Reference conflictingResource;

    @JsonCreator
    DuplicateFieldWithConflictingResourceErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("field") final String field,
            @JsonProperty("duplicateValue") final java.lang.Object duplicateValue,
            @JsonProperty("conflictingResource") final com.commercetools.api.models.common.Reference conflictingResource) {
        this.message = message;
        this.values = values;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.conflictingResource = conflictingResource;
        this.code = DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE;
    }

    public DuplicateFieldWithConflictingResourceErrorImpl() {
        this.code = DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *
     */

    public String getField() {
        return this.field;
    }

    /**
     *
     */

    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public com.commercetools.api.models.common.Reference getConflictingResource() {
        return this.conflictingResource;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setDuplicateValue(final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
    }

    public void setConflictingResource(final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateFieldWithConflictingResourceErrorImpl that = (DuplicateFieldWithConflictingResourceErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(field, that.field)
                .append(duplicateValue, that.duplicateValue)
                .append(conflictingResource, that.conflictingResource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(field)
                .append(duplicateValue)
                .append(conflictingResource)
                .toHashCode();
    }

}
