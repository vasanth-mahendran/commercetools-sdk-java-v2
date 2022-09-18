package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.PaymentKeyReference;
import io.vrap.rmf.base.client.Builder;

import java.util.Objects;

public class PaymentInfoBuilder implements Builder<PaymentInfo> {
    private java.util.List<PaymentKeyReference> payments;

    public static PaymentInfoBuilder of() {
        return new PaymentInfoBuilder();
    }

    public static PaymentInfoBuilder of(PaymentInfo template) {
        PaymentInfoBuilder builder = new PaymentInfoBuilder();
        builder.payments = template.getPayments();
        return builder;
    }

    @Override public PaymentInfo build() {
        Objects.requireNonNull(payments, PaymentInfo.class + ": payments is missing");
        return new PaymentInfoImpl(payments);
    }
}
