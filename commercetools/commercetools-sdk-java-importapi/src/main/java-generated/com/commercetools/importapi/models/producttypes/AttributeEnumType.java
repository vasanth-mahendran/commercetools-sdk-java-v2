
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeEnumType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeEnumType attributeEnumType = AttributeEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeEnumTypeImpl.class)
public interface AttributeEnumType extends AttributeType {

    String ENUM = "enum";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributePlainEnumValue> getValues();

    @JsonIgnore
    public void setValues(final AttributePlainEnumValue... values);

    public void setValues(final List<AttributePlainEnumValue> values);

    public static AttributeEnumType of() {
        return new AttributeEnumTypeImpl();
    }

    public static AttributeEnumType of(final AttributeEnumType template) {
        AttributeEnumTypeImpl instance = new AttributeEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static AttributeEnumTypeBuilder builder() {
        return AttributeEnumTypeBuilder.of();
    }

    public static AttributeEnumTypeBuilder builder(final AttributeEnumType template) {
        return AttributeEnumTypeBuilder.of(template);
    }

    default <T> T withAttributeEnumType(Function<AttributeEnumType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeEnumType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeEnumType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeEnumType>";
            }
        };
    }
}
