package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.message.ParcelItemsUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelItemsUpdatedMessagePayloadBuilder {
   
   @Nullable
   private String deliveryId;
   
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> oldItems;
   
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> items;
   
   
   private String parcelId;
   
   public ParcelItemsUpdatedMessagePayloadBuilder deliveryId(@Nullable final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelItemsUpdatedMessagePayloadBuilder oldItems( final java.util.List<com.commercetools.models.order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }
   
   public ParcelItemsUpdatedMessagePayloadBuilder items( final java.util.List<com.commercetools.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelItemsUpdatedMessagePayloadBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public ParcelItemsUpdatedMessagePayload build() {
       return new ParcelItemsUpdatedMessagePayloadImpl(deliveryId, oldItems, items, parcelId);
   }
   
   public static ParcelItemsUpdatedMessagePayloadBuilder of() {
      return new ParcelItemsUpdatedMessagePayloadBuilder();
   }
   
   public static ParcelItemsUpdatedMessagePayloadBuilder of(final ParcelItemsUpdatedMessagePayload template) {
      ParcelItemsUpdatedMessagePayloadBuilder builder = new ParcelItemsUpdatedMessagePayloadBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.oldItems = template.getOldItems();
      builder.items = template.getItems();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}