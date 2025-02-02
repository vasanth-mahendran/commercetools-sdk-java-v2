
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDefinitionTypeConflictErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionTypeConflictError attributeDefinitionTypeConflictError = AttributeDefinitionTypeConflictError.builder()
 *             .message("{message}")
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDefinitionTypeConflictErrorBuilder implements Builder<AttributeDefinitionTypeConflictError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingProductTypeId;

    private String conflictingProductTypeName;

    private String conflictingAttributeName;

    /**
     *
     */

    public AttributeDefinitionTypeConflictErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     */

    public AttributeDefinitionTypeConflictErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public AttributeDefinitionTypeConflictErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *
     */

    public AttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeId(final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }

    /**
     *
     */

    public AttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeName(
            final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }

    /**
     *
     */

    public AttributeDefinitionTypeConflictErrorBuilder conflictingAttributeName(final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getConflictingProductTypeId() {
        return this.conflictingProductTypeId;
    }

    public String getConflictingProductTypeName() {
        return this.conflictingProductTypeName;
    }

    public String getConflictingAttributeName() {
        return this.conflictingAttributeName;
    }

    public AttributeDefinitionTypeConflictError build() {
        Objects.requireNonNull(message, AttributeDefinitionTypeConflictError.class + ": message is missing");
        Objects.requireNonNull(values, AttributeDefinitionTypeConflictError.class + ": values are missing");
        Objects.requireNonNull(conflictingProductTypeId,
            AttributeDefinitionTypeConflictError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName,
            AttributeDefinitionTypeConflictError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName,
            AttributeDefinitionTypeConflictError.class + ": conflictingAttributeName is missing");
        return new AttributeDefinitionTypeConflictErrorImpl(message, values, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * builds AttributeDefinitionTypeConflictError without checking for non null required values
     */
    public AttributeDefinitionTypeConflictError buildUnchecked() {
        return new AttributeDefinitionTypeConflictErrorImpl(message, values, conflictingProductTypeId,
            conflictingProductTypeName, conflictingAttributeName);
    }

    public static AttributeDefinitionTypeConflictErrorBuilder of() {
        return new AttributeDefinitionTypeConflictErrorBuilder();
    }

    public static AttributeDefinitionTypeConflictErrorBuilder of(final AttributeDefinitionTypeConflictError template) {
        AttributeDefinitionTypeConflictErrorBuilder builder = new AttributeDefinitionTypeConflictErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
