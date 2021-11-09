
package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.Builder;

import java.util.Objects;

public class UnauthorizedClientErrorBuilder implements Builder<UnauthorizedClientError> {

    private String message;

    public UnauthorizedClientErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public UnauthorizedClientError build() {
        Objects.requireNonNull(message, UnauthorizedClientError.class + ": message is missing");
        return new UnauthorizedClientErrorImpl(message);
    }

    /**
     * builds InvalidInputError without checking for non null required values
     */
    public UnauthorizedClientError buildUnchecked() {
        return new UnauthorizedClientErrorImpl(message);
    }

    public static UnauthorizedClientErrorBuilder of() {
        return new UnauthorizedClientErrorBuilder();
    }

    public static UnauthorizedClientErrorBuilder of(final UnauthorizedClientError template) {
        UnauthorizedClientErrorBuilder builder = new UnauthorizedClientErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
