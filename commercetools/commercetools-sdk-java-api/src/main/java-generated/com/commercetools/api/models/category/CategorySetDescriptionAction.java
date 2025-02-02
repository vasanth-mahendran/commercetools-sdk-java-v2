
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
 * CategorySetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetDescriptionAction categorySetDescriptionAction = CategorySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetDescriptionActionImpl.class)
public interface CategorySetDescriptionAction extends CategoryUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static CategorySetDescriptionAction of() {
        return new CategorySetDescriptionActionImpl();
    }

    public static CategorySetDescriptionAction of(final CategorySetDescriptionAction template) {
        CategorySetDescriptionActionImpl instance = new CategorySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static CategorySetDescriptionActionBuilder builder() {
        return CategorySetDescriptionActionBuilder.of();
    }

    public static CategorySetDescriptionActionBuilder builder(final CategorySetDescriptionAction template) {
        return CategorySetDescriptionActionBuilder.of(template);
    }

    default <T> T withCategorySetDescriptionAction(Function<CategorySetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetDescriptionAction>";
            }
        };
    }
}
