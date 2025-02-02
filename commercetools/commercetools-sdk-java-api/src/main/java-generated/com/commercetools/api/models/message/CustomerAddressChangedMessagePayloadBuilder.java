
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressChangedMessagePayload customerAddressChangedMessagePayload = CustomerAddressChangedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressChangedMessagePayloadBuilder implements Builder<CustomerAddressChangedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *
     */

    public CustomerAddressChangedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public CustomerAddressChangedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CustomerAddressChangedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressChangedMessagePayload.class + ": address is missing");
        return new CustomerAddressChangedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerAddressChangedMessagePayload without checking for non null required values
     */
    public CustomerAddressChangedMessagePayload buildUnchecked() {
        return new CustomerAddressChangedMessagePayloadImpl(address);
    }

    public static CustomerAddressChangedMessagePayloadBuilder of() {
        return new CustomerAddressChangedMessagePayloadBuilder();
    }

    public static CustomerAddressChangedMessagePayloadBuilder of(final CustomerAddressChangedMessagePayload template) {
        CustomerAddressChangedMessagePayloadBuilder builder = new CustomerAddressChangedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
