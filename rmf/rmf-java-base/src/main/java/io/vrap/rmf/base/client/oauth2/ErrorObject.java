
package io.vrap.rmf.base.client.oauth2;

import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonSubTypes({ @JsonSubTypes.Type(value = InvalidClientError.class, name = InvalidClientError.INVALID_CLIENT),
        @JsonSubTypes.Type(value = InvalidGrantError.class, name = InvalidGrantError.INVALID_GRANT),
        @JsonSubTypes.Type(value = InvalidRequestError.class, name = InvalidRequestError.INVALID_REQUEST),
        @JsonSubTypes.Type(value = InvalidScopeError.class, name = InvalidScopeError.INVALID_SCOPE),
        @JsonSubTypes.Type(value = UnauthorizedClientError.class, name = UnauthorizedClientError.UNAUTHORIZED_CLIENT),
        @JsonSubTypes.Type(value = UnsupportedGrantTypeError.class, name = UnsupportedGrantTypeError.UNSUPPORTED_GRANT_TYPE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
public interface ErrorObject {

    @NotNull
    @JsonProperty("code")
    public String getCode();

    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }
}
