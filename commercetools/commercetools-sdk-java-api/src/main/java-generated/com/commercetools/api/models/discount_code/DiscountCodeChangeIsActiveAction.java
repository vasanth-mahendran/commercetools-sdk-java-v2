
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeChangeIsActiveAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeChangeIsActiveAction discountCodeChangeIsActiveAction = DiscountCodeChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeIsActiveActionImpl.class)
public interface DiscountCodeChangeIsActiveAction extends DiscountCodeUpdateAction {

    String CHANGE_IS_ACTIVE = "changeIsActive";

    /**
     *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    public void setIsActive(final Boolean isActive);

    public static DiscountCodeChangeIsActiveAction of() {
        return new DiscountCodeChangeIsActiveActionImpl();
    }

    public static DiscountCodeChangeIsActiveAction of(final DiscountCodeChangeIsActiveAction template) {
        DiscountCodeChangeIsActiveActionImpl instance = new DiscountCodeChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public static DiscountCodeChangeIsActiveActionBuilder builder() {
        return DiscountCodeChangeIsActiveActionBuilder.of();
    }

    public static DiscountCodeChangeIsActiveActionBuilder builder(final DiscountCodeChangeIsActiveAction template) {
        return DiscountCodeChangeIsActiveActionBuilder.of(template);
    }

    default <T> T withDiscountCodeChangeIsActiveAction(Function<DiscountCodeChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeIsActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeIsActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeChangeIsActiveAction>";
            }
        };
    }
}
