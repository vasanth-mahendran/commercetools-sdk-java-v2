
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTimeType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeTimeType attributeTimeType = AttributeTimeType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeTimeTypeImpl.class)
public interface AttributeTimeType extends AttributeType {

    String TIME = "time";

    public static AttributeTimeType of() {
        return new AttributeTimeTypeImpl();
    }

    public static AttributeTimeType of(final AttributeTimeType template) {
        AttributeTimeTypeImpl instance = new AttributeTimeTypeImpl();
        return instance;
    }

    public static AttributeTimeTypeBuilder builder() {
        return AttributeTimeTypeBuilder.of();
    }

    public static AttributeTimeTypeBuilder builder(final AttributeTimeType template) {
        return AttributeTimeTypeBuilder.of(template);
    }

    default <T> T withAttributeTimeType(Function<AttributeTimeType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeTimeType>";
            }
        };
    }
}
