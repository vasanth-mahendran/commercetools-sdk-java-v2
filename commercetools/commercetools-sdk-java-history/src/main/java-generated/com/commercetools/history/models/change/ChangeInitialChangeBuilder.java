
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeInitialChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInitialChange changeInitialChange = ChangeInitialChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeInitialChangeBuilder implements Builder<ChangeInitialChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     *  <p>Shape of the action for <code>changeInitial</code></p>
     */

    public ChangeInitialChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public ChangeInitialChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public ChangeInitialChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public ChangeInitialChange build() {
        Objects.requireNonNull(change, ChangeInitialChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeInitialChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeInitialChange.class + ": nextValue is missing");
        return new ChangeInitialChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeInitialChange without checking for non null required values
     */
    public ChangeInitialChange buildUnchecked() {
        return new ChangeInitialChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeInitialChangeBuilder of() {
        return new ChangeInitialChangeBuilder();
    }

    public static ChangeInitialChangeBuilder of(final ChangeInitialChange template) {
        ChangeInitialChangeBuilder builder = new ChangeInitialChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
