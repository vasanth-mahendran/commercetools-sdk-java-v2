
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Product.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductResourceIdentifier productResourceIdentifier = ProductResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductResourceIdentifierImpl.class)
public interface ProductResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Product> {

    String PRODUCT = "product";

    /**
     *  <p>Unique identifier of the referenced Product. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Product. Either <code>id</code> or <code>key</code> is required.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ProductResourceIdentifier of() {
        return new ProductResourceIdentifierImpl();
    }

    public static ProductResourceIdentifier of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierImpl instance = new ProductResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductResourceIdentifierBuilder builder() {
        return ProductResourceIdentifierBuilder.of();
    }

    public static ProductResourceIdentifierBuilder builder(final ProductResourceIdentifier template) {
        return ProductResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductResourceIdentifier(Function<ProductResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductResourceIdentifier>";
            }
        };
    }
}
