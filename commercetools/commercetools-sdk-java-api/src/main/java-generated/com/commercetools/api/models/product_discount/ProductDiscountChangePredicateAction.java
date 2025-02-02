
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangePredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangePredicateAction productDiscountChangePredicateAction = ProductDiscountChangePredicateAction.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangePredicateActionImpl.class)
public interface ProductDiscountChangePredicateAction extends ProductDiscountUpdateAction {

    String CHANGE_PREDICATE = "changePredicate";

    /**
     *  <p>New value to set. Must be a valid ProductDiscount predicate.</p>
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ProductDiscountChangePredicateAction of() {
        return new ProductDiscountChangePredicateActionImpl();
    }

    public static ProductDiscountChangePredicateAction of(final ProductDiscountChangePredicateAction template) {
        ProductDiscountChangePredicateActionImpl instance = new ProductDiscountChangePredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static ProductDiscountChangePredicateActionBuilder builder() {
        return ProductDiscountChangePredicateActionBuilder.of();
    }

    public static ProductDiscountChangePredicateActionBuilder builder(
            final ProductDiscountChangePredicateAction template) {
        return ProductDiscountChangePredicateActionBuilder.of(template);
    }

    default <T> T withProductDiscountChangePredicateAction(Function<ProductDiscountChangePredicateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangePredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangePredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangePredicateAction>";
            }
        };
    }
}
