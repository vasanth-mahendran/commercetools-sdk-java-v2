
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImportRequest productImportRequest = ProductImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductImportRequestBuilder implements Builder<ProductImportRequest> {

    private java.util.List<com.commercetools.importapi.models.products.ProductImport> resources;

    /**
     *  <p>The product import resources of this request.</p>
     */

    public ProductImportRequestBuilder resources(
            final com.commercetools.importapi.models.products.ProductImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The product import resources of this request.</p>
     */

    public ProductImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.products.ProductImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The product import resources of this request.</p>
     */

    public ProductImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.products.ProductImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The product import resources of this request.</p>
     */

    public ProductImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.products.ProductImportBuilder, com.commercetools.importapi.models.products.ProductImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.products.ProductImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product import resources of this request.</p>
     */

    public ProductImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.products.ProductImportBuilder, com.commercetools.importapi.models.products.ProductImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.products.ProductImportBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.products.ProductImport> getResources() {
        return this.resources;
    }

    public ProductImportRequest build() {
        Objects.requireNonNull(resources, ProductImportRequest.class + ": resources is missing");
        return new ProductImportRequestImpl(resources);
    }

    /**
     * builds ProductImportRequest without checking for non null required values
     */
    public ProductImportRequest buildUnchecked() {
        return new ProductImportRequestImpl(resources);
    }

    public static ProductImportRequestBuilder of() {
        return new ProductImportRequestBuilder();
    }

    public static ProductImportRequestBuilder of(final ProductImportRequest template) {
        ProductImportRequestBuilder builder = new ProductImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
