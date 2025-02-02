
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemAddedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemAddedMessage orderLineItemAddedMessage = OrderLineItemAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .addedQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemAddedMessageImpl.class)
public interface OrderLineItemAddedMessage extends OrderMessage {

    String ORDER_LINE_ITEM_ADDED = "OrderLineItemAdded";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LineItem getLineItem();

    /**
     *
     */
    @NotNull
    @JsonProperty("addedQuantity")
    public Long getAddedQuantity();

    public void setLineItem(final LineItem lineItem);

    public void setAddedQuantity(final Long addedQuantity);

    public static OrderLineItemAddedMessage of() {
        return new OrderLineItemAddedMessageImpl();
    }

    public static OrderLineItemAddedMessage of(final OrderLineItemAddedMessage template) {
        OrderLineItemAddedMessageImpl instance = new OrderLineItemAddedMessageImpl();
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
        instance.setLineItem(template.getLineItem());
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    public static OrderLineItemAddedMessageBuilder builder() {
        return OrderLineItemAddedMessageBuilder.of();
    }

    public static OrderLineItemAddedMessageBuilder builder(final OrderLineItemAddedMessage template) {
        return OrderLineItemAddedMessageBuilder.of(template);
    }

    default <T> T withOrderLineItemAddedMessage(Function<OrderLineItemAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemAddedMessage>";
            }
        };
    }
}
