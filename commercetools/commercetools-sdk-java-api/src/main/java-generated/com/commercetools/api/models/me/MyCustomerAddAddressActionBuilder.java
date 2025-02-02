
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerAddAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddAddressAction myCustomerAddAddressAction = MyCustomerAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerAddAddressActionBuilder implements Builder<MyCustomerAddAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public MyCustomerAddAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyCustomerAddAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public MyCustomerAddAddressAction build() {
        Objects.requireNonNull(address, MyCustomerAddAddressAction.class + ": address is missing");
        return new MyCustomerAddAddressActionImpl(address);
    }

    /**
     * builds MyCustomerAddAddressAction without checking for non null required values
     */
    public MyCustomerAddAddressAction buildUnchecked() {
        return new MyCustomerAddAddressActionImpl(address);
    }

    public static MyCustomerAddAddressActionBuilder of() {
        return new MyCustomerAddAddressActionBuilder();
    }

    public static MyCustomerAddAddressActionBuilder of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionBuilder builder = new MyCustomerAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
