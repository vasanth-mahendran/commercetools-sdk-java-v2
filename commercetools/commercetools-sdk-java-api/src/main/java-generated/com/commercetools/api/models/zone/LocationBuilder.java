
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Location location = Location.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocationBuilder implements Builder<Location> {

    private String country;

    @Nullable
    private String state;

    /**
     *  <p>Country code of the geographic location.</p>
     */

    public LocationBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>State within the country.</p>
     */

    public LocationBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    public Location build() {
        Objects.requireNonNull(country, Location.class + ": country is missing");
        return new LocationImpl(country, state);
    }

    /**
     * builds Location without checking for non null required values
     */
    public Location buildUnchecked() {
        return new LocationImpl(country, state);
    }

    public static LocationBuilder of() {
        return new LocationBuilder();
    }

    public static LocationBuilder of(final Location template) {
        LocationBuilder builder = new LocationBuilder();
        builder.country = template.getCountry();
        builder.state = template.getState();
        return builder;
    }

}
