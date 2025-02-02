
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This is the generic error code for access denied. In case of a wrong scope, an InvalidScopeError will be returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AccessDeniedError accessDeniedError = AccessDeniedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AccessDeniedErrorImpl.class)
public interface AccessDeniedError extends ErrorObject {

    String ACCESS_DENIED = "access_denied";

    public static AccessDeniedError of() {
        return new AccessDeniedErrorImpl();
    }

    public static AccessDeniedError of(final AccessDeniedError template) {
        AccessDeniedErrorImpl instance = new AccessDeniedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static AccessDeniedErrorBuilder builder() {
        return AccessDeniedErrorBuilder.of();
    }

    public static AccessDeniedErrorBuilder builder(final AccessDeniedError template) {
        return AccessDeniedErrorBuilder.of(template);
    }

    default <T> T withAccessDeniedError(Function<AccessDeniedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AccessDeniedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AccessDeniedError>() {
            @Override
            public String toString() {
                return "TypeReference<AccessDeniedError>";
            }
        };
    }
}
