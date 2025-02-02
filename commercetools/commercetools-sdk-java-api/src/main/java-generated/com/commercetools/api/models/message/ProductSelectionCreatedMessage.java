
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionCreatedMessage productSelectionCreatedMessage = ProductSelectionCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionCreatedMessageImpl.class)
public interface ProductSelectionCreatedMessage extends Message {

    String PRODUCT_SELECTION_CREATED = "ProductSelectionCreated";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionType getProductSelection();

    public void setProductSelection(final ProductSelectionType productSelection);

    public static ProductSelectionCreatedMessage of() {
        return new ProductSelectionCreatedMessageImpl();
    }

    public static ProductSelectionCreatedMessage of(final ProductSelectionCreatedMessage template) {
        ProductSelectionCreatedMessageImpl instance = new ProductSelectionCreatedMessageImpl();
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
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    public static ProductSelectionCreatedMessageBuilder builder() {
        return ProductSelectionCreatedMessageBuilder.of();
    }

    public static ProductSelectionCreatedMessageBuilder builder(final ProductSelectionCreatedMessage template) {
        return ProductSelectionCreatedMessageBuilder.of(template);
    }

    default <T> T withProductSelectionCreatedMessage(Function<ProductSelectionCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionCreatedMessage>";
            }
        };
    }
}
