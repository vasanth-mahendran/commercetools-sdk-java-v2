
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldDefinitionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldDefinition fieldDefinition = FieldDefinition.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .required(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldDefinitionBuilder implements Builder<FieldDefinition> {

    private com.commercetools.api.models.type.FieldType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean required;

    @Nullable
    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    /**
     *  <p>Data type of the Custom Field to define.</p>
     */

    public FieldDefinitionBuilder type(final com.commercetools.api.models.type.FieldType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Data type of the Custom Field to define.</p>
     */

    public FieldDefinitionBuilder type(
            Function<com.commercetools.api.models.type.FieldTypeBuilder, Builder<? extends com.commercetools.api.models.type.FieldType>> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.FieldTypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Custom Field to define. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>.</p>
     */

    public FieldDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A human-readable label for the field.</p>
     */

    public FieldDefinitionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A human-readable label for the field.</p>
     */

    public FieldDefinitionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Defines whether the field is required to have a value.</p>
     */

    public FieldDefinitionBuilder required(final Boolean required) {
        this.required = required;
        return this;
    }

    /**
     *  <p>Must be either <code>SingleLine</code> or <code>MultiLine</code>. Defines the visual representation of the field in user interfaces like the Merchant Center. It is only relevant for string-based FieldTypes like CustomFieldStringType and CustomFieldLocalizedStringType.</p>
     */

    public FieldDefinitionBuilder inputHint(
            @Nullable final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public com.commercetools.api.models.type.FieldType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public Boolean getRequired() {
        return this.required;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeTextInputHint getInputHint() {
        return this.inputHint;
    }

    public FieldDefinition build() {
        Objects.requireNonNull(type, FieldDefinition.class + ": type is missing");
        Objects.requireNonNull(name, FieldDefinition.class + ": name is missing");
        Objects.requireNonNull(label, FieldDefinition.class + ": label is missing");
        Objects.requireNonNull(required, FieldDefinition.class + ": required is missing");
        return new FieldDefinitionImpl(type, name, label, required, inputHint);
    }

    /**
     * builds FieldDefinition without checking for non null required values
     */
    public FieldDefinition buildUnchecked() {
        return new FieldDefinitionImpl(type, name, label, required, inputHint);
    }

    public static FieldDefinitionBuilder of() {
        return new FieldDefinitionBuilder();
    }

    public static FieldDefinitionBuilder of(final FieldDefinition template) {
        FieldDefinitionBuilder builder = new FieldDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.required = template.getRequired();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
