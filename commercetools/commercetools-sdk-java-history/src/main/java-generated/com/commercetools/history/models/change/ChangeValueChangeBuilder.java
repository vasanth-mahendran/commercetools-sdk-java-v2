
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueChange changeValueChange = ChangeValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueChangeBuilder implements Builder<ChangeValueChange> {

    private String change;

    private com.commercetools.history.models.change_value.ChangeValueChangeValue nextValue;

    private com.commercetools.history.models.change_value.ChangeValueChangeValue previousValue;

    /**
     *  <p>Update action for <code>changeValue</code> on cart discounts and product discounts</p>
     */

    public ChangeValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public ChangeValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ChangeValueChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public ChangeValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeValueChangeValue>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ChangeValueChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ChangeValueChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public ChangeValueChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeValueChangeValue>> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder.of())
                .build();
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ChangeValueChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.ChangeValueChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public ChangeValueChange build() {
        Objects.requireNonNull(change, ChangeValueChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeValueChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeValueChange.class + ": previousValue is missing");
        return new ChangeValueChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeValueChange without checking for non null required values
     */
    public ChangeValueChange buildUnchecked() {
        return new ChangeValueChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeValueChangeBuilder of() {
        return new ChangeValueChangeBuilder();
    }

    public static ChangeValueChangeBuilder of(final ChangeValueChange template) {
        ChangeValueChangeBuilder builder = new ChangeValueChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
