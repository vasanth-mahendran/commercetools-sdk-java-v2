
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAttributeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAttributeAction productSetAttributeAction = ProductSetAttributeAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAttributeActionBuilder implements Builder<ProductSetAttributeAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private String name;

    @Nullable
    private java.lang.Object value;

    @Nullable
    private Boolean staged;

    /**
     *
     */

    public ProductSetAttributeActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *
     */

    public ProductSetAttributeActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *
     */

    public ProductSetAttributeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If the attribute exists and the value is omitted or set to <code>null</code>, the attribute is removed. If the attribute exists and a value is provided, the new value is applied. If the attribute does not exist and a value is provided, it is added as a new attribute.</p>
     */

    public ProductSetAttributeActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public ProductSetAttributeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
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

    public ProductSetAttributeAction build() {
        Objects.requireNonNull(name, ProductSetAttributeAction.class + ": name is missing");
        return new ProductSetAttributeActionImpl(variantId, sku, name, value, staged);
    }

    /**
     * builds ProductSetAttributeAction without checking for non null required values
     */
    public ProductSetAttributeAction buildUnchecked() {
        return new ProductSetAttributeActionImpl(variantId, sku, name, value, staged);
    }

    public static ProductSetAttributeActionBuilder of() {
        return new ProductSetAttributeActionBuilder();
    }

    public static ProductSetAttributeActionBuilder of(final ProductSetAttributeAction template) {
        ProductSetAttributeActionBuilder builder = new ProductSetAttributeActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
