
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypedMoney
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypedMoney typedMoney = TypedMoney.highPrecisionBuilder()
 *             centAmount(0.3)
 *             currencyCode("{currencyCode}")
 *             preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.HighPrecisionMoneyImpl.class, name = HighPrecisionMoney.HIGH_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.MoneyImpl.class, name = Money.CENT_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypedMoney {

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
     *
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *
     */
    @NotNull
    @JsonProperty("centAmount")
    public Long getCentAmount();

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    public void setFractionDigits(final Integer fractionDigits);

    public void setCentAmount(final Long centAmount);

    public void setCurrencyCode(final String currencyCode);

    public static com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder.of();
    }

    public static com.commercetools.importapi.models.common.MoneyBuilder centPrecisionBuilder() {
        return com.commercetools.importapi.models.common.MoneyBuilder.of();
    }

    default <T> T withTypedMoney(Function<TypedMoney, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypedMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypedMoney>() {
            @Override
            public String toString() {
                return "TypeReference<TypedMoney>";
            }
        };
    }
}
