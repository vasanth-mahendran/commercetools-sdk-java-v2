
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidInputError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInputError invalidInputError = InvalidInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidInputErrorImpl.class)
public interface InvalidInputError extends ErrorObject {

    String INVALID_INPUT = "InvalidInput";

    public static InvalidInputError of() {
        return new InvalidInputErrorImpl();
    }

    public static InvalidInputError of(final InvalidInputError template) {
        InvalidInputErrorImpl instance = new InvalidInputErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InvalidInputErrorBuilder builder() {
        return InvalidInputErrorBuilder.of();
    }

    public static InvalidInputErrorBuilder builder(final InvalidInputError template) {
        return InvalidInputErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidInputError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidInputError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidInputError>";
            }
        };
    }
}
