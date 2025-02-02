
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateChangedMessagePayload orderStateChangedMessagePayload = OrderStateChangedMessagePayload.builder()
 *             .orderState(OrderState.OPEN)
 *             .oldOrderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderStateChangedMessagePayloadBuilder implements Builder<OrderStateChangedMessagePayload> {

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.order.OrderState oldOrderState;

    /**
     *
     */

    public OrderStateChangedMessagePayloadBuilder orderState(
            final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *
     */

    public OrderStateChangedMessagePayloadBuilder oldOrderState(
            final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.oldOrderState = oldOrderState;
        return this;
    }

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public com.commercetools.api.models.order.OrderState getOldOrderState() {
        return this.oldOrderState;
    }

    public OrderStateChangedMessagePayload build() {
        Objects.requireNonNull(orderState, OrderStateChangedMessagePayload.class + ": orderState is missing");
        Objects.requireNonNull(oldOrderState, OrderStateChangedMessagePayload.class + ": oldOrderState is missing");
        return new OrderStateChangedMessagePayloadImpl(orderState, oldOrderState);
    }

    /**
     * builds OrderStateChangedMessagePayload without checking for non null required values
     */
    public OrderStateChangedMessagePayload buildUnchecked() {
        return new OrderStateChangedMessagePayloadImpl(orderState, oldOrderState);
    }

    public static OrderStateChangedMessagePayloadBuilder of() {
        return new OrderStateChangedMessagePayloadBuilder();
    }

    public static OrderStateChangedMessagePayloadBuilder of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadBuilder builder = new OrderStateChangedMessagePayloadBuilder();
        builder.orderState = template.getOrderState();
        builder.oldOrderState = template.getOldOrderState();
        return builder;
    }

}
