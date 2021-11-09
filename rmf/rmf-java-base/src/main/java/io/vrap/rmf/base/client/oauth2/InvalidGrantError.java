
package io.vrap.rmf.base.client.oauth2;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.function.Function;

@JsonDeserialize(as = InvalidGrantErrorImpl.class)
public interface InvalidGrantError extends ErrorObject {

    String INVALID_GRANT = "invalid_grant";

    public static InvalidGrantError of() {
        return new InvalidGrantErrorImpl();
    }

    public static InvalidGrantError of(final InvalidGrantError template) {
        InvalidGrantErrorImpl instance = new InvalidGrantErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidGrantErrorBuilder builder() {
        return InvalidGrantErrorBuilder.of();
    }

    public static InvalidGrantErrorBuilder builder(final InvalidGrantError template) {
        return InvalidGrantErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidGrantError, T> helper) {
        return helper.apply(this);
    }
}
