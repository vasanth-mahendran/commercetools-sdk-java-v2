
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ClassificationShippingRateInputBuilder
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
public class ClassificationShippingRateInputBuilder implements Builder<ClassificationShippingRateInput> {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     *
     */

    public ClassificationShippingRateInputBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ClassificationShippingRateInputBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ClassificationShippingRateInputBuilder label(
            final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public ClassificationShippingRateInput build() {
        Objects.requireNonNull(key, ClassificationShippingRateInput.class + ": key is missing");
        Objects.requireNonNull(label, ClassificationShippingRateInput.class + ": label is missing");
        return new ClassificationShippingRateInputImpl(key, label);
    }

    /**
     * builds ClassificationShippingRateInput without checking for non null required values
     */
    public ClassificationShippingRateInput buildUnchecked() {
        return new ClassificationShippingRateInputImpl(key, label);
    }

    public static ClassificationShippingRateInputBuilder of() {
        return new ClassificationShippingRateInputBuilder();
    }

    public static ClassificationShippingRateInputBuilder of(final ClassificationShippingRateInput template) {
        ClassificationShippingRateInputBuilder builder = new ClassificationShippingRateInputBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
