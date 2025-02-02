
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The representation sent to the server when creating an ImportContainer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerDraft importContainerDraft = ImportContainerDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerDraftImpl.class)
public interface ImportContainerDraft {

    /**
     *  <p>User-defined unique identifier of the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    public void setKey(final String key);

    public void setResourceType(final ImportResourceType resourceType);

    public static ImportContainerDraft of() {
        return new ImportContainerDraftImpl();
    }

    public static ImportContainerDraft of(final ImportContainerDraft template) {
        ImportContainerDraftImpl instance = new ImportContainerDraftImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    public static ImportContainerDraftBuilder builder() {
        return ImportContainerDraftBuilder.of();
    }

    public static ImportContainerDraftBuilder builder(final ImportContainerDraft template) {
        return ImportContainerDraftBuilder.of(template);
    }

    default <T> T withImportContainerDraft(Function<ImportContainerDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerDraft>";
            }
        };
    }
}
