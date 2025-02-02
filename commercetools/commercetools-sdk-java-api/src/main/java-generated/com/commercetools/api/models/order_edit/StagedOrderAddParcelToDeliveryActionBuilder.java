
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddParcelToDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddParcelToDeliveryAction stagedOrderAddParcelToDeliveryAction = StagedOrderAddParcelToDeliveryAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddParcelToDeliveryActionBuilder implements Builder<StagedOrderAddParcelToDeliveryAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public StagedOrderAddParcelToDeliveryActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public StagedOrderAddParcelToDeliveryAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderAddParcelToDeliveryAction.class + ": deliveryId is missing");
        return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, measurements, trackingData, items);
    }

    /**
     * builds StagedOrderAddParcelToDeliveryAction without checking for non null required values
     */
    public StagedOrderAddParcelToDeliveryAction buildUnchecked() {
        return new StagedOrderAddParcelToDeliveryActionImpl(deliveryId, measurements, trackingData, items);
    }

    public static StagedOrderAddParcelToDeliveryActionBuilder of() {
        return new StagedOrderAddParcelToDeliveryActionBuilder();
    }

    public static StagedOrderAddParcelToDeliveryActionBuilder of(final StagedOrderAddParcelToDeliveryAction template) {
        StagedOrderAddParcelToDeliveryActionBuilder builder = new StagedOrderAddParcelToDeliveryActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        return builder;
    }

}
