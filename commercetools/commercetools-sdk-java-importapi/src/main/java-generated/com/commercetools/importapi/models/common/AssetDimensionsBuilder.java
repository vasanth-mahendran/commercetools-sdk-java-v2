
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetDimensionsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetDimensions assetDimensions = AssetDimensions.builder()
 *             .w(0.3)
 *             .h(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetDimensionsBuilder implements Builder<AssetDimensions> {

    private Integer w;

    private Integer h;

    /**
     *  <p>The width of the asset source.</p>
     */

    public AssetDimensionsBuilder w(final Integer w) {
        this.w = w;
        return this;
    }

    /**
     *  <p>The height of the asset source.</p>
     */

    public AssetDimensionsBuilder h(final Integer h) {
        this.h = h;
        return this;
    }

    public Integer getW() {
        return this.w;
    }

    public Integer getH() {
        return this.h;
    }

    public AssetDimensions build() {
        Objects.requireNonNull(w, AssetDimensions.class + ": w is missing");
        Objects.requireNonNull(h, AssetDimensions.class + ": h is missing");
        return new AssetDimensionsImpl(w, h);
    }

    /**
     * builds AssetDimensions without checking for non null required values
     */
    public AssetDimensions buildUnchecked() {
        return new AssetDimensionsImpl(w, h);
    }

    public static AssetDimensionsBuilder of() {
        return new AssetDimensionsBuilder();
    }

    public static AssetDimensionsBuilder of(final AssetDimensions template) {
        AssetDimensionsBuilder builder = new AssetDimensionsBuilder();
        builder.w = template.getW();
        builder.h = template.getH();
        return builder;
    }

}
