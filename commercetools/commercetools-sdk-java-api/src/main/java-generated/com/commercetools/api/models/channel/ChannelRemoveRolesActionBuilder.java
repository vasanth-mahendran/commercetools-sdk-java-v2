
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelRemoveRolesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelRemoveRolesAction channelRemoveRolesAction = ChannelRemoveRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelRemoveRolesActionBuilder implements Builder<ChannelRemoveRolesAction> {

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    /**
     *  <p>Value to remove from the array.</p>
     */

    public ChannelRemoveRolesActionBuilder roles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Value to remove from the array.</p>
     */

    public ChannelRemoveRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Value to remove from the array.</p>
     */

    public ChannelRemoveRolesActionBuilder plusRoles(
            final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    public ChannelRemoveRolesAction build() {
        Objects.requireNonNull(roles, ChannelRemoveRolesAction.class + ": roles is missing");
        return new ChannelRemoveRolesActionImpl(roles);
    }

    /**
     * builds ChannelRemoveRolesAction without checking for non null required values
     */
    public ChannelRemoveRolesAction buildUnchecked() {
        return new ChannelRemoveRolesActionImpl(roles);
    }

    public static ChannelRemoveRolesActionBuilder of() {
        return new ChannelRemoveRolesActionBuilder();
    }

    public static ChannelRemoveRolesActionBuilder of(final ChannelRemoveRolesAction template) {
        ChannelRemoveRolesActionBuilder builder = new ChannelRemoveRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
