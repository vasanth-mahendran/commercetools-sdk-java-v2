
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Location location = Location.builder()
 *             .country("{country}")
 *             .state("{state}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocationImpl.class)
public interface Location {

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *
     */
    @NotNull
    @JsonProperty("state")
    public String getState();

    public void setCountry(final String country);

    public void setState(final String state);

    public static Location of() {
        return new LocationImpl();
    }

    public static Location of(final Location template) {
        LocationImpl instance = new LocationImpl();
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    public static LocationBuilder builder() {
        return LocationBuilder.of();
    }

    public static LocationBuilder builder(final Location template) {
        return LocationBuilder.of(template);
    }

    default <T> T withLocation(Function<Location, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Location> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Location>() {
            @Override
            public String toString() {
                return "TypeReference<Location>";
            }
        };
    }
}
