
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeNumberType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNumberType attributeNumberType = AttributeNumberType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNumberTypeImpl.class)
public interface AttributeNumberType extends AttributeType {

    String NUMBER = "number";

    public static AttributeNumberType of() {
        return new AttributeNumberTypeImpl();
    }

    public static AttributeNumberType of(final AttributeNumberType template) {
        AttributeNumberTypeImpl instance = new AttributeNumberTypeImpl();
        return instance;
    }

    public static AttributeNumberTypeBuilder builder() {
        return AttributeNumberTypeBuilder.of();
    }

    public static AttributeNumberTypeBuilder builder(final AttributeNumberType template) {
        return AttributeNumberTypeBuilder.of(template);
    }

    default <T> T withAttributeNumberType(Function<AttributeNumberType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeNumberType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeNumberType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeNumberType>";
            }
        };
    }
}
