
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeLocalizedEnumValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizedEnumValue attributeLocalizedEnumValue = AttributeLocalizedEnumValue.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizedEnumValueImpl.class)
public interface AttributeLocalizedEnumValue {

    /**
     *
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);

    public void setLabel(final LocalizedString label);

    public static AttributeLocalizedEnumValue of() {
        return new AttributeLocalizedEnumValueImpl();
    }

    public static AttributeLocalizedEnumValue of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueImpl instance = new AttributeLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static AttributeLocalizedEnumValueBuilder builder() {
        return AttributeLocalizedEnumValueBuilder.of();
    }

    public static AttributeLocalizedEnumValueBuilder builder(final AttributeLocalizedEnumValue template) {
        return AttributeLocalizedEnumValueBuilder.of(template);
    }

    default <T> T withAttributeLocalizedEnumValue(Function<AttributeLocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizedEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizedEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeLocalizedEnumValue>";
            }
        };
    }
}
