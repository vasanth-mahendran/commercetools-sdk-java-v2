package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountChangeCartPredicateActionImpl.class)
public interface CartDiscountChangeCartPredicateAction extends CartDiscountUpdateAction {

    /**
    *  <p>A valid Cart predicate.</p>
    */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    public void setCartPredicate(final String cartPredicate);

    public static CartDiscountChangeCartPredicateAction of(){
        return new CartDiscountChangeCartPredicateActionImpl();
    }
    

    public static CartDiscountChangeCartPredicateAction of(final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionImpl instance = new CartDiscountChangeCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    public static CartDiscountChangeCartPredicateActionBuilder builder(){
        return CartDiscountChangeCartPredicateActionBuilder.of();
    }
    
    public static CartDiscountChangeCartPredicateActionBuilder builder(final CartDiscountChangeCartPredicateAction template){
        return CartDiscountChangeCartPredicateActionBuilder.of(template);
    }
    

    default <T> T withCartDiscountChangeCartPredicateAction(Function<CartDiscountChangeCartPredicateAction, T> helper) {
        return helper.apply(this);
    }
}
