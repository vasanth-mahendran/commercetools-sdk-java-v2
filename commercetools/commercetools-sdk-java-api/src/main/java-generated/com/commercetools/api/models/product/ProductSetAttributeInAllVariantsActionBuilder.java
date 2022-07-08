
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAttributeInAllVariantsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAttributeInAllVariantsAction productSetAttributeInAllVariantsAction = ProductSetAttributeInAllVariantsAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAttributeInAllVariantsActionBuilder implements Builder<ProductSetAttributeInAllVariantsAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The name of the Attribute to set.</p>
     */

    public ProductSetAttributeInAllVariantsActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
     */

    public ProductSetAttributeInAllVariantsActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     */

    public ProductSetAttributeInAllVariantsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetAttributeInAllVariantsAction build() {
        Objects.requireNonNull(name, ProductSetAttributeInAllVariantsAction.class + ": name is missing");
        return new ProductSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    /**
     * builds ProductSetAttributeInAllVariantsAction without checking for non null required values
     */
    public ProductSetAttributeInAllVariantsAction buildUnchecked() {
        return new ProductSetAttributeInAllVariantsActionImpl(name, value, staged);
    }

    public static ProductSetAttributeInAllVariantsActionBuilder of() {
        return new ProductSetAttributeInAllVariantsActionBuilder();
    }

    public static ProductSetAttributeInAllVariantsActionBuilder of(
            final ProductSetAttributeInAllVariantsAction template) {
        ProductSetAttributeInAllVariantsActionBuilder builder = new ProductSetAttributeInAllVariantsActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
