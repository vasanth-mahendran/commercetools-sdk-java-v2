
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a TaxCategory.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReference taxCategoryReference = TaxCategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryReferenceImpl.class)
public interface TaxCategoryReference extends Reference, com.commercetools.api.models.Identifiable<TaxCategory> {

    String TAX_CATEGORY = "tax-category";

    /**
     *  <p>Contains the representation of the expanded TaxCategory. Only present in responses to requests with Reference Expansion for TaxCategories.</p>
     */
    @Valid
    @JsonProperty("obj")
    public TaxCategory getObj();

    /**
     *  <p>Unique identifier of the referenced TaxCategory.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final TaxCategory obj);

    public void setId(final String id);

    public static TaxCategoryReference of() {
        return new TaxCategoryReferenceImpl();
    }

    public static TaxCategoryReference of(final TaxCategoryReference template) {
        TaxCategoryReferenceImpl instance = new TaxCategoryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static TaxCategoryReferenceBuilder builder() {
        return TaxCategoryReferenceBuilder.of();
    }

    public static TaxCategoryReferenceBuilder builder(final TaxCategoryReference template) {
        return TaxCategoryReferenceBuilder.of(template);
    }

    default <T> T withTaxCategoryReference(Function<TaxCategoryReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryReference>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryReference>";
            }
        };
    }
}
