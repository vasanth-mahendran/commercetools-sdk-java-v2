package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.PaymentKeyReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.function.Function;

public interface PaymentInfo {
    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("payments")
    public List<PaymentKeyReference> getPayments();

    @JsonIgnore
    public void setPayments(final PaymentKeyReference... payments);

    public void setPayments(final List<PaymentKeyReference> payments);

    public static PaymentInfo of() {
        return new PaymentInfoImpl();
    }

    public static PaymentInfo of(final PaymentInfo template) {
        PaymentInfoImpl instance = new PaymentInfoImpl();
        instance.setPayments(template.getPayments());
        return instance;
    }

    public static PaymentInfoBuilder builder() {
        return PaymentInfoBuilder.of();
    }

    public static PaymentInfoBuilder builder(final PaymentInfo template) {
        return PaymentInfoBuilder.of(template);
    }

    default <T> T withPaymentInfo(Function<PaymentInfo, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInfo>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInfo>";
            }
        };
    }
}
