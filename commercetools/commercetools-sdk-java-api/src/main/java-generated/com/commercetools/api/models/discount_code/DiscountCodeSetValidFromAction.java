
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidFromAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidFromAction discountCodeSetValidFromAction = DiscountCodeSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidFromActionImpl.class)
public interface DiscountCodeSetValidFromAction extends DiscountCodeUpdateAction {

    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    public void setValidFrom(final ZonedDateTime validFrom);

    public static DiscountCodeSetValidFromAction of() {
        return new DiscountCodeSetValidFromActionImpl();
    }

    public static DiscountCodeSetValidFromAction of(final DiscountCodeSetValidFromAction template) {
        DiscountCodeSetValidFromActionImpl instance = new DiscountCodeSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    public static DiscountCodeSetValidFromActionBuilder builder() {
        return DiscountCodeSetValidFromActionBuilder.of();
    }

    public static DiscountCodeSetValidFromActionBuilder builder(final DiscountCodeSetValidFromAction template) {
        return DiscountCodeSetValidFromActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetValidFromAction(Function<DiscountCodeSetValidFromAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetValidFromAction>";
            }
        };
    }
}
