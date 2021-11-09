
package io.vrap.rmf.base.client.oauth2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Function;

@JsonDeserialize(as = ErrorResponseImpl.class)
public interface ErrorResponse {

    @NotNull
    @JsonProperty("statusCode")
    public Integer getStatusCode();

    @NotNull
    @JsonProperty("message")
    public String getMessage();

    @JsonProperty("error")
    public String getError();

    @JsonProperty("error_description")
    public String getErrorDescription();

    @JsonProperty("error_uri")
    public String getErrorUri();

    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    public void setStatusCode(final Integer statusCode);

    public void setMessage(final String message);

    public void setError(final String error);

    public void setErrorDescription(final String errorDescription);

    public void setErrorUri(final String errorUri);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

    public static ErrorResponse of() {
        return new ErrorResponseImpl();
    }

    public static ErrorResponse of(final ErrorResponse template) {
        ErrorResponseImpl instance = new ErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        instance.setErrorUri(template.getErrorUri());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public static ErrorResponseBuilder builder() {
        return ErrorResponseBuilder.of();
    }

    public static ErrorResponseBuilder builder(final ErrorResponse template) {
        return ErrorResponseBuilder.of(template);
    }

    default <T> T withErrorResponse(Function<ErrorResponse, T> helper) {
        return helper.apply(this);
    }
}
