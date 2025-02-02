
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderReturnInfoAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReturnInfoAddedMessagePayload orderReturnInfoAddedMessagePayload = OrderReturnInfoAddedMessagePayload.builder()
 *             .returnInfo(returnInfoBuilder -> returnInfoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderReturnInfoAddedMessagePayloadBuilder implements Builder<OrderReturnInfoAddedMessagePayload> {

    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    /**
     *
     */

    public OrderReturnInfoAddedMessagePayloadBuilder returnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderReturnInfoAddedMessagePayloadBuilder returnInfo(
            final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public com.commercetools.api.models.order.ReturnInfo getReturnInfo() {
        return this.returnInfo;
    }

    public OrderReturnInfoAddedMessagePayload build() {
        Objects.requireNonNull(returnInfo, OrderReturnInfoAddedMessagePayload.class + ": returnInfo is missing");
        return new OrderReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    /**
     * builds OrderReturnInfoAddedMessagePayload without checking for non null required values
     */
    public OrderReturnInfoAddedMessagePayload buildUnchecked() {
        return new OrderReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder of() {
        return new OrderReturnInfoAddedMessagePayloadBuilder();
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder of(final OrderReturnInfoAddedMessagePayload template) {
        OrderReturnInfoAddedMessagePayloadBuilder builder = new OrderReturnInfoAddedMessagePayloadBuilder();
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
