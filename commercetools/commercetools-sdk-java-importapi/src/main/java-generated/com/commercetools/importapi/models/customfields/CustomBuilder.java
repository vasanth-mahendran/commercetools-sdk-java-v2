
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Custom custom = Custom.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomBuilder implements Builder<Custom> {

    private com.commercetools.importapi.models.common.TypeKeyReference type;

    @Nullable
    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    /**
     *  <p>The type that provides the field definitions for this object.</p>
     */

    public CustomBuilder type(
            Function<com.commercetools.importapi.models.common.TypeKeyReferenceBuilder, com.commercetools.importapi.models.common.TypeKeyReferenceBuilder> builder) {
        this.type = builder.apply(com.commercetools.importapi.models.common.TypeKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The type that provides the field definitions for this object.</p>
     */

    public CustomBuilder type(final com.commercetools.importapi.models.common.TypeKeyReference type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>The custom fields of this object.</p>
     */

    public CustomBuilder fields(
            Function<com.commercetools.importapi.models.customfields.FieldContainerBuilder, com.commercetools.importapi.models.customfields.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.importapi.models.customfields.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields of this object.</p>
     */

    public CustomBuilder fields(@Nullable final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.importapi.models.common.TypeKeyReference getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.FieldContainer getFields() {
        return this.fields;
    }

    public Custom build() {
        Objects.requireNonNull(type, Custom.class + ": type is missing");
        return new CustomImpl(type, fields);
    }

    /**
     * builds Custom without checking for non null required values
     */
    public Custom buildUnchecked() {
        return new CustomImpl(type, fields);
    }

    public static CustomBuilder of() {
        return new CustomBuilder();
    }

    public static CustomBuilder of(final Custom template) {
        CustomBuilder builder = new CustomBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
