
package io.vrap.rmf.base.client.oauth2;

import java.util.function.Function;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = UnsupportedGrantTypeErrorImpl.class)
public interface UnsupportedGrantTypeError extends ErrorObject {

    String UNSUPPORTED_GRANT_TYPE = "unsupported_grant_type";

    public static UnsupportedGrantTypeError of() {
        return new UnsupportedGrantTypeErrorImpl();
    }

    public static UnsupportedGrantTypeError of(final UnsupportedGrantTypeError template) {
        UnsupportedGrantTypeErrorImpl instance = new UnsupportedGrantTypeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static UnsupportedGrantTypeErrorBuilder builder() {
        return UnsupportedGrantTypeErrorBuilder.of();
    }

    public static UnsupportedGrantTypeErrorBuilder builder(final UnsupportedGrantTypeError template) {
        return UnsupportedGrantTypeErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<UnsupportedGrantTypeError, T> helper) {
        return helper.apply(this);
    }
}
