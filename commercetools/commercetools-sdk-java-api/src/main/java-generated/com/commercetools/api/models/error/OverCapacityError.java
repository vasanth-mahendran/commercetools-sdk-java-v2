
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OverCapacityError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OverCapacityError overCapacityError = OverCapacityError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OverCapacityErrorImpl.class)
public interface OverCapacityError extends ErrorObject {

    String OVER_CAPACITY = "OverCapacity";

    public static OverCapacityError of() {
        return new OverCapacityErrorImpl();
    }

    public static OverCapacityError of(final OverCapacityError template) {
        OverCapacityErrorImpl instance = new OverCapacityErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static OverCapacityErrorBuilder builder() {
        return OverCapacityErrorBuilder.of();
    }

    public static OverCapacityErrorBuilder builder(final OverCapacityError template) {
        return OverCapacityErrorBuilder.of(template);
    }

    default <T> T withOverCapacityError(Function<OverCapacityError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OverCapacityError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OverCapacityError>() {
            @Override
            public String toString() {
                return "TypeReference<OverCapacityError>";
            }
        };
    }
}
