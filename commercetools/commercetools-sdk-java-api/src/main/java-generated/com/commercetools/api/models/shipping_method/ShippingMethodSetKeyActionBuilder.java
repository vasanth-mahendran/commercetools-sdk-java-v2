
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetKeyAction shippingMethodSetKeyAction = ShippingMethodSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetKeyActionBuilder implements Builder<ShippingMethodSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     */

    public ShippingMethodSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ShippingMethodSetKeyAction build() {
        return new ShippingMethodSetKeyActionImpl(key);
    }

    /**
     * builds ShippingMethodSetKeyAction without checking for non null required values
     */
    public ShippingMethodSetKeyAction buildUnchecked() {
        return new ShippingMethodSetKeyActionImpl(key);
    }

    public static ShippingMethodSetKeyActionBuilder of() {
        return new ShippingMethodSetKeyActionBuilder();
    }

    public static ShippingMethodSetKeyActionBuilder of(final ShippingMethodSetKeyAction template) {
        ShippingMethodSetKeyActionBuilder builder = new ShippingMethodSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
