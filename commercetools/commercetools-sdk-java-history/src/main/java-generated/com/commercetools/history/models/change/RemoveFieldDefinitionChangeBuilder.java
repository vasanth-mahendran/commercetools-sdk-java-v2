
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveFieldDefinitionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFieldDefinitionChange removeFieldDefinitionChange = RemoveFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveFieldDefinitionChangeBuilder implements Builder<RemoveFieldDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.FieldDefinition previousValue;

    /**
     *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
     */

    public RemoveFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public RemoveFieldDefinitionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinitionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public RemoveFieldDefinitionChangeBuilder previousValue(
            final com.commercetools.history.models.common.FieldDefinition previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.FieldDefinition getPreviousValue() {
        return this.previousValue;
    }

    public RemoveFieldDefinitionChange build() {
        Objects.requireNonNull(change, RemoveFieldDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveFieldDefinitionChange.class + ": previousValue is missing");
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveFieldDefinitionChange without checking for non null required values
     */
    public RemoveFieldDefinitionChange buildUnchecked() {
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    public static RemoveFieldDefinitionChangeBuilder of() {
        return new RemoveFieldDefinitionChangeBuilder();
    }

    public static RemoveFieldDefinitionChangeBuilder of(final RemoveFieldDefinitionChange template) {
        RemoveFieldDefinitionChangeBuilder builder = new RemoveFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
