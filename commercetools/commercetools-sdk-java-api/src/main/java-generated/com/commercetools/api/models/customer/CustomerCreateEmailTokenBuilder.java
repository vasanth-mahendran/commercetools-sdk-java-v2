
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreateEmailTokenBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCreateEmailToken customerCreateEmailToken = CustomerCreateEmailToken.builder()
 *             .id("{id}")
 *             .ttlMinutes(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCreateEmailTokenBuilder implements Builder<CustomerCreateEmailToken> {

    private String id;

    @Nullable
    private Long version;

    private Long ttlMinutes;

    /**
     *  <p>Unique identifier of the email token.</p>
     */

    public CustomerCreateEmailTokenBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public CustomerCreateEmailTokenBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public CustomerCreateEmailTokenBuilder ttlMinutes(final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    public CustomerCreateEmailToken build() {
        Objects.requireNonNull(id, CustomerCreateEmailToken.class + ": id is missing");
        Objects.requireNonNull(ttlMinutes, CustomerCreateEmailToken.class + ": ttlMinutes is missing");
        return new CustomerCreateEmailTokenImpl(id, version, ttlMinutes);
    }

    /**
     * builds CustomerCreateEmailToken without checking for non null required values
     */
    public CustomerCreateEmailToken buildUnchecked() {
        return new CustomerCreateEmailTokenImpl(id, version, ttlMinutes);
    }

    public static CustomerCreateEmailTokenBuilder of() {
        return new CustomerCreateEmailTokenBuilder();
    }

    public static CustomerCreateEmailTokenBuilder of(final CustomerCreateEmailToken template) {
        CustomerCreateEmailTokenBuilder builder = new CustomerCreateEmailTokenBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.ttlMinutes = template.getTtlMinutes();
        return builder;
    }

}
