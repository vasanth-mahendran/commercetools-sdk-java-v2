
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryRemovedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryRemovedMessagePayload deliveryRemovedMessagePayload = DeliveryRemovedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryRemovedMessagePayloadImpl.class)
public interface DeliveryRemovedMessagePayload extends OrderMessagePayload {

    String DELIVERY_REMOVED = "DeliveryRemoved";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    public void setDelivery(final Delivery delivery);

    public static DeliveryRemovedMessagePayload of() {
        return new DeliveryRemovedMessagePayloadImpl();
    }

    public static DeliveryRemovedMessagePayload of(final DeliveryRemovedMessagePayload template) {
        DeliveryRemovedMessagePayloadImpl instance = new DeliveryRemovedMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        return instance;
    }

    public static DeliveryRemovedMessagePayloadBuilder builder() {
        return DeliveryRemovedMessagePayloadBuilder.of();
    }

    public static DeliveryRemovedMessagePayloadBuilder builder(final DeliveryRemovedMessagePayload template) {
        return DeliveryRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withDeliveryRemovedMessagePayload(Function<DeliveryRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryRemovedMessagePayload>";
            }
        };
    }
}
