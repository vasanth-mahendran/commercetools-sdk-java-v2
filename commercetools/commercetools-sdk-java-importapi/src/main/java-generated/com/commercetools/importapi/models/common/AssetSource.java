
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>An AssetSource is a representation of an Asset in a specific format, for example, a video in a certain encoding or an image in a certain resolution.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetSource assetSource = AssetSource.builder()
 *             .uri("{uri}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssetSourceImpl.class)
public interface AssetSource {

    /**
     *
     */
    @NotNull
    @JsonProperty("uri")
    public String getUri();

    /**
     *
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The width and height of the Asset Source.</p>
     */
    @Valid
    @JsonProperty("dimensions")
    public AssetDimensions getDimensions();

    /**
     *
     */

    @JsonProperty("contentType")
    public String getContentType();

    public void setUri(final String uri);

    public void setKey(final String key);

    public void setDimensions(final AssetDimensions dimensions);

    public void setContentType(final String contentType);

    public static AssetSource of() {
        return new AssetSourceImpl();
    }

    public static AssetSource of(final AssetSource template) {
        AssetSourceImpl instance = new AssetSourceImpl();
        instance.setUri(template.getUri());
        instance.setKey(template.getKey());
        instance.setDimensions(template.getDimensions());
        instance.setContentType(template.getContentType());
        return instance;
    }

    public static AssetSourceBuilder builder() {
        return AssetSourceBuilder.of();
    }

    public static AssetSourceBuilder builder(final AssetSource template) {
        return AssetSourceBuilder.of(template);
    }

    default <T> T withAssetSource(Function<AssetSource, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssetSource> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetSource>() {
            @Override
            public String toString() {
                return "TypeReference<AssetSource>";
            }
        };
    }
}
