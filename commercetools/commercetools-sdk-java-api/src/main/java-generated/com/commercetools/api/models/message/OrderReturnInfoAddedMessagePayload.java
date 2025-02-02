
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderReturnInfoAddedMessagePayload
 *
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
@JsonDeserialize(as = OrderReturnInfoAddedMessagePayloadImpl.class)
public interface OrderReturnInfoAddedMessagePayload extends OrderMessagePayload {

    String RETURN_INFO_ADDED = "ReturnInfoAdded";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("returnInfo")
    public ReturnInfo getReturnInfo();

    public void setReturnInfo(final ReturnInfo returnInfo);

    public static OrderReturnInfoAddedMessagePayload of() {
        return new OrderReturnInfoAddedMessagePayloadImpl();
    }

    public static OrderReturnInfoAddedMessagePayload of(final OrderReturnInfoAddedMessagePayload template) {
        OrderReturnInfoAddedMessagePayloadImpl instance = new OrderReturnInfoAddedMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder builder() {
        return OrderReturnInfoAddedMessagePayloadBuilder.of();
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder builder(final OrderReturnInfoAddedMessagePayload template) {
        return OrderReturnInfoAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderReturnInfoAddedMessagePayload(Function<OrderReturnInfoAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderReturnInfoAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReturnInfoAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReturnInfoAddedMessagePayload>";
            }
        };
    }
}
