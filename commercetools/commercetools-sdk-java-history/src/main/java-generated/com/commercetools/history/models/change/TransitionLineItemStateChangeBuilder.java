
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransitionLineItemStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransitionLineItemStateChange transitionLineItemStateChange = TransitionLineItemStateChange.builder()
 *             .change("{change}")
 *             .lineItemId("{lineItemId}")
 *             .stateId("{stateId}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransitionLineItemStateChangeBuilder implements Builder<TransitionLineItemStateChange> {

    private String change;

    private String lineItemId;

    private String stateId;

    private java.util.List<com.commercetools.history.models.common.ItemState> nextValue;

    private java.util.List<com.commercetools.history.models.common.ItemState> previousValue;

    /**
     *  <p>Update action for <code>transitionLineItemState</code></p>
     */

    public TransitionLineItemStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder stateId(final String stateId) {
        this.stateId = stateId;
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemState... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ItemState... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemState... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ItemState> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ItemState... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public TransitionLineItemStateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getStateId() {
        return this.stateId;
    }

    public java.util.List<com.commercetools.history.models.common.ItemState> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.ItemState> getPreviousValue() {
        return this.previousValue;
    }

    public TransitionLineItemStateChange build() {
        Objects.requireNonNull(change, TransitionLineItemStateChange.class + ": change is missing");
        Objects.requireNonNull(lineItemId, TransitionLineItemStateChange.class + ": lineItemId is missing");
        Objects.requireNonNull(stateId, TransitionLineItemStateChange.class + ": stateId is missing");
        Objects.requireNonNull(nextValue, TransitionLineItemStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, TransitionLineItemStateChange.class + ": previousValue is missing");
        return new TransitionLineItemStateChangeImpl(change, lineItemId, stateId, nextValue, previousValue);
    }

    /**
     * builds TransitionLineItemStateChange without checking for non null required values
     */
    public TransitionLineItemStateChange buildUnchecked() {
        return new TransitionLineItemStateChangeImpl(change, lineItemId, stateId, nextValue, previousValue);
    }

    public static TransitionLineItemStateChangeBuilder of() {
        return new TransitionLineItemStateChangeBuilder();
    }

    public static TransitionLineItemStateChangeBuilder of(final TransitionLineItemStateChange template) {
        TransitionLineItemStateChangeBuilder builder = new TransitionLineItemStateChangeBuilder();
        builder.change = template.getChange();
        builder.lineItemId = template.getLineItemId();
        builder.stateId = template.getStateId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
