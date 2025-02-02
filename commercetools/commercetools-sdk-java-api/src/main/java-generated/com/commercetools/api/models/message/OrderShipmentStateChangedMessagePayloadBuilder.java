
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderShipmentStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShipmentStateChangedMessagePayload orderShipmentStateChangedMessagePayload = OrderShipmentStateChangedMessagePayload.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShipmentStateChangedMessagePayloadBuilder
        implements Builder<OrderShipmentStateChangedMessagePayload> {

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState oldShipmentState;

    /**
     *
     */

    public OrderShipmentStateChangedMessagePayloadBuilder shipmentState(
            final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *
     */

    public OrderShipmentStateChangedMessagePayloadBuilder oldShipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.oldShipmentState = oldShipmentState;
        return this;
    }

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getOldShipmentState() {
        return this.oldShipmentState;
    }

    public OrderShipmentStateChangedMessagePayload build() {
        Objects.requireNonNull(shipmentState,
            OrderShipmentStateChangedMessagePayload.class + ": shipmentState is missing");
        return new OrderShipmentStateChangedMessagePayloadImpl(shipmentState, oldShipmentState);
    }

    /**
     * builds OrderShipmentStateChangedMessagePayload without checking for non null required values
     */
    public OrderShipmentStateChangedMessagePayload buildUnchecked() {
        return new OrderShipmentStateChangedMessagePayloadImpl(shipmentState, oldShipmentState);
    }

    public static OrderShipmentStateChangedMessagePayloadBuilder of() {
        return new OrderShipmentStateChangedMessagePayloadBuilder();
    }

    public static OrderShipmentStateChangedMessagePayloadBuilder of(
            final OrderShipmentStateChangedMessagePayload template) {
        OrderShipmentStateChangedMessagePayloadBuilder builder = new OrderShipmentStateChangedMessagePayloadBuilder();
        builder.shipmentState = template.getShipmentState();
        builder.oldShipmentState = template.getOldShipmentState();
        return builder;
    }

}
