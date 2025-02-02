
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceNotFoundError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceNotFoundError resourceNotFoundError = ResourceNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {

    String RESOURCE_NOT_FOUND = "ResourceNotFound";

    /**
     *
     */

    @JsonProperty("resource")
    public Object getResource();

    public void setResource(final Object resource);

    public static ResourceNotFoundError of() {
        return new ResourceNotFoundErrorImpl();
    }

    public static ResourceNotFoundError of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceNotFoundErrorBuilder builder() {
        return ResourceNotFoundErrorBuilder.of();
    }

    public static ResourceNotFoundErrorBuilder builder(final ResourceNotFoundError template) {
        return ResourceNotFoundErrorBuilder.of(template);
    }

    default <T> T withResourceNotFoundError(Function<ResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceNotFoundError>";
            }
        };
    }
}
