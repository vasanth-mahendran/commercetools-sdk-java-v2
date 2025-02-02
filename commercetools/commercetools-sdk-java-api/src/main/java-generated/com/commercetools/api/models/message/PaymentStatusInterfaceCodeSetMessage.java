
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusInterfaceCodeSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusInterfaceCodeSetMessage paymentStatusInterfaceCodeSetMessage = PaymentStatusInterfaceCodeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .paymentId("{paymentId}")
 *             .interfaceCode("{interfaceCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusInterfaceCodeSetMessageImpl.class)
public interface PaymentStatusInterfaceCodeSetMessage extends Message {

    String PAYMENT_STATUS_INTERFACE_CODE_SET = "PaymentStatusInterfaceCodeSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("paymentId")
    public String getPaymentId();

    /**
     *
     */
    @NotNull
    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    public void setPaymentId(final String paymentId);

    public void setInterfaceCode(final String interfaceCode);

    public static PaymentStatusInterfaceCodeSetMessage of() {
        return new PaymentStatusInterfaceCodeSetMessageImpl();
    }

    public static PaymentStatusInterfaceCodeSetMessage of(final PaymentStatusInterfaceCodeSetMessage template) {
        PaymentStatusInterfaceCodeSetMessageImpl instance = new PaymentStatusInterfaceCodeSetMessageImpl();
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
        instance.setPaymentId(template.getPaymentId());
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    public static PaymentStatusInterfaceCodeSetMessageBuilder builder() {
        return PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }

    public static PaymentStatusInterfaceCodeSetMessageBuilder builder(
            final PaymentStatusInterfaceCodeSetMessage template) {
        return PaymentStatusInterfaceCodeSetMessageBuilder.of(template);
    }

    default <T> T withPaymentStatusInterfaceCodeSetMessage(Function<PaymentStatusInterfaceCodeSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusInterfaceCodeSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusInterfaceCodeSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusInterfaceCodeSetMessage>";
            }
        };
    }
}
