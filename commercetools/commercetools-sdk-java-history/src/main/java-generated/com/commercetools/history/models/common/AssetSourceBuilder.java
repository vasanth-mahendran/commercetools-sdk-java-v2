
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetSourceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetSource assetSource = AssetSource.builder()
 *             .uri("{uri}")
 *             .key("{key}")
 *             .dimensions(dimensionsBuilder -> dimensionsBuilder)
 *             .contentType("{contentType}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetSourceBuilder implements Builder<AssetSource> {

    private String uri;

    private String key;

    private com.commercetools.history.models.common.AssetDimensions dimensions;

    private String contentType;

    /**
     *
     */

    public AssetSourceBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    /**
     *
     */

    public AssetSourceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public AssetSourceBuilder dimensions(
            Function<com.commercetools.history.models.common.AssetDimensionsBuilder, com.commercetools.history.models.common.AssetDimensionsBuilder> builder) {
        this.dimensions = builder.apply(com.commercetools.history.models.common.AssetDimensionsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public AssetSourceBuilder dimensions(final com.commercetools.history.models.common.AssetDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     *
     */

    public AssetSourceBuilder contentType(final String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    public String getContentType() {
        return this.contentType;
    }

    public AssetSource build() {
        Objects.requireNonNull(uri, AssetSource.class + ": uri is missing");
        Objects.requireNonNull(key, AssetSource.class + ": key is missing");
        Objects.requireNonNull(dimensions, AssetSource.class + ": dimensions is missing");
        Objects.requireNonNull(contentType, AssetSource.class + ": contentType is missing");
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    /**
     * builds AssetSource without checking for non null required values
     */
    public AssetSource buildUnchecked() {
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    public static AssetSourceBuilder of() {
        return new AssetSourceBuilder();
    }

    public static AssetSourceBuilder of(final AssetSource template) {
        AssetSourceBuilder builder = new AssetSourceBuilder();
        builder.uri = template.getUri();
        builder.key = template.getKey();
        builder.dimensions = template.getDimensions();
        builder.contentType = template.getContentType();
        return builder;
    }

}
