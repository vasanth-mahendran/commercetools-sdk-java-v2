
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeAddEnumValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeAddEnumValueAction typeAddEnumValueAction = TypeAddEnumValueAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeAddEnumValueActionBuilder implements Builder<TypeAddEnumValueAction> {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldEnumValue value;

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     */

    public TypeAddEnumValueActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public TypeAddEnumValueActionBuilder value(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public TypeAddEnumValueActionBuilder value(final com.commercetools.api.models.type.CustomFieldEnumValue value) {
        this.value = value;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.CustomFieldEnumValue getValue() {
        return this.value;
    }

    public TypeAddEnumValueAction build() {
        Objects.requireNonNull(fieldName, TypeAddEnumValueAction.class + ": fieldName is missing");
        Objects.requireNonNull(value, TypeAddEnumValueAction.class + ": value is missing");
        return new TypeAddEnumValueActionImpl(fieldName, value);
    }

    /**
     * builds TypeAddEnumValueAction without checking for non null required values
     */
    public TypeAddEnumValueAction buildUnchecked() {
        return new TypeAddEnumValueActionImpl(fieldName, value);
    }

    public static TypeAddEnumValueActionBuilder of() {
        return new TypeAddEnumValueActionBuilder();
    }

    public static TypeAddEnumValueActionBuilder of(final TypeAddEnumValueAction template) {
        TypeAddEnumValueActionBuilder builder = new TypeAddEnumValueActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
