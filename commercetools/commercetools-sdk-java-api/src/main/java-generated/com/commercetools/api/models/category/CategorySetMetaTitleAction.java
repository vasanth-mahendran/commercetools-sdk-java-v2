
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
 * CategorySetMetaTitleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaTitleAction categorySetMetaTitleAction = CategorySetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaTitleActionImpl.class)
public interface CategorySetMetaTitleAction extends CategoryUpdateAction {

    String SET_META_TITLE = "setMetaTitle";

    /**
     *  <p>Value to set.</p>
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    public void setMetaTitle(final LocalizedString metaTitle);

    public static CategorySetMetaTitleAction of() {
        return new CategorySetMetaTitleActionImpl();
    }

    public static CategorySetMetaTitleAction of(final CategorySetMetaTitleAction template) {
        CategorySetMetaTitleActionImpl instance = new CategorySetMetaTitleActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        return instance;
    }

    public static CategorySetMetaTitleActionBuilder builder() {
        return CategorySetMetaTitleActionBuilder.of();
    }

    public static CategorySetMetaTitleActionBuilder builder(final CategorySetMetaTitleAction template) {
        return CategorySetMetaTitleActionBuilder.of(template);
    }

    default <T> T withCategorySetMetaTitleAction(Function<CategorySetMetaTitleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetMetaTitleAction>";
            }
        };
    }
}
