
package com.commercetools.importapi.models.orders;

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
 * ClassificationShippingRateInput
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInput classificationShippingRateInput = ClassificationShippingRateInput.builder()
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ClassificationShippingRateInputImpl.class)
public interface ClassificationShippingRateInput extends ShippingRateInput {

    String CLASSIFICATION = "Classification";

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

    public static ClassificationShippingRateInput of() {
        return new ClassificationShippingRateInputImpl();
    }

    public static ClassificationShippingRateInput of(final ClassificationShippingRateInput template) {
        ClassificationShippingRateInputImpl instance = new ClassificationShippingRateInputImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static ClassificationShippingRateInputBuilder builder() {
        return ClassificationShippingRateInputBuilder.of();
    }

    public static ClassificationShippingRateInputBuilder builder(final ClassificationShippingRateInput template) {
        return ClassificationShippingRateInputBuilder.of(template);
    }

    default <T> T withClassificationShippingRateInput(Function<ClassificationShippingRateInput, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ClassificationShippingRateInput>";
            }
        };
    }
}
