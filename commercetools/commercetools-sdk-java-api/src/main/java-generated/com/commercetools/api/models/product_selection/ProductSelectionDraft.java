
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDraft productSelectionDraft = ProductSelectionDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionDraftImpl.class)
public interface ProductSelectionDraft extends com.commercetools.api.models.CustomizableDraft<ProductSelectionDraft> {

    /**
     *  <p>User-defined unique identifier for the ProductSelection.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ProductSelection. Not checked for uniqueness, but distinct names are recommended.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    public void setCustom(final CustomFieldsDraft custom);

    public static ProductSelectionDraft of() {
        return new ProductSelectionDraftImpl();
    }

    public static ProductSelectionDraft of(final ProductSelectionDraft template) {
        ProductSelectionDraftImpl instance = new ProductSelectionDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ProductSelectionDraftBuilder builder() {
        return ProductSelectionDraftBuilder.of();
    }

    public static ProductSelectionDraftBuilder builder(final ProductSelectionDraft template) {
        return ProductSelectionDraftBuilder.of(template);
    }

    default <T> T withProductSelectionDraft(Function<ProductSelectionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionDraft>";
            }
        };
    }
}
