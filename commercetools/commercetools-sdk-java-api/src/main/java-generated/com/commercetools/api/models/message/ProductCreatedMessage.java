
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
 * ProductCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCreatedMessage productCreatedMessage = ProductCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductCreatedMessageImpl.class)
public interface ProductCreatedMessage extends Message {

    String PRODUCT_CREATED = "ProductCreated";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    public void setProductProjection(final ProductProjection productProjection);

    public static ProductCreatedMessage of() {
        return new ProductCreatedMessageImpl();
    }

    public static ProductCreatedMessage of(final ProductCreatedMessage template) {
        ProductCreatedMessageImpl instance = new ProductCreatedMessageImpl();
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
        instance.setProductProjection(template.getProductProjection());
        return instance;
    }

    public static ProductCreatedMessageBuilder builder() {
        return ProductCreatedMessageBuilder.of();
    }

    public static ProductCreatedMessageBuilder builder(final ProductCreatedMessage template) {
        return ProductCreatedMessageBuilder.of(template);
    }

    default <T> T withProductCreatedMessage(Function<ProductCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductCreatedMessage>";
            }
        };
    }
}
