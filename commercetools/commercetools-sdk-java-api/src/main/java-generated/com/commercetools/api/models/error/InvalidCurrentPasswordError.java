
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidCurrentPasswordError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidCurrentPasswordError invalidCurrentPasswordError = InvalidCurrentPasswordError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidCurrentPasswordErrorImpl.class)
public interface InvalidCurrentPasswordError extends ErrorObject {

    String INVALID_CURRENT_PASSWORD = "InvalidCurrentPassword";

    public static InvalidCurrentPasswordError of() {
        return new InvalidCurrentPasswordErrorImpl();
    }

    public static InvalidCurrentPasswordError of(final InvalidCurrentPasswordError template) {
        InvalidCurrentPasswordErrorImpl instance = new InvalidCurrentPasswordErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InvalidCurrentPasswordErrorBuilder builder() {
        return InvalidCurrentPasswordErrorBuilder.of();
    }

    public static InvalidCurrentPasswordErrorBuilder builder(final InvalidCurrentPasswordError template) {
        return InvalidCurrentPasswordErrorBuilder.of(template);
    }

    default <T> T withInvalidCurrentPasswordError(Function<InvalidCurrentPasswordError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidCurrentPasswordError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidCurrentPasswordError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidCurrentPasswordError>";
            }
        };
    }
}
