package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresRemoveSupplyChannelsActionImpl;

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
@JsonDeserialize(as = StoresRemoveSupplyChannelsActionImpl.class)
public interface StoresRemoveSupplyChannelsAction extends StoreUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static StoresRemoveSupplyChannelsAction of(){
        return new StoresRemoveSupplyChannelsActionImpl();
    }
    

    public static StoresRemoveSupplyChannelsAction of(final StoresRemoveSupplyChannelsAction template) {
        StoresRemoveSupplyChannelsActionImpl instance = new StoresRemoveSupplyChannelsActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static StoresRemoveSupplyChannelsActionBuilder builder(){
        return StoresRemoveSupplyChannelsActionBuilder.of();
    }
    
    public static StoresRemoveSupplyChannelsActionBuilder builder(final StoresRemoveSupplyChannelsAction template){
        return StoresRemoveSupplyChannelsActionBuilder.of(template);
    }
    

    default <T> T withStoresRemoveSupplyChannelsAction(Function<StoresRemoveSupplyChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
