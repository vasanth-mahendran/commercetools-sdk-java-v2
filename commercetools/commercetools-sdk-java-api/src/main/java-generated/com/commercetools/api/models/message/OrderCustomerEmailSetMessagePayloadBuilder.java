
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerEmailSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerEmailSetMessagePayload orderCustomerEmailSetMessagePayload = OrderCustomerEmailSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomerEmailSetMessagePayloadBuilder implements Builder<OrderCustomerEmailSetMessagePayload> {

    @Nullable
    private String email;

    @Nullable
    private String oldEmail;

    /**
     *
     */

    public OrderCustomerEmailSetMessagePayloadBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *
     */

    public OrderCustomerEmailSetMessagePayloadBuilder oldEmail(@Nullable final String oldEmail) {
        this.oldEmail = oldEmail;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    @Nullable
    public String getOldEmail() {
        return this.oldEmail;
    }

    public OrderCustomerEmailSetMessagePayload build() {
        return new OrderCustomerEmailSetMessagePayloadImpl(email, oldEmail);
    }

    /**
     * builds OrderCustomerEmailSetMessagePayload without checking for non null required values
     */
    public OrderCustomerEmailSetMessagePayload buildUnchecked() {
        return new OrderCustomerEmailSetMessagePayloadImpl(email, oldEmail);
    }

    public static OrderCustomerEmailSetMessagePayloadBuilder of() {
        return new OrderCustomerEmailSetMessagePayloadBuilder();
    }

    public static OrderCustomerEmailSetMessagePayloadBuilder of(final OrderCustomerEmailSetMessagePayload template) {
        OrderCustomerEmailSetMessagePayloadBuilder builder = new OrderCustomerEmailSetMessagePayloadBuilder();
        builder.email = template.getEmail();
        builder.oldEmail = template.getOldEmail();
        return builder;
    }

}
