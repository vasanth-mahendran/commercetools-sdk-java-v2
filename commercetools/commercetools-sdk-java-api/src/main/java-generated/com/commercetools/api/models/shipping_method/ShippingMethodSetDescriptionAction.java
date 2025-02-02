
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetDescriptionAction shippingMethodSetDescriptionAction = ShippingMethodSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetDescriptionActionImpl.class)
public interface ShippingMethodSetDescriptionAction extends ShippingMethodUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ShippingMethodSetDescriptionAction of() {
        return new ShippingMethodSetDescriptionActionImpl();
    }

    public static ShippingMethodSetDescriptionAction of(final ShippingMethodSetDescriptionAction template) {
        ShippingMethodSetDescriptionActionImpl instance = new ShippingMethodSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ShippingMethodSetDescriptionActionBuilder builder() {
        return ShippingMethodSetDescriptionActionBuilder.of();
    }

    public static ShippingMethodSetDescriptionActionBuilder builder(final ShippingMethodSetDescriptionAction template) {
        return ShippingMethodSetDescriptionActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetDescriptionAction(Function<ShippingMethodSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetDescriptionAction>";
            }
        };
    }
}
