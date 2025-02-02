
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationVersionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationVersionChange setApplicationVersionChange = SetApplicationVersionChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationVersionChangeBuilder implements Builder<SetApplicationVersionChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     *  <p>Internal Update action for <code>setApplicationVersion</code></p>
     */

    public SetApplicationVersionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetApplicationVersionChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetApplicationVersionChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public SetApplicationVersionChange build() {
        Objects.requireNonNull(change, SetApplicationVersionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetApplicationVersionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetApplicationVersionChange.class + ": nextValue is missing");
        return new SetApplicationVersionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetApplicationVersionChange without checking for non null required values
     */
    public SetApplicationVersionChange buildUnchecked() {
        return new SetApplicationVersionChangeImpl(change, previousValue, nextValue);
    }

    public static SetApplicationVersionChangeBuilder of() {
        return new SetApplicationVersionChangeBuilder();
    }

    public static SetApplicationVersionChangeBuilder of(final SetApplicationVersionChange template) {
        SetApplicationVersionChangeBuilder builder = new SetApplicationVersionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
