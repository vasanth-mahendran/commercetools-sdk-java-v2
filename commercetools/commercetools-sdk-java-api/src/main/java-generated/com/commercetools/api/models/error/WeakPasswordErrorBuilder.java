
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * WeakPasswordErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     WeakPasswordError weakPasswordError = WeakPasswordError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class WeakPasswordErrorBuilder implements Builder<WeakPasswordError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *
     */

    public WeakPasswordErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *
     */

    public WeakPasswordErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *
     */

    public WeakPasswordErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public WeakPasswordError build() {
        Objects.requireNonNull(message, WeakPasswordError.class + ": message is missing");
        Objects.requireNonNull(values, WeakPasswordError.class + ": values are missing");
        return new WeakPasswordErrorImpl(message, values);
    }

    /**
     * builds WeakPasswordError without checking for non null required values
     */
    public WeakPasswordError buildUnchecked() {
        return new WeakPasswordErrorImpl(message, values);
    }

    public static WeakPasswordErrorBuilder of() {
        return new WeakPasswordErrorBuilder();
    }

    public static WeakPasswordErrorBuilder of(final WeakPasswordError template) {
        WeakPasswordErrorBuilder builder = new WeakPasswordErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
