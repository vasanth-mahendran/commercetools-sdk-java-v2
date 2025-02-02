
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddShippingAddressIdAction customerAddShippingAddressIdAction = CustomerAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddShippingAddressIdActionBuilder implements Builder<CustomerAddShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *
     */

    public CustomerAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *
     */

    public CustomerAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerAddShippingAddressIdAction build() {
        return new CustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerAddShippingAddressIdAction without checking for non null required values
     */
    public CustomerAddShippingAddressIdAction buildUnchecked() {
        return new CustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerAddShippingAddressIdActionBuilder of() {
        return new CustomerAddShippingAddressIdActionBuilder();
    }

    public static CustomerAddShippingAddressIdActionBuilder of(final CustomerAddShippingAddressIdAction template) {
        CustomerAddShippingAddressIdActionBuilder builder = new CustomerAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
