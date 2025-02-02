
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddedMessagePayload deliveryAddedMessagePayload = DeliveryAddedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryAddedMessagePayloadBuilder implements Builder<DeliveryAddedMessagePayload> {

    private com.commercetools.api.models.order.Delivery delivery;

    /**
     *
     */

    public DeliveryAddedMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public DeliveryAddedMessagePayloadBuilder delivery(final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    public DeliveryAddedMessagePayload build() {
        Objects.requireNonNull(delivery, DeliveryAddedMessagePayload.class + ": delivery is missing");
        return new DeliveryAddedMessagePayloadImpl(delivery);
    }

    /**
     * builds DeliveryAddedMessagePayload without checking for non null required values
     */
    public DeliveryAddedMessagePayload buildUnchecked() {
        return new DeliveryAddedMessagePayloadImpl(delivery);
    }

    public static DeliveryAddedMessagePayloadBuilder of() {
        return new DeliveryAddedMessagePayloadBuilder();
    }

    public static DeliveryAddedMessagePayloadBuilder of(final DeliveryAddedMessagePayload template) {
        DeliveryAddedMessagePayloadBuilder builder = new DeliveryAddedMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        return builder;
    }

}
