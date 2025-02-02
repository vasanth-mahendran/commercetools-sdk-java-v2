
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PendingOperationError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PendingOperationError pendingOperationError = PendingOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PendingOperationErrorImpl.class)
public interface PendingOperationError extends ErrorObject {

    String PENDING_OPERATION = "PendingOperation";

    public static PendingOperationError of() {
        return new PendingOperationErrorImpl();
    }

    public static PendingOperationError of(final PendingOperationError template) {
        PendingOperationErrorImpl instance = new PendingOperationErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static PendingOperationErrorBuilder builder() {
        return PendingOperationErrorBuilder.of();
    }

    public static PendingOperationErrorBuilder builder(final PendingOperationError template) {
        return PendingOperationErrorBuilder.of(template);
    }

    default <T> T withPendingOperationError(Function<PendingOperationError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PendingOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PendingOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<PendingOperationError>";
            }
        };
    }
}
