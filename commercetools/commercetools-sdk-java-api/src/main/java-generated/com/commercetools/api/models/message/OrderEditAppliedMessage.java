
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditAppliedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditAppliedMessage orderEditAppliedMessage = OrderEditAppliedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .edit(editBuilder -> editBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditAppliedMessageImpl.class)
public interface OrderEditAppliedMessage extends OrderMessage {

    String ORDER_EDIT_APPLIED = "OrderEditApplied";

    /**
     *  <p>Reference to an OrderEdit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("edit")
    public OrderEditReference getEdit();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditApplied getResult();

    public void setEdit(final OrderEditReference edit);

    public void setResult(final OrderEditApplied result);

    public static OrderEditAppliedMessage of() {
        return new OrderEditAppliedMessageImpl();
    }

    public static OrderEditAppliedMessage of(final OrderEditAppliedMessage template) {
        OrderEditAppliedMessageImpl instance = new OrderEditAppliedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setEdit(template.getEdit());
        instance.setResult(template.getResult());
        return instance;
    }

    public static OrderEditAppliedMessageBuilder builder() {
        return OrderEditAppliedMessageBuilder.of();
    }

    public static OrderEditAppliedMessageBuilder builder(final OrderEditAppliedMessage template) {
        return OrderEditAppliedMessageBuilder.of(template);
    }

    default <T> T withOrderEditAppliedMessage(Function<OrderEditAppliedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditAppliedMessage>";
            }
        };
    }
}
