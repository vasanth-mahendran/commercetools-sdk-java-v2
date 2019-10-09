package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.TrackingData;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelTrackingDataUpdatedMessagePayloadImpl implements ParcelTrackingDataUpdatedMessagePayload {

   private String type;
   
   private String deliveryId;
   
   private com.commercetools.models.order.TrackingData trackingData;
   
   private String parcelId;

   @JsonCreator
   ParcelTrackingDataUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("trackingData") final com.commercetools.models.order.TrackingData trackingData, @JsonProperty("parcelId") final String parcelId) {
      this.deliveryId = deliveryId;
      this.trackingData = trackingData;
      this.parcelId = parcelId;
      this.type = "ParcelTrackingDataUpdated";
   }
   public ParcelTrackingDataUpdatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public com.commercetools.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setTrackingData(final com.commercetools.models.order.TrackingData trackingData){
      this.trackingData = trackingData;
   }
   
   public void setParcelId(final String parcelId){
      this.parcelId = parcelId;
   }

}