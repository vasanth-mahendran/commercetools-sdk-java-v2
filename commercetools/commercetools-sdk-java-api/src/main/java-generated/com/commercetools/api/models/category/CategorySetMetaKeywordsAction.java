
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
 * CategorySetMetaKeywordsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaKeywordsAction categorySetMetaKeywordsAction = CategorySetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaKeywordsActionImpl.class)
public interface CategorySetMetaKeywordsAction extends CategoryUpdateAction {

    String SET_META_KEYWORDS = "setMetaKeywords";

    /**
     *  <p>Value to set.</p>
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public static CategorySetMetaKeywordsAction of() {
        return new CategorySetMetaKeywordsActionImpl();
    }

    public static CategorySetMetaKeywordsAction of(final CategorySetMetaKeywordsAction template) {
        CategorySetMetaKeywordsActionImpl instance = new CategorySetMetaKeywordsActionImpl();
        instance.setMetaKeywords(template.getMetaKeywords());
        return instance;
    }

    public static CategorySetMetaKeywordsActionBuilder builder() {
        return CategorySetMetaKeywordsActionBuilder.of();
    }

    public static CategorySetMetaKeywordsActionBuilder builder(final CategorySetMetaKeywordsAction template) {
        return CategorySetMetaKeywordsActionBuilder.of(template);
    }

    default <T> T withCategorySetMetaKeywordsAction(Function<CategorySetMetaKeywordsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaKeywordsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaKeywordsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetMetaKeywordsAction>";
            }
        };
    }
}
