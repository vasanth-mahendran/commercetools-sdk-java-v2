
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a product by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductKeyReference productKeyReference = ProductKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductKeyReferenceImpl.class)
public interface ProductKeyReference extends KeyReference {

    String PRODUCT = "product";

    public static ProductKeyReference of() {
        return new ProductKeyReferenceImpl();
    }

    public static ProductKeyReference of(final ProductKeyReference template) {
        ProductKeyReferenceImpl instance = new ProductKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductKeyReferenceBuilder builder() {
        return ProductKeyReferenceBuilder.of();
    }

    public static ProductKeyReferenceBuilder builder(final ProductKeyReference template) {
        return ProductKeyReferenceBuilder.of(template);
    }

    default <T> T withProductKeyReference(Function<ProductKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductKeyReference>";
            }
        };
    }
}
