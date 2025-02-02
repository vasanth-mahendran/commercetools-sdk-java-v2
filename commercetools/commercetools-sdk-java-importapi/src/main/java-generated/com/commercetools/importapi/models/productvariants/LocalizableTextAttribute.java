
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a localized text.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableTextAttribute localizableTextAttribute = LocalizableTextAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizableTextAttributeImpl.class)
public interface LocalizableTextAttribute extends Attribute {

    String LTEXT = "ltext";

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
    @JsonProperty("value")
    public LocalizedString getValue();

    public void setValue(final LocalizedString value);

    public static LocalizableTextAttribute of() {
        return new LocalizableTextAttributeImpl();
    }

    public static LocalizableTextAttribute of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeImpl instance = new LocalizableTextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizableTextAttributeBuilder builder() {
        return LocalizableTextAttributeBuilder.of();
    }

    public static LocalizableTextAttributeBuilder builder(final LocalizableTextAttribute template) {
        return LocalizableTextAttributeBuilder.of(template);
    }

    default <T> T withLocalizableTextAttribute(Function<LocalizableTextAttribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableTextAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableTextAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableTextAttribute>";
            }
        };
    }
}
