
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetKeyAction productDiscountSetKeyAction = ProductDiscountSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetKeyActionImpl.class)
public interface ProductDiscountSetKeyAction extends ProductDiscountUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductDiscountSetKeyAction of() {
        return new ProductDiscountSetKeyActionImpl();
    }

    public static ProductDiscountSetKeyAction of(final ProductDiscountSetKeyAction template) {
        ProductDiscountSetKeyActionImpl instance = new ProductDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductDiscountSetKeyActionBuilder builder() {
        return ProductDiscountSetKeyActionBuilder.of();
    }

    public static ProductDiscountSetKeyActionBuilder builder(final ProductDiscountSetKeyAction template) {
        return ProductDiscountSetKeyActionBuilder.of(template);
    }

    default <T> T withProductDiscountSetKeyAction(Function<ProductDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetKeyAction>";
            }
        };
    }
}
