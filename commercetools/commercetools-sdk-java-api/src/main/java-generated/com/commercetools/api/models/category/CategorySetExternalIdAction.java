
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action sets a new ID that can be used as an additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetExternalIdAction categorySetExternalIdAction = CategorySetExternalIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetExternalIdActionImpl.class)
public interface CategorySetExternalIdAction extends CategoryUpdateAction {

    String SET_EXTERNAL_ID = "setExternalId";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("externalId")
    public String getExternalId();

    public void setExternalId(final String externalId);

    public static CategorySetExternalIdAction of() {
        return new CategorySetExternalIdActionImpl();
    }

    public static CategorySetExternalIdAction of(final CategorySetExternalIdAction template) {
        CategorySetExternalIdActionImpl instance = new CategorySetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public static CategorySetExternalIdActionBuilder builder() {
        return CategorySetExternalIdActionBuilder.of();
    }

    public static CategorySetExternalIdActionBuilder builder(final CategorySetExternalIdAction template) {
        return CategorySetExternalIdActionBuilder.of(template);
    }

    default <T> T withCategorySetExternalIdAction(Function<CategorySetExternalIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetExternalIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetExternalIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetExternalIdAction>";
            }
        };
    }
}
