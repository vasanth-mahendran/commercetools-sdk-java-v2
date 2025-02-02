
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeLocalizedEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizedEnumType attributeLocalizedEnumType = AttributeLocalizedEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeLocalizedEnumTypeBuilder implements Builder<AttributeLocalizedEnumType> {

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values;

    /**
     *
     */

    public AttributeLocalizedEnumTypeBuilder values(
            final com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *
     */

    public AttributeLocalizedEnumTypeBuilder values(
            final java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public AttributeLocalizedEnumTypeBuilder plusValues(
            final com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *
     */

    public AttributeLocalizedEnumTypeBuilder plusValues(
            Function<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueBuilder, com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueBuilder.of())
                    .build());
        return this;
    }

    /**
     *
     */

    public AttributeLocalizedEnumTypeBuilder withValues(
            Function<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueBuilder, com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueBuilder.of())
                    .build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> getValues() {
        return this.values;
    }

    public AttributeLocalizedEnumType build() {
        Objects.requireNonNull(values, AttributeLocalizedEnumType.class + ": values is missing");
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    /**
     * builds AttributeLocalizedEnumType without checking for non null required values
     */
    public AttributeLocalizedEnumType buildUnchecked() {
        return new AttributeLocalizedEnumTypeImpl(values);
    }

    public static AttributeLocalizedEnumTypeBuilder of() {
        return new AttributeLocalizedEnumTypeBuilder();
    }

    public static AttributeLocalizedEnumTypeBuilder of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeBuilder builder = new AttributeLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
