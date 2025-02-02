
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetDefaultBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetDefaultBillingAddressAction myCustomerSetDefaultBillingAddressAction = MyCustomerSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetDefaultBillingAddressActionBuilder
        implements Builder<MyCustomerSetDefaultBillingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *
     */

    public MyCustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *
     */

    public MyCustomerSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    public MyCustomerSetDefaultBillingAddressAction build() {
        return new MyCustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerSetDefaultBillingAddressAction without checking for non null required values
     */
    public MyCustomerSetDefaultBillingAddressAction buildUnchecked() {
        return new MyCustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder of() {
        return new MyCustomerSetDefaultBillingAddressActionBuilder();
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder of(
            final MyCustomerSetDefaultBillingAddressAction template) {
        MyCustomerSetDefaultBillingAddressActionBuilder builder = new MyCustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
