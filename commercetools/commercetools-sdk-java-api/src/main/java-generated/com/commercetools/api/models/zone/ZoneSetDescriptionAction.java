package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneSetDescriptionActionImpl;

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
@JsonDeserialize(as = ZoneSetDescriptionActionImpl.class)
public interface ZoneSetDescriptionAction extends ZoneUpdateAction {

    
    
    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ZoneSetDescriptionAction of(){
        return new ZoneSetDescriptionActionImpl();
    }
    

    public static ZoneSetDescriptionAction of(final ZoneSetDescriptionAction template) {
        ZoneSetDescriptionActionImpl instance = new ZoneSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ZoneSetDescriptionActionBuilder builder(){
        return ZoneSetDescriptionActionBuilder.of();
    }
    
    public static ZoneSetDescriptionActionBuilder builder(final ZoneSetDescriptionAction template){
        return ZoneSetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withZoneSetDescriptionAction(Function<ZoneSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
