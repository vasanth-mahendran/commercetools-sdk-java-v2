
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetRatingChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetRatingChange setRatingChange = SetRatingChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetRatingChangeBuilder implements Builder<SetRatingChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     *  <p>Shape of the action for <code>setRating</code></p>
     */

    public SetRatingChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetRatingChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetRatingChangeBuilder nextValue(final Integer nextValue) {
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

    public SetRatingChange build() {
        Objects.requireNonNull(change, SetRatingChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetRatingChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetRatingChange.class + ": nextValue is missing");
        return new SetRatingChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetRatingChange without checking for non null required values
     */
    public SetRatingChange buildUnchecked() {
        return new SetRatingChangeImpl(change, previousValue, nextValue);
    }

    public static SetRatingChangeBuilder of() {
        return new SetRatingChangeBuilder();
    }

    public static SetRatingChangeBuilder of(final SetRatingChange template) {
        SetRatingChangeBuilder builder = new SetRatingChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
