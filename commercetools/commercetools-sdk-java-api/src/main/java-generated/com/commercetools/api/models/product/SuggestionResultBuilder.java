
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestionResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestionResult suggestionResult = SuggestionResult.builder()
 *             .plus/searchKeywords.[a-z]{2}(-[A-Z]{2})?/(/searchKeywords.[a-z]{2}(-[A-Z]{2})?/Builder -> /searchKeywords.[a-z]{2}(-[A-Z]{2})?/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestionResultBuilder implements Builder<SuggestionResult> {

    private Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values = new HashMap<>();

    /**
     *
     */

    public SuggestionResultBuilder values(
            final Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public SuggestionResultBuilder addValue(final String key,
            final java.util.List<com.commercetools.api.models.product.Suggestion> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> getValues() {
        return this.values;
    }

    public SuggestionResult build() {
        Objects.requireNonNull(values, SuggestionResult.class + ": values are missing");
        return new SuggestionResultImpl(values);
    }

    /**
     * builds SuggestionResult without checking for non null required values
     */
    public SuggestionResult buildUnchecked() {
        return new SuggestionResultImpl(values);
    }

    public static SuggestionResultBuilder of() {
        return new SuggestionResultBuilder();
    }

    public static SuggestionResultBuilder of(final SuggestionResult template) {
        SuggestionResultBuilder builder = new SuggestionResultBuilder();
        builder.values = template.values();
        return builder;
    }

}
