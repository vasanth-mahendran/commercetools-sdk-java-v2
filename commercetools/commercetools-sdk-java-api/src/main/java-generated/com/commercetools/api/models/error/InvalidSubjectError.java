
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidSubjectError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidSubjectError invalidSubjectError = InvalidSubjectError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidSubjectErrorImpl.class)
public interface InvalidSubjectError extends ErrorObject {

    String INVALID_SUBJECT = "InvalidSubject";

    public static InvalidSubjectError of() {
        return new InvalidSubjectErrorImpl();
    }

    public static InvalidSubjectError of(final InvalidSubjectError template) {
        InvalidSubjectErrorImpl instance = new InvalidSubjectErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InvalidSubjectErrorBuilder builder() {
        return InvalidSubjectErrorBuilder.of();
    }

    public static InvalidSubjectErrorBuilder builder(final InvalidSubjectError template) {
        return InvalidSubjectErrorBuilder.of(template);
    }

    default <T> T withInvalidSubjectError(Function<InvalidSubjectError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidSubjectError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidSubjectError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidSubjectError>";
            }
        };
    }
}
