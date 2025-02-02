
package com.commercetools.api.models.custom_object;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectBuilder
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
public class CustomObjectBuilder implements Builder<CustomObject> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String container;

    private String key;

    private java.lang.Object value;

    /**
     *  <p>Unique identifier of the CustomObject.</p>
     */

    public CustomObjectBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the CustomObject.</p>
     */

    public CustomObjectBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomObject was initially created.</p>
     */

    public CustomObjectBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CustomObject was last updated.</p>
     */

    public CustomObjectBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomObjectBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomObjectBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomObjectBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomObjectBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Namespace to group CustomObjects.</p>
     */

    public CustomObjectBuilder container(final String container) {
        this.container = container;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     */

    public CustomObjectBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>JSON standard types Number, String, Boolean, Array, Object, and common API data types. For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</p>
     */

    public CustomObjectBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public String getContainer() {
        return this.container;
    }

    public String getKey() {
        return this.key;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public CustomObject build() {
        Objects.requireNonNull(id, CustomObject.class + ": id is missing");
        Objects.requireNonNull(version, CustomObject.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomObject.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomObject.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(container, CustomObject.class + ": container is missing");
        Objects.requireNonNull(key, CustomObject.class + ": key is missing");
        Objects.requireNonNull(value, CustomObject.class + ": value is missing");
        return new CustomObjectImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, container, key,
            value);
    }

    /**
     * builds CustomObject without checking for non null required values
     */
    public CustomObject buildUnchecked() {
        return new CustomObjectImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, container, key,
            value);
    }

    public static CustomObjectBuilder of() {
        return new CustomObjectBuilder();
    }

    public static CustomObjectBuilder of(final CustomObject template) {
        CustomObjectBuilder builder = new CustomObjectBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.container = template.getContainer();
        builder.key = template.getKey();
        builder.value = template.getValue();
        return builder;
    }

}
