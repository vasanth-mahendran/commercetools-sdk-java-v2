
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDraft storeDraft = StoreDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDraftBuilder implements Builder<StoreDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private java.util.List<String> languages;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique and immutable identifier for the Store. Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
     */

    public StoreDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     */

    public StoreDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Store.</p>
     */

    public StoreDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     */

    public StoreDraftBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     */

    public StoreDraftBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     */

    public StoreDraftBuilder plusLanguages(@Nullable final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder distributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder distributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder plusDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder supplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder supplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder plusSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreDraftBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreDraftBuilder productSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreDraftBuilder productSelections(
            @Nullable final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreDraftBuilder plusProductSelections(
            @Nullable final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.addAll(Arrays.asList(productSelections));
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreDraftBuilder plusProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        if (this.productSelections == null) {
            this.productSelections = new ArrayList<>();
        }
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */

    public StoreDraftBuilder withProductSelections(
            Function<com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder, com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder> builder) {
        this.productSelections = new ArrayList<>();
        this.productSelections.add(
            builder.apply(com.commercetools.api.models.store.ProductSelectionSettingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     */

    public StoreDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields for the Store.</p>
     */

    public StoreDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections() {
        return this.productSelections;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public StoreDraft build() {
        Objects.requireNonNull(key, StoreDraft.class + ": key is missing");
        return new StoreDraftImpl(key, name, languages, distributionChannels, supplyChannels, productSelections,
            custom);
    }

    /**
     * builds StoreDraft without checking for non null required values
     */
    public StoreDraft buildUnchecked() {
        return new StoreDraftImpl(key, name, languages, distributionChannels, supplyChannels, productSelections,
            custom);
    }

    public static StoreDraftBuilder of() {
        return new StoreDraftBuilder();
    }

    public static StoreDraftBuilder of(final StoreDraft template) {
        StoreDraftBuilder builder = new StoreDraftBuilder();
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
