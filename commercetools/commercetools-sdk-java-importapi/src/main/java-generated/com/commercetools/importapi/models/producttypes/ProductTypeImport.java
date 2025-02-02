
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a ProductType to be imported that is persisted as a ProductType in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeImport productTypeImport = ProductTypeImport.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeImportImpl.class)
public interface ProductTypeImport extends ImportResource {

    /**
     *  <p>Maps to <code>ProductType.name</code>.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Maps to <code>ProductType.description</code>.</p>
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     */
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setAttributes(final AttributeDefinition... attributes);

    public void setAttributes(final List<AttributeDefinition> attributes);

    public static ProductTypeImport of() {
        return new ProductTypeImportImpl();
    }

    public static ProductTypeImport of(final ProductTypeImport template) {
        ProductTypeImportImpl instance = new ProductTypeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public static ProductTypeImportBuilder builder() {
        return ProductTypeImportBuilder.of();
    }

    public static ProductTypeImportBuilder builder(final ProductTypeImport template) {
        return ProductTypeImportBuilder.of(template);
    }

    default <T> T withProductTypeImport(Function<ProductTypeImport, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeImport>";
            }
        };
    }
}
