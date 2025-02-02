
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldExpandedValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldExpandedValue customFieldExpandedValue = CustomFieldExpandedValue.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldExpandedValueBuilder implements Builder<CustomFieldExpandedValue> {

    private String name;

    private java.lang.Object value;

    private com.commercetools.history.models.common.LocalizedString label;

    /**
     *  <p>Name of a custom field.</p>
     */

    public CustomFieldExpandedValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public CustomFieldExpandedValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public CustomFieldExpandedValueBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public CustomFieldExpandedValueBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public CustomFieldExpandedValue build() {
        Objects.requireNonNull(name, CustomFieldExpandedValue.class + ": name is missing");
        Objects.requireNonNull(value, CustomFieldExpandedValue.class + ": value is missing");
        Objects.requireNonNull(label, CustomFieldExpandedValue.class + ": label is missing");
        return new CustomFieldExpandedValueImpl(name, value, label);
    }

    /**
     * builds CustomFieldExpandedValue without checking for non null required values
     */
    public CustomFieldExpandedValue buildUnchecked() {
        return new CustomFieldExpandedValueImpl(name, value, label);
    }

    public static CustomFieldExpandedValueBuilder of() {
        return new CustomFieldExpandedValueBuilder();
    }

    public static CustomFieldExpandedValueBuilder of(final CustomFieldExpandedValue template) {
        CustomFieldExpandedValueBuilder builder = new CustomFieldExpandedValueBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.label = template.getLabel();
        return builder;
    }

}
