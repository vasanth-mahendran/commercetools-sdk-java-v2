
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidOperationError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidOperationError invalidOperationError = InvalidOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidOperationErrorImpl.class)
public interface InvalidOperationError extends ErrorObject {

    String INVALID_OPERATION = "InvalidOperation";

    public static InvalidOperationError of() {
        return new InvalidOperationErrorImpl();
    }

    public static InvalidOperationError of(final InvalidOperationError template) {
        InvalidOperationErrorImpl instance = new InvalidOperationErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InvalidOperationErrorBuilder builder() {
        return InvalidOperationErrorBuilder.of();
    }

    public static InvalidOperationErrorBuilder builder(final InvalidOperationError template) {
        return InvalidOperationErrorBuilder.of(template);
    }

    default <T> T withInvalidOperationError(Function<InvalidOperationError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidOperationError>";
            }
        };
    }
}
