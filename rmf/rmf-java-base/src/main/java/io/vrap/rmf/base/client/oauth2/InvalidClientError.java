
package io.vrap.rmf.base.client.oauth2;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.function.Function;

@JsonDeserialize(as = InvalidClientErrorImpl.class)
public interface InvalidClientError extends ErrorObject {

    String INVALID_CLIENT = "invalid_client";

    public static InvalidClientError of() {
        return new InvalidClientErrorImpl();
    }

    public static InvalidClientError of(final InvalidClientError template) {
        InvalidClientErrorImpl instance = new InvalidClientErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidClientErrorBuilder builder() {
        return InvalidClientErrorBuilder.of();
    }

    public static InvalidClientErrorBuilder builder(final InvalidClientError template) {
        return InvalidClientErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidClientError, T> helper) {
        return helper.apply(this);
    }
}
