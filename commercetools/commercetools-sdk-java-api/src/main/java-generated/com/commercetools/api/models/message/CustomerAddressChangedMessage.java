
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressChangedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressChangedMessage customerAddressChangedMessage = CustomerAddressChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressChangedMessageImpl.class)
public interface CustomerAddressChangedMessage extends Message {

    String CUSTOMER_ADDRESS_CHANGED = "CustomerAddressChanged";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddressChangedMessage of() {
        return new CustomerAddressChangedMessageImpl();
    }

    public static CustomerAddressChangedMessage of(final CustomerAddressChangedMessage template) {
        CustomerAddressChangedMessageImpl instance = new CustomerAddressChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerAddressChangedMessageBuilder builder() {
        return CustomerAddressChangedMessageBuilder.of();
    }

    public static CustomerAddressChangedMessageBuilder builder(final CustomerAddressChangedMessage template) {
        return CustomerAddressChangedMessageBuilder.of(template);
    }

    default <T> T withCustomerAddressChangedMessage(Function<CustomerAddressChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressChangedMessage>";
            }
        };
    }
}
