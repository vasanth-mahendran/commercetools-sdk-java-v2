
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetCustomTypeAction inventoryEntrySetCustomTypeAction = InventoryEntrySetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetCustomTypeActionBuilder implements Builder<InventoryEntrySetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the InventoryEntry with Custom Fields. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     */

    public InventoryEntrySetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the InventoryEntry with Custom Fields. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     */

    public InventoryEntrySetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the InventoryEntry.</p>
     */

    public InventoryEntrySetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the InventoryEntry.</p>
     */

    public InventoryEntrySetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public InventoryEntrySetCustomTypeAction build() {
        return new InventoryEntrySetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds InventoryEntrySetCustomTypeAction without checking for non null required values
     */
    public InventoryEntrySetCustomTypeAction buildUnchecked() {
        return new InventoryEntrySetCustomTypeActionImpl(type, fields);
    }

    public static InventoryEntrySetCustomTypeActionBuilder of() {
        return new InventoryEntrySetCustomTypeActionBuilder();
    }

    public static InventoryEntrySetCustomTypeActionBuilder of(final InventoryEntrySetCustomTypeAction template) {
        InventoryEntrySetCustomTypeActionBuilder builder = new InventoryEntrySetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
