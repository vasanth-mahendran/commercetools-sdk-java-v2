
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAssetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAssetChange removeAssetChange = RemoveAssetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAssetChangeBuilder implements Builder<RemoveAssetChange> {

    private String change;

    private com.commercetools.history.models.common.Asset previousValue;

    /**
     *  <p>Update action for <code>removeAsset</code></p>
     */

    public RemoveAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public RemoveAssetChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public RemoveAssetChangeBuilder previousValue(final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Asset getPreviousValue() {
        return this.previousValue;
    }

    public RemoveAssetChange build() {
        Objects.requireNonNull(change, RemoveAssetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAssetChange.class + ": previousValue is missing");
        return new RemoveAssetChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAssetChange without checking for non null required values
     */
    public RemoveAssetChange buildUnchecked() {
        return new RemoveAssetChangeImpl(change, previousValue);
    }

    public static RemoveAssetChangeBuilder of() {
        return new RemoveAssetChangeBuilder();
    }

    public static RemoveAssetChangeBuilder of(final RemoveAssetChange template) {
        RemoveAssetChangeBuilder builder = new RemoveAssetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
