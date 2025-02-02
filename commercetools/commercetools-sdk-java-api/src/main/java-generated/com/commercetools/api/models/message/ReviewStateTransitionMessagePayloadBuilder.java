
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewStateTransitionMessagePayload reviewStateTransitionMessagePayload = ReviewStateTransitionMessagePayload.builder()
 *             .oldState(oldStateBuilder -> oldStateBuilder)
 *             .newState(newStateBuilder -> newStateBuilder)
 *             .oldIncludedInStatistics(true)
 *             .newIncludedInStatistics(true)
 *             .target(targetBuilder -> targetBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewStateTransitionMessagePayloadBuilder implements Builder<ReviewStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference oldState;

    private com.commercetools.api.models.state.StateReference newState;

    private Boolean oldIncludedInStatistics;

    private Boolean newIncludedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    private Boolean force;

    /**
     *  <p>Reference to a State.</p>
     */

    public ReviewStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public ReviewStateTransitionMessagePayloadBuilder oldState(
            final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public ReviewStateTransitionMessagePayloadBuilder newState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.newState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a State.</p>
     */

    public ReviewStateTransitionMessagePayloadBuilder newState(
            final com.commercetools.api.models.state.StateReference newState) {
        this.newState = newState;
        return this;
    }

    /**
     *
     */

    public ReviewStateTransitionMessagePayloadBuilder oldIncludedInStatistics(final Boolean oldIncludedInStatistics) {
        this.oldIncludedInStatistics = oldIncludedInStatistics;
        return this;
    }

    /**
     *
     */

    public ReviewStateTransitionMessagePayloadBuilder newIncludedInStatistics(final Boolean newIncludedInStatistics) {
        this.newIncludedInStatistics = newIncludedInStatistics;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public ReviewStateTransitionMessagePayloadBuilder target(
            final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public ReviewStateTransitionMessagePayloadBuilder target(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.target = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ReviewStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    public com.commercetools.api.models.state.StateReference getNewState() {
        return this.newState;
    }

    public Boolean getOldIncludedInStatistics() {
        return this.oldIncludedInStatistics;
    }

    public Boolean getNewIncludedInStatistics() {
        return this.newIncludedInStatistics;
    }

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public Boolean getForce() {
        return this.force;
    }

    public ReviewStateTransitionMessagePayload build() {
        Objects.requireNonNull(oldState, ReviewStateTransitionMessagePayload.class + ": oldState is missing");
        Objects.requireNonNull(newState, ReviewStateTransitionMessagePayload.class + ": newState is missing");
        Objects.requireNonNull(oldIncludedInStatistics,
            ReviewStateTransitionMessagePayload.class + ": oldIncludedInStatistics is missing");
        Objects.requireNonNull(newIncludedInStatistics,
            ReviewStateTransitionMessagePayload.class + ": newIncludedInStatistics is missing");
        Objects.requireNonNull(target, ReviewStateTransitionMessagePayload.class + ": target is missing");
        Objects.requireNonNull(force, ReviewStateTransitionMessagePayload.class + ": force is missing");
        return new ReviewStateTransitionMessagePayloadImpl(oldState, newState, oldIncludedInStatistics,
            newIncludedInStatistics, target, force);
    }

    /**
     * builds ReviewStateTransitionMessagePayload without checking for non null required values
     */
    public ReviewStateTransitionMessagePayload buildUnchecked() {
        return new ReviewStateTransitionMessagePayloadImpl(oldState, newState, oldIncludedInStatistics,
            newIncludedInStatistics, target, force);
    }

    public static ReviewStateTransitionMessagePayloadBuilder of() {
        return new ReviewStateTransitionMessagePayloadBuilder();
    }

    public static ReviewStateTransitionMessagePayloadBuilder of(final ReviewStateTransitionMessagePayload template) {
        ReviewStateTransitionMessagePayloadBuilder builder = new ReviewStateTransitionMessagePayloadBuilder();
        builder.oldState = template.getOldState();
        builder.newState = template.getNewState();
        builder.oldIncludedInStatistics = template.getOldIncludedInStatistics();
        builder.newIncludedInStatistics = template.getNewIncludedInStatistics();
        builder.target = template.getTarget();
        builder.force = template.getForce();
        return builder;
    }

}
