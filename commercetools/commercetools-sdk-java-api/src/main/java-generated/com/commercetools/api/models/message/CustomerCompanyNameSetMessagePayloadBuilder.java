
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCompanyNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCompanyNameSetMessagePayload customerCompanyNameSetMessagePayload = CustomerCompanyNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCompanyNameSetMessagePayloadBuilder implements Builder<CustomerCompanyNameSetMessagePayload> {

    @Nullable
    private String companyName;

    /**
     *
     */

    public CustomerCompanyNameSetMessagePayloadBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    public CustomerCompanyNameSetMessagePayload build() {
        return new CustomerCompanyNameSetMessagePayloadImpl(companyName);
    }

    /**
     * builds CustomerCompanyNameSetMessagePayload without checking for non null required values
     */
    public CustomerCompanyNameSetMessagePayload buildUnchecked() {
        return new CustomerCompanyNameSetMessagePayloadImpl(companyName);
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder of() {
        return new CustomerCompanyNameSetMessagePayloadBuilder();
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder of(final CustomerCompanyNameSetMessagePayload template) {
        CustomerCompanyNameSetMessagePayloadBuilder builder = new CustomerCompanyNameSetMessagePayloadBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
