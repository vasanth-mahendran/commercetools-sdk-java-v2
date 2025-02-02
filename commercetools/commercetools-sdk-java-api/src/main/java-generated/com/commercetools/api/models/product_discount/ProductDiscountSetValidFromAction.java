
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetValidFromAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAction productDiscountSetValidFromAction = ProductDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetValidFromActionImpl.class)
public interface ProductDiscountSetValidFromAction extends ProductDiscountUpdateAction {

    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    public void setValidFrom(final ZonedDateTime validFrom);

    public static ProductDiscountSetValidFromAction of() {
        return new ProductDiscountSetValidFromActionImpl();
    }

    public static ProductDiscountSetValidFromAction of(final ProductDiscountSetValidFromAction template) {
        ProductDiscountSetValidFromActionImpl instance = new ProductDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    public static ProductDiscountSetValidFromActionBuilder builder() {
        return ProductDiscountSetValidFromActionBuilder.of();
    }

    public static ProductDiscountSetValidFromActionBuilder builder(final ProductDiscountSetValidFromAction template) {
        return ProductDiscountSetValidFromActionBuilder.of(template);
    }

    default <T> T withProductDiscountSetValidFromAction(Function<ProductDiscountSetValidFromAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetValidFromAction>";
            }
        };
    }
}
