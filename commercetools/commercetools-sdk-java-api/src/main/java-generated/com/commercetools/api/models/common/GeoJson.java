
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>GeoJSON Geometry represents a Geometry Object as defined in the GeoJSON standard.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeoJson geoJson = GeoJson.pointBuilder()
 *             plusCoordinates(coordinatesBuilder -> coordinatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.GeoJsonPointImpl.class, name = GeoJsonPoint.POINT) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = GeoJsonImpl.class, visible = true)
@JsonDeserialize(as = GeoJsonImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface GeoJson {

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.common.GeoJsonPointBuilder pointBuilder() {
        return com.commercetools.api.models.common.GeoJsonPointBuilder.of();
    }

    default <T> T withGeoJson(Function<GeoJson, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GeoJson> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeoJson>() {
            @Override
            public String toString() {
                return "TypeReference<GeoJson>";
            }
        };
    }
}
