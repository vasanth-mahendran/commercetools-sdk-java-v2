
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetDescriptionAction cartDiscountSetDescriptionAction = CartDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetDescriptionActionImpl.class)
public interface CartDiscountSetDescriptionAction extends CartDiscountUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static CartDiscountSetDescriptionAction of() {
        return new CartDiscountSetDescriptionActionImpl();
    }

    public static CartDiscountSetDescriptionAction of(final CartDiscountSetDescriptionAction template) {
        CartDiscountSetDescriptionActionImpl instance = new CartDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static CartDiscountSetDescriptionActionBuilder builder() {
        return CartDiscountSetDescriptionActionBuilder.of();
    }

    public static CartDiscountSetDescriptionActionBuilder builder(final CartDiscountSetDescriptionAction template) {
        return CartDiscountSetDescriptionActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetDescriptionAction(Function<CartDiscountSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetDescriptionAction>";
            }
        };
    }
}
