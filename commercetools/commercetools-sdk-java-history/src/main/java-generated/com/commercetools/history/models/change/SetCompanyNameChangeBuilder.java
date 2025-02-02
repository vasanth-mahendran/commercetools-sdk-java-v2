
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCompanyNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCompanyNameChange setCompanyNameChange = SetCompanyNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCompanyNameChangeBuilder implements Builder<SetCompanyNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setCompanyName</code></p>
     */

    public SetCompanyNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetCompanyNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetCompanyNameChangeBuilder nextValue(final String nextValue) {
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

    public SetCompanyNameChange build() {
        Objects.requireNonNull(change, SetCompanyNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCompanyNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCompanyNameChange.class + ": nextValue is missing");
        return new SetCompanyNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCompanyNameChange without checking for non null required values
     */
    public SetCompanyNameChange buildUnchecked() {
        return new SetCompanyNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetCompanyNameChangeBuilder of() {
        return new SetCompanyNameChangeBuilder();
    }

    public static SetCompanyNameChangeBuilder of(final SetCompanyNameChange template) {
        SetCompanyNameChangeBuilder builder = new SetCompanyNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
