
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductReference productReference = ProductReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference {

    String PRODUCT = "product";

    public static ProductReference of() {
        return new ProductReferenceImpl();
    }

    public static ProductReference of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static ProductReferenceBuilder builder() {
        return ProductReferenceBuilder.of();
    }

    public static ProductReferenceBuilder builder(final ProductReference template) {
        return ProductReferenceBuilder.of(template);
    }

    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductReference>";
            }
        };
    }
}
