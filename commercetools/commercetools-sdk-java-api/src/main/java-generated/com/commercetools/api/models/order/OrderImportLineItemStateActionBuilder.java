
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportLineItemStateAction orderImportLineItemStateAction = OrderImportLineItemStateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderImportLineItemStateActionBuilder implements Builder<OrderImportLineItemStateAction> {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    /**
     *
     */

    public OrderImportLineItemStateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     */

    public OrderImportLineItemStateActionBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *
     */

    public OrderImportLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *
     */

    public OrderImportLineItemStateActionBuilder plusState(
            final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *
     */

    public OrderImportLineItemStateActionBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public OrderImportLineItemStateActionBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public OrderImportLineItemStateAction build() {
        Objects.requireNonNull(lineItemId, OrderImportLineItemStateAction.class + ": lineItemId is missing");
        Objects.requireNonNull(state, OrderImportLineItemStateAction.class + ": state is missing");
        return new OrderImportLineItemStateActionImpl(lineItemId, state);
    }

    /**
     * builds OrderImportLineItemStateAction without checking for non null required values
     */
    public OrderImportLineItemStateAction buildUnchecked() {
        return new OrderImportLineItemStateActionImpl(lineItemId, state);
    }

    public static OrderImportLineItemStateActionBuilder of() {
        return new OrderImportLineItemStateActionBuilder();
    }

    public static OrderImportLineItemStateActionBuilder of(final OrderImportLineItemStateAction template) {
        OrderImportLineItemStateActionBuilder builder = new OrderImportLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
