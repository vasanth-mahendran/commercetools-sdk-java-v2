
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeGroupsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeGroupsChange changeGroupsChange = ChangeGroupsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeGroupsChangeBuilder implements Builder<ChangeGroupsChange> {

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    /**
     *  <p>Update action for <code>changeGroups</code> on stores</p>
     */

    public ChangeGroupsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public ChangeGroupsChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public ChangeGroupsChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public ChangeGroupsChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public ChangeGroupsChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public ChangeGroupsChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public ChangeGroupsChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public ChangeGroupsChange build() {
        Objects.requireNonNull(change, ChangeGroupsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeGroupsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeGroupsChange.class + ": nextValue is missing");
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeGroupsChange without checking for non null required values
     */
    public ChangeGroupsChange buildUnchecked() {
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeGroupsChangeBuilder of() {
        return new ChangeGroupsChangeBuilder();
    }

    public static ChangeGroupsChangeBuilder of(final ChangeGroupsChange template) {
        ChangeGroupsChangeBuilder builder = new ChangeGroupsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
