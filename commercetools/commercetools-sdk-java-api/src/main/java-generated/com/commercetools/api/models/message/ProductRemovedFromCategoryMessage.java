
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemovedFromCategoryMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovedFromCategoryMessage productRemovedFromCategoryMessage = ProductRemovedFromCategoryMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemovedFromCategoryMessageImpl.class)
public interface ProductRemovedFromCategoryMessage extends Message {

    String PRODUCT_REMOVED_FROM_CATEGORY = "ProductRemovedFromCategory";

    /**
     *  <p>Reference to a Category.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    /**
     *
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryReference category);

    public void setStaged(final Boolean staged);

    public static ProductRemovedFromCategoryMessage of() {
        return new ProductRemovedFromCategoryMessageImpl();
    }

    public static ProductRemovedFromCategoryMessage of(final ProductRemovedFromCategoryMessage template) {
        ProductRemovedFromCategoryMessageImpl instance = new ProductRemovedFromCategoryMessageImpl();
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
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemovedFromCategoryMessageBuilder builder() {
        return ProductRemovedFromCategoryMessageBuilder.of();
    }

    public static ProductRemovedFromCategoryMessageBuilder builder(final ProductRemovedFromCategoryMessage template) {
        return ProductRemovedFromCategoryMessageBuilder.of(template);
    }

    default <T> T withProductRemovedFromCategoryMessage(Function<ProductRemovedFromCategoryMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemovedFromCategoryMessage>";
            }
        };
    }
}
