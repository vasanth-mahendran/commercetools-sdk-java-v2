
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceSizeLimitExceededError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceSizeLimitExceededError resourceSizeLimitExceededError = ResourceSizeLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceSizeLimitExceededErrorImpl.class)
public interface ResourceSizeLimitExceededError extends ErrorObject {

    String RESOURCE_SIZE_LIMIT_EXCEEDED = "ResourceSizeLimitExceeded";

    public static ResourceSizeLimitExceededError of() {
        return new ResourceSizeLimitExceededErrorImpl();
    }

    public static ResourceSizeLimitExceededError of(final ResourceSizeLimitExceededError template) {
        ResourceSizeLimitExceededErrorImpl instance = new ResourceSizeLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static ResourceSizeLimitExceededErrorBuilder builder() {
        return ResourceSizeLimitExceededErrorBuilder.of();
    }

    public static ResourceSizeLimitExceededErrorBuilder builder(final ResourceSizeLimitExceededError template) {
        return ResourceSizeLimitExceededErrorBuilder.of(template);
    }

    default <T> T withResourceSizeLimitExceededError(Function<ResourceSizeLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResourceSizeLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceSizeLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceSizeLimitExceededError>";
            }
        };
    }
}
