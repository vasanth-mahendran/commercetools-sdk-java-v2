
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemoveDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveDiscountCodeAction myCartRemoveDiscountCodeAction = MyCartRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveDiscountCodeActionImpl.class)
public interface MyCartRemoveDiscountCodeAction extends MyCartUpdateAction {

    String REMOVE_DISCOUNT_CODE = "removeDiscountCode";

    /**
     *  <p>Reference to a DiscountCode.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static MyCartRemoveDiscountCodeAction of() {
        return new MyCartRemoveDiscountCodeActionImpl();
    }

    public static MyCartRemoveDiscountCodeAction of(final MyCartRemoveDiscountCodeAction template) {
        MyCartRemoveDiscountCodeActionImpl instance = new MyCartRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static MyCartRemoveDiscountCodeActionBuilder builder() {
        return MyCartRemoveDiscountCodeActionBuilder.of();
    }

    public static MyCartRemoveDiscountCodeActionBuilder builder(final MyCartRemoveDiscountCodeAction template) {
        return MyCartRemoveDiscountCodeActionBuilder.of(template);
    }

    default <T> T withMyCartRemoveDiscountCodeAction(Function<MyCartRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemoveDiscountCodeAction>";
            }
        };
    }
}
