
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerEmailAction stagedOrderSetCustomerEmailAction = StagedOrderSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomerEmailActionBuilder implements Builder<StagedOrderSetCustomerEmailAction> {

    @Nullable
    private String email;

    /**
     *
     */

    public StagedOrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public StagedOrderSetCustomerEmailAction build() {
        return new StagedOrderSetCustomerEmailActionImpl(email);
    }

    /**
     * builds StagedOrderSetCustomerEmailAction without checking for non null required values
     */
    public StagedOrderSetCustomerEmailAction buildUnchecked() {
        return new StagedOrderSetCustomerEmailActionImpl(email);
    }

    public static StagedOrderSetCustomerEmailActionBuilder of() {
        return new StagedOrderSetCustomerEmailActionBuilder();
    }

    public static StagedOrderSetCustomerEmailActionBuilder of(final StagedOrderSetCustomerEmailAction template) {
        StagedOrderSetCustomerEmailActionBuilder builder = new StagedOrderSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
