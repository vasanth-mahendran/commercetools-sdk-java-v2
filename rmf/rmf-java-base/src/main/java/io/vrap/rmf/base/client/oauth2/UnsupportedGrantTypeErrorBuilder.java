
package io.vrap.rmf.base.client.oauth2;

import java.util.Objects;

import io.vrap.rmf.base.client.Builder;

public class UnsupportedGrantTypeErrorBuilder implements Builder<UnsupportedGrantTypeError> {

    private String message;

    public UnsupportedGrantTypeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public UnsupportedGrantTypeError build() {
        Objects.requireNonNull(message, UnsupportedGrantTypeError.class + ": message is missing");
        return new UnsupportedGrantTypeErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public UnsupportedGrantTypeError buildUnchecked() {
        return new UnsupportedGrantTypeErrorImpl(message);
    }

    public static UnsupportedGrantTypeErrorBuilder of() {
        return new UnsupportedGrantTypeErrorBuilder();
    }

    public static UnsupportedGrantTypeErrorBuilder of(final UnsupportedGrantTypeError template) {
        UnsupportedGrantTypeErrorBuilder builder = new UnsupportedGrantTypeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
