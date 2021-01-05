package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresAddDistributionChannelsActionImpl;

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
@JsonDeserialize(as = StoresAddDistributionChannelsActionImpl.class)
public interface StoresAddDistributionChannelsAction extends StoreUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StoresAddDistributionChannelsAction of(){
        return new StoresAddDistributionChannelsActionImpl();
    }
    

    public static StoresAddDistributionChannelsAction of(final StoresAddDistributionChannelsAction template) {
        StoresAddDistributionChannelsActionImpl instance = new StoresAddDistributionChannelsActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StoresAddDistributionChannelsActionBuilder builder(){
        return StoresAddDistributionChannelsActionBuilder.of();
    }
    
    public static StoresAddDistributionChannelsActionBuilder builder(final StoresAddDistributionChannelsAction template){
        return StoresAddDistributionChannelsActionBuilder.of(template);
    }
    

    default <T> T withStoresAddDistributionChannelsAction(Function<StoresAddDistributionChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
