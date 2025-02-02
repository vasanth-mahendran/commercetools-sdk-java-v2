
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAssetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetCustomFieldAction productSetAssetCustomFieldAction = ProductSetAssetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetCustomFieldActionImpl.class)
public interface ProductSetAssetCustomFieldAction extends ProductUpdateAction {

    String SET_ASSET_CUSTOM_FIELD = "setAssetCustomField";

    /**
     *
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static ProductSetAssetCustomFieldAction of() {
        return new ProductSetAssetCustomFieldActionImpl();
    }

    public static ProductSetAssetCustomFieldAction of(final ProductSetAssetCustomFieldAction template) {
        ProductSetAssetCustomFieldActionImpl instance = new ProductSetAssetCustomFieldActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ProductSetAssetCustomFieldActionBuilder builder() {
        return ProductSetAssetCustomFieldActionBuilder.of();
    }

    public static ProductSetAssetCustomFieldActionBuilder builder(final ProductSetAssetCustomFieldAction template) {
        return ProductSetAssetCustomFieldActionBuilder.of(template);
    }

    default <T> T withProductSetAssetCustomFieldAction(Function<ProductSetAssetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetCustomFieldAction>";
            }
        };
    }
}
