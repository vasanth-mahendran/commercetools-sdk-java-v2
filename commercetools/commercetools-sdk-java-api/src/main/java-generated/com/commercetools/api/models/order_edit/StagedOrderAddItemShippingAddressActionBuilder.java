
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddItemShippingAddressAction stagedOrderAddItemShippingAddressAction = StagedOrderAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddItemShippingAddressActionBuilder
        implements Builder<StagedOrderAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public StagedOrderAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StagedOrderAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public StagedOrderAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, StagedOrderAddItemShippingAddressAction.class + ": address is missing");
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderAddItemShippingAddressAction without checking for non null required values
     */
    public StagedOrderAddItemShippingAddressAction buildUnchecked() {
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    public static StagedOrderAddItemShippingAddressActionBuilder of() {
        return new StagedOrderAddItemShippingAddressActionBuilder();
    }

    public static StagedOrderAddItemShippingAddressActionBuilder of(
            final StagedOrderAddItemShippingAddressAction template) {
        StagedOrderAddItemShippingAddressActionBuilder builder = new StagedOrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
