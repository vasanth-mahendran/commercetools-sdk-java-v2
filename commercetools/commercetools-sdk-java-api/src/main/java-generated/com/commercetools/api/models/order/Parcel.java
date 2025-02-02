
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
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
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelImpl.class)
public interface Parcel extends com.commercetools.api.models.Customizable<Parcel> {

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>The delivery items contained in this parcel.</p>
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Custom Fields of this parcel.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setCustom(final CustomFields custom);

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
        instance.setCustom(template.getCustom());
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

    public default ParcelDraftBuilder toDraftBuilder() {
        return ParcelDraft.builder()
                .measurements(this.getMeasurements())
                .trackingData(this.getTrackingData())
                .items(this.getItems())
                .custom(this.getCustom().toDraft());
    }

    public default ParcelDraft toDraft() {
        return toDraftBuilder().build();
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
