
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemReturnItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemReturnItem customLineItemReturnItem = CustomLineItemReturnItem.builder()
 *             .id("{id}")
 *             .quantity(0.3)
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemReturnItemBuilder implements Builder<CustomLineItemReturnItem> {

    private String id;

    private Long quantity;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    private String customLineItemId;

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     */

    public CustomLineItemReturnItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Custom Fields of this return item.</p>
     */

    public CustomLineItemReturnItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of this return item.</p>
     */

    public CustomLineItemReturnItemBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public CustomLineItemReturnItemBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public CustomLineItemReturnItem build() {
        Objects.requireNonNull(id, CustomLineItemReturnItem.class + ": id is missing");
        Objects.requireNonNull(quantity, CustomLineItemReturnItem.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, CustomLineItemReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, CustomLineItemReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, CustomLineItemReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, CustomLineItemReturnItem.class + ": createdAt is missing");
        Objects.requireNonNull(customLineItemId, CustomLineItemReturnItem.class + ": customLineItemId is missing");
        return new CustomLineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, custom,
            lastModifiedAt, createdAt, customLineItemId);
    }

    /**
     * builds CustomLineItemReturnItem without checking for non null required values
     */
    public CustomLineItemReturnItem buildUnchecked() {
        return new CustomLineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, custom,
            lastModifiedAt, createdAt, customLineItemId);
    }

    public static CustomLineItemReturnItemBuilder of() {
        return new CustomLineItemReturnItemBuilder();
    }

    public static CustomLineItemReturnItemBuilder of(final CustomLineItemReturnItem template) {
        CustomLineItemReturnItemBuilder builder = new CustomLineItemReturnItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.custom = template.getCustom();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
