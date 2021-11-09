
package io.vrap.rmf.base.client.oauth2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class InvalidClientErrorImpl implements InvalidClientError {

    private final String code;

    private String message;

    @JsonCreator
    InvalidClientErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = INVALID_CLIENT;
    }

    public InvalidClientErrorImpl() {
        this.code = INVALID_CLIENT;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidClientErrorImpl that = (InvalidClientErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

}
