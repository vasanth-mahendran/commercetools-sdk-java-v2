
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeDraft productTypeDraft = ProductTypeDraft.builder()
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeDraftBuilder implements Builder<ProductTypeDraft> {

    @Nullable
    private String key;

    private String name;

    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes;

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     */

    public ProductTypeDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ProductType.</p>
     */

    public ProductTypeDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the ProductType.</p>
     */

    public ProductTypeDraftBuilder description(final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     */

    public ProductTypeDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinitionDraft... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     */

    public ProductTypeDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     */

    public ProductTypeDraftBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinitionDraft... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     */

    public ProductTypeDraftBuilder plusAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     */

    public ProductTypeDraftBuilder withAttributes(
            Function<com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder, com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(
            builder.apply(com.commercetools.api.models.product_type.AttributeDefinitionDraftBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> getAttributes() {
        return this.attributes;
    }

    public ProductTypeDraft build() {
        Objects.requireNonNull(name, ProductTypeDraft.class + ": name is missing");
        Objects.requireNonNull(description, ProductTypeDraft.class + ": description is missing");
        return new ProductTypeDraftImpl(key, name, description, attributes);
    }

    /**
     * builds ProductTypeDraft without checking for non null required values
     */
    public ProductTypeDraft buildUnchecked() {
        return new ProductTypeDraftImpl(key, name, description, attributes);
    }

    public static ProductTypeDraftBuilder of() {
        return new ProductTypeDraftBuilder();
    }

    public static ProductTypeDraftBuilder of(final ProductTypeDraft template) {
        ProductTypeDraftBuilder builder = new ProductTypeDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
