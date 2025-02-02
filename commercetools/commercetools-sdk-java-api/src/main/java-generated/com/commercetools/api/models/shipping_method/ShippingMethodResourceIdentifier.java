
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ShippingMethod.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodResourceIdentifier shippingMethodResourceIdentifier = ShippingMethodResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodResourceIdentifierImpl.class)
public interface ShippingMethodResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ShippingMethod> {

    String SHIPPING_METHOD = "shipping-method";

    /**
     *  <p>Unique identifier of the referenced ShippingMethod. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ShippingMethod. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ShippingMethodResourceIdentifier of() {
        return new ShippingMethodResourceIdentifierImpl();
    }

    public static ShippingMethodResourceIdentifier of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierImpl instance = new ShippingMethodResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShippingMethodResourceIdentifierBuilder builder() {
        return ShippingMethodResourceIdentifierBuilder.of();
    }

    public static ShippingMethodResourceIdentifierBuilder builder(final ShippingMethodResourceIdentifier template) {
        return ShippingMethodResourceIdentifierBuilder.of(template);
    }

    default <T> T withShippingMethodResourceIdentifier(Function<ShippingMethodResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodResourceIdentifier>";
            }
        };
    }
}
