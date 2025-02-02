
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetKeyAction cartDiscountSetKeyAction = CartDiscountSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetKeyActionImpl.class)
public interface CartDiscountSetKeyAction extends CartDiscountUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CartDiscountSetKeyAction of() {
        return new CartDiscountSetKeyActionImpl();
    }

    public static CartDiscountSetKeyAction of(final CartDiscountSetKeyAction template) {
        CartDiscountSetKeyActionImpl instance = new CartDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartDiscountSetKeyActionBuilder builder() {
        return CartDiscountSetKeyActionBuilder.of();
    }

    public static CartDiscountSetKeyActionBuilder builder(final CartDiscountSetKeyAction template) {
        return CartDiscountSetKeyActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetKeyAction(Function<CartDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetKeyAction>";
            }
        };
    }
}
