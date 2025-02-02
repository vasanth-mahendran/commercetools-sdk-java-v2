
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDeletedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDeletedMessage productDeletedMessage = ProductDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .currentProjection(currentProjectionBuilder -> currentProjectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDeletedMessageImpl.class)
public interface ProductDeletedMessage extends Message {

    String PRODUCT_DELETED = "ProductDeleted";

    /**
     *
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("currentProjection")
    public ProductProjection getCurrentProjection();

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public void setCurrentProjection(final ProductProjection currentProjection);

    public static ProductDeletedMessage of() {
        return new ProductDeletedMessageImpl();
    }

    public static ProductDeletedMessage of(final ProductDeletedMessage template) {
        ProductDeletedMessageImpl instance = new ProductDeletedMessageImpl();
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
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setCurrentProjection(template.getCurrentProjection());
        return instance;
    }

    public static ProductDeletedMessageBuilder builder() {
        return ProductDeletedMessageBuilder.of();
    }

    public static ProductDeletedMessageBuilder builder(final ProductDeletedMessage template) {
        return ProductDeletedMessageBuilder.of(template);
    }

    default <T> T withProductDeletedMessage(Function<ProductDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDeletedMessage>";
            }
        };
    }
}
