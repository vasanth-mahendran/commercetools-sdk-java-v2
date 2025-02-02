
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValueChange setValueChange = SetValueChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValueChangeBuilder implements Builder<SetValueChange> {

    private String change;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for <code>setValue</code> on custom objects</p>
     */

    public SetValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetValueChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public SetValueChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetValueChange build() {
        Objects.requireNonNull(change, SetValueChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetValueChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetValueChange.class + ": previousValue is missing");
        return new SetValueChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetValueChange without checking for non null required values
     */
    public SetValueChange buildUnchecked() {
        return new SetValueChangeImpl(change, nextValue, previousValue);
    }

    public static SetValueChangeBuilder of() {
        return new SetValueChangeBuilder();
    }

    public static SetValueChangeBuilder of(final SetValueChange template) {
        SetValueChangeBuilder builder = new SetValueChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
