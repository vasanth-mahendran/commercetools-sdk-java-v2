
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeLabelAction typeChangeLabelAction = TypeChangeLabelAction.builder()
 *             .fieldName("{fieldName}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeLabelActionBuilder implements Builder<TypeChangeLabelAction> {

    private String fieldName;

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     *  <p>Name of the Field Definition to update.</p>
     */

    public TypeChangeLabelActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public TypeChangeLabelActionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public TypeChangeLabelActionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public TypeChangeLabelAction build() {
        Objects.requireNonNull(fieldName, TypeChangeLabelAction.class + ": fieldName is missing");
        Objects.requireNonNull(label, TypeChangeLabelAction.class + ": label is missing");
        return new TypeChangeLabelActionImpl(fieldName, label);
    }

    /**
     * builds TypeChangeLabelAction without checking for non null required values
     */
    public TypeChangeLabelAction buildUnchecked() {
        return new TypeChangeLabelActionImpl(fieldName, label);
    }

    public static TypeChangeLabelActionBuilder of() {
        return new TypeChangeLabelActionBuilder();
    }

    public static TypeChangeLabelActionBuilder of(final TypeChangeLabelAction template) {
        TypeChangeLabelActionBuilder builder = new TypeChangeLabelActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.label = template.getLabel();
        return builder;
    }

}
