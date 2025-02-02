
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddItemShippingAddressAction orderAddItemShippingAddressAction = OrderAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddItemShippingAddressActionBuilder implements Builder<OrderAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public OrderAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public OrderAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, OrderAddItemShippingAddressAction.class + ": address is missing");
        return new OrderAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds OrderAddItemShippingAddressAction without checking for non null required values
     */
    public OrderAddItemShippingAddressAction buildUnchecked() {
        return new OrderAddItemShippingAddressActionImpl(address);
    }

    public static OrderAddItemShippingAddressActionBuilder of() {
        return new OrderAddItemShippingAddressActionBuilder();
    }

    public static OrderAddItemShippingAddressActionBuilder of(final OrderAddItemShippingAddressAction template) {
        OrderAddItemShippingAddressActionBuilder builder = new OrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
