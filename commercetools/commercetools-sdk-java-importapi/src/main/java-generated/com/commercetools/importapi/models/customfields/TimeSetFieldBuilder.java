
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TimeSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeSetField timeSetField = TimeSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeSetFieldBuilder implements Builder<TimeSetField> {

    private java.util.List<java.time.LocalTime> value;

    /**
     *
     */

    public TimeSetFieldBuilder value(final java.time.LocalTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     */

    public TimeSetFieldBuilder value(final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public TimeSetFieldBuilder plusValue(final java.time.LocalTime... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<java.time.LocalTime> getValue() {
        return this.value;
    }

    public TimeSetField build() {
        Objects.requireNonNull(value, TimeSetField.class + ": value is missing");
        return new TimeSetFieldImpl(value);
    }

    /**
     * builds TimeSetField without checking for non null required values
     */
    public TimeSetField buildUnchecked() {
        return new TimeSetFieldImpl(value);
    }

    public static TimeSetFieldBuilder of() {
        return new TimeSetFieldBuilder();
    }

    public static TimeSetFieldBuilder of(final TimeSetField template) {
        TimeSetFieldBuilder builder = new TimeSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
