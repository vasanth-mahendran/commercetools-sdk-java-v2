
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeDraft typeDraft = TypeDraft.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .plusResourceTypeIds(resourceTypeIdsBuilder -> resourceTypeIdsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeDraftBuilder implements Builder<TypeDraft> {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    @Nullable
    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    /**
     *  <p>User-defined unique identifier for the Type.</p>
     */

    public TypeDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     */

    public TypeDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Type.</p>
     */

    public TypeDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     */

    public TypeDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Type.</p>
     */

    public TypeDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     */

    public TypeDraftBuilder resourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     */

    public TypeDraftBuilder resourceTypeIds(
            final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }

    /**
     *  <p>Resources and/or data types for which the Type is defined.</p>
     */

    public TypeDraftBuilder plusResourceTypeIds(
            final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        if (this.resourceTypeIds == null) {
            this.resourceTypeIds = new ArrayList<>();
        }
        this.resourceTypeIds.addAll(Arrays.asList(resourceTypeIds));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     */

    public TypeDraftBuilder fieldDefinitions(
            @Nullable final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     */

    public TypeDraftBuilder fieldDefinitions(
            @Nullable final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     */

    public TypeDraftBuilder plusFieldDefinitions(
            @Nullable final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.addAll(Arrays.asList(fieldDefinitions));
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     */

    public TypeDraftBuilder plusFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        if (this.fieldDefinitions == null) {
            this.fieldDefinitions = new ArrayList<>();
        }
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines Custom Fields.</p>
     */

    public TypeDraftBuilder withFieldDefinitions(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        this.fieldDefinitions = new ArrayList<>();
        this.fieldDefinitions.add(builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build());
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    public TypeDraft build() {
        Objects.requireNonNull(key, TypeDraft.class + ": key is missing");
        Objects.requireNonNull(name, TypeDraft.class + ": name is missing");
        Objects.requireNonNull(resourceTypeIds, TypeDraft.class + ": resourceTypeIds is missing");
        return new TypeDraftImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    /**
     * builds TypeDraft without checking for non null required values
     */
    public TypeDraft buildUnchecked() {
        return new TypeDraftImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    public static TypeDraftBuilder of() {
        return new TypeDraftBuilder();
    }

    public static TypeDraftBuilder of(final TypeDraft template) {
        TypeDraftBuilder builder = new TypeDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.resourceTypeIds = template.getResourceTypeIds();
        builder.fieldDefinitions = template.getFieldDefinitions();
        return builder;
    }

}
