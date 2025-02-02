
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueAbsoluteDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueAbsoluteDraft cartDiscountValueAbsoluteDraft = CartDiscountValueAbsoluteDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueAbsoluteDraftImpl.class)
public interface CartDiscountValueAbsoluteDraft extends CartDiscountValueDraft {

    String ABSOLUTE = "absolute";

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    @JsonIgnore
    public void setMoney(final Money... money);

    public void setMoney(final List<Money> money);

    public static CartDiscountValueAbsoluteDraft of() {
        return new CartDiscountValueAbsoluteDraftImpl();
    }

    public static CartDiscountValueAbsoluteDraft of(final CartDiscountValueAbsoluteDraft template) {
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartDiscountValueAbsoluteDraftBuilder builder() {
        return CartDiscountValueAbsoluteDraftBuilder.of();
    }

    public static CartDiscountValueAbsoluteDraftBuilder builder(final CartDiscountValueAbsoluteDraft template) {
        return CartDiscountValueAbsoluteDraftBuilder.of(template);
    }

    default <T> T withCartDiscountValueAbsoluteDraft(Function<CartDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsoluteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsoluteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueAbsoluteDraft>";
            }
        };
    }
}
