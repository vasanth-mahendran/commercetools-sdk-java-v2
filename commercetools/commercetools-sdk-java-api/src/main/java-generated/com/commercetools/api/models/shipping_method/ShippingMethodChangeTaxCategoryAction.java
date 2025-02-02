
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeTaxCategoryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeTaxCategoryAction shippingMethodChangeTaxCategoryAction = ShippingMethodChangeTaxCategoryAction.builder()
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeTaxCategoryActionImpl.class)
public interface ShippingMethodChangeTaxCategoryAction extends ShippingMethodUpdateAction {

    String CHANGE_TAX_CATEGORY = "changeTaxCategory";

    /**
     *  <p>Value to set.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public static ShippingMethodChangeTaxCategoryAction of() {
        return new ShippingMethodChangeTaxCategoryActionImpl();
    }

    public static ShippingMethodChangeTaxCategoryAction of(final ShippingMethodChangeTaxCategoryAction template) {
        ShippingMethodChangeTaxCategoryActionImpl instance = new ShippingMethodChangeTaxCategoryActionImpl();
        instance.setTaxCategory(template.getTaxCategory());
        return instance;
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder builder() {
        return ShippingMethodChangeTaxCategoryActionBuilder.of();
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder builder(
            final ShippingMethodChangeTaxCategoryAction template) {
        return ShippingMethodChangeTaxCategoryActionBuilder.of(template);
    }

    default <T> T withShippingMethodChangeTaxCategoryAction(Function<ShippingMethodChangeTaxCategoryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeTaxCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeTaxCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeTaxCategoryAction>";
            }
        };
    }
}
