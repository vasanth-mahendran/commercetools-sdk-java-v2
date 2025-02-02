
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldDateTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldDateType customFieldDateType = CustomFieldDateType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldDateTypeBuilder implements Builder<CustomFieldDateType> {

    public CustomFieldDateType build() {
        return new CustomFieldDateTypeImpl();
    }

    /**
     * builds CustomFieldDateType without checking for non null required values
     */
    public CustomFieldDateType buildUnchecked() {
        return new CustomFieldDateTypeImpl();
    }

    public static CustomFieldDateTypeBuilder of() {
        return new CustomFieldDateTypeBuilder();
    }

    public static CustomFieldDateTypeBuilder of(final CustomFieldDateType template) {
        CustomFieldDateTypeBuilder builder = new CustomFieldDateTypeBuilder();
        return builder;
    }

}
