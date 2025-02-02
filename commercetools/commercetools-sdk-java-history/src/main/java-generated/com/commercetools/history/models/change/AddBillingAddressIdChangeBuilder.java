
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddBillingAddressIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddBillingAddressIdChange addBillingAddressIdChange = AddBillingAddressIdChange.builder()
 *             .change("{change}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddBillingAddressIdChangeBuilder implements Builder<AddBillingAddressIdChange> {

    private String change;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    private com.commercetools.history.models.common.Address address;

    /**
     *  <p>Update action for <code>addBillingAddressId</code> action on customers.</p>
     */

    public AddBillingAddressIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public AddBillingAddressIdChangeBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public AddBillingAddressIdChange build() {
        Objects.requireNonNull(change, AddBillingAddressIdChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddBillingAddressIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddBillingAddressIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(address, AddBillingAddressIdChange.class + ": address is missing");
        return new AddBillingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    /**
     * builds AddBillingAddressIdChange without checking for non null required values
     */
    public AddBillingAddressIdChange buildUnchecked() {
        return new AddBillingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    public static AddBillingAddressIdChangeBuilder of() {
        return new AddBillingAddressIdChangeBuilder();
    }

    public static AddBillingAddressIdChangeBuilder of(final AddBillingAddressIdChange template) {
        AddBillingAddressIdChangeBuilder builder = new AddBillingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        builder.address = template.getAddress();
        return builder;
    }

}
