
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.products.ProductImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The request body to import Products. Contains data for Products to be created or updated in a Project.</p>
 *
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
@JsonDeserialize(as = ProductImportRequestImpl.class)
public interface ProductImportRequest extends ImportRequest {

    String PRODUCT = "product";

    /**
     *  <p>The product import resources of this request.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductImport> getResources();

    @JsonIgnore
    public void setResources(final ProductImport... resources);

    public void setResources(final List<ProductImport> resources);

    public static ProductImportRequest of() {
        return new ProductImportRequestImpl();
    }

    public static ProductImportRequest of(final ProductImportRequest template) {
        ProductImportRequestImpl instance = new ProductImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static ProductImportRequestBuilder builder() {
        return ProductImportRequestBuilder.of();
    }

    public static ProductImportRequestBuilder builder(final ProductImportRequest template) {
        return ProductImportRequestBuilder.of(template);
    }

    default <T> T withProductImportRequest(Function<ProductImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImportRequest>";
            }
        };
    }
}
