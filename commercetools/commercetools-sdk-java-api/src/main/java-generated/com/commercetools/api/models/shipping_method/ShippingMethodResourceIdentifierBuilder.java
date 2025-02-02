
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodResourceIdentifier shippingMethodResourceIdentifier = ShippingMethodResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodResourceIdentifierBuilder implements Builder<ShippingMethodResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced ShippingMethod. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public ShippingMethodResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced ShippingMethod. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public ShippingMethodResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ShippingMethodResourceIdentifier build() {
        return new ShippingMethodResourceIdentifierImpl(id, key);
    }

    /**
     * builds ShippingMethodResourceIdentifier without checking for non null required values
     */
    public ShippingMethodResourceIdentifier buildUnchecked() {
        return new ShippingMethodResourceIdentifierImpl(id, key);
    }

    public static ShippingMethodResourceIdentifierBuilder of() {
        return new ShippingMethodResourceIdentifierBuilder();
    }

    public static ShippingMethodResourceIdentifierBuilder of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierBuilder builder = new ShippingMethodResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
