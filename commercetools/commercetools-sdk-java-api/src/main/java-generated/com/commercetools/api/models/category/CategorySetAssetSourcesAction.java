
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetSourcesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetSourcesAction categorySetAssetSourcesAction = CategorySetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetSourcesActionImpl.class)
public interface CategorySetAssetSourcesAction extends CategoryUpdateAction {

    String SET_ASSET_SOURCES = "setAssetSources";

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    public void setSources(final List<AssetSource> sources);

    public static CategorySetAssetSourcesAction of() {
        return new CategorySetAssetSourcesActionImpl();
    }

    public static CategorySetAssetSourcesAction of(final CategorySetAssetSourcesAction template) {
        CategorySetAssetSourcesActionImpl instance = new CategorySetAssetSourcesActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    public static CategorySetAssetSourcesActionBuilder builder() {
        return CategorySetAssetSourcesActionBuilder.of();
    }

    public static CategorySetAssetSourcesActionBuilder builder(final CategorySetAssetSourcesAction template) {
        return CategorySetAssetSourcesActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetSourcesAction(Function<CategorySetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetSourcesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetSourcesAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetSourcesAction>";
            }
        };
    }
}
