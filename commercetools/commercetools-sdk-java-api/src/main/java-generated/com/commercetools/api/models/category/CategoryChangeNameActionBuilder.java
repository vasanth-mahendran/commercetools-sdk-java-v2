
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeNameAction categoryChangeNameAction = CategoryChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeNameActionBuilder implements Builder<CategoryChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public CategoryChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public CategoryChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public CategoryChangeNameAction build() {
        Objects.requireNonNull(name, CategoryChangeNameAction.class + ": name is missing");
        return new CategoryChangeNameActionImpl(name);
    }

    /**
     * builds CategoryChangeNameAction without checking for non null required values
     */
    public CategoryChangeNameAction buildUnchecked() {
        return new CategoryChangeNameActionImpl(name);
    }

    public static CategoryChangeNameActionBuilder of() {
        return new CategoryChangeNameActionBuilder();
    }

    public static CategoryChangeNameActionBuilder of(final CategoryChangeNameAction template) {
        CategoryChangeNameActionBuilder builder = new CategoryChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
