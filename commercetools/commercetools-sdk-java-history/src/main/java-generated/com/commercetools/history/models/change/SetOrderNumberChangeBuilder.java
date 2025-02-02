
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderNumberChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderNumberChange setOrderNumberChange = SetOrderNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderNumberChangeBuilder implements Builder<SetOrderNumberChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setOrderNumber</code></p>
     */

    public SetOrderNumberChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetOrderNumberChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetOrderNumberChangeBuilder nextValue(final String nextValue) {
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

    public SetOrderNumberChange build() {
        Objects.requireNonNull(change, SetOrderNumberChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetOrderNumberChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetOrderNumberChange.class + ": nextValue is missing");
        return new SetOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetOrderNumberChange without checking for non null required values
     */
    public SetOrderNumberChange buildUnchecked() {
        return new SetOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    public static SetOrderNumberChangeBuilder of() {
        return new SetOrderNumberChangeBuilder();
    }

    public static SetOrderNumberChangeBuilder of(final SetOrderNumberChange template) {
        SetOrderNumberChangeBuilder builder = new SetOrderNumberChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
