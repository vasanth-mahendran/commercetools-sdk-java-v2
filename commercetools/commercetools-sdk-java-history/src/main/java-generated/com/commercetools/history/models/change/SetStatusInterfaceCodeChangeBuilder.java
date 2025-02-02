
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStatusInterfaceCodeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceCodeChange setStatusInterfaceCodeChange = SetStatusInterfaceCodeChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStatusInterfaceCodeChangeBuilder implements Builder<SetStatusInterfaceCodeChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setStatusInterfaceCode</code></p>
     */

    public SetStatusInterfaceCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetStatusInterfaceCodeChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetStatusInterfaceCodeChangeBuilder nextValue(final String nextValue) {
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

    public SetStatusInterfaceCodeChange build() {
        Objects.requireNonNull(change, SetStatusInterfaceCodeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStatusInterfaceCodeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStatusInterfaceCodeChange.class + ": nextValue is missing");
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStatusInterfaceCodeChange without checking for non null required values
     */
    public SetStatusInterfaceCodeChange buildUnchecked() {
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }

    public static SetStatusInterfaceCodeChangeBuilder of() {
        return new SetStatusInterfaceCodeChangeBuilder();
    }

    public static SetStatusInterfaceCodeChangeBuilder of(final SetStatusInterfaceCodeChange template) {
        SetStatusInterfaceCodeChangeBuilder builder = new SetStatusInterfaceCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
