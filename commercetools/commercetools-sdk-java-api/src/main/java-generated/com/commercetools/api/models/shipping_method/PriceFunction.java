
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceFunction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceFunction priceFunction = PriceFunction.builder()
 *             .currencyCode("{currencyCode}")
 *             .function("{function}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceFunctionImpl.class)
public interface PriceFunction {

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     *
     */
    @NotNull
    @JsonProperty("function")
    public String getFunction();

    public void setCurrencyCode(final String currencyCode);

    public void setFunction(final String function);

    public static PriceFunction of() {
        return new PriceFunctionImpl();
    }

    public static PriceFunction of(final PriceFunction template) {
        PriceFunctionImpl instance = new PriceFunctionImpl();
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFunction(template.getFunction());
        return instance;
    }

    public static PriceFunctionBuilder builder() {
        return PriceFunctionBuilder.of();
    }

    public static PriceFunctionBuilder builder(final PriceFunction template) {
        return PriceFunctionBuilder.of(template);
    }

    default <T> T withPriceFunction(Function<PriceFunction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceFunction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceFunction>() {
            @Override
            public String toString() {
                return "TypeReference<PriceFunction>";
            }
        };
    }
}
