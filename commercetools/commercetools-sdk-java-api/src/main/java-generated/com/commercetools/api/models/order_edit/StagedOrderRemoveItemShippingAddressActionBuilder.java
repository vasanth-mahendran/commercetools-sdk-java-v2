
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveItemShippingAddressAction stagedOrderRemoveItemShippingAddressAction = StagedOrderRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveItemShippingAddressActionBuilder
        implements Builder<StagedOrderRemoveItemShippingAddressAction> {

    private String addressKey;

    /**
     *
     */

    public StagedOrderRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public StagedOrderRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey,
            StagedOrderRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new StagedOrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds StagedOrderRemoveItemShippingAddressAction without checking for non null required values
     */
    public StagedOrderRemoveItemShippingAddressAction buildUnchecked() {
        return new StagedOrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder of() {
        return new StagedOrderRemoveItemShippingAddressActionBuilder();
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder of(
            final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionBuilder builder = new StagedOrderRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
