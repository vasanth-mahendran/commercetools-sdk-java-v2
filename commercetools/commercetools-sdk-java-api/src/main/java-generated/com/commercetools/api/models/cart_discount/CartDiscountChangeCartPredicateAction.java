
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeCartPredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeCartPredicateAction cartDiscountChangeCartPredicateAction = CartDiscountChangeCartPredicateAction.builder()
 *             .cartPredicate("{cartPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeCartPredicateActionImpl.class)
public interface CartDiscountChangeCartPredicateAction extends CartDiscountUpdateAction {

    String CHANGE_CART_PREDICATE = "changeCartPredicate";

    /**
     *  <p>New value to set.</p>
     */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    public void setCartPredicate(final String cartPredicate);

    public static CartDiscountChangeCartPredicateAction of() {
        return new CartDiscountChangeCartPredicateActionImpl();
    }

    public static CartDiscountChangeCartPredicateAction of(final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionImpl instance = new CartDiscountChangeCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    public static CartDiscountChangeCartPredicateActionBuilder builder() {
        return CartDiscountChangeCartPredicateActionBuilder.of();
    }

    public static CartDiscountChangeCartPredicateActionBuilder builder(
            final CartDiscountChangeCartPredicateAction template) {
        return CartDiscountChangeCartPredicateActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeCartPredicateAction(Function<CartDiscountChangeCartPredicateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeCartPredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeCartPredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeCartPredicateAction>";
            }
        };
    }
}
