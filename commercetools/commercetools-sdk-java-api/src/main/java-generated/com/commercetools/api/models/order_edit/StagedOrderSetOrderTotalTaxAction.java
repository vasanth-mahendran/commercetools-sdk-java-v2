
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetOrderTotalTaxAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetOrderTotalTaxAction stagedOrderSetOrderTotalTaxAction = StagedOrderSetOrderTotalTaxAction.builder()
 *             .externalTotalGross(externalTotalGrossBuilder -> externalTotalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetOrderTotalTaxActionImpl.class)
public interface StagedOrderSetOrderTotalTaxAction extends StagedOrderUpdateAction {

    String SET_ORDER_TOTAL_TAX = "setOrderTotalTax";

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("externalTotalGross")
    public Money getExternalTotalGross();

    /**
     *
     */
    @Valid
    @JsonProperty("externalTaxPortions")
    public List<TaxPortionDraft> getExternalTaxPortions();

    public void setExternalTotalGross(final Money externalTotalGross);

    @JsonIgnore
    public void setExternalTaxPortions(final TaxPortionDraft... externalTaxPortions);

    public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);

    public static StagedOrderSetOrderTotalTaxAction of() {
        return new StagedOrderSetOrderTotalTaxActionImpl();
    }

    public static StagedOrderSetOrderTotalTaxAction of(final StagedOrderSetOrderTotalTaxAction template) {
        StagedOrderSetOrderTotalTaxActionImpl instance = new StagedOrderSetOrderTotalTaxActionImpl();
        instance.setExternalTotalGross(template.getExternalTotalGross());
        instance.setExternalTaxPortions(template.getExternalTaxPortions());
        return instance;
    }

    public static StagedOrderSetOrderTotalTaxActionBuilder builder() {
        return StagedOrderSetOrderTotalTaxActionBuilder.of();
    }

    public static StagedOrderSetOrderTotalTaxActionBuilder builder(final StagedOrderSetOrderTotalTaxAction template) {
        return StagedOrderSetOrderTotalTaxActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetOrderTotalTaxAction(Function<StagedOrderSetOrderTotalTaxAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderTotalTaxAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderTotalTaxAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetOrderTotalTaxAction>";
            }
        };
    }
}
