
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Delivery delivery = Delivery.builder()
 *             .id("{id}")
 *             .createdAt("{createdAt}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryBuilder implements Builder<Delivery> {

    private String id;

    private String createdAt;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    @Nullable
    private com.commercetools.history.models.common.Address address;

    @Nullable
    private com.commercetools.history.models.common.CustomFields custom;

    /**
     *
     */

    public DeliveryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder items(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder plusItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder plusItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder parcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder parcels(final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder plusParcels(final com.commercetools.history.models.common.Parcel... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder plusParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder withParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public DeliveryBuilder address(@Nullable final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public DeliveryBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public DeliveryBuilder custom(@Nullable final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    @Nullable
    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public Delivery build() {
        Objects.requireNonNull(id, Delivery.class + ": id is missing");
        Objects.requireNonNull(createdAt, Delivery.class + ": createdAt is missing");
        Objects.requireNonNull(items, Delivery.class + ": items is missing");
        Objects.requireNonNull(parcels, Delivery.class + ": parcels is missing");
        return new DeliveryImpl(id, createdAt, items, parcels, address, custom);
    }

    /**
     * builds Delivery without checking for non null required values
     */
    public Delivery buildUnchecked() {
        return new DeliveryImpl(id, createdAt, items, parcels, address, custom);
    }

    public static DeliveryBuilder of() {
        return new DeliveryBuilder();
    }

    public static DeliveryBuilder of(final Delivery template) {
        DeliveryBuilder builder = new DeliveryBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        builder.items = template.getItems();
        builder.parcels = template.getParcels();
        builder.address = template.getAddress();
        builder.custom = template.getCustom();
        return builder;
    }

}
