
package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.Builder;

import java.util.Objects;

public class InvalidClientErrorBuilder implements Builder<InvalidClientError> {

    private String message;

    public InvalidClientErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidClientError build() {
        Objects.requireNonNull(message, InvalidClientError.class + ": message is missing");
        return new InvalidClientErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidClientError buildUnchecked() {
        return new InvalidClientErrorImpl(message);
    }

    public static InvalidClientErrorBuilder of() {
        return new InvalidClientErrorBuilder();
    }

    public static InvalidClientErrorBuilder of(final InvalidClientError template) {
        InvalidClientErrorBuilder builder = new InvalidClientErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
