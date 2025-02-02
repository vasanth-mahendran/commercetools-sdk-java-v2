
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Store store = Store.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreBuilder implements Builder<Store> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<String> languages;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique ID of the Store.</p>
     */

    public StoreBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Store.</p>
     */

    public StoreBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Store was initially created.</p>
     */

    public StoreBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Store was last updated.</p>
     */

    public StoreBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StoreBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique and immutable identifier for the Store.</p>
     */

    public StoreBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     */

    public StoreBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     */

    public StoreBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     */

    public StoreBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     */

    public StoreBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     */

    public StoreBuilder plusLanguages(final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     */

    public StoreBuilder distributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     */

    public StoreBuilder distributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     */

    public StoreBuilder plusDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     */

    public StoreBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product Distribution Channels allowed for the Store.</p>
     */

    public StoreBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     */

    public StoreBuilder supplyChannels(final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     */

    public StoreBuilder supplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     */

    public StoreBuilder plusSupplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     */

    public StoreBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory Supply Channels allowed for the Store.</p>
     */

    public StoreBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>If empty all Products in the Project are available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreBuilder productSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>If empty all Products in the Project are available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreBuilder productSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>If empty all Products in the Project are available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreBuilder plusProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSetting... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>If empty all Products in the Project are available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>If empty all Products in the Project are available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingBuilder, com.commercetools.api.models.store.ProductSelectionSettingBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections
                .add(builder.apply(com.commercetools.api.models.store.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     */

    public StoreBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     */

    public StoreBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels() {
        return this.distributionChannels;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getSupplyChannels() {
        return this.supplyChannels;
    }

    public java.util.List<com.commercetools.api.models.store.ProductSelectionSetting> getProductSelections() {
        return this.productSelections;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public Store build() {
        Objects.requireNonNull(id, Store.class + ": id is missing");
        Objects.requireNonNull(version, Store.class + ": version is missing");
        Objects.requireNonNull(createdAt, Store.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Store.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Store.class + ": key is missing");
        Objects.requireNonNull(languages, Store.class + ": languages is missing");
        Objects.requireNonNull(distributionChannels, Store.class + ": distributionChannels is missing");
        Objects.requireNonNull(supplyChannels, Store.class + ": supplyChannels is missing");
        Objects.requireNonNull(productSelections, Store.class + ": productSelections is missing");
        return new StoreImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, languages,
            distributionChannels, supplyChannels, productSelections, custom);
    }

    /**
     * builds Store without checking for non null required values
     */
    public Store buildUnchecked() {
        return new StoreImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, languages,
            distributionChannels, supplyChannels, productSelections, custom);
    }

    public static StoreBuilder of() {
        return new StoreBuilder();
    }

    public static StoreBuilder of(final Store template) {
        StoreBuilder builder = new StoreBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.languages = template.getLanguages();
        builder.distributionChannels = template.getDistributionChannels();
        builder.supplyChannels = template.getSupplyChannels();
        builder.productSelections = template.getProductSelections();
        builder.custom = template.getCustom();
        return builder;
    }

}
