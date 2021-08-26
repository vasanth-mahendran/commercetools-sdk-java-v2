
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetDescriptionActionBuilder implements Builder<MyShoppingListSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public MyShoppingListSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public MyShoppingListSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public MyShoppingListSetDescriptionAction build() {
        return new MyShoppingListSetDescriptionActionImpl(description);
    }

    /**
     * builds MyShoppingListSetDescriptionAction without checking for non null required values
     */
    public MyShoppingListSetDescriptionAction buildUnchecked() {
        return new MyShoppingListSetDescriptionActionImpl(description);
    }

    public static MyShoppingListSetDescriptionActionBuilder of() {
        return new MyShoppingListSetDescriptionActionBuilder();
    }

    public static MyShoppingListSetDescriptionActionBuilder of(final MyShoppingListSetDescriptionAction template) {
        MyShoppingListSetDescriptionActionBuilder builder = new MyShoppingListSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
