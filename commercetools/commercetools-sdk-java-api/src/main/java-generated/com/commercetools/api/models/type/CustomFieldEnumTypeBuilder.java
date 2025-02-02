
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldEnumType customFieldEnumType = CustomFieldEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldEnumTypeBuilder implements Builder<CustomFieldEnumType> {

    private java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values;

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldEnumTypeBuilder values(final com.commercetools.api.models.type.CustomFieldEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldEnumTypeBuilder plusValues(
            final com.commercetools.api.models.type.CustomFieldEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Allowed values.</p>
     */

    public CustomFieldEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> getValues() {
        return this.values;
    }

    public CustomFieldEnumType build() {
        Objects.requireNonNull(values, CustomFieldEnumType.class + ": values is missing");
        return new CustomFieldEnumTypeImpl(values);
    }

    /**
     * builds CustomFieldEnumType without checking for non null required values
     */
    public CustomFieldEnumType buildUnchecked() {
        return new CustomFieldEnumTypeImpl(values);
    }

    public static CustomFieldEnumTypeBuilder of() {
        return new CustomFieldEnumTypeBuilder();
    }

    public static CustomFieldEnumTypeBuilder of(final CustomFieldEnumType template) {
        CustomFieldEnumTypeBuilder builder = new CustomFieldEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
