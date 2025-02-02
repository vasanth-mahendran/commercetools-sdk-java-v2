
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.Category;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryCreatedMessage categoryCreatedMessage = CategoryCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryCreatedMessageImpl.class)
public interface CategoryCreatedMessage extends Message {

    String CATEGORY_CREATED = "CategoryCreated";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public Category getCategory();

    public void setCategory(final Category category);

    public static CategoryCreatedMessage of() {
        return new CategoryCreatedMessageImpl();
    }

    public static CategoryCreatedMessage of(final CategoryCreatedMessage template) {
        CategoryCreatedMessageImpl instance = new CategoryCreatedMessageImpl();
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
        return instance;
    }

    public static CategoryCreatedMessageBuilder builder() {
        return CategoryCreatedMessageBuilder.of();
    }

    public static CategoryCreatedMessageBuilder builder(final CategoryCreatedMessage template) {
        return CategoryCreatedMessageBuilder.of(template);
    }

    default <T> T withCategoryCreatedMessage(Function<CategoryCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryCreatedMessage>";
            }
        };
    }
}
