
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeoJsonPoint
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeoJsonPoint geoJsonPoint = GeoJsonPoint.builder()
 *             .plusCoordinates(coordinatesBuilder -> coordinatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GeoJsonPointImpl.class)
public interface GeoJsonPoint extends GeoJson {

    String POINT = "Point";

    /**
     *  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>
     */
    @NotNull
    @JsonProperty("coordinates")
    public List<Double> getCoordinates();

    @JsonIgnore
    public void setCoordinates(final Double... coordinates);

    public void setCoordinates(final List<Double> coordinates);

    public static GeoJsonPoint of() {
        return new GeoJsonPointImpl();
    }

    public static GeoJsonPoint of(final GeoJsonPoint template) {
        GeoJsonPointImpl instance = new GeoJsonPointImpl();
        instance.setCoordinates(template.getCoordinates());
        return instance;
    }

    public static GeoJsonPointBuilder builder() {
        return GeoJsonPointBuilder.of();
    }

    public static GeoJsonPointBuilder builder(final GeoJsonPoint template) {
        return GeoJsonPointBuilder.of(template);
    }

    default <T> T withGeoJsonPoint(Function<GeoJsonPoint, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GeoJsonPoint> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeoJsonPoint>() {
            @Override
            public String toString() {
                return "TypeReference<GeoJsonPoint>";
            }
        };
    }
}
