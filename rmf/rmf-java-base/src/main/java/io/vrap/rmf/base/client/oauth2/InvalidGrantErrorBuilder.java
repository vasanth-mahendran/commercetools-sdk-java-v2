
package io.vrap.rmf.base.client.oauth2;

import java.util.Objects;

import io.vrap.rmf.base.client.Builder;

public class InvalidGrantErrorBuilder implements Builder<InvalidGrantError> {

    private String message;

    public InvalidGrantErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidGrantError build() {
        Objects.requireNonNull(message, InvalidGrantError.class + ": message is missing");
        return new InvalidGrantErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidGrantError buildUnchecked() {
        return new InvalidGrantErrorImpl(message);
    }

    public static InvalidGrantErrorBuilder of() {
        return new InvalidGrantErrorBuilder();
    }

    public static InvalidGrantErrorBuilder of(final InvalidGrantError template) {
        InvalidGrantErrorBuilder builder = new InvalidGrantErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
