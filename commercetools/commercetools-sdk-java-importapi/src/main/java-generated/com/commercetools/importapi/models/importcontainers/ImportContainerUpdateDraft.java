
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
 *  <p>The representation sent to the server when updating an import container.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerUpdateDraft importContainerUpdateDraft = ImportContainerUpdateDraft.builder()
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerUpdateDraftImpl.class)
public interface ImportContainerUpdateDraft {

    /**
     *  <p>Current version of the ImportContainer.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    public void setVersion(final Long version);

    public void setResourceType(final ImportResourceType resourceType);

    public static ImportContainerUpdateDraft of() {
        return new ImportContainerUpdateDraftImpl();
    }

    public static ImportContainerUpdateDraft of(final ImportContainerUpdateDraft template) {
        ImportContainerUpdateDraftImpl instance = new ImportContainerUpdateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    public static ImportContainerUpdateDraftBuilder builder() {
        return ImportContainerUpdateDraftBuilder.of();
    }

    public static ImportContainerUpdateDraftBuilder builder(final ImportContainerUpdateDraft template) {
        return ImportContainerUpdateDraftBuilder.of(template);
    }

    default <T> T withImportContainerUpdateDraft(Function<ImportContainerUpdateDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerUpdateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerUpdateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerUpdateDraft>";
            }
        };
    }
}
