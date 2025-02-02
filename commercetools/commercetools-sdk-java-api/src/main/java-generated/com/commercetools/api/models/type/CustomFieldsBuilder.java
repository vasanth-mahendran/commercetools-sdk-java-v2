
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFields customFields = CustomFields.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .fields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldsBuilder implements Builder<CustomFields> {

    private com.commercetools.api.models.type.TypeReference type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Reference to the Type that holds the FieldDefinitions for the Custom Fields.</p>
     */

    public CustomFieldsBuilder type(
            Function<com.commercetools.api.models.type.TypeReferenceBuilder, com.commercetools.api.models.type.TypeReferenceBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Type that holds the FieldDefinitions for the Custom Fields.</p>
     */

    public CustomFieldsBuilder type(final com.commercetools.api.models.type.TypeReference type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     */

    public CustomFieldsBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     */

    public CustomFieldsBuilder fields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeReference getType() {
        return this.type;
    }

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CustomFields build() {
        Objects.requireNonNull(type, CustomFields.class + ": type is missing");
        Objects.requireNonNull(fields, CustomFields.class + ": fields is missing");
        return new CustomFieldsImpl(type, fields);
    }

    /**
     * builds CustomFields without checking for non null required values
     */
    public CustomFields buildUnchecked() {
        return new CustomFieldsImpl(type, fields);
    }

    public static CustomFieldsBuilder of() {
        return new CustomFieldsBuilder();
    }

    public static CustomFieldsBuilder of(final CustomFields template) {
        CustomFieldsBuilder builder = new CustomFieldsBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
