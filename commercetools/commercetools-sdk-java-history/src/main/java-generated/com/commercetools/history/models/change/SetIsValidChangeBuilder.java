
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetIsValidChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetIsValidChange setIsValidChange = SetIsValidChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetIsValidChangeBuilder implements Builder<SetIsValidChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     *  <p>Shape of the action for <code>setIsValid</code></p>
     */

    public SetIsValidChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetIsValidChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetIsValidChangeBuilder nextValue(final Boolean nextValue) {
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

    public SetIsValidChange build() {
        Objects.requireNonNull(change, SetIsValidChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetIsValidChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetIsValidChange.class + ": nextValue is missing");
        return new SetIsValidChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetIsValidChange without checking for non null required values
     */
    public SetIsValidChange buildUnchecked() {
        return new SetIsValidChangeImpl(change, previousValue, nextValue);
    }

    public static SetIsValidChangeBuilder of() {
        return new SetIsValidChangeBuilder();
    }

    public static SetIsValidChangeBuilder of(final SetIsValidChange template) {
        SetIsValidChangeBuilder builder = new SetIsValidChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
