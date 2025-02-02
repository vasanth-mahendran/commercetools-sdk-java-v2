
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoInterfaceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoInterfaceAction paymentSetMethodInfoInterfaceAction = PaymentSetMethodInfoInterfaceAction.builder()
 *             .interface("{interface}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAction extends PaymentUpdateAction {

    String SET_METHOD_INFO_INTERFACE = "setMethodInfoInterface";

    /**
     *
     */
    @NotNull
    @JsonProperty("interface")
    public String getInterface();

    public void setInterface(final String _interface);

    public static PaymentSetMethodInfoInterfaceAction of() {
        return new PaymentSetMethodInfoInterfaceActionImpl();
    }

    public static PaymentSetMethodInfoInterfaceAction of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionImpl instance = new PaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder builder() {
        return PaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder builder(
            final PaymentSetMethodInfoInterfaceAction template) {
        return PaymentSetMethodInfoInterfaceActionBuilder.of(template);
    }

    default <T> T withPaymentSetMethodInfoInterfaceAction(Function<PaymentSetMethodInfoInterfaceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoInterfaceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetMethodInfoInterfaceAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetMethodInfoInterfaceAction>";
            }
        };
    }
}
