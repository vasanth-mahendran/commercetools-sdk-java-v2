
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SyncInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyncInfo syncInfo = SyncInfo.builder()
 *             .channel(channelBuilder -> channelBuilder)
 *             .syncedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SyncInfoBuilder implements Builder<SyncInfo> {

    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    @Nullable
    private String externalId;

    private java.time.ZonedDateTime syncedAt;

    /**
     *  <p>Maps to <code>SyncInfo.channel</code></p>
     */

    public SyncInfoBuilder channel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>SyncInfo.channel</code></p>
     */

    public SyncInfoBuilder channel(final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Maps to <code>SyncInfo.externalId</code></p>
     */

    public SyncInfoBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Maps to <code>SyncInfo.syncedAt</code></p>
     */

    public SyncInfoBuilder syncedAt(final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    public SyncInfo build() {
        Objects.requireNonNull(channel, SyncInfo.class + ": channel is missing");
        Objects.requireNonNull(syncedAt, SyncInfo.class + ": syncedAt is missing");
        return new SyncInfoImpl(channel, externalId, syncedAt);
    }

    /**
     * builds SyncInfo without checking for non null required values
     */
    public SyncInfo buildUnchecked() {
        return new SyncInfoImpl(channel, externalId, syncedAt);
    }

    public static SyncInfoBuilder of() {
        return new SyncInfoBuilder();
    }

    public static SyncInfoBuilder of(final SyncInfo template) {
        SyncInfoBuilder builder = new SyncInfoBuilder();
        builder.channel = template.getChannel();
        builder.externalId = template.getExternalId();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
