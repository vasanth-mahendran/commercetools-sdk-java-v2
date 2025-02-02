
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMaxApplicationsPerCustomerChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxApplicationsPerCustomerChange setMaxApplicationsPerCustomerChange = SetMaxApplicationsPerCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMaxApplicationsPerCustomerChangeBuilder implements Builder<SetMaxApplicationsPerCustomerChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     *  <p>Shape of the action for <code>setMaxApplicationsPerCustomer</code></p>
     */

    public SetMaxApplicationsPerCustomerChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetMaxApplicationsPerCustomerChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetMaxApplicationsPerCustomerChangeBuilder nextValue(final Integer nextValue) {
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

    public SetMaxApplicationsPerCustomerChange build() {
        Objects.requireNonNull(change, SetMaxApplicationsPerCustomerChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMaxApplicationsPerCustomerChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMaxApplicationsPerCustomerChange.class + ": nextValue is missing");
        return new SetMaxApplicationsPerCustomerChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMaxApplicationsPerCustomerChange without checking for non null required values
     */
    public SetMaxApplicationsPerCustomerChange buildUnchecked() {
        return new SetMaxApplicationsPerCustomerChangeImpl(change, previousValue, nextValue);
    }

    public static SetMaxApplicationsPerCustomerChangeBuilder of() {
        return new SetMaxApplicationsPerCustomerChangeBuilder();
    }

    public static SetMaxApplicationsPerCustomerChangeBuilder of(final SetMaxApplicationsPerCustomerChange template) {
        SetMaxApplicationsPerCustomerChangeBuilder builder = new SetMaxApplicationsPerCustomerChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
