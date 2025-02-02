
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextChange setTextChange = SetTextChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTextChangeBuilder implements Builder<SetTextChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setText</code></p>
     */

    public SetTextChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetTextChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetTextChangeBuilder nextValue(final String nextValue) {
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

    public SetTextChange build() {
        Objects.requireNonNull(change, SetTextChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTextChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextChange.class + ": nextValue is missing");
        return new SetTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTextChange without checking for non null required values
     */
    public SetTextChange buildUnchecked() {
        return new SetTextChangeImpl(change, previousValue, nextValue);
    }

    public static SetTextChangeBuilder of() {
        return new SetTextChangeBuilder();
    }

    public static SetTextChangeBuilder of(final SetTextChange template) {
        SetTextChangeBuilder builder = new SetTextChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
