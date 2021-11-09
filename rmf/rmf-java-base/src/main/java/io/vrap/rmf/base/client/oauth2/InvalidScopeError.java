
package io.vrap.rmf.base.client.oauth2;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.function.Function;

@JsonDeserialize(as = InvalidScopeErrorImpl.class)
public interface InvalidScopeError extends ErrorObject {

    String INVALID_SCOPE = "invalid_scope";

    public static InvalidScopeError of() {
        return new InvalidScopeErrorImpl();
    }

    public static InvalidScopeError of(final InvalidScopeError template) {
        InvalidScopeErrorImpl instance = new InvalidScopeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidScopeErrorBuilder builder() {
        return InvalidScopeErrorBuilder.of();
    }

    public static InvalidScopeErrorBuilder builder(final InvalidScopeError template) {
        return InvalidScopeErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidScopeError, T> helper) {
        return helper.apply(this);
    }
}
