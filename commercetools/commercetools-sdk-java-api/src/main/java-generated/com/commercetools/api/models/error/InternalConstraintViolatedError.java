
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InternalConstraintViolatedError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InternalConstraintViolatedError internalConstraintViolatedError = InternalConstraintViolatedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InternalConstraintViolatedErrorImpl.class)
public interface InternalConstraintViolatedError extends ErrorObject {

    String INTERNAL_CONSTRAINT_VIOLATED = "InternalConstraintViolated";

    public static InternalConstraintViolatedError of() {
        return new InternalConstraintViolatedErrorImpl();
    }

    public static InternalConstraintViolatedError of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorImpl instance = new InternalConstraintViolatedErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InternalConstraintViolatedErrorBuilder builder() {
        return InternalConstraintViolatedErrorBuilder.of();
    }

    public static InternalConstraintViolatedErrorBuilder builder(final InternalConstraintViolatedError template) {
        return InternalConstraintViolatedErrorBuilder.of(template);
    }

    default <T> T withInternalConstraintViolatedError(Function<InternalConstraintViolatedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InternalConstraintViolatedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InternalConstraintViolatedError>() {
            @Override
            public String toString() {
                return "TypeReference<InternalConstraintViolatedError>";
            }
        };
    }
}
