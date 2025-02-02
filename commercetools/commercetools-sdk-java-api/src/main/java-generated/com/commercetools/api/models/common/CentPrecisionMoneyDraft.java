
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CentPrecisionMoneyDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CentPrecisionMoneyDraft centPrecisionMoneyDraft = CentPrecisionMoneyDraft.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CentPrecisionMoneyDraftImpl.class)
public interface CentPrecisionMoneyDraft extends TypedMoneyDraft {

    String CENT_PRECISION = "centPrecision";

    /**
     *  <p>This field is optional for cent precision. If provided, it must be equal to the default number of fraction digits for the specified currency.</p>
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setFractionDigits(final Integer fractionDigits);

    public static CentPrecisionMoneyDraft of() {
        return new CentPrecisionMoneyDraftImpl();
    }

    public static CentPrecisionMoneyDraft of(final CentPrecisionMoneyDraft template) {
        CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    public static CentPrecisionMoneyDraftBuilder builder() {
        return CentPrecisionMoneyDraftBuilder.of();
    }

    public static CentPrecisionMoneyDraftBuilder builder(final CentPrecisionMoneyDraft template) {
        return CentPrecisionMoneyDraftBuilder.of(template);
    }

    default <T> T withCentPrecisionMoneyDraft(Function<CentPrecisionMoneyDraft, T> helper) {
        return helper.apply(this);
    }

    public static CentPrecisionMoneyDraft of(final javax.money.MonetaryAmount monetaryAmount) {
        return MoneyUtil.draftOf(monetaryAmount);
    }

    public static CentPrecisionMoneyDraft of(final CentPrecisionMoney template) {
        CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CentPrecisionMoneyDraft>";
            }
        };
    }
}
