
package io.vrap.rmf.base.client.oauth2;

import java.util.Objects;

import io.vrap.rmf.base.client.Builder;

public class InvalidRequestErrorBuilder implements Builder<InvalidRequestError> {

    private String message;

    public InvalidRequestErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidRequestError build() {
        Objects.requireNonNull(message, InvalidRequestError.class + ": message is missing");
        return new InvalidRequestErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public InvalidRequestError buildUnchecked() {
        return new InvalidRequestErrorImpl(message);
    }

    public static InvalidRequestErrorBuilder of() {
        return new InvalidRequestErrorBuilder();
    }

    public static InvalidRequestErrorBuilder of(final InvalidRequestError template) {
        InvalidRequestErrorBuilder builder = new InvalidRequestErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
