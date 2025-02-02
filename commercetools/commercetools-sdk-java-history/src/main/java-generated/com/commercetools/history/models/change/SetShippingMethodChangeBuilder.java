
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingMethodChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodChange setShippingMethodChange = SetShippingMethodChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodChangeBuilder implements Builder<SetShippingMethodChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue;

    /**
     *  <p>Update action for <code>setShippingMethod</code></p>
     */

    public SetShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetShippingMethodChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public SetShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public SetShippingMethodChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public SetShippingMethodChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingMethodChange build() {
        Objects.requireNonNull(change, SetShippingMethodChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodChange.class + ": previousValue is missing");
        return new SetShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingMethodChange without checking for non null required values
     */
    public SetShippingMethodChange buildUnchecked() {
        return new SetShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingMethodChangeBuilder of() {
        return new SetShippingMethodChangeBuilder();
    }

    public static SetShippingMethodChangeBuilder of(final SetShippingMethodChange template) {
        SetShippingMethodChangeBuilder builder = new SetShippingMethodChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
