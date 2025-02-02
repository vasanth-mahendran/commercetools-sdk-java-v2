
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetNameAction discountCodeSetNameAction = DiscountCodeSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetNameActionImpl.class)
public interface DiscountCodeSetNameAction extends DiscountCodeUpdateAction {

    String SET_NAME = "setName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static DiscountCodeSetNameAction of() {
        return new DiscountCodeSetNameActionImpl();
    }

    public static DiscountCodeSetNameAction of(final DiscountCodeSetNameAction template) {
        DiscountCodeSetNameActionImpl instance = new DiscountCodeSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static DiscountCodeSetNameActionBuilder builder() {
        return DiscountCodeSetNameActionBuilder.of();
    }

    public static DiscountCodeSetNameActionBuilder builder(final DiscountCodeSetNameAction template) {
        return DiscountCodeSetNameActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetNameAction(Function<DiscountCodeSetNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetNameAction>";
            }
        };
    }
}
