
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextAttribute textAttribute = TextAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextAttributeBuilder implements Builder<TextAttribute> {

    @Nullable
    private String name;

    private String value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public TextAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public TextAttributeBuilder value(final String value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public TextAttribute build() {
        Objects.requireNonNull(value, TextAttribute.class + ": value is missing");
        return new TextAttributeImpl(name, value);
    }

    /**
     * builds TextAttribute without checking for non null required values
     */
    public TextAttribute buildUnchecked() {
        return new TextAttributeImpl(name, value);
    }

    public static TextAttributeBuilder of() {
        return new TextAttributeBuilder();
    }

    public static TextAttributeBuilder of(final TextAttribute template) {
        TextAttributeBuilder builder = new TextAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
