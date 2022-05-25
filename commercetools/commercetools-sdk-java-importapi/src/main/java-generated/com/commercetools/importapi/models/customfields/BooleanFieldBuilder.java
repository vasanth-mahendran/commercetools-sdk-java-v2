
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BooleanFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanField booleanField = BooleanField.builder()
 *             .value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BooleanFieldBuilder implements Builder<BooleanField> {

    private Boolean value;

    /**
     *
     */

    public BooleanFieldBuilder value(final Boolean value) {
        this.value = value;
        return this;
    }

    public Boolean getValue() {
        return this.value;
    }

    public BooleanField build() {
        Objects.requireNonNull(value, BooleanField.class + ": value is missing");
        return new BooleanFieldImpl(value);
    }

    /**
     * builds BooleanField without checking for non null required values
     */
    public BooleanField buildUnchecked() {
        return new BooleanFieldImpl(value);
    }

    public static BooleanFieldBuilder of() {
        return new BooleanFieldBuilder();
    }

    public static BooleanFieldBuilder of(final BooleanField template) {
        BooleanFieldBuilder builder = new BooleanFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
