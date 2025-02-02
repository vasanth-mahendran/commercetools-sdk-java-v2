
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductVariant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantDeletedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDeletedMessage productVariantDeletedMessage = ProductVariantDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variant(variantBuilder -> variantBuilder)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantDeletedMessageImpl.class)
public interface ProductVariantDeletedMessage extends Message {

    String PRODUCT_VARIANT_DELETED = "ProductVariantDeleted";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    public void setVariant(final ProductVariant variant);

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public static ProductVariantDeletedMessage of() {
        return new ProductVariantDeletedMessageImpl();
    }

    public static ProductVariantDeletedMessage of(final ProductVariantDeletedMessage template) {
        ProductVariantDeletedMessageImpl instance = new ProductVariantDeletedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVariant(template.getVariant());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    public static ProductVariantDeletedMessageBuilder builder() {
        return ProductVariantDeletedMessageBuilder.of();
    }

    public static ProductVariantDeletedMessageBuilder builder(final ProductVariantDeletedMessage template) {
        return ProductVariantDeletedMessageBuilder.of(template);
    }

    default <T> T withProductVariantDeletedMessage(Function<ProductVariantDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantDeletedMessage>";
            }
        };
    }
}
