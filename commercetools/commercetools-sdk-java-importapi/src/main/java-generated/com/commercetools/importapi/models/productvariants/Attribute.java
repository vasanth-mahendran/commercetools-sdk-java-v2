
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents the value of an attribute of a product variant. The name and type property must match the name and type property of an attribute definition of the product type.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attribute attribute = Attribute.booleanBuilder()
 *             value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.BooleanAttributeImpl.class, name = BooleanAttribute.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.BooleanSetAttributeImpl.class, name = BooleanSetAttribute.BOOLEAN_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateAttributeImpl.class, name = DateAttribute.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateSetAttributeImpl.class, name = DateSetAttribute.DATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateTimeAttributeImpl.class, name = DateTimeAttribute.DATETIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateTimeSetAttributeImpl.class, name = DateTimeSetAttribute.DATETIME_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.EnumAttributeImpl.class, name = EnumAttribute.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.EnumSetAttributeImpl.class, name = EnumSetAttribute.ENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeImpl.class, name = LocalizableEnumAttribute.LENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeImpl.class, name = LocalizableEnumSetAttribute.LENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableTextAttributeImpl.class, name = LocalizableTextAttribute.LTEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeImpl.class, name = LocalizableTextSetAttribute.LTEXT_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.MoneyAttributeImpl.class, name = MoneyAttribute.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.MoneySetAttributeImpl.class, name = MoneySetAttribute.MONEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.NumberAttributeImpl.class, name = NumberAttribute.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.NumberSetAttributeImpl.class, name = NumberSetAttribute.NUMBER_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.ReferenceAttributeImpl.class, name = ReferenceAttribute.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.ReferenceSetAttributeImpl.class, name = ReferenceSetAttribute.REFERENCE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TextAttributeImpl.class, name = TextAttribute.TEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TextSetAttributeImpl.class, name = TextSetAttribute.TEXT_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TimeAttributeImpl.class, name = TimeAttribute.TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TimeSetAttributeImpl.class, name = TimeSetAttribute.TIME_SET) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = AttributeImpl.class, visible = true)
@JsonDeserialize(as = AttributeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Attribute {

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    @JsonProperty("name")
    public String getName();

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public void setName(final String name);

    public static com.commercetools.importapi.models.productvariants.BooleanAttributeBuilder booleanBuilder() {
        return com.commercetools.importapi.models.productvariants.BooleanAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.BooleanSetAttributeBuilder booleanSetBuilder() {
        return com.commercetools.importapi.models.productvariants.BooleanSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.DateAttributeBuilder dateBuilder() {
        return com.commercetools.importapi.models.productvariants.DateAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.DateSetAttributeBuilder dateSetBuilder() {
        return com.commercetools.importapi.models.productvariants.DateSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.DateTimeAttributeBuilder datetimeBuilder() {
        return com.commercetools.importapi.models.productvariants.DateTimeAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.DateTimeSetAttributeBuilder datetimeSetBuilder() {
        return com.commercetools.importapi.models.productvariants.DateTimeSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.EnumAttributeBuilder enumBuilder() {
        return com.commercetools.importapi.models.productvariants.EnumAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.EnumSetAttributeBuilder enumSetBuilder() {
        return com.commercetools.importapi.models.productvariants.EnumSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeBuilder lenumBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeBuilder lenumSetBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.LocalizableTextAttributeBuilder ltextBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableTextAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeBuilder ltextSetBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.MoneyAttributeBuilder moneyBuilder() {
        return com.commercetools.importapi.models.productvariants.MoneyAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.MoneySetAttributeBuilder moneySetBuilder() {
        return com.commercetools.importapi.models.productvariants.MoneySetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.NumberAttributeBuilder numberBuilder() {
        return com.commercetools.importapi.models.productvariants.NumberAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.NumberSetAttributeBuilder numberSetBuilder() {
        return com.commercetools.importapi.models.productvariants.NumberSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.ReferenceAttributeBuilder referenceBuilder() {
        return com.commercetools.importapi.models.productvariants.ReferenceAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.ReferenceSetAttributeBuilder referenceSetBuilder() {
        return com.commercetools.importapi.models.productvariants.ReferenceSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.TextAttributeBuilder textBuilder() {
        return com.commercetools.importapi.models.productvariants.TextAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.TextSetAttributeBuilder textSetBuilder() {
        return com.commercetools.importapi.models.productvariants.TextSetAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.TimeAttributeBuilder timeBuilder() {
        return com.commercetools.importapi.models.productvariants.TimeAttributeBuilder.of();
    }

    public static com.commercetools.importapi.models.productvariants.TimeSetAttributeBuilder timeSetBuilder() {
        return com.commercetools.importapi.models.productvariants.TimeSetAttributeBuilder.of();
    }

    default <T> T withAttribute(Function<Attribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Attribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Attribute>() {
            @Override
            public String toString() {
                return "TypeReference<Attribute>";
            }
        };
    }
}
