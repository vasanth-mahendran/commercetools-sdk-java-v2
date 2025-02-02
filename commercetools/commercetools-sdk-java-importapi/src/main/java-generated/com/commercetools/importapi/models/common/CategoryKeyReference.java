
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a category by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryKeyReference categoryKeyReference = CategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryKeyReferenceImpl.class)
public interface CategoryKeyReference extends KeyReference {

    String CATEGORY = "category";

    public static CategoryKeyReference of() {
        return new CategoryKeyReferenceImpl();
    }

    public static CategoryKeyReference of(final CategoryKeyReference template) {
        CategoryKeyReferenceImpl instance = new CategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CategoryKeyReferenceBuilder builder() {
        return CategoryKeyReferenceBuilder.of();
    }

    public static CategoryKeyReferenceBuilder builder(final CategoryKeyReference template) {
        return CategoryKeyReferenceBuilder.of(template);
    }

    default <T> T withCategoryKeyReference(Function<CategoryKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryKeyReference>";
            }
        };
    }
}
