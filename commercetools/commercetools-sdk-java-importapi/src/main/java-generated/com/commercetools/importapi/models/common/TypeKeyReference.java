
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a type by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeKeyReference typeKeyReference = TypeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeKeyReferenceImpl.class)
public interface TypeKeyReference extends KeyReference {

    String TYPE = "type";

    public static TypeKeyReference of() {
        return new TypeKeyReferenceImpl();
    }

    public static TypeKeyReference of(final TypeKeyReference template) {
        TypeKeyReferenceImpl instance = new TypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TypeKeyReferenceBuilder builder() {
        return TypeKeyReferenceBuilder.of();
    }

    public static TypeKeyReferenceBuilder builder(final TypeKeyReference template) {
        return TypeKeyReferenceBuilder.of(template);
    }

    default <T> T withTypeKeyReference(Function<TypeKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<TypeKeyReference>";
            }
        };
    }
}
