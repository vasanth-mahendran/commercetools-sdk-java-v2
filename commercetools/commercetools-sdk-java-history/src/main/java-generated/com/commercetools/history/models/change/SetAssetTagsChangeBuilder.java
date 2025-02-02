
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetTagsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetTagsChange setAssetTagsChange = SetAssetTagsChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetTagsChangeBuilder implements Builder<SetAssetTagsChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    /**
     *  <p>Update action for <code>setAssetTags</code></p>
     */

    public SetAssetTagsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder asset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetAssetTagsChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetTagsChange build() {
        Objects.requireNonNull(change, SetAssetTagsChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetTagsChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetTagsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetTagsChange.class + ": previousValue is missing");
        return new SetAssetTagsChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetTagsChange without checking for non null required values
     */
    public SetAssetTagsChange buildUnchecked() {
        return new SetAssetTagsChangeImpl(change, asset, nextValue, previousValue);
    }

    public static SetAssetTagsChangeBuilder of() {
        return new SetAssetTagsChangeBuilder();
    }

    public static SetAssetTagsChangeBuilder of(final SetAssetTagsChange template) {
        SetAssetTagsChangeBuilder builder = new SetAssetTagsChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
