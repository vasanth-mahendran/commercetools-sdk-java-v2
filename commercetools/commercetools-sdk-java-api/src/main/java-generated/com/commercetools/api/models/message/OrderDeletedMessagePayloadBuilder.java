
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDeletedMessagePayload orderDeletedMessagePayload = OrderDeletedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderDeletedMessagePayloadBuilder implements Builder<OrderDeletedMessagePayload> {

    private com.commercetools.api.models.order.Order order;

    /**
     *
     */

    public OrderDeletedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderDeletedMessagePayloadBuilder order(final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    public OrderDeletedMessagePayload build() {
        Objects.requireNonNull(order, OrderDeletedMessagePayload.class + ": order is missing");
        return new OrderDeletedMessagePayloadImpl(order);
    }

    /**
     * builds OrderDeletedMessagePayload without checking for non null required values
     */
    public OrderDeletedMessagePayload buildUnchecked() {
        return new OrderDeletedMessagePayloadImpl(order);
    }

    public static OrderDeletedMessagePayloadBuilder of() {
        return new OrderDeletedMessagePayloadBuilder();
    }

    public static OrderDeletedMessagePayloadBuilder of(final OrderDeletedMessagePayload template) {
        OrderDeletedMessagePayloadBuilder builder = new OrderDeletedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
