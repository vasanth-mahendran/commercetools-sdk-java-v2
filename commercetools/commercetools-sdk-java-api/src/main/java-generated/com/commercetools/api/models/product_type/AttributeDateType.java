
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateType attributeDateType = AttributeDateType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDateTypeImpl.class)
public interface AttributeDateType extends AttributeType {

    String DATE = "date";

    public static AttributeDateType of() {
        return new AttributeDateTypeImpl();
    }

    public static AttributeDateType of(final AttributeDateType template) {
        AttributeDateTypeImpl instance = new AttributeDateTypeImpl();
        return instance;
    }

    public static AttributeDateTypeBuilder builder() {
        return AttributeDateTypeBuilder.of();
    }

    public static AttributeDateTypeBuilder builder(final AttributeDateType template) {
        return AttributeDateTypeBuilder.of(template);
    }

    default <T> T withAttributeDateType(Function<AttributeDateType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDateType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDateType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDateType>";
            }
        };
    }
}
