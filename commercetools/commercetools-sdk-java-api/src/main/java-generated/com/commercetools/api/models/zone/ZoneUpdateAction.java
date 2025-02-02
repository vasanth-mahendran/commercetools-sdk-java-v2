
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneUpdateAction zoneUpdateAction = ZoneUpdateAction.addLocationBuilder()
 *             location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneAddLocationActionImpl.class, name = ZoneAddLocationAction.ADD_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneChangeNameActionImpl.class, name = ZoneChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneRemoveLocationActionImpl.class, name = ZoneRemoveLocationAction.REMOVE_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetDescriptionActionImpl.class, name = ZoneSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetKeyActionImpl.class, name = ZoneSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ZoneUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ZoneUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ZoneUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ZoneUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.zone.ZoneAddLocationActionBuilder addLocationBuilder() {
        return com.commercetools.api.models.zone.ZoneAddLocationActionBuilder.of();
    }

    public static com.commercetools.api.models.zone.ZoneChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.zone.ZoneChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.zone.ZoneRemoveLocationActionBuilder removeLocationBuilder() {
        return com.commercetools.api.models.zone.ZoneRemoveLocationActionBuilder.of();
    }

    public static com.commercetools.api.models.zone.ZoneSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.zone.ZoneSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.zone.ZoneSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.zone.ZoneSetKeyActionBuilder.of();
    }

    default <T> T withZoneUpdateAction(Function<ZoneUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneUpdateAction>";
            }
        };
    }
}
