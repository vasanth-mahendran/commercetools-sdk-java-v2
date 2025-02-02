
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelDraft channelDraft = ChannelDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelDraftBuilder implements Builder<ChannelDraft> {

    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.common.GeoJson geoLocation;

    /**
     *  <p>User-defined unique identifier for the Channel.</p>
     */

    public ChannelDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     */

    public ChannelDraftBuilder roles(@Nullable final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     */

    public ChannelDraftBuilder roles(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     */

    public ChannelDraftBuilder plusRoles(
            @Nullable final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Name of the Channel.</p>
     */

    public ChannelDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Channel.</p>
     */

    public ChannelDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Channel.</p>
     */

    public ChannelDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Channel.</p>
     */

    public ChannelDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Address where the Channel is located.</p>
     */

    public ChannelDraftBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address where the Channel is located.</p>
     */

    public ChannelDraftBuilder address(@Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Custom fields defined for the Channel.</p>
     */

    public ChannelDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields defined for the Channel.</p>
     */

    public ChannelDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the Point type is supported.</p>
     */

    public ChannelDraftBuilder geoLocation(@Nullable final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the Point type is supported.</p>
     */

    public ChannelDraftBuilder geoLocation(
            Function<com.commercetools.api.models.common.GeoJsonBuilder, Builder<? extends com.commercetools.api.models.common.GeoJson>> builder) {
        this.geoLocation = builder.apply(com.commercetools.api.models.common.GeoJsonBuilder.of()).build();
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.common.GeoJson getGeoLocation() {
        return this.geoLocation;
    }

    public ChannelDraft build() {
        Objects.requireNonNull(key, ChannelDraft.class + ": key is missing");
        return new ChannelDraftImpl(key, roles, name, description, address, custom, geoLocation);
    }

    /**
     * builds ChannelDraft without checking for non null required values
     */
    public ChannelDraft buildUnchecked() {
        return new ChannelDraftImpl(key, roles, name, description, address, custom, geoLocation);
    }

    public static ChannelDraftBuilder of() {
        return new ChannelDraftBuilder();
    }

    public static ChannelDraftBuilder of(final ChannelDraft template) {
        ChannelDraftBuilder builder = new ChannelDraftBuilder();
        builder.key = template.getKey();
        builder.roles = template.getRoles();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.address = template.getAddress();
        builder.custom = template.getCustom();
        builder.geoLocation = template.getGeoLocation();
        return builder;
    }

}
