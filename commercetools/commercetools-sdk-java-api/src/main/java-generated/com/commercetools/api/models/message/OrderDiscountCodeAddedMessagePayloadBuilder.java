
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDiscountCodeAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeAddedMessagePayload orderDiscountCodeAddedMessagePayload = OrderDiscountCodeAddedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderDiscountCodeAddedMessagePayloadBuilder implements Builder<OrderDiscountCodeAddedMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public OrderDiscountCodeAddedMessagePayloadBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public OrderDiscountCodeAddedMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public OrderDiscountCodeAddedMessagePayload build() {
        Objects.requireNonNull(discountCode, OrderDiscountCodeAddedMessagePayload.class + ": discountCode is missing");
        return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
    }

    /**
     * builds OrderDiscountCodeAddedMessagePayload without checking for non null required values
     */
    public OrderDiscountCodeAddedMessagePayload buildUnchecked() {
        return new OrderDiscountCodeAddedMessagePayloadImpl(discountCode);
    }

    public static OrderDiscountCodeAddedMessagePayloadBuilder of() {
        return new OrderDiscountCodeAddedMessagePayloadBuilder();
    }

    public static OrderDiscountCodeAddedMessagePayloadBuilder of(final OrderDiscountCodeAddedMessagePayload template) {
        OrderDiscountCodeAddedMessagePayloadBuilder builder = new OrderDiscountCodeAddedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
