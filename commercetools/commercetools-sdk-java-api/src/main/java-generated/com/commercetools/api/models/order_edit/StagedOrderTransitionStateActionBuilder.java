
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionStateAction stagedOrderTransitionStateAction = StagedOrderTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderTransitionStateActionBuilder implements Builder<StagedOrderTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */

    public StagedOrderTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */

    public StagedOrderTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *
     */

    public StagedOrderTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    public StagedOrderTransitionStateAction build() {
        Objects.requireNonNull(state, StagedOrderTransitionStateAction.class + ": state is missing");
        return new StagedOrderTransitionStateActionImpl(state, force);
    }

    /**
     * builds StagedOrderTransitionStateAction without checking for non null required values
     */
    public StagedOrderTransitionStateAction buildUnchecked() {
        return new StagedOrderTransitionStateActionImpl(state, force);
    }

    public static StagedOrderTransitionStateActionBuilder of() {
        return new StagedOrderTransitionStateActionBuilder();
    }

    public static StagedOrderTransitionStateActionBuilder of(final StagedOrderTransitionStateAction template) {
        StagedOrderTransitionStateActionBuilder builder = new StagedOrderTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
