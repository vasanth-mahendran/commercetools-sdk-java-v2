
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartUpdateItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartUpdateItemShippingAddressAction myCartUpdateItemShippingAddressAction = MyCartUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartUpdateItemShippingAddressActionBuilder implements Builder<MyCartUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public MyCartUpdateItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyCartUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public MyCartUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, MyCartUpdateItemShippingAddressAction.class + ": address is missing");
        return new MyCartUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * builds MyCartUpdateItemShippingAddressAction without checking for non null required values
     */
    public MyCartUpdateItemShippingAddressAction buildUnchecked() {
        return new MyCartUpdateItemShippingAddressActionImpl(address);
    }

    public static MyCartUpdateItemShippingAddressActionBuilder of() {
        return new MyCartUpdateItemShippingAddressActionBuilder();
    }

    public static MyCartUpdateItemShippingAddressActionBuilder of(
            final MyCartUpdateItemShippingAddressAction template) {
        MyCartUpdateItemShippingAddressActionBuilder builder = new MyCartUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
