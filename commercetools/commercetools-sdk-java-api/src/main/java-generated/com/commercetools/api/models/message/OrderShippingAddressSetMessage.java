
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderShippingAddressSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingAddressSetMessage orderShippingAddressSetMessage = OrderShippingAddressSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShippingAddressSetMessageImpl.class)
public interface OrderShippingAddressSetMessage extends OrderMessage {

    String ORDER_SHIPPING_ADDRESS_SET = "OrderShippingAddressSet";

    /**
     *
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static OrderShippingAddressSetMessage of() {
        return new OrderShippingAddressSetMessageImpl();
    }

    public static OrderShippingAddressSetMessage of(final OrderShippingAddressSetMessage template) {
        OrderShippingAddressSetMessageImpl instance = new OrderShippingAddressSetMessageImpl();
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
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static OrderShippingAddressSetMessageBuilder builder() {
        return OrderShippingAddressSetMessageBuilder.of();
    }

    public static OrderShippingAddressSetMessageBuilder builder(final OrderShippingAddressSetMessage template) {
        return OrderShippingAddressSetMessageBuilder.of(template);
    }

    default <T> T withOrderShippingAddressSetMessage(Function<OrderShippingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingAddressSetMessage>";
            }
        };
    }
}
