
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneAddLocationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneAddLocationAction zoneAddLocationAction = ZoneAddLocationAction.builder()
 *             .location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneAddLocationActionBuilder implements Builder<ZoneAddLocationAction> {

    private com.commercetools.api.models.zone.Location location;

    /**
     *  <p>Location to be added to the Zone.</p>
     */

    public ZoneAddLocationActionBuilder location(
            Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        this.location = builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Location to be added to the Zone.</p>
     */

    public ZoneAddLocationActionBuilder location(final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        return this;
    }

    public com.commercetools.api.models.zone.Location getLocation() {
        return this.location;
    }

    public ZoneAddLocationAction build() {
        Objects.requireNonNull(location, ZoneAddLocationAction.class + ": location is missing");
        return new ZoneAddLocationActionImpl(location);
    }

    /**
     * builds ZoneAddLocationAction without checking for non null required values
     */
    public ZoneAddLocationAction buildUnchecked() {
        return new ZoneAddLocationActionImpl(location);
    }

    public static ZoneAddLocationActionBuilder of() {
        return new ZoneAddLocationActionBuilder();
    }

    public static ZoneAddLocationActionBuilder of(final ZoneAddLocationAction template) {
        ZoneAddLocationActionBuilder builder = new ZoneAddLocationActionBuilder();
        builder.location = template.getLocation();
        return builder;
    }

}
