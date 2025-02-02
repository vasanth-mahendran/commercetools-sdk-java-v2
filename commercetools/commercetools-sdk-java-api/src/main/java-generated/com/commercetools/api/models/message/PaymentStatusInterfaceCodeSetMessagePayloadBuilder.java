
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusInterfaceCodeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusInterfaceCodeSetMessagePayload paymentStatusInterfaceCodeSetMessagePayload = PaymentStatusInterfaceCodeSetMessagePayload.builder()
 *             .paymentId("{paymentId}")
 *             .interfaceCode("{interfaceCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusInterfaceCodeSetMessagePayloadBuilder
        implements Builder<PaymentStatusInterfaceCodeSetMessagePayload> {

    private String paymentId;

    private String interfaceCode;

    /**
     *
     */

    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentId(final String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     *
     */

    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder interfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public PaymentStatusInterfaceCodeSetMessagePayload build() {
        Objects.requireNonNull(paymentId, PaymentStatusInterfaceCodeSetMessagePayload.class + ": paymentId is missing");
        Objects.requireNonNull(interfaceCode,
            PaymentStatusInterfaceCodeSetMessagePayload.class + ": interfaceCode is missing");
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(paymentId, interfaceCode);
    }

    /**
     * builds PaymentStatusInterfaceCodeSetMessagePayload without checking for non null required values
     */
    public PaymentStatusInterfaceCodeSetMessagePayload buildUnchecked() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(paymentId, interfaceCode);
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder = new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
        builder.paymentId = template.getPaymentId();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
