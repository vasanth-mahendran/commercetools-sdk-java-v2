
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discounts the Product's Price by a fixed amount, defined by the <code>money</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueAbsolute productDiscountValueAbsolute = ProductDiscountValueAbsolute.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueAbsoluteImpl.class)
public interface ProductDiscountValueAbsolute extends ProductDiscountValue {

    String ABSOLUTE = "absolute";

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<CentPrecisionMoney> getMoney();

    @JsonIgnore
    public void setMoney(final CentPrecisionMoney... money);

    public void setMoney(final List<CentPrecisionMoney> money);

    public static ProductDiscountValueAbsolute of() {
        return new ProductDiscountValueAbsoluteImpl();
    }

    public static ProductDiscountValueAbsolute of(final ProductDiscountValueAbsolute template) {
        ProductDiscountValueAbsoluteImpl instance = new ProductDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static ProductDiscountValueAbsoluteBuilder builder() {
        return ProductDiscountValueAbsoluteBuilder.of();
    }

    public static ProductDiscountValueAbsoluteBuilder builder(final ProductDiscountValueAbsolute template) {
        return ProductDiscountValueAbsoluteBuilder.of(template);
    }

    default <T> T withProductDiscountValueAbsolute(Function<ProductDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsolute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsolute>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueAbsolute>";
            }
        };
    }
}
