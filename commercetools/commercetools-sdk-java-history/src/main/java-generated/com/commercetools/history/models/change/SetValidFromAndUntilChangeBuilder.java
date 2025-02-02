
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidFromAndUntilChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromAndUntilChange setValidFromAndUntilChange = SetValidFromAndUntilChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidFromAndUntilChangeBuilder implements Builder<SetValidFromAndUntilChange> {

    private String change;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue;

    /**
     *
     */

    public SetValidFromAndUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
     */

    public SetValidFromAndUntilChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
     */

    public SetValidFromAndUntilChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
     */

    public SetValidFromAndUntilChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
     */

    public SetValidFromAndUntilChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getNextValue() {
        return this.nextValue;
    }

    public SetValidFromAndUntilChange build() {
        Objects.requireNonNull(change, SetValidFromAndUntilChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidFromAndUntilChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidFromAndUntilChange.class + ": nextValue is missing");
        return new SetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidFromAndUntilChange without checking for non null required values
     */
    public SetValidFromAndUntilChange buildUnchecked() {
        return new SetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    public static SetValidFromAndUntilChangeBuilder of() {
        return new SetValidFromAndUntilChangeBuilder();
    }

    public static SetValidFromAndUntilChangeBuilder of(final SetValidFromAndUntilChange template) {
        SetValidFromAndUntilChangeBuilder builder = new SetValidFromAndUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
