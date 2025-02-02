
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddFieldDefinitionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddFieldDefinitionChange addFieldDefinitionChange = AddFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddFieldDefinitionChangeBuilder implements Builder<AddFieldDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.FieldDefinition nextValue;

    /**
     *  <p>Update action for <code>addFieldDefinition</code> on payments</p>
     */

    public AddFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public AddFieldDefinitionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinitionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public AddFieldDefinitionChangeBuilder nextValue(
            final com.commercetools.history.models.common.FieldDefinition nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.FieldDefinition getNextValue() {
        return this.nextValue;
    }

    public AddFieldDefinitionChange build() {
        Objects.requireNonNull(change, AddFieldDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddFieldDefinitionChange.class + ": nextValue is missing");
        return new AddFieldDefinitionChangeImpl(change, nextValue);
    }

    /**
     * builds AddFieldDefinitionChange without checking for non null required values
     */
    public AddFieldDefinitionChange buildUnchecked() {
        return new AddFieldDefinitionChangeImpl(change, nextValue);
    }

    public static AddFieldDefinitionChangeBuilder of() {
        return new AddFieldDefinitionChangeBuilder();
    }

    public static AddFieldDefinitionChangeBuilder of(final AddFieldDefinitionChange template) {
        AddFieldDefinitionChangeBuilder builder = new AddFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
