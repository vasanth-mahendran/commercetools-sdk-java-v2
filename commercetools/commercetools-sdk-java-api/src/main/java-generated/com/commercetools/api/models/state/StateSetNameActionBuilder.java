
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetNameAction stateSetNameAction = StateSetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateSetNameActionBuilder implements Builder<StateSetNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public StateSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public StateSetNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public StateSetNameAction build() {
        Objects.requireNonNull(name, StateSetNameAction.class + ": name is missing");
        return new StateSetNameActionImpl(name);
    }

    /**
     * builds StateSetNameAction without checking for non null required values
     */
    public StateSetNameAction buildUnchecked() {
        return new StateSetNameActionImpl(name);
    }

    public static StateSetNameActionBuilder of() {
        return new StateSetNameActionBuilder();
    }

    public static StateSetNameActionBuilder of(final StateSetNameAction template) {
        StateSetNameActionBuilder builder = new StateSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
