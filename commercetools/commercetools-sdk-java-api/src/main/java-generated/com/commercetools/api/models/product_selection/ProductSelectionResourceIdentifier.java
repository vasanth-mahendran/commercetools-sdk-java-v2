
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a ProductSelection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionResourceIdentifier productSelectionResourceIdentifier = ProductSelectionResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionResourceIdentifierImpl.class)
public interface ProductSelectionResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ProductSelection> {

    String PRODUCT_SELECTION = "product-selection";

    /**
     *  <p>Unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ProductSelectionResourceIdentifier of() {
        return new ProductSelectionResourceIdentifierImpl();
    }

    public static ProductSelectionResourceIdentifier of(final ProductSelectionResourceIdentifier template) {
        ProductSelectionResourceIdentifierImpl instance = new ProductSelectionResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductSelectionResourceIdentifierBuilder builder() {
        return ProductSelectionResourceIdentifierBuilder.of();
    }

    public static ProductSelectionResourceIdentifierBuilder builder(final ProductSelectionResourceIdentifier template) {
        return ProductSelectionResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductSelectionResourceIdentifier(Function<ProductSelectionResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionResourceIdentifier>";
            }
        };
    }
}
