
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeEnumValueLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeEnumValueLabelAction typeChangeEnumValueLabelAction = TypeChangeEnumValueLabelAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeEnumValueLabelActionBuilder implements Builder<TypeChangeEnumValueLabelAction> {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldEnumValue value;

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     */

    public TypeChangeEnumValueLabelActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public TypeChangeEnumValueLabelActionBuilder value(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public TypeChangeEnumValueLabelActionBuilder value(
            final com.commercetools.api.models.type.CustomFieldEnumValue value) {
        this.value = value;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.CustomFieldEnumValue getValue() {
        return this.value;
    }

    public TypeChangeEnumValueLabelAction build() {
        Objects.requireNonNull(fieldName, TypeChangeEnumValueLabelAction.class + ": fieldName is missing");
        Objects.requireNonNull(value, TypeChangeEnumValueLabelAction.class + ": value is missing");
        return new TypeChangeEnumValueLabelActionImpl(fieldName, value);
    }

    /**
     * builds TypeChangeEnumValueLabelAction without checking for non null required values
     */
    public TypeChangeEnumValueLabelAction buildUnchecked() {
        return new TypeChangeEnumValueLabelActionImpl(fieldName, value);
    }

    public static TypeChangeEnumValueLabelActionBuilder of() {
        return new TypeChangeEnumValueLabelActionBuilder();
    }

    public static TypeChangeEnumValueLabelActionBuilder of(final TypeChangeEnumValueLabelAction template) {
        TypeChangeEnumValueLabelActionBuilder builder = new TypeChangeEnumValueLabelActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
