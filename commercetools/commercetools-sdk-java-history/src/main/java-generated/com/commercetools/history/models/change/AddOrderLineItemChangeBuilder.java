
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddOrderLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddOrderLineItemChange addOrderLineItemChange = AddOrderLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddOrderLineItemChangeBuilder implements Builder<AddOrderLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    /**
     *
     */

    public AddOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public AddOrderLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public AddOrderLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public AddOrderLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public AddOrderLineItemChangeBuilder nextValue(final com.commercetools.history.models.common.LineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LineItem getNextValue() {
        return this.nextValue;
    }

    public AddOrderLineItemChange build() {
        Objects.requireNonNull(change, AddOrderLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddOrderLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddOrderLineItemChange.class + ": nextValue is missing");
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddOrderLineItemChange without checking for non null required values
     */
    public AddOrderLineItemChange buildUnchecked() {
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static AddOrderLineItemChangeBuilder of() {
        return new AddOrderLineItemChangeBuilder();
    }

    public static AddOrderLineItemChangeBuilder of(final AddOrderLineItemChange template) {
        AddOrderLineItemChangeBuilder builder = new AddOrderLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
