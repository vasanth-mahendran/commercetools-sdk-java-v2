
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelection productSelection = ProductSelection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .productCount(0.3)
 *             .type(ProductSelectionTypeEnum.INDIVIDUAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionBuilder implements Builder<ProductSelection> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private Integer productCount;

    private com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the ProductSelection.</p>
     */

    public ProductSelectionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ProductSelection.</p>
     */

    public ProductSelectionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductSelection was initially created.</p>
     */

    public ProductSelectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductSelection was last updated.</p>
     */

    public ProductSelectionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     */

    public ProductSelectionBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     */

    public ProductSelectionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     */

    public ProductSelectionBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     */

    public ProductSelectionBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ProductSelection.</p>
     */

    public ProductSelectionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the ProductSelection.</p>
     */

    public ProductSelectionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ProductSelection.</p>
     */

    public ProductSelectionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Number of Products that are currently assigned to this ProductSelection.</p>
     */

    public ProductSelectionBuilder productCount(final Integer productCount) {
        this.productCount = productCount;
        return this;
    }

    /**
     *  <p>Specifies in which way the Products are assigned to the ProductSelection. Currently, the only way of doing this is to specify each Product individually. Hence, the type is fixed to <code>individual</code> for now, but we have plans to add other types in the future.</p>
     */

    public ProductSelectionBuilder type(
            final com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     */

    public ProductSelectionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     */

    public ProductSelectionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getProductCount() {
        return this.productCount;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionTypeEnum getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public ProductSelection build() {
        Objects.requireNonNull(id, ProductSelection.class + ": id is missing");
        Objects.requireNonNull(version, ProductSelection.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductSelection.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductSelection.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ProductSelection.class + ": name is missing");
        Objects.requireNonNull(productCount, ProductSelection.class + ": productCount is missing");
        Objects.requireNonNull(type, ProductSelection.class + ": type is missing");
        return new ProductSelectionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            productCount, type, custom);
    }

    /**
     * builds ProductSelection without checking for non null required values
     */
    public ProductSelection buildUnchecked() {
        return new ProductSelectionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name,
            productCount, type, custom);
    }

    public static ProductSelectionBuilder of() {
        return new ProductSelectionBuilder();
    }

    public static ProductSelectionBuilder of(final ProductSelection template) {
        ProductSelectionBuilder builder = new ProductSelectionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.productCount = template.getProductCount();
        builder.type = template.getType();
        builder.custom = template.getCustom();
        return builder;
    }

}
