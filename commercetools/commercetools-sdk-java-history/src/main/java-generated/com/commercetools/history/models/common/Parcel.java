
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Parcel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Parcel parcel = Parcel.builder()
 *             .id("{id}")
 *             .createdAt("{createdAt}")
 *             .measurements(measurementsBuilder -> measurementsBuilder)
 *             .trackingData(trackingDataBuilder -> trackingDataBuilder)
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelImpl.class)
public interface Parcel {

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
    @JsonProperty("createdAt")
    public String getCreatedAt();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setId(final String id);

    public void setCreatedAt(final String createdAt);

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static Parcel of() {
        return new ParcelImpl();
    }

    public static Parcel of(final Parcel template) {
        ParcelImpl instance = new ParcelImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public static ParcelBuilder builder() {
        return ParcelBuilder.of();
    }

    public static ParcelBuilder builder(final Parcel template) {
        return ParcelBuilder.of(template);
    }

    default <T> T withParcel(Function<Parcel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Parcel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Parcel>() {
            @Override
            public String toString() {
                return "TypeReference<Parcel>";
            }
        };
    }
}
