
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetLocalizedDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedDescriptionAction shippingMethodSetLocalizedDescriptionAction = ShippingMethodSetLocalizedDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedDescriptionActionImpl.class)
public interface ShippingMethodSetLocalizedDescriptionAction extends ShippingMethodUpdateAction {

    String SET_LOCALIZED_DESCRIPTION = "setLocalizedDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("localizedDescription")
    public LocalizedString getLocalizedDescription();

    public void setLocalizedDescription(final LocalizedString localizedDescription);

    public static ShippingMethodSetLocalizedDescriptionAction of() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl();
    }

    public static ShippingMethodSetLocalizedDescriptionAction of(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionImpl instance = new ShippingMethodSetLocalizedDescriptionActionImpl();
        instance.setLocalizedDescription(template.getLocalizedDescription());
        return instance;
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder() {
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of();
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder builder(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        return ShippingMethodSetLocalizedDescriptionActionBuilder.of(template);
    }

    default <T> T withShippingMethodSetLocalizedDescriptionAction(
            Function<ShippingMethodSetLocalizedDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetLocalizedDescriptionAction>";
            }
        };
    }
}
