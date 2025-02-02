
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductUnpublishedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUnpublishedMessage productUnpublishedMessage = ProductUnpublishedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishedMessageImpl.class)
public interface ProductUnpublishedMessage extends Message {

    String PRODUCT_UNPUBLISHED = "ProductUnpublished";

    public static ProductUnpublishedMessage of() {
        return new ProductUnpublishedMessageImpl();
    }

    public static ProductUnpublishedMessage of(final ProductUnpublishedMessage template) {
        ProductUnpublishedMessageImpl instance = new ProductUnpublishedMessageImpl();
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
        return instance;
    }

    public static ProductUnpublishedMessageBuilder builder() {
        return ProductUnpublishedMessageBuilder.of();
    }

    public static ProductUnpublishedMessageBuilder builder(final ProductUnpublishedMessage template) {
        return ProductUnpublishedMessageBuilder.of(template);
    }

    default <T> T withProductUnpublishedMessage(Function<ProductUnpublishedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUnpublishedMessage>";
            }
        };
    }
}
