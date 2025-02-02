
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A representation of the resource to import. Import resources are similar to draft types, but they only support key references. In general, import resources are more granular then regular resources. They are optimized for incremental updates and therefore have a slightly different structure.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportResource importResource = ImportResource.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportResourceImpl.class)
public interface ImportResource {

    /**
     *
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ImportResource of() {
        return new ImportResourceImpl();
    }

    public static ImportResource of(final ImportResource template) {
        ImportResourceImpl instance = new ImportResourceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ImportResourceBuilder builder() {
        return ImportResourceBuilder.of();
    }

    public static ImportResourceBuilder builder(final ImportResource template) {
        return ImportResourceBuilder.of(template);
    }

    default <T> T withImportResource(Function<ImportResource, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportResource> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportResource>() {
            @Override
            public String toString() {
                return "TypeReference<ImportResource>";
            }
        };
    }
}
