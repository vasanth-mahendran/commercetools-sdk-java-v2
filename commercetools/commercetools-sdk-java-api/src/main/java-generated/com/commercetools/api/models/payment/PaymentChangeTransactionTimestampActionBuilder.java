
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentChangeTransactionTimestampActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeTransactionTimestampAction paymentChangeTransactionTimestampAction = PaymentChangeTransactionTimestampAction.builder()
 *             .transactionId("{transactionId}")
 *             .timestamp(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentChangeTransactionTimestampActionBuilder
        implements Builder<PaymentChangeTransactionTimestampAction> {

    private String transactionId;

    private java.time.ZonedDateTime timestamp;

    /**
     *
     */

    public PaymentChangeTransactionTimestampActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *
     */

    public PaymentChangeTransactionTimestampActionBuilder timestamp(final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public PaymentChangeTransactionTimestampAction build() {
        Objects.requireNonNull(transactionId,
            PaymentChangeTransactionTimestampAction.class + ": transactionId is missing");
        Objects.requireNonNull(timestamp, PaymentChangeTransactionTimestampAction.class + ": timestamp is missing");
        return new PaymentChangeTransactionTimestampActionImpl(transactionId, timestamp);
    }

    /**
     * builds PaymentChangeTransactionTimestampAction without checking for non null required values
     */
    public PaymentChangeTransactionTimestampAction buildUnchecked() {
        return new PaymentChangeTransactionTimestampActionImpl(transactionId, timestamp);
    }

    public static PaymentChangeTransactionTimestampActionBuilder of() {
        return new PaymentChangeTransactionTimestampActionBuilder();
    }

    public static PaymentChangeTransactionTimestampActionBuilder of(
            final PaymentChangeTransactionTimestampAction template) {
        PaymentChangeTransactionTimestampActionBuilder builder = new PaymentChangeTransactionTimestampActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.timestamp = template.getTimestamp();
        return builder;
    }

}
