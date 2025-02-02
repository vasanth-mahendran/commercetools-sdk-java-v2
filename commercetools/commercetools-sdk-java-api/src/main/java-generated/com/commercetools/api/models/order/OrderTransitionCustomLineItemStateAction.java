
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderTransitionCustomLineItemStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderTransitionCustomLineItemStateAction orderTransitionCustomLineItemStateAction = OrderTransitionCustomLineItemStateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderTransitionCustomLineItemStateActionImpl.class)
public interface OrderTransitionCustomLineItemStateAction extends OrderUpdateAction {

    String TRANSITION_CUSTOM_LINE_ITEM_STATE = "transitionCustomLineItemState";

    /**
     *
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();

    /**
     *  <p>ResourceIdentifier to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();

    /**
     *
     */

    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateResourceIdentifier fromState);

    public void setToState(final StateResourceIdentifier toState);

    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static OrderTransitionCustomLineItemStateAction of() {
        return new OrderTransitionCustomLineItemStateActionImpl();
    }

    public static OrderTransitionCustomLineItemStateAction of(final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionImpl instance = new OrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    public static OrderTransitionCustomLineItemStateActionBuilder builder() {
        return OrderTransitionCustomLineItemStateActionBuilder.of();
    }

    public static OrderTransitionCustomLineItemStateActionBuilder builder(
            final OrderTransitionCustomLineItemStateAction template) {
        return OrderTransitionCustomLineItemStateActionBuilder.of(template);
    }

    default <T> T withOrderTransitionCustomLineItemStateAction(
            Function<OrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderTransitionCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderTransitionCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderTransitionCustomLineItemStateAction>";
            }
        };
    }
}
