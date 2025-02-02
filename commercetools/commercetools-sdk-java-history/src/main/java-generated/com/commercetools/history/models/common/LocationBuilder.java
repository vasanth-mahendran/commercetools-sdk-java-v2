
package com.commercetools.history.models.common;

import java.util.*;

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
 *             .state("{state}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocationBuilder implements Builder<Location> {

    private String country;

    private String state;

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public LocationBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *
     */

    public LocationBuilder state(final String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    public String getState() {
        return this.state;
    }

    public Location build() {
        Objects.requireNonNull(country, Location.class + ": country is missing");
        Objects.requireNonNull(state, Location.class + ": state is missing");
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
