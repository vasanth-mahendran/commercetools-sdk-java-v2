
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDateOfBirthSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDateOfBirthSetMessagePayload customerDateOfBirthSetMessagePayload = CustomerDateOfBirthSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDateOfBirthSetMessagePayloadBuilder implements Builder<CustomerDateOfBirthSetMessagePayload> {

    @Nullable
    private java.time.LocalDate dateOfBirth;

    /**
     *
     */

    public CustomerDateOfBirthSetMessagePayloadBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public CustomerDateOfBirthSetMessagePayload build() {
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }

    /**
     * builds CustomerDateOfBirthSetMessagePayload without checking for non null required values
     */
    public CustomerDateOfBirthSetMessagePayload buildUnchecked() {
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder of() {
        return new CustomerDateOfBirthSetMessagePayloadBuilder();
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadBuilder builder = new CustomerDateOfBirthSetMessagePayloadBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
