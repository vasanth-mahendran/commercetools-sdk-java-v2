
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeOrderStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderStateChange changeOrderStateChange = ChangeOrderStateChange.builder()
 *             .change("{change}")
 *             .nextValue(OrderState.OPEN)
 *             .previousValue(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeOrderStateChangeBuilder implements Builder<ChangeOrderStateChange> {

    private String change;

    private com.commercetools.history.models.common.OrderState nextValue;

    private com.commercetools.history.models.common.OrderState previousValue;

    /**
     *  <p>Update action for <code>changeOrderState</code></p>
     */

    public ChangeOrderStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public ChangeOrderStateChangeBuilder nextValue(final com.commercetools.history.models.common.OrderState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public ChangeOrderStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.OrderState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.OrderState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.OrderState getPreviousValue() {
        return this.previousValue;
    }

    public ChangeOrderStateChange build() {
        Objects.requireNonNull(change, ChangeOrderStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeOrderStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeOrderStateChange.class + ": previousValue is missing");
        return new ChangeOrderStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeOrderStateChange without checking for non null required values
     */
    public ChangeOrderStateChange buildUnchecked() {
        return new ChangeOrderStateChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeOrderStateChangeBuilder of() {
        return new ChangeOrderStateChangeBuilder();
    }

    public static ChangeOrderStateChangeBuilder of(final ChangeOrderStateChange template) {
        ChangeOrderStateChangeBuilder builder = new ChangeOrderStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
