
package io.vrap.rmf.base.client.oauth2;

import java.util.function.Function;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = UnauthorizedClientErrorImpl.class)
public interface UnauthorizedClientError extends ErrorObject {

    String UNAUTHORIZED_CLIENT = "unauthorized_client";

    public static UnauthorizedClientError of() {
        return new UnauthorizedClientErrorImpl();
    }

    public static UnauthorizedClientError of(final UnauthorizedClientError template) {
        UnauthorizedClientErrorImpl instance = new UnauthorizedClientErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static UnauthorizedClientErrorBuilder builder() {
        return UnauthorizedClientErrorBuilder.of();
    }

    public static UnauthorizedClientErrorBuilder builder(final UnauthorizedClientError template) {
        return UnauthorizedClientErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<UnauthorizedClientError, T> helper) {
        return helper.apply(this);
    }
}
