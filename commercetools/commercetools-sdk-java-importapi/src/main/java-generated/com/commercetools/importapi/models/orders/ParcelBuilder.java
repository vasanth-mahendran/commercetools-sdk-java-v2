
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.AddressBuilder;
import com.commercetools.importapi.models.customfields.CustomBuilder;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Parcel parcel = Parcel.builder()
 *             .id("{id}")
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelBuilder implements Builder<Parcel> {

    private String id;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    @Nullable
    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *
     */

    public ParcelBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public ParcelBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public ParcelBuilder measurements(
            Function<com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder, com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ParcelBuilder measurements(
            @Nullable final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *
     */

    public ParcelBuilder trackingData(
            Function<com.commercetools.importapi.models.orders.TrackingDataBuilder, com.commercetools.importapi.models.orders.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.importapi.models.orders.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ParcelBuilder trackingData(
            @Nullable final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *
     */

    public ParcelBuilder items(@Nullable final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     */

    public ParcelBuilder items(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *
     */

    public ParcelBuilder plusItems(@Nullable final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *
     */

    public ParcelBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ParcelBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The custom fields for this Customer.</p>
     */

    public ParcelBuilder custom(
            Function<CustomBuilder, CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields for this Customer.</p>
     */

    public ParcelBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public Parcel build() {
        Objects.requireNonNull(id, Parcel.class + ": id is missing");
        Objects.requireNonNull(createdAt, Parcel.class + ": createdAt is missing");
        return new ParcelImpl(id, createdAt, measurements, trackingData, items,custom);
    }

    /**
     * builds Parcel without checking for non null required values
     */
    public Parcel buildUnchecked() {
        return new ParcelImpl(id, createdAt, measurements, trackingData, items,custom);
    }

    public static ParcelBuilder of() {
        return new ParcelBuilder();
    }

    public static ParcelBuilder of(final Parcel template) {
        ParcelBuilder builder = new ParcelBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        builder.measurements = template.getMeasurements();
        builder.trackingData = template.getTrackingData();
        builder.items = template.getItems();
        builder.custom = template.getCustom();
        return builder;
    }

}
