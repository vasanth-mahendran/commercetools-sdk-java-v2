
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetBillingAddressAction myCartSetBillingAddressAction = MyCartSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetBillingAddressActionBuilder implements Builder<MyCartSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public MyCartSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyCartSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public MyCartSetBillingAddressAction build() {
        return new MyCartSetBillingAddressActionImpl(address);
    }

    /**
     * builds MyCartSetBillingAddressAction without checking for non null required values
     */
    public MyCartSetBillingAddressAction buildUnchecked() {
        return new MyCartSetBillingAddressActionImpl(address);
    }

    public static MyCartSetBillingAddressActionBuilder of() {
        return new MyCartSetBillingAddressActionBuilder();
    }

    public static MyCartSetBillingAddressActionBuilder of(final MyCartSetBillingAddressAction template) {
        MyCartSetBillingAddressActionBuilder builder = new MyCartSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
