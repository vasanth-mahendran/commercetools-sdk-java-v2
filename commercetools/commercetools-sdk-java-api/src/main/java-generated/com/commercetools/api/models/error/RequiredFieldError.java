
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RequiredFieldError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequiredFieldError requiredFieldError = RequiredFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RequiredFieldErrorImpl.class)
public interface RequiredFieldError extends ErrorObject {

    String REQUIRED_FIELD = "RequiredField";

    /**
     *
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    public void setField(final String field);

    public static RequiredFieldError of() {
        return new RequiredFieldErrorImpl();
    }

    public static RequiredFieldError of(final RequiredFieldError template) {
        RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setField(template.getField());
        return instance;
    }

    public static RequiredFieldErrorBuilder builder() {
        return RequiredFieldErrorBuilder.of();
    }

    public static RequiredFieldErrorBuilder builder(final RequiredFieldError template) {
        return RequiredFieldErrorBuilder.of(template);
    }

    default <T> T withRequiredFieldError(Function<RequiredFieldError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RequiredFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RequiredFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<RequiredFieldError>";
            }
        };
    }
}
