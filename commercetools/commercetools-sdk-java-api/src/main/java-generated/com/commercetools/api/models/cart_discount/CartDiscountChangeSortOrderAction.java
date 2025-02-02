
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeSortOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeSortOrderAction cartDiscountChangeSortOrderAction = CartDiscountChangeSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeSortOrderActionImpl.class)
public interface CartDiscountChangeSortOrderAction extends CartDiscountUpdateAction {

    String CHANGE_SORT_ORDER = "changeSortOrder";

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A Discount with a higher sortOrder is prioritized.</p>
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    public void setSortOrder(final String sortOrder);

    public static CartDiscountChangeSortOrderAction of() {
        return new CartDiscountChangeSortOrderActionImpl();
    }

    public static CartDiscountChangeSortOrderAction of(final CartDiscountChangeSortOrderAction template) {
        CartDiscountChangeSortOrderActionImpl instance = new CartDiscountChangeSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    public static CartDiscountChangeSortOrderActionBuilder builder() {
        return CartDiscountChangeSortOrderActionBuilder.of();
    }

    public static CartDiscountChangeSortOrderActionBuilder builder(final CartDiscountChangeSortOrderAction template) {
        return CartDiscountChangeSortOrderActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeSortOrderAction(Function<CartDiscountChangeSortOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeSortOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeSortOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeSortOrderAction>";
            }
        };
    }
}
