
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BadGatewayError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BadGatewayError badGatewayError = BadGatewayError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BadGatewayErrorImpl.class)
public interface BadGatewayError extends ErrorObject {

    String BAD_GATEWAY = "BadGateway";

    public static BadGatewayError of() {
        return new BadGatewayErrorImpl();
    }

    public static BadGatewayError of(final BadGatewayError template) {
        BadGatewayErrorImpl instance = new BadGatewayErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static BadGatewayErrorBuilder builder() {
        return BadGatewayErrorBuilder.of();
    }

    public static BadGatewayErrorBuilder builder(final BadGatewayError template) {
        return BadGatewayErrorBuilder.of(template);
    }

    default <T> T withBadGatewayError(Function<BadGatewayError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BadGatewayError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BadGatewayError>() {
            @Override
            public String toString() {
                return "TypeReference<BadGatewayError>";
            }
        };
    }
}
