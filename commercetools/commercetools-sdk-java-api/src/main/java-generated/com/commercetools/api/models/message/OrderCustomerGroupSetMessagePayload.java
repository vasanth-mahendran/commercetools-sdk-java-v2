
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerGroupSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerGroupSetMessagePayload orderCustomerGroupSetMessagePayload = OrderCustomerGroupSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomerGroupSetMessagePayloadImpl.class)
public interface OrderCustomerGroupSetMessagePayload extends OrderMessagePayload {

    String ORDER_CUSTOMER_GROUP_SET = "OrderCustomerGroupSet";

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    public static OrderCustomerGroupSetMessagePayload of() {
        return new OrderCustomerGroupSetMessagePayloadImpl();
    }

    public static OrderCustomerGroupSetMessagePayload of(final OrderCustomerGroupSetMessagePayload template) {
        OrderCustomerGroupSetMessagePayloadImpl instance = new OrderCustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public static OrderCustomerGroupSetMessagePayloadBuilder builder() {
        return OrderCustomerGroupSetMessagePayloadBuilder.of();
    }

    public static OrderCustomerGroupSetMessagePayloadBuilder builder(
            final OrderCustomerGroupSetMessagePayload template) {
        return OrderCustomerGroupSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomerGroupSetMessagePayload(Function<OrderCustomerGroupSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerGroupSetMessagePayload>";
            }
        };
    }
}
