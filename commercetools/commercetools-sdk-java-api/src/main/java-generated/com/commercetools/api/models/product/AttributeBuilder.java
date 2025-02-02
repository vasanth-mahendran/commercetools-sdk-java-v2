
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attribute attribute = Attribute.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeBuilder implements Builder<Attribute> {

    private String name;

    private java.lang.Object value;

    /**
     *
     */

    public AttributeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A valid JSON value, based on an AttributeDefinition.</p>
     */

    public AttributeBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public Attribute build() {
        Objects.requireNonNull(name, Attribute.class + ": name is missing");
        Objects.requireNonNull(value, Attribute.class + ": value is missing");
        return new AttributeImpl(name, value);
    }

    /**
     * builds Attribute without checking for non null required values
     */
    public Attribute buildUnchecked() {
        return new AttributeImpl(name, value);
    }

    public static AttributeBuilder of() {
        return new AttributeBuilder();
    }

    public static AttributeBuilder of(final Attribute template) {
        AttributeBuilder builder = new AttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
