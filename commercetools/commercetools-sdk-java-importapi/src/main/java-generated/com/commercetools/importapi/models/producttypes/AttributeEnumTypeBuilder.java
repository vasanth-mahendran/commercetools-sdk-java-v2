
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeEnumTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeEnumType attributeEnumType = AttributeEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeEnumTypeBuilder implements Builder<AttributeEnumType> {

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values;

    /**
     *
     */

    public AttributeEnumTypeBuilder values(
            final com.commercetools.importapi.models.producttypes.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    /**
     *
     */

    public AttributeEnumTypeBuilder values(
            final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public AttributeEnumTypeBuilder plusValues(
            final com.commercetools.importapi.models.producttypes.AttributePlainEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    /**
     *
     */

    public AttributeEnumTypeBuilder plusValues(
            Function<com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder, com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public AttributeEnumTypeBuilder withValues(
            Function<com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder, com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.importapi.models.producttypes.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public AttributeEnumType build() {
        Objects.requireNonNull(values, AttributeEnumType.class + ": values is missing");
        return new AttributeEnumTypeImpl(values);
    }

    /**
     * builds AttributeEnumType without checking for non null required values
     */
    public AttributeEnumType buildUnchecked() {
        return new AttributeEnumTypeImpl(values);
    }

    public static AttributeEnumTypeBuilder of() {
        return new AttributeEnumTypeBuilder();
    }

    public static AttributeEnumTypeBuilder of(final AttributeEnumType template) {
        AttributeEnumTypeBuilder builder = new AttributeEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
