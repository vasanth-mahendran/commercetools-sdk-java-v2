
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveDiscountCodeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDiscountCodeChange removeDiscountCodeChange = RemoveDiscountCodeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveDiscountCodeChangeBuilder implements Builder<RemoveDiscountCodeChange> {

    private String change;

    private com.commercetools.history.models.common.DiscountCodeInfo previousValue;

    /**
     *  <p>Update action for <code>removeDiscountCode</code></p>
     */

    public RemoveDiscountCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public RemoveDiscountCodeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountCodeInfoBuilder, com.commercetools.history.models.common.DiscountCodeInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountCodeInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public RemoveDiscountCodeChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountCodeInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.DiscountCodeInfo getPreviousValue() {
        return this.previousValue;
    }

    public RemoveDiscountCodeChange build() {
        Objects.requireNonNull(change, RemoveDiscountCodeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveDiscountCodeChange.class + ": previousValue is missing");
        return new RemoveDiscountCodeChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveDiscountCodeChange without checking for non null required values
     */
    public RemoveDiscountCodeChange buildUnchecked() {
        return new RemoveDiscountCodeChangeImpl(change, previousValue);
    }

    public static RemoveDiscountCodeChangeBuilder of() {
        return new RemoveDiscountCodeChangeBuilder();
    }

    public static RemoveDiscountCodeChangeBuilder of(final RemoveDiscountCodeChange template) {
        RemoveDiscountCodeChangeBuilder builder = new RemoveDiscountCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
