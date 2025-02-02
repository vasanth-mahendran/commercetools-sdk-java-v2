
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetDescriptionAction shoppingListSetDescriptionAction = ShoppingListSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetDescriptionActionBuilder implements Builder<ShoppingListSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *
     */

    public ShoppingListSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ShoppingListSetDescriptionAction build() {
        return new ShoppingListSetDescriptionActionImpl(description);
    }

    /**
     * builds ShoppingListSetDescriptionAction without checking for non null required values
     */
    public ShoppingListSetDescriptionAction buildUnchecked() {
        return new ShoppingListSetDescriptionActionImpl(description);
    }

    public static ShoppingListSetDescriptionActionBuilder of() {
        return new ShoppingListSetDescriptionActionBuilder();
    }

    public static ShoppingListSetDescriptionActionBuilder of(final ShoppingListSetDescriptionAction template) {
        ShoppingListSetDescriptionActionBuilder builder = new ShoppingListSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
