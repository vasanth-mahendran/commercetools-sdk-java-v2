
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedMessage orderCreatedMessage = OrderCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCreatedMessageImpl.class)
public interface OrderCreatedMessage extends OrderMessage {

    String ORDER_CREATED = "OrderCreated";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderCreatedMessage of() {
        return new OrderCreatedMessageImpl();
    }

    public static OrderCreatedMessage of(final OrderCreatedMessage template) {
        OrderCreatedMessageImpl instance = new OrderCreatedMessageImpl();
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
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderCreatedMessageBuilder builder() {
        return OrderCreatedMessageBuilder.of();
    }

    public static OrderCreatedMessageBuilder builder(final OrderCreatedMessage template) {
        return OrderCreatedMessageBuilder.of(template);
    }

    default <T> T withOrderCreatedMessage(Function<OrderCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreatedMessage>";
            }
        };
    }
}
