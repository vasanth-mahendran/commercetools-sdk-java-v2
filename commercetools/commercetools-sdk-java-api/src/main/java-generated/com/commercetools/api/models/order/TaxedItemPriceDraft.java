
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedItemPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedItemPriceDraft taxedItemPriceDraft = TaxedItemPriceDraft.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedItemPriceDraftImpl.class)
public interface TaxedItemPriceDraft {

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    public void setTotalNet(final Money totalNet);

    public void setTotalGross(final Money totalGross);

    public static TaxedItemPriceDraft of() {
        return new TaxedItemPriceDraftImpl();
    }

    public static TaxedItemPriceDraft of(final TaxedItemPriceDraft template) {
        TaxedItemPriceDraftImpl instance = new TaxedItemPriceDraftImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    public static TaxedItemPriceDraftBuilder builder() {
        return TaxedItemPriceDraftBuilder.of();
    }

    public static TaxedItemPriceDraftBuilder builder(final TaxedItemPriceDraft template) {
        return TaxedItemPriceDraftBuilder.of(template);
    }

    default <T> T withTaxedItemPriceDraft(Function<TaxedItemPriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxedItemPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedItemPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedItemPriceDraft>";
            }
        };
    }
}
