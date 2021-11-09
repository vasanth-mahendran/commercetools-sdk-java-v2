
package io.vrap.rmf.base.client.oauth2;

import java.util.function.Function;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = InvalidRequestErrorImpl.class)
public interface InvalidRequestError extends ErrorObject {

    String INVALID_REQUEST = "invalid_request";

    public static InvalidRequestError of() {
        return new InvalidRequestErrorImpl();
    }

    public static InvalidRequestError of(final InvalidRequestError template) {
        InvalidRequestErrorImpl instance = new InvalidRequestErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidRequestErrorBuilder builder() {
        return InvalidRequestErrorBuilder.of();
    }

    public static InvalidRequestErrorBuilder builder(final InvalidRequestError template) {
        return InvalidRequestErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidRequestError, T> helper) {
        return helper.apply(this);
    }
}
