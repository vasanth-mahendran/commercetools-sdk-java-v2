
package io.vrap.rmf.base.client.oauth2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;

public class ErrorResponseBuilder implements Builder<ErrorResponse> {

    private Integer statusCode;

    private String message;

    @Nullable
    private String error;

    @Nullable
    private String error_description;

    @Nullable
    private String error_uri;

    @Nullable
    private List<ErrorObject> errors;

    public ErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public ErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ErrorResponseBuilder error(@Nullable final String error) {
        this.error = error;
        return this;
    }

    public ErrorResponseBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }

    public ErrorResponseBuilder error_uri(@Nullable final String error_uri) {
        this.error_uri = error_uri;
        return this;
    }

    public ErrorResponseBuilder errors(@Nullable final ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    public ErrorResponseBuilder errors(@Nullable final List<ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public String getError() {
        return this.error;
    }

    @Nullable
    public String getErrorDescription() {
        return this.error_description;
    }

    @Nullable
    public String getErrorUri() {
        return this.error_uri;
    }

    @Nullable
    public List<ErrorObject> getErrors() {
        return this.errors;
    }

    public ErrorResponse build() {
        Objects.requireNonNull(statusCode, ErrorResponse.class + ": statusCode is missing");
        Objects.requireNonNull(message, ErrorResponse.class + ": message is missing");
        return new ErrorResponseImpl(statusCode, message, error, error_description, error_uri, errors);
    }

    /**
     * builds ErrorResponse without checking for non null required values
     */
    public ErrorResponse buildUnchecked() {
        return new ErrorResponseImpl(statusCode, message, error, error_description, error_uri, errors);
    }

    public static ErrorResponseBuilder of() {
        return new ErrorResponseBuilder();
    }

    public static ErrorResponseBuilder of(final ErrorResponse template) {
        ErrorResponseBuilder builder = new ErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.error = template.getError();
        builder.error_description = template.getErrorDescription();
        builder.error_uri = template.getErrorUri();
        builder.errors = template.getErrors();
        return builder;
    }

}
