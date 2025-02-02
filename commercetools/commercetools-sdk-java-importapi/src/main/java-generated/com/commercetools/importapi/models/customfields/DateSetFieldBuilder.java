
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DateSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateSetField dateSetField = DateSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateSetFieldBuilder implements Builder<DateSetField> {

    private java.util.List<java.time.LocalDate> value;

    /**
     *
     */

    public DateSetFieldBuilder value(final java.time.LocalDate... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     */

    public DateSetFieldBuilder value(final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public DateSetFieldBuilder plusValue(final java.time.LocalDate... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<java.time.LocalDate> getValue() {
        return this.value;
    }

    public DateSetField build() {
        Objects.requireNonNull(value, DateSetField.class + ": value is missing");
        return new DateSetFieldImpl(value);
    }

    /**
     * builds DateSetField without checking for non null required values
     */
    public DateSetField buildUnchecked() {
        return new DateSetFieldImpl(value);
    }

    public static DateSetFieldBuilder of() {
        return new DateSetFieldBuilder();
    }

    public static DateSetFieldBuilder of(final DateSetField template) {
        DateSetFieldBuilder builder = new DateSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
