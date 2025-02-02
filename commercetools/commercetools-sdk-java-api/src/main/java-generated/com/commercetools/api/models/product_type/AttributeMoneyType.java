
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeMoneyType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeMoneyType attributeMoneyType = AttributeMoneyType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeMoneyTypeImpl.class)
public interface AttributeMoneyType extends AttributeType {

    String MONEY = "money";

    public static AttributeMoneyType of() {
        return new AttributeMoneyTypeImpl();
    }

    public static AttributeMoneyType of(final AttributeMoneyType template) {
        AttributeMoneyTypeImpl instance = new AttributeMoneyTypeImpl();
        return instance;
    }

    public static AttributeMoneyTypeBuilder builder() {
        return AttributeMoneyTypeBuilder.of();
    }

    public static AttributeMoneyTypeBuilder builder(final AttributeMoneyType template) {
        return AttributeMoneyTypeBuilder.of(template);
    }

    default <T> T withAttributeMoneyType(Function<AttributeMoneyType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeMoneyType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeMoneyType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeMoneyType>";
            }
        };
    }
}
