
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelection
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelection productVariantSelection = ProductVariantSelection.builder()
 *             .type("{type}")
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionImpl.class)
public interface ProductVariantSelection {

    /**
     *  <p>One of the values <code>inclusion</code>, or <code>exclusion</code>, that determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Non-empty array of SKUs</p>
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    public void setType(final String type);

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static ProductVariantSelection of() {
        return new ProductVariantSelectionImpl();
    }

    public static ProductVariantSelection of(final ProductVariantSelection template) {
        ProductVariantSelectionImpl instance = new ProductVariantSelectionImpl();
        instance.setType(template.getType());
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static ProductVariantSelectionBuilder builder() {
        return ProductVariantSelectionBuilder.of();
    }

    public static ProductVariantSelectionBuilder builder(final ProductVariantSelection template) {
        return ProductVariantSelectionBuilder.of(template);
    }

    default <T> T withProductVariantSelection(Function<ProductVariantSelection, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelection>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelection>";
            }
        };
    }
}
