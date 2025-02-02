
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetDescriptionAction productDiscountSetDescriptionAction = ProductDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetDescriptionActionImpl.class)
public interface ProductDiscountSetDescriptionAction extends ProductDiscountUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static ProductDiscountSetDescriptionAction of() {
        return new ProductDiscountSetDescriptionActionImpl();
    }

    public static ProductDiscountSetDescriptionAction of(final ProductDiscountSetDescriptionAction template) {
        ProductDiscountSetDescriptionActionImpl instance = new ProductDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ProductDiscountSetDescriptionActionBuilder builder() {
        return ProductDiscountSetDescriptionActionBuilder.of();
    }

    public static ProductDiscountSetDescriptionActionBuilder builder(
            final ProductDiscountSetDescriptionAction template) {
        return ProductDiscountSetDescriptionActionBuilder.of(template);
    }

    default <T> T withProductDiscountSetDescriptionAction(Function<ProductDiscountSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetDescriptionAction>";
            }
        };
    }
}
