package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.PaymentKeyReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PaymentInfoImpl implements PaymentInfo {
    List<PaymentKeyReference> payments;

    PaymentInfoImpl(List<PaymentKeyReference> payments) {
        this.payments = payments;
    }

    PaymentInfoImpl() {

    }

    @Override public List<PaymentKeyReference> getPayments() {
        return payments;
    }

    @Override public void setPayments(PaymentKeyReference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
    }

    @Override public void setPayments(List<PaymentKeyReference> payments) {
        this.payments = payments;
    }

    @Override public <T> T withPaymentInfo(Function<PaymentInfo, T> helper) {
        return helper.apply(this);
    }
}
