
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetExpectedDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetExpectedDeliveryChange setExpectedDeliveryChange = SetExpectedDeliveryChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetExpectedDeliveryChangeBuilder implements Builder<SetExpectedDeliveryChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setExpectedDelivery</code></p>
     */

    public SetExpectedDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetExpectedDeliveryChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetExpectedDeliveryChangeBuilder nextValue(final String nextValue) {
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

    public SetExpectedDeliveryChange build() {
        Objects.requireNonNull(change, SetExpectedDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetExpectedDeliveryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetExpectedDeliveryChange.class + ": nextValue is missing");
        return new SetExpectedDeliveryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetExpectedDeliveryChange without checking for non null required values
     */
    public SetExpectedDeliveryChange buildUnchecked() {
        return new SetExpectedDeliveryChangeImpl(change, previousValue, nextValue);
    }

    public static SetExpectedDeliveryChangeBuilder of() {
        return new SetExpectedDeliveryChangeBuilder();
    }

    public static SetExpectedDeliveryChangeBuilder of(final SetExpectedDeliveryChange template) {
        SetExpectedDeliveryChangeBuilder builder = new SetExpectedDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
