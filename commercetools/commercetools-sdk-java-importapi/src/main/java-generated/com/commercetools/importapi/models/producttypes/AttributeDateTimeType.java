
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateTimeType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateTimeType attributeDateTimeType = AttributeDateTimeType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDateTimeTypeImpl.class)
public interface AttributeDateTimeType extends AttributeType {

    String DATETIME = "datetime";

    public static AttributeDateTimeType of() {
        return new AttributeDateTimeTypeImpl();
    }

    public static AttributeDateTimeType of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeImpl instance = new AttributeDateTimeTypeImpl();
        return instance;
    }

    public static AttributeDateTimeTypeBuilder builder() {
        return AttributeDateTimeTypeBuilder.of();
    }

    public static AttributeDateTimeTypeBuilder builder(final AttributeDateTimeType template) {
        return AttributeDateTimeTypeBuilder.of(template);
    }

    default <T> T withAttributeDateTimeType(Function<AttributeDateTimeType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDateTimeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDateTimeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDateTimeType>";
            }
        };
    }
}
