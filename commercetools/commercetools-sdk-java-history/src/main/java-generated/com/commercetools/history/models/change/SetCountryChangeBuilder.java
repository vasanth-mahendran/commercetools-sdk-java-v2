
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCountryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountryChange setCountryChange = SetCountryChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCountryChangeBuilder implements Builder<SetCountryChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>setCountry</code></p>
     */

    public SetCountryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public SetCountryChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public SetCountryChangeBuilder nextValue(final String nextValue) {
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

    public SetCountryChange build() {
        Objects.requireNonNull(change, SetCountryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCountryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCountryChange.class + ": nextValue is missing");
        return new SetCountryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCountryChange without checking for non null required values
     */
    public SetCountryChange buildUnchecked() {
        return new SetCountryChangeImpl(change, previousValue, nextValue);
    }

    public static SetCountryChangeBuilder of() {
        return new SetCountryChangeBuilder();
    }

    public static SetCountryChangeBuilder of(final SetCountryChange template) {
        SetCountryChangeBuilder builder = new SetCountryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
