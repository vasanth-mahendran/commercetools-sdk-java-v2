
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPaymentAddedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentAddedMessagePayload orderPaymentAddedMessagePayload = OrderPaymentAddedMessagePayload.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPaymentAddedMessagePayloadImpl.class)
public interface OrderPaymentAddedMessagePayload extends MessagePayload {

    String ORDER_PAYMENT_ADDED = "OrderPaymentAdded";

    /**
     *  <p>Reference to a Payment.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    public void setPayment(final PaymentReference payment);

    public static OrderPaymentAddedMessagePayload of() {
        return new OrderPaymentAddedMessagePayloadImpl();
    }

    public static OrderPaymentAddedMessagePayload of(final OrderPaymentAddedMessagePayload template) {
        OrderPaymentAddedMessagePayloadImpl instance = new OrderPaymentAddedMessagePayloadImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static OrderPaymentAddedMessagePayloadBuilder builder() {
        return OrderPaymentAddedMessagePayloadBuilder.of();
    }

    public static OrderPaymentAddedMessagePayloadBuilder builder(final OrderPaymentAddedMessagePayload template) {
        return OrderPaymentAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderPaymentAddedMessagePayload(Function<OrderPaymentAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentAddedMessagePayload>";
            }
        };
    }
}
