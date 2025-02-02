
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerIdChange setCustomerIdChange = SetCustomerIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerIdChangeBuilder implements Builder<SetCustomerIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setCustomerId</code></p>
     */

    public SetCustomerIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetCustomerIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetCustomerIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetCustomerIdChange build() {
        Objects.requireNonNull(change, SetCustomerIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerIdChange.class + ": nextValue is missing");
        return new SetCustomerIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerIdChange without checking for non null required values
     */
    public SetCustomerIdChange buildUnchecked() {
        return new SetCustomerIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerIdChangeBuilder of() {
        return new SetCustomerIdChangeBuilder();
    }

    public static SetCustomerIdChangeBuilder of(final SetCustomerIdChange template) {
        SetCustomerIdChangeBuilder builder = new SetCustomerIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
