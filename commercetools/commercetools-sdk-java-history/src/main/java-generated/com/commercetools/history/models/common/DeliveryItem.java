
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItem deliveryItem = DeliveryItem.builder()
 *             .id("{id}")
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryItemImpl.class)
public interface DeliveryItem {

    /**
     *
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    public void setId(final String id);

    public void setQuantity(final Integer quantity);

    public static DeliveryItem of() {
        return new DeliveryItemImpl();
    }

    public static DeliveryItem of(final DeliveryItem template) {
        DeliveryItemImpl instance = new DeliveryItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static DeliveryItemBuilder builder() {
        return DeliveryItemBuilder.of();
    }

    public static DeliveryItemBuilder builder(final DeliveryItem template) {
        return DeliveryItemBuilder.of(template);
    }

    default <T> T withDeliveryItem(Function<DeliveryItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryItem>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryItem>";
            }
        };
    }
}
