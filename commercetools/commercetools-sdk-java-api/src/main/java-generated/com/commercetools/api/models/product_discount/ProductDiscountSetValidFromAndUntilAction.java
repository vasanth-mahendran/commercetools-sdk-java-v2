
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetValidFromAndUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAndUntilAction productDiscountSetValidFromAndUntilAction = ProductDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetValidFromAndUntilActionImpl.class)
public interface ProductDiscountSetValidFromAndUntilAction extends ProductDiscountUpdateAction {

    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static ProductDiscountSetValidFromAndUntilAction of() {
        return new ProductDiscountSetValidFromAndUntilActionImpl();
    }

    public static ProductDiscountSetValidFromAndUntilAction of(
            final ProductDiscountSetValidFromAndUntilAction template) {
        ProductDiscountSetValidFromAndUntilActionImpl instance = new ProductDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder builder() {
        return ProductDiscountSetValidFromAndUntilActionBuilder.of();
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder builder(
            final ProductDiscountSetValidFromAndUntilAction template) {
        return ProductDiscountSetValidFromAndUntilActionBuilder.of(template);
    }

    default <T> T withProductDiscountSetValidFromAndUntilAction(
            Function<ProductDiscountSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetValidFromAndUntilAction>";
            }
        };
    }
}
