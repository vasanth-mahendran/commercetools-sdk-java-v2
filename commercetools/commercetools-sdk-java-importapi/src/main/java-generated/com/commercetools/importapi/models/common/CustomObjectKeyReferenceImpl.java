
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>References a key value document by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectKeyReferenceImpl implements CustomObjectKeyReference {

    private String key;

    private String typeId;

    private String container;

    @JsonCreator
    CustomObjectKeyReferenceImpl(@JsonProperty("key") final String key,
            @JsonProperty("container") final String container) {
        this.key = key;
        this.container = container;
        this.typeId = KEY_VALUE_DOCUMENT;
    }

    public CustomObjectKeyReferenceImpl() {
        this.typeId = KEY_VALUE_DOCUMENT;
    }

    public String getKey() {
        return this.key;
    }

    public String getTypeId() {
        return this.typeId;
    }

    public String getContainer() {
        return this.container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomObjectKeyReferenceImpl that = (CustomObjectKeyReferenceImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(typeId, that.typeId)
                .append(container, that.container)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(typeId).append(container).toHashCode();
    }

}
