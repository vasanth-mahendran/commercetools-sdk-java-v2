
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStatusInterfaceTextChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceTextChange setStatusInterfaceTextChange = SetStatusInterfaceTextChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStatusInterfaceTextChangeBuilder implements Builder<SetStatusInterfaceTextChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setStatusInterfaceText</code></p>
     */

    public SetStatusInterfaceTextChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetStatusInterfaceTextChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetStatusInterfaceTextChangeBuilder nextValue(final String nextValue) {
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

    public SetStatusInterfaceTextChange build() {
        Objects.requireNonNull(change, SetStatusInterfaceTextChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStatusInterfaceTextChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStatusInterfaceTextChange.class + ": nextValue is missing");
        return new SetStatusInterfaceTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStatusInterfaceTextChange without checking for non null required values
     */
    public SetStatusInterfaceTextChange buildUnchecked() {
        return new SetStatusInterfaceTextChangeImpl(change, previousValue, nextValue);
    }

    public static SetStatusInterfaceTextChangeBuilder of() {
        return new SetStatusInterfaceTextChangeBuilder();
    }

    public static SetStatusInterfaceTextChangeBuilder of(final SetStatusInterfaceTextChange template) {
        SetStatusInterfaceTextChangeBuilder builder = new SetStatusInterfaceTextChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
