
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Zone.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneReference zoneReference = ZoneReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneReferenceImpl.class)
public interface ZoneReference extends Reference, com.commercetools.api.models.Identifiable<Zone> {

    String ZONE = "zone";

    /**
     *  <p>Contains the representation of the expanded Zone. Only present in responses to requests with Reference Expansion for Zones.</p>
     */
    @Valid
    @JsonProperty("obj")
    public Zone getObj();

    /**
     *  <p>Unique identifier of the referenced Zone.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Zone obj);

    public void setId(final String id);

    public static ZoneReference of() {
        return new ZoneReferenceImpl();
    }

    public static ZoneReference of(final ZoneReference template) {
        ZoneReferenceImpl instance = new ZoneReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ZoneReferenceBuilder builder() {
        return ZoneReferenceBuilder.of();
    }

    public static ZoneReferenceBuilder builder(final ZoneReference template) {
        return ZoneReferenceBuilder.of(template);
    }

    default <T> T withZoneReference(Function<ZoneReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneReference>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneReference>";
            }
        };
    }
}
