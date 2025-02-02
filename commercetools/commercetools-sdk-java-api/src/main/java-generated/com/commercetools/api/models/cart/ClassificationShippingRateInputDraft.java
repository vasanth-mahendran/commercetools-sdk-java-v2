
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ClassificationShippingRateInputDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInputDraft classificationShippingRateInputDraft = ClassificationShippingRateInputDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ClassificationShippingRateInputDraftImpl.class)
public interface ClassificationShippingRateInputDraft extends ShippingRateInputDraft {

    String CLASSIFICATION = "Classification";

    /**
     *
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ClassificationShippingRateInputDraft of() {
        return new ClassificationShippingRateInputDraftImpl();
    }

    public static ClassificationShippingRateInputDraft of(final ClassificationShippingRateInputDraft template) {
        ClassificationShippingRateInputDraftImpl instance = new ClassificationShippingRateInputDraftImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ClassificationShippingRateInputDraftBuilder builder() {
        return ClassificationShippingRateInputDraftBuilder.of();
    }

    public static ClassificationShippingRateInputDraftBuilder builder(
            final ClassificationShippingRateInputDraft template) {
        return ClassificationShippingRateInputDraftBuilder.of(template);
    }

    default <T> T withClassificationShippingRateInputDraft(Function<ClassificationShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInputDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ClassificationShippingRateInputDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ClassificationShippingRateInputDraft>";
            }
        };
    }
}
