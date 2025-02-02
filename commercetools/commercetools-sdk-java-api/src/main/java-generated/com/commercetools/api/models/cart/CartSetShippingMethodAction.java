
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingMethodAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodAction cartSetShippingMethodAction = CartSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingMethodActionImpl.class)
public interface CartSetShippingMethodAction extends CartUpdateAction {

    String SET_SHIPPING_METHOD = "setShippingMethod";

    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartSetShippingMethodAction of() {
        return new CartSetShippingMethodActionImpl();
    }

    public static CartSetShippingMethodAction of(final CartSetShippingMethodAction template) {
        CartSetShippingMethodActionImpl instance = new CartSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartSetShippingMethodActionBuilder builder() {
        return CartSetShippingMethodActionBuilder.of();
    }

    public static CartSetShippingMethodActionBuilder builder(final CartSetShippingMethodAction template) {
        return CartSetShippingMethodActionBuilder.of(template);
    }

    default <T> T withCartSetShippingMethodAction(Function<CartSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingMethodAction>";
            }
        };
    }
}
