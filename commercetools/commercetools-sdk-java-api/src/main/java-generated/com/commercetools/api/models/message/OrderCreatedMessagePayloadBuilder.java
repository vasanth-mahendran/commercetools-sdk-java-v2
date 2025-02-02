
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedMessagePayload orderCreatedMessagePayload = OrderCreatedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCreatedMessagePayloadBuilder implements Builder<OrderCreatedMessagePayload> {

    private com.commercetools.api.models.order.Order order;

    /**
     *
     */

    public OrderCreatedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderCreatedMessagePayloadBuilder order(final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    public OrderCreatedMessagePayload build() {
        Objects.requireNonNull(order, OrderCreatedMessagePayload.class + ": order is missing");
        return new OrderCreatedMessagePayloadImpl(order);
    }

    /**
     * builds OrderCreatedMessagePayload without checking for non null required values
     */
    public OrderCreatedMessagePayload buildUnchecked() {
        return new OrderCreatedMessagePayloadImpl(order);
    }

    public static OrderCreatedMessagePayloadBuilder of() {
        return new OrderCreatedMessagePayloadBuilder();
    }

    public static OrderCreatedMessagePayloadBuilder of(final OrderCreatedMessagePayload template) {
        OrderCreatedMessagePayloadBuilder builder = new OrderCreatedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
