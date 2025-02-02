
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObject
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObject customObject = CustomObject.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .container("{container}")
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomObjectImpl.class)
public interface CustomObject extends BaseResource, com.commercetools.api.models.DomainResource<CustomObject>,
        com.commercetools.api.models.Referencable<CustomObject> {

    /**
     *  <p>Unique identifier of the CustomObject.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the CustomObject.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the CustomObject was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the CustomObject was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Namespace to group CustomObjects.</p>
     */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>JSON standard types Number, String, Boolean, Array, Object, and common API data types. For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</p>
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setContainer(final String container);

    public void setKey(final String key);

    public void setValue(final Object value);

    public static CustomObject of() {
        return new CustomObjectImpl();
    }

    public static CustomObject of(final CustomObject template) {
        CustomObjectImpl instance = new CustomObjectImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomObjectBuilder builder() {
        return CustomObjectBuilder.of();
    }

    public static CustomObjectBuilder builder(final CustomObject template) {
        return CustomObjectBuilder.of(template);
    }

    default <T> T withCustomObject(Function<CustomObject, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.custom_object.CustomObjectReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObject>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObject>";
            }
        };
    }
}
