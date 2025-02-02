
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a DiscountCode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeResourceIdentifier discountCodeResourceIdentifier = DiscountCodeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeResourceIdentifierImpl.class)
public interface DiscountCodeResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<DiscountCode> {

    String DISCOUNT_CODE = "discount-code";

    /**
     *  <p>Unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static DiscountCodeResourceIdentifier of() {
        return new DiscountCodeResourceIdentifierImpl();
    }

    public static DiscountCodeResourceIdentifier of(final DiscountCodeResourceIdentifier template) {
        DiscountCodeResourceIdentifierImpl instance = new DiscountCodeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static DiscountCodeResourceIdentifierBuilder builder() {
        return DiscountCodeResourceIdentifierBuilder.of();
    }

    public static DiscountCodeResourceIdentifierBuilder builder(final DiscountCodeResourceIdentifier template) {
        return DiscountCodeResourceIdentifierBuilder.of(template);
    }

    default <T> T withDiscountCodeResourceIdentifier(Function<DiscountCodeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeResourceIdentifier>";
            }
        };
    }
}
