
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMetaDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMetaDescriptionChange setMetaDescriptionChange = SetMetaDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMetaDescriptionChangeBuilder implements Builder<SetMetaDescriptionChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    /**
     *  <p>Shape of the action for <code>setMetaDescription</code></p>
     */

    public SetMetaDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetMetaDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public SetMetaDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetMetaDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public SetMetaDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetMetaDescriptionChange build() {
        Objects.requireNonNull(change, SetMetaDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMetaDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMetaDescriptionChange.class + ": nextValue is missing");
        return new SetMetaDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMetaDescriptionChange without checking for non null required values
     */
    public SetMetaDescriptionChange buildUnchecked() {
        return new SetMetaDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static SetMetaDescriptionChangeBuilder of() {
        return new SetMetaDescriptionChangeBuilder();
    }

    public static SetMetaDescriptionChangeBuilder of(final SetMetaDescriptionChange template) {
        SetMetaDescriptionChangeBuilder builder = new SetMetaDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
