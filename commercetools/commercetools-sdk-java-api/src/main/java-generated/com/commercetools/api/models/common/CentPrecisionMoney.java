
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Object that stores cent amounts in a specific currency.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CentPrecisionMoney centPrecisionMoney = CentPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .fractionDigits(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CentPrecisionMoneyImpl.class)
public interface CentPrecisionMoney extends TypedMoney {

    String CENT_PRECISION = "centPrecision";

    /**
     *  <p>The number of default fraction digits for the given currency, like <code>2</code> for EUR or <code>0</code> for JPY.</p>
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setFractionDigits(final Integer fractionDigits);

    public static CentPrecisionMoney of() {
        return new CentPrecisionMoneyImpl();
    }

    public static CentPrecisionMoney of(final CentPrecisionMoney template) {
        CentPrecisionMoneyImpl instance = new CentPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    public static CentPrecisionMoneyBuilder builder() {
        return CentPrecisionMoneyBuilder.of();
    }

    public static CentPrecisionMoneyBuilder builder(final CentPrecisionMoney template) {
        return CentPrecisionMoneyBuilder.of(template);
    }

    default <T> T withCentPrecisionMoney(Function<CentPrecisionMoney, T> helper) {
        return helper.apply(this);
    }

    public static CentPrecisionMoney of(final javax.money.MonetaryAmount monetaryAmount) {
        return MoneyUtil.of(monetaryAmount);
    }

    public default CentPrecisionMoneyDraft toDraft() {
        return CentPrecisionMoneyDraft.of(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoney>() {
            @Override
            public String toString() {
                return "TypeReference<CentPrecisionMoney>";
            }
        };
    }
}
