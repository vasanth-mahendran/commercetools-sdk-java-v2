
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The request body to import ProductVariantPatches. The data to be imported are represented by ProductVariantPatch.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatchRequest productVariantPatchRequest = ProductVariantPatchRequest.builder()
 *             .plusPatches(patchesBuilder -> patchesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantPatchRequestImpl.class)
public interface ProductVariantPatchRequest extends ImportRequest {

    String PRODUCT_VARIANT_PATCH = "product-variant-patch";

    /**
     *  <p>The product variant patches of this request.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("patches")
    public List<ProductVariantPatch> getPatches();

    @JsonIgnore
    public void setPatches(final ProductVariantPatch... patches);

    public void setPatches(final List<ProductVariantPatch> patches);

    public static ProductVariantPatchRequest of() {
        return new ProductVariantPatchRequestImpl();
    }

    public static ProductVariantPatchRequest of(final ProductVariantPatchRequest template) {
        ProductVariantPatchRequestImpl instance = new ProductVariantPatchRequestImpl();
        instance.setPatches(template.getPatches());
        return instance;
    }

    public static ProductVariantPatchRequestBuilder builder() {
        return ProductVariantPatchRequestBuilder.of();
    }

    public static ProductVariantPatchRequestBuilder builder(final ProductVariantPatchRequest template) {
        return ProductVariantPatchRequestBuilder.of(template);
    }

    default <T> T withProductVariantPatchRequest(Function<ProductVariantPatchRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantPatchRequest>";
            }
        };
    }
}
