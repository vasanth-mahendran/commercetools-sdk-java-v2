
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressAction cartSetBillingAddressAction = CartSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetBillingAddressActionBuilder implements Builder<CartSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *
     */

    public CartSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public CartSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public CartSetBillingAddressAction build() {
        return new CartSetBillingAddressActionImpl(address);
    }

    /**
     * builds CartSetBillingAddressAction without checking for non null required values
     */
    public CartSetBillingAddressAction buildUnchecked() {
        return new CartSetBillingAddressActionImpl(address);
    }

    public static CartSetBillingAddressActionBuilder of() {
        return new CartSetBillingAddressActionBuilder();
    }

    public static CartSetBillingAddressActionBuilder of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionBuilder builder = new CartSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
