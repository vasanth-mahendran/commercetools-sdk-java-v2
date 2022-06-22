
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionType productVariantSelectionType = ProductVariantSelectionType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductVariantSelectionType {

    /**
     *  <p>The following type of Product Variant Selections is supported:</p>
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    default <T> T withProductVariantSelectionType(Function<ProductVariantSelectionType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionType>";
            }
        };
    }
}
