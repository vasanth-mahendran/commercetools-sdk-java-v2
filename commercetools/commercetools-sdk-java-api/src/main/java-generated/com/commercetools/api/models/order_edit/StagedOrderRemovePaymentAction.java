
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemovePaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemovePaymentAction stagedOrderRemovePaymentAction = StagedOrderRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemovePaymentActionImpl.class)
public interface StagedOrderRemovePaymentAction extends StagedOrderUpdateAction {

    String REMOVE_PAYMENT = "removePayment";

    /**
     *  <p>ResourceIdentifier to a Payment.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static StagedOrderRemovePaymentAction of() {
        return new StagedOrderRemovePaymentActionImpl();
    }

    public static StagedOrderRemovePaymentAction of(final StagedOrderRemovePaymentAction template) {
        StagedOrderRemovePaymentActionImpl instance = new StagedOrderRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static StagedOrderRemovePaymentActionBuilder builder() {
        return StagedOrderRemovePaymentActionBuilder.of();
    }

    public static StagedOrderRemovePaymentActionBuilder builder(final StagedOrderRemovePaymentAction template) {
        return StagedOrderRemovePaymentActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemovePaymentAction(Function<StagedOrderRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemovePaymentAction>";
            }
        };
    }
}
