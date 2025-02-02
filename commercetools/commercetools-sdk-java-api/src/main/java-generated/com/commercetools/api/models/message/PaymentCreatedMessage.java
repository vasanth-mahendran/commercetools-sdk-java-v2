
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.Payment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentCreatedMessage paymentCreatedMessage = PaymentCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentCreatedMessageImpl.class)
public interface PaymentCreatedMessage extends Message {

    String PAYMENT_CREATED = "PaymentCreated";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public Payment getPayment();

    public void setPayment(final Payment payment);

    public static PaymentCreatedMessage of() {
        return new PaymentCreatedMessageImpl();
    }

    public static PaymentCreatedMessage of(final PaymentCreatedMessage template) {
        PaymentCreatedMessageImpl instance = new PaymentCreatedMessageImpl();
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
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static PaymentCreatedMessageBuilder builder() {
        return PaymentCreatedMessageBuilder.of();
    }

    public static PaymentCreatedMessageBuilder builder(final PaymentCreatedMessage template) {
        return PaymentCreatedMessageBuilder.of(template);
    }

    default <T> T withPaymentCreatedMessage(Function<PaymentCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentCreatedMessage>";
            }
        };
    }
}
