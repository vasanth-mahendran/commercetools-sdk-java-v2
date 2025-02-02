
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetCartPredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCartPredicateAction discountCodeSetCartPredicateAction = DiscountCodeSetCartPredicateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetCartPredicateActionImpl.class)
public interface DiscountCodeSetCartPredicateAction extends DiscountCodeUpdateAction {

    String SET_CART_PREDICATE = "setCartPredicate";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    public void setCartPredicate(final String cartPredicate);

    public static DiscountCodeSetCartPredicateAction of() {
        return new DiscountCodeSetCartPredicateActionImpl();
    }

    public static DiscountCodeSetCartPredicateAction of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionImpl instance = new DiscountCodeSetCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    public static DiscountCodeSetCartPredicateActionBuilder builder() {
        return DiscountCodeSetCartPredicateActionBuilder.of();
    }

    public static DiscountCodeSetCartPredicateActionBuilder builder(final DiscountCodeSetCartPredicateAction template) {
        return DiscountCodeSetCartPredicateActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetCartPredicateAction(Function<DiscountCodeSetCartPredicateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCartPredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCartPredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetCartPredicateAction>";
            }
        };
    }
}
