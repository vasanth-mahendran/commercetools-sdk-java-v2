
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.productdrafts.ProductDraftImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The request body to import ProductDrafts. Contains data for Products to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraftImportRequest productDraftImportRequest = ProductDraftImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDraftImportRequestImpl.class)
public interface ProductDraftImportRequest extends ImportRequest {

    String PRODUCT_DRAFT = "product-draft";

    /**
     *  <p>The product draft import resources of this request.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductDraftImport> getResources();

    @JsonIgnore
    public void setResources(final ProductDraftImport... resources);

    public void setResources(final List<ProductDraftImport> resources);

    public static ProductDraftImportRequest of() {
        return new ProductDraftImportRequestImpl();
    }

    public static ProductDraftImportRequest of(final ProductDraftImportRequest template) {
        ProductDraftImportRequestImpl instance = new ProductDraftImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static ProductDraftImportRequestBuilder builder() {
        return ProductDraftImportRequestBuilder.of();
    }

    public static ProductDraftImportRequestBuilder builder(final ProductDraftImportRequest template) {
        return ProductDraftImportRequestBuilder.of(template);
    }

    default <T> T withProductDraftImportRequest(Function<ProductDraftImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDraftImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDraftImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDraftImportRequest>";
            }
        };
    }
}
