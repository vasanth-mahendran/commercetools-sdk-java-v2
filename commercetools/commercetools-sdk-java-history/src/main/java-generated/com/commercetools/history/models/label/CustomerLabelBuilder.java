
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLabel customerLabel = CustomerLabel.builder()
 *             .firstName("{firstName}")
 *             .lastName("{lastName}")
 *             .customerNumber("{customerNumber}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerLabelBuilder implements Builder<CustomerLabel> {

    private String firstName;

    private String lastName;

    private String customerNumber;

    /**
     *
     */

    public CustomerLabelBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *
     */

    public CustomerLabelBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *
     */

    public CustomerLabelBuilder customerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public CustomerLabel build() {
        Objects.requireNonNull(firstName, CustomerLabel.class + ": firstName is missing");
        Objects.requireNonNull(lastName, CustomerLabel.class + ": lastName is missing");
        Objects.requireNonNull(customerNumber, CustomerLabel.class + ": customerNumber is missing");
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }

    /**
     * builds CustomerLabel without checking for non null required values
     */
    public CustomerLabel buildUnchecked() {
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }

    public static CustomerLabelBuilder of() {
        return new CustomerLabelBuilder();
    }

    public static CustomerLabelBuilder of(final CustomerLabel template) {
        CustomerLabelBuilder builder = new CustomerLabelBuilder();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.customerNumber = template.getCustomerNumber();
        return builder;
    }

}
