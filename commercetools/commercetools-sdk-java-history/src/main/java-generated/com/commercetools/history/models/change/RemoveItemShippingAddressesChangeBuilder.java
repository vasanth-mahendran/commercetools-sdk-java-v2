
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveItemShippingAddressesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveItemShippingAddressesChange removeItemShippingAddressesChange = RemoveItemShippingAddressesChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveItemShippingAddressesChangeBuilder implements Builder<RemoveItemShippingAddressesChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    /**
     *  <p>Update action for <code>removeItemShippingAddress</code></p>
     */

    public RemoveItemShippingAddressesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public RemoveItemShippingAddressesChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public RemoveItemShippingAddressesChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public RemoveItemShippingAddressesChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public RemoveItemShippingAddressesChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    public RemoveItemShippingAddressesChange build() {
        Objects.requireNonNull(change, RemoveItemShippingAddressesChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemoveItemShippingAddressesChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemoveItemShippingAddressesChange.class + ": previousValue is missing");
        return new RemoveItemShippingAddressesChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds RemoveItemShippingAddressesChange without checking for non null required values
     */
    public RemoveItemShippingAddressesChange buildUnchecked() {
        return new RemoveItemShippingAddressesChangeImpl(change, nextValue, previousValue);
    }

    public static RemoveItemShippingAddressesChangeBuilder of() {
        return new RemoveItemShippingAddressesChangeBuilder();
    }

    public static RemoveItemShippingAddressesChangeBuilder of(final RemoveItemShippingAddressesChange template) {
        RemoveItemShippingAddressesChangeBuilder builder = new RemoveItemShippingAddressesChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
