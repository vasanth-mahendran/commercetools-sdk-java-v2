
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneUpdate zoneUpdate = ZoneUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneUpdateBuilder implements Builder<ZoneUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> actions;

    /**
     *  <p>Expected version of the Zone on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */

    public ZoneUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     */

    public ZoneUpdateBuilder actions(final com.commercetools.api.models.zone.ZoneUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     */

    public ZoneUpdateBuilder actions(final java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     */

    public ZoneUpdateBuilder plusActions(final com.commercetools.api.models.zone.ZoneUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     */

    public ZoneUpdateBuilder plusActions(
            Function<com.commercetools.api.models.zone.ZoneUpdateActionBuilder, Builder<? extends com.commercetools.api.models.zone.ZoneUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.zone.ZoneUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     */

    public ZoneUpdateBuilder withActions(
            Function<com.commercetools.api.models.zone.ZoneUpdateActionBuilder, Builder<? extends com.commercetools.api.models.zone.ZoneUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.zone.ZoneUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> getActions() {
        return this.actions;
    }

    public ZoneUpdate build() {
        Objects.requireNonNull(version, ZoneUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ZoneUpdate.class + ": actions is missing");
        return new ZoneUpdateImpl(version, actions);
    }

    /**
     * builds ZoneUpdate without checking for non null required values
     */
    public ZoneUpdate buildUnchecked() {
        return new ZoneUpdateImpl(version, actions);
    }

    public static ZoneUpdateBuilder of() {
        return new ZoneUpdateBuilder();
    }

    public static ZoneUpdateBuilder of(final ZoneUpdate template) {
        ZoneUpdateBuilder builder = new ZoneUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
