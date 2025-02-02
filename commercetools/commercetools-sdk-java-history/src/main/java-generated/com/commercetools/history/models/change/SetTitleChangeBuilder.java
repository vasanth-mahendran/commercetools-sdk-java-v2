
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTitleChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTitleChange setTitleChange = SetTitleChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTitleChangeBuilder implements Builder<SetTitleChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setTitle</code></p>
     */

    public SetTitleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetTitleChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetTitleChangeBuilder nextValue(final String nextValue) {
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

    public SetTitleChange build() {
        Objects.requireNonNull(change, SetTitleChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTitleChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTitleChange.class + ": nextValue is missing");
        return new SetTitleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTitleChange without checking for non null required values
     */
    public SetTitleChange buildUnchecked() {
        return new SetTitleChangeImpl(change, previousValue, nextValue);
    }

    public static SetTitleChangeBuilder of() {
        return new SetTitleChangeBuilder();
    }

    public static SetTitleChangeBuilder of(final SetTitleChange template) {
        SetTitleChangeBuilder builder = new SetTitleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
