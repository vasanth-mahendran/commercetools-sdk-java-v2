package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.order_edit.StagedOrderAddParcelToDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderAddParcelToDeliveryActionImpl.class)
public interface StagedOrderAddParcelToDeliveryAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();
    
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();
    
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setDeliveryId(final String deliveryId);
    
    public void setMeasurements(final ParcelMeasurements measurements);
    
    public void setTrackingData(final TrackingData trackingData);
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);

    public static StagedOrderAddParcelToDeliveryAction of(){
        return new StagedOrderAddParcelToDeliveryActionImpl();
    }
    

    public static StagedOrderAddParcelToDeliveryAction of(final StagedOrderAddParcelToDeliveryAction template) {
        StagedOrderAddParcelToDeliveryActionImpl instance = new StagedOrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public static StagedOrderAddParcelToDeliveryActionBuilder builder(){
        return StagedOrderAddParcelToDeliveryActionBuilder.of();
    }
    
    public static StagedOrderAddParcelToDeliveryActionBuilder builder(final StagedOrderAddParcelToDeliveryAction template){
        return StagedOrderAddParcelToDeliveryActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderAddParcelToDeliveryAction(Function<StagedOrderAddParcelToDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
