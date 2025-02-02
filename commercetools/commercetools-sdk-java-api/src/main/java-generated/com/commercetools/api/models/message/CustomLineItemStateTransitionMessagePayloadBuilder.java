
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemStateTransitionMessagePayload customLineItemStateTransitionMessagePayload = CustomLineItemStateTransitionMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .transitionDate(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemStateTransitionMessagePayloadBuilder
        implements Builder<CustomLineItemStateTransitionMessagePayload> {

    private String customLineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    /**
     *
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder transitionDate(
            final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    /**
     *
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    public CustomLineItemStateTransitionMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            CustomLineItemStateTransitionMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(transitionDate,
            CustomLineItemStateTransitionMessagePayload.class + ": transitionDate is missing");
        Objects.requireNonNull(quantity, CustomLineItemStateTransitionMessagePayload.class + ": quantity is missing");
        Objects.requireNonNull(fromState, CustomLineItemStateTransitionMessagePayload.class + ": fromState is missing");
        Objects.requireNonNull(toState, CustomLineItemStateTransitionMessagePayload.class + ": toState is missing");
        return new CustomLineItemStateTransitionMessagePayloadImpl(customLineItemId, transitionDate, quantity,
            fromState, toState);
    }

    /**
     * builds CustomLineItemStateTransitionMessagePayload without checking for non null required values
     */
    public CustomLineItemStateTransitionMessagePayload buildUnchecked() {
        return new CustomLineItemStateTransitionMessagePayloadImpl(customLineItemId, transitionDate, quantity,
            fromState, toState);
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder of() {
        return new CustomLineItemStateTransitionMessagePayloadBuilder();
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder of(
            final CustomLineItemStateTransitionMessagePayload template) {
        CustomLineItemStateTransitionMessagePayloadBuilder builder = new CustomLineItemStateTransitionMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
