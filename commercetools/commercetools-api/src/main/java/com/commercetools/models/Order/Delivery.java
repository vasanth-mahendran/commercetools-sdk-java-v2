package com.commercetools.models.order;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.Parcel;
import java.time.ZonedDateTime;
import com.commercetools.models.order.DeliveryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DeliveryImpl.class)
public interface Delivery  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<DeliveryItem> getItems();
   
   @NotNull
   @Valid
   @JsonProperty("parcels")
   public List<Parcel> getParcels();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setId(final String id);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setItems(final List<DeliveryItem> items);
   
   public void setParcels(final List<Parcel> parcels);
   
   public void setAddress(final Address address);
   
   public static DeliveryImpl of(){
      return new DeliveryImpl();
   }
   

   public static DeliveryImpl of(final Delivery template) {
      DeliveryImpl instance = new DeliveryImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setAddress(template.getAddress());
      instance.setId(template.getId());
      instance.setItems(template.getItems());
      instance.setParcels(template.getParcels());
      return instance;
   }

}