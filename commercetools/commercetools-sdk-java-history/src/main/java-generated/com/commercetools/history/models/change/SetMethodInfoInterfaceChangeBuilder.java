
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMethodInfoInterfaceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoInterfaceChange setMethodInfoInterfaceChange = SetMethodInfoInterfaceChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMethodInfoInterfaceChangeBuilder implements Builder<SetMethodInfoInterfaceChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setMethodInfoInterface</code></p>
     */

    public SetMethodInfoInterfaceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetMethodInfoInterfaceChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetMethodInfoInterfaceChangeBuilder nextValue(final String nextValue) {
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

    public SetMethodInfoInterfaceChange build() {
        Objects.requireNonNull(change, SetMethodInfoInterfaceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMethodInfoInterfaceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMethodInfoInterfaceChange.class + ": nextValue is missing");
        return new SetMethodInfoInterfaceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMethodInfoInterfaceChange without checking for non null required values
     */
    public SetMethodInfoInterfaceChange buildUnchecked() {
        return new SetMethodInfoInterfaceChangeImpl(change, previousValue, nextValue);
    }

    public static SetMethodInfoInterfaceChangeBuilder of() {
        return new SetMethodInfoInterfaceChangeBuilder();
    }

    public static SetMethodInfoInterfaceChangeBuilder of(final SetMethodInfoInterfaceChange template) {
        SetMethodInfoInterfaceChangeBuilder builder = new SetMethodInfoInterfaceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
