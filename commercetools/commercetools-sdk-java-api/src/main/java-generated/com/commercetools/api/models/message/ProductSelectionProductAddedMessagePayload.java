
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionProductAddedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductAddedMessagePayload productSelectionProductAddedMessagePayload = ProductSelectionProductAddedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductAddedMessagePayloadImpl.class)
public interface ProductSelectionProductAddedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_PRODUCT_ADDED = "ProductSelectionProductAdded";

    /**
     *  <p>Reference to a Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    public void setProduct(final ProductReference product);

    public static ProductSelectionProductAddedMessagePayload of() {
        return new ProductSelectionProductAddedMessagePayloadImpl();
    }

    public static ProductSelectionProductAddedMessagePayload of(
            final ProductSelectionProductAddedMessagePayload template) {
        ProductSelectionProductAddedMessagePayloadImpl instance = new ProductSelectionProductAddedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder builder() {
        return ProductSelectionProductAddedMessagePayloadBuilder.of();
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder builder(
            final ProductSelectionProductAddedMessagePayload template) {
        return ProductSelectionProductAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionProductAddedMessagePayload(
            Function<ProductSelectionProductAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductAddedMessagePayload>";
            }
        };
    }
}
