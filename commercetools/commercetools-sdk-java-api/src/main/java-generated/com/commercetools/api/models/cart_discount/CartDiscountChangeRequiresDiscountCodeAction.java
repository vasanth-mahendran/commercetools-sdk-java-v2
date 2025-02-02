
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeRequiresDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeRequiresDiscountCodeAction cartDiscountChangeRequiresDiscountCodeAction = CartDiscountChangeRequiresDiscountCodeAction.builder()
 *             .requiresDiscountCode(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeRequiresDiscountCodeActionImpl.class)
public interface CartDiscountChangeRequiresDiscountCodeAction extends CartDiscountUpdateAction {

    String CHANGE_REQUIRES_DISCOUNT_CODE = "changeRequiresDiscountCode";

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount can only be used in connection with a DiscountCode.</p>
     */
    @NotNull
    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);

    public static CartDiscountChangeRequiresDiscountCodeAction of() {
        return new CartDiscountChangeRequiresDiscountCodeActionImpl();
    }

    public static CartDiscountChangeRequiresDiscountCodeAction of(
            final CartDiscountChangeRequiresDiscountCodeAction template) {
        CartDiscountChangeRequiresDiscountCodeActionImpl instance = new CartDiscountChangeRequiresDiscountCodeActionImpl();
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        return instance;
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder builder() {
        return CartDiscountChangeRequiresDiscountCodeActionBuilder.of();
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder builder(
            final CartDiscountChangeRequiresDiscountCodeAction template) {
        return CartDiscountChangeRequiresDiscountCodeActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeRequiresDiscountCodeAction(
            Function<CartDiscountChangeRequiresDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeRequiresDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeRequiresDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeRequiresDiscountCodeAction>";
            }
        };
    }
}
