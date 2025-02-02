
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidUntilAction cartDiscountSetValidUntilAction = CartDiscountSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetValidUntilActionImpl.class)
public interface CartDiscountSetValidUntilAction extends CartDiscountUpdateAction {

    String SET_VALID_UNTIL = "setValidUntil";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidUntil(final ZonedDateTime validUntil);

    public static CartDiscountSetValidUntilAction of() {
        return new CartDiscountSetValidUntilActionImpl();
    }

    public static CartDiscountSetValidUntilAction of(final CartDiscountSetValidUntilAction template) {
        CartDiscountSetValidUntilActionImpl instance = new CartDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static CartDiscountSetValidUntilActionBuilder builder() {
        return CartDiscountSetValidUntilActionBuilder.of();
    }

    public static CartDiscountSetValidUntilActionBuilder builder(final CartDiscountSetValidUntilAction template) {
        return CartDiscountSetValidUntilActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetValidUntilAction(Function<CartDiscountSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetValidUntilAction>";
            }
        };
    }
}
