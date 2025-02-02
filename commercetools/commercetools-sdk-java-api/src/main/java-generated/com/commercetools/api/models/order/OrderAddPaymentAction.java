
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddPaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddPaymentAction orderAddPaymentAction = OrderAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderAddPaymentActionImpl.class)
public interface OrderAddPaymentAction extends OrderUpdateAction {

    String ADD_PAYMENT = "addPayment";

    /**
     *  <p>ResourceIdentifier to a Payment.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static OrderAddPaymentAction of() {
        return new OrderAddPaymentActionImpl();
    }

    public static OrderAddPaymentAction of(final OrderAddPaymentAction template) {
        OrderAddPaymentActionImpl instance = new OrderAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static OrderAddPaymentActionBuilder builder() {
        return OrderAddPaymentActionBuilder.of();
    }

    public static OrderAddPaymentActionBuilder builder(final OrderAddPaymentAction template) {
        return OrderAddPaymentActionBuilder.of(template);
    }

    default <T> T withOrderAddPaymentAction(Function<OrderAddPaymentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddPaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddPaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddPaymentAction>";
            }
        };
    }
}
