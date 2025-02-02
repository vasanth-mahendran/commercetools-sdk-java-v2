
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInputTipChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInputTipChange setInputTipChange = SetInputTipChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetInputTipChangeBuilder implements Builder<SetInputTipChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    /**
     *  <p>Update action for <code>setInputTip</code> on product types</p>
     */

    public SetInputTipChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the updated attribute.</p>
     */

    public SetInputTipChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *
     */

    public SetInputTipChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public SetInputTipChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public SetInputTipChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public SetInputTipChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public SetInputTipChange build() {
        Objects.requireNonNull(change, SetInputTipChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, SetInputTipChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, SetInputTipChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetInputTipChange.class + ": previousValue is missing");
        return new SetInputTipChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * builds SetInputTipChange without checking for non null required values
     */
    public SetInputTipChange buildUnchecked() {
        return new SetInputTipChangeImpl(change, attributeName, nextValue, previousValue);
    }

    public static SetInputTipChangeBuilder of() {
        return new SetInputTipChangeBuilder();
    }

    public static SetInputTipChangeBuilder of(final SetInputTipChange template) {
        SetInputTipChangeBuilder builder = new SetInputTipChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
