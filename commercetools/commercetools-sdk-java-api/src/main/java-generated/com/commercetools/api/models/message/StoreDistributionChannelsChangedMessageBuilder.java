
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDistributionChannelsChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDistributionChannelsChangedMessage storeDistributionChannelsChangedMessage = StoreDistributionChannelsChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusAddedDistributionChannels(addedDistributionChannelsBuilder -> addedDistributionChannelsBuilder)
 *             .plusRemovedDistributionChannels(removedDistributionChannelsBuilder -> removedDistributionChannelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDistributionChannelsChangedMessageBuilder
        implements Builder<StoreDistributionChannelsChangedMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels;

    /**
     *  <p>Unique identifier of the Message.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public StoreDistributionChannelsChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The product distribution channels that have been added.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder addedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        this.addedDistributionChannels = new ArrayList<>(Arrays.asList(addedDistributionChannels));
        return this;
    }

    /**
     *  <p>The product distribution channels that have been added.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder addedDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels) {
        this.addedDistributionChannels = addedDistributionChannels;
        return this;
    }

    /**
     *  <p>The product distribution channels that have been added.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder plusAddedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        if (this.addedDistributionChannels == null) {
            this.addedDistributionChannels = new ArrayList<>();
        }
        this.addedDistributionChannels.addAll(Arrays.asList(addedDistributionChannels));
        return this;
    }

    /**
     *  <p>The product distribution channels that have been added.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder plusAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.addedDistributionChannels == null) {
            this.addedDistributionChannels = new ArrayList<>();
        }
        this.addedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product distribution channels that have been added.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder withAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.addedDistributionChannels = new ArrayList<>();
        this.addedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product distribution channels that have been removed.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder removedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        this.removedDistributionChannels = new ArrayList<>(Arrays.asList(removedDistributionChannels));
        return this;
    }

    /**
     *  <p>The product distribution channels that have been removed.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder removedDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels) {
        this.removedDistributionChannels = removedDistributionChannels;
        return this;
    }

    /**
     *  <p>The product distribution channels that have been removed.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder plusRemovedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        if (this.removedDistributionChannels == null) {
            this.removedDistributionChannels = new ArrayList<>();
        }
        this.removedDistributionChannels.addAll(Arrays.asList(removedDistributionChannels));
        return this;
    }

    /**
     *  <p>The product distribution channels that have been removed.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder plusRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.removedDistributionChannels == null) {
            this.removedDistributionChannels = new ArrayList<>();
        }
        this.removedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product distribution channels that have been removed.</p>
     */

    public StoreDistributionChannelsChangedMessageBuilder withRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.removedDistributionChannels = new ArrayList<>();
        this.removedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedDistributionChannels() {
        return this.addedDistributionChannels;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedDistributionChannels() {
        return this.removedDistributionChannels;
    }

    public StoreDistributionChannelsChangedMessage build() {
        Objects.requireNonNull(id, StoreDistributionChannelsChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, StoreDistributionChannelsChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StoreDistributionChannelsChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            StoreDistributionChannelsChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            StoreDistributionChannelsChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StoreDistributionChannelsChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            StoreDistributionChannelsChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(addedDistributionChannels,
            StoreDistributionChannelsChangedMessage.class + ": addedDistributionChannels is missing");
        Objects.requireNonNull(removedDistributionChannels,
            StoreDistributionChannelsChangedMessage.class + ": removedDistributionChannels is missing");
        return new StoreDistributionChannelsChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            addedDistributionChannels, removedDistributionChannels);
    }

    /**
     * builds StoreDistributionChannelsChangedMessage without checking for non null required values
     */
    public StoreDistributionChannelsChangedMessage buildUnchecked() {
        return new StoreDistributionChannelsChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            addedDistributionChannels, removedDistributionChannels);
    }

    public static StoreDistributionChannelsChangedMessageBuilder of() {
        return new StoreDistributionChannelsChangedMessageBuilder();
    }

    public static StoreDistributionChannelsChangedMessageBuilder of(
            final StoreDistributionChannelsChangedMessage template) {
        StoreDistributionChannelsChangedMessageBuilder builder = new StoreDistributionChannelsChangedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.addedDistributionChannels = template.getAddedDistributionChannels();
        builder.removedDistributionChannels = template.getRemovedDistributionChannels();
        return builder;
    }

}
