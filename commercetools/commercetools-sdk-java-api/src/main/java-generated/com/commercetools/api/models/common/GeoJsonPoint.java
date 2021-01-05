package com.commercetools.api.models.common;

import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.GeoJsonPointImpl;

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
@JsonDeserialize(as = GeoJsonPointImpl.class)
public interface GeoJsonPoint extends GeoJson {

    
    @NotNull
    @JsonProperty("coordinates")
    public List<Double> getCoordinates();

    @JsonIgnore
    public void setCoordinates(final Double ...coordinates);
    public void setCoordinates(final List<Double> coordinates);

    public static GeoJsonPoint of(){
        return new GeoJsonPointImpl();
    }
    

    public static GeoJsonPoint of(final GeoJsonPoint template) {
        GeoJsonPointImpl instance = new GeoJsonPointImpl();
        instance.setCoordinates(template.getCoordinates());
        return instance;
    }

    public static GeoJsonPointBuilder builder(){
        return GeoJsonPointBuilder.of();
    }
    
    public static GeoJsonPointBuilder builder(final GeoJsonPoint template){
        return GeoJsonPointBuilder.of(template);
    }
    

    default <T> T withGeoJsonPoint(Function<GeoJsonPoint, T> helper) {
        return helper.apply(this);
    }
}
