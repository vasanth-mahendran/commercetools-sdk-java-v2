
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetShippingMethodAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetShippingMethodAction myCartSetShippingMethodAction = MyCartSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetShippingMethodActionImpl.class)
public interface MyCartSetShippingMethodAction extends MyCartUpdateAction {

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

    public static MyCartSetShippingMethodAction of() {
        return new MyCartSetShippingMethodActionImpl();
    }

    public static MyCartSetShippingMethodAction of(final MyCartSetShippingMethodAction template) {
        MyCartSetShippingMethodActionImpl instance = new MyCartSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static MyCartSetShippingMethodActionBuilder builder() {
        return MyCartSetShippingMethodActionBuilder.of();
    }

    public static MyCartSetShippingMethodActionBuilder builder(final MyCartSetShippingMethodAction template) {
        return MyCartSetShippingMethodActionBuilder.of(template);
    }

    default <T> T withMyCartSetShippingMethodAction(Function<MyCartSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetShippingMethodAction>";
            }
        };
    }
}
