
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferencedResourceNotFoundError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferencedResourceNotFoundError referencedResourceNotFoundError = ReferencedResourceNotFoundError.builder()
 *             .message("{message}")
 *             .typeId(ReferenceTypeId.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferencedResourceNotFoundErrorImpl.class)
public interface ReferencedResourceNotFoundError extends ErrorObject {

    String REFERENCED_RESOURCE_NOT_FOUND = "ReferencedResourceNotFound";

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *
     */

    @JsonProperty("id")
    public String getId();

    /**
     *
     */

    @JsonProperty("key")
    public String getKey();

    public void setTypeId(final ReferenceTypeId typeId);

    public void setId(final String id);

    public void setKey(final String key);

    public static ReferencedResourceNotFoundError of() {
        return new ReferencedResourceNotFoundErrorImpl();
    }

    public static ReferencedResourceNotFoundError of(final ReferencedResourceNotFoundError template) {
        ReferencedResourceNotFoundErrorImpl instance = new ReferencedResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReferencedResourceNotFoundErrorBuilder builder() {
        return ReferencedResourceNotFoundErrorBuilder.of();
    }

    public static ReferencedResourceNotFoundErrorBuilder builder(final ReferencedResourceNotFoundError template) {
        return ReferencedResourceNotFoundErrorBuilder.of(template);
    }

    default <T> T withReferencedResourceNotFoundError(Function<ReferencedResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferencedResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ReferencedResourceNotFoundError>";
            }
        };
    }
}
