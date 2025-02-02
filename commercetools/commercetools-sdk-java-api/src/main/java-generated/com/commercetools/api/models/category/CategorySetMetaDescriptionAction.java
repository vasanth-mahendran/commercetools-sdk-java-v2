
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetMetaDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaDescriptionAction categorySetMetaDescriptionAction = CategorySetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaDescriptionActionImpl.class)
public interface CategorySetMetaDescriptionAction extends CategoryUpdateAction {

    String SET_META_DESCRIPTION = "setMetaDescription";

    /**
     *  <p>Value to set.</p>
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    public void setMetaDescription(final LocalizedString metaDescription);

    public static CategorySetMetaDescriptionAction of() {
        return new CategorySetMetaDescriptionActionImpl();
    }

    public static CategorySetMetaDescriptionAction of(final CategorySetMetaDescriptionAction template) {
        CategorySetMetaDescriptionActionImpl instance = new CategorySetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        return instance;
    }

    public static CategorySetMetaDescriptionActionBuilder builder() {
        return CategorySetMetaDescriptionActionBuilder.of();
    }

    public static CategorySetMetaDescriptionActionBuilder builder(final CategorySetMetaDescriptionAction template) {
        return CategorySetMetaDescriptionActionBuilder.of(template);
    }

    default <T> T withCategorySetMetaDescriptionAction(Function<CategorySetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetMetaDescriptionAction>";
            }
        };
    }
}
