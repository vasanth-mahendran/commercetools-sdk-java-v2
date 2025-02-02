
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderRemoveParcelFromDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveParcelFromDeliveryAction orderRemoveParcelFromDeliveryAction = OrderRemoveParcelFromDeliveryAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderRemoveParcelFromDeliveryActionBuilder implements Builder<OrderRemoveParcelFromDeliveryAction> {

    private String parcelId;

    /**
     *
     */

    public OrderRemoveParcelFromDeliveryActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public OrderRemoveParcelFromDeliveryAction build() {
        Objects.requireNonNull(parcelId, OrderRemoveParcelFromDeliveryAction.class + ": parcelId is missing");
        return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    /**
     * builds OrderRemoveParcelFromDeliveryAction without checking for non null required values
     */
    public OrderRemoveParcelFromDeliveryAction buildUnchecked() {
        return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder of() {
        return new OrderRemoveParcelFromDeliveryActionBuilder();
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder of(final OrderRemoveParcelFromDeliveryAction template) {
        OrderRemoveParcelFromDeliveryActionBuilder builder = new OrderRemoveParcelFromDeliveryActionBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
