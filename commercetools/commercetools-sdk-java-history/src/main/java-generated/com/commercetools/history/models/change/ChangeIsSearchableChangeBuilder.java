
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIsSearchableChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsSearchableChange changeIsSearchableChange = ChangeIsSearchableChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(true)
 *             .previousValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeIsSearchableChangeBuilder implements Builder<ChangeIsSearchableChange> {

    private String change;

    private String attributeName;

    private Boolean nextValue;

    private Boolean previousValue;

    /**
     *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
     */

    public ChangeIsSearchableChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the updated attribute.</p>
     */

    public ChangeIsSearchableChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *
     */

    public ChangeIsSearchableChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public ChangeIsSearchableChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    public ChangeIsSearchableChange build() {
        Objects.requireNonNull(change, ChangeIsSearchableChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangeIsSearchableChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeIsSearchableChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeIsSearchableChange.class + ": previousValue is missing");
        return new ChangeIsSearchableChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeIsSearchableChange without checking for non null required values
     */
    public ChangeIsSearchableChange buildUnchecked() {
        return new ChangeIsSearchableChangeImpl(change, attributeName, nextValue, previousValue);
    }

    public static ChangeIsSearchableChangeBuilder of() {
        return new ChangeIsSearchableChangeBuilder();
    }

    public static ChangeIsSearchableChangeBuilder of(final ChangeIsSearchableChange template) {
        ChangeIsSearchableChangeBuilder builder = new ChangeIsSearchableChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
