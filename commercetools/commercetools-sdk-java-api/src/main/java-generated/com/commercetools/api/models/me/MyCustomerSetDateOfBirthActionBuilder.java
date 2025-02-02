
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetDateOfBirthActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetDateOfBirthAction myCustomerSetDateOfBirthAction = MyCustomerSetDateOfBirthAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetDateOfBirthActionBuilder implements Builder<MyCustomerSetDateOfBirthAction> {

    @Nullable
    private java.time.LocalDate dateOfBirth;

    /**
     *
     */

    public MyCustomerSetDateOfBirthActionBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public MyCustomerSetDateOfBirthAction build() {
        return new MyCustomerSetDateOfBirthActionImpl(dateOfBirth);
    }

    /**
     * builds MyCustomerSetDateOfBirthAction without checking for non null required values
     */
    public MyCustomerSetDateOfBirthAction buildUnchecked() {
        return new MyCustomerSetDateOfBirthActionImpl(dateOfBirth);
    }

    public static MyCustomerSetDateOfBirthActionBuilder of() {
        return new MyCustomerSetDateOfBirthActionBuilder();
    }

    public static MyCustomerSetDateOfBirthActionBuilder of(final MyCustomerSetDateOfBirthAction template) {
        MyCustomerSetDateOfBirthActionBuilder builder = new MyCustomerSetDateOfBirthActionBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
