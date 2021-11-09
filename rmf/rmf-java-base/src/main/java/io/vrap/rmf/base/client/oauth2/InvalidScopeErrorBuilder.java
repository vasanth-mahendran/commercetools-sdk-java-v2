
package io.vrap.rmf.base.client.oauth2;

import java.util.Objects;

import io.vrap.rmf.base.client.Builder;

public class InvalidScopeErrorBuilder implements Builder<InvalidScopeError> {

    private String message;

    public InvalidScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidScopeError build() {
        Objects.requireNonNull(message, InvalidScopeError.class + ": message is missing");
        return new InvalidScopeErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidScopeError buildUnchecked() {
        return new InvalidScopeErrorImpl(message);
    }

    public static InvalidScopeErrorBuilder of() {
        return new InvalidScopeErrorBuilder();
    }

    public static InvalidScopeErrorBuilder of(final InvalidScopeError template) {
        InvalidScopeErrorBuilder builder = new InvalidScopeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
