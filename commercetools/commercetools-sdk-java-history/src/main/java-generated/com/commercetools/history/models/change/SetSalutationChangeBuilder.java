
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSalutationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSalutationChange setSalutationChange = SetSalutationChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSalutationChangeBuilder implements Builder<SetSalutationChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setSalutation</code></p>
     */

    public SetSalutationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetSalutationChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetSalutationChangeBuilder nextValue(final String nextValue) {
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

    public SetSalutationChange build() {
        Objects.requireNonNull(change, SetSalutationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSalutationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSalutationChange.class + ": nextValue is missing");
        return new SetSalutationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetSalutationChange without checking for non null required values
     */
    public SetSalutationChange buildUnchecked() {
        return new SetSalutationChangeImpl(change, previousValue, nextValue);
    }

    public static SetSalutationChangeBuilder of() {
        return new SetSalutationChangeBuilder();
    }

    public static SetSalutationChangeBuilder of(final SetSalutationChange template) {
        SetSalutationChangeBuilder builder = new SetSalutationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
