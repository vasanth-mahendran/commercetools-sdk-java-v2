
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscount productDiscount = ProductDiscount.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .predicate("{predicate}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountBuilder implements Builder<ProductDiscount> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.product_discount.ProductDiscountValue value;

    private String predicate;

    private String sortOrder;

    private Boolean isActive;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Unique identifier of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductDiscount was initially created.</p>
     */

    public ProductDiscountBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ProductDiscount was last updated.</p>
     */

    public ProductDiscountBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ProductDiscountBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ProductDiscountBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ProductDiscountBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ProductDiscountBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the ProductDiscount.</p>
     */

    public ProductDiscountBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     */

    public ProductDiscountBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Type of Discount and its corresponding value.</p>
     */

    public ProductDiscountBuilder value(
            Function<com.commercetools.api.models.product_discount.ProductDiscountValueBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Valid ProductDiscount predicate.</p>
     */

    public ProductDiscountBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Unique decimal value between 0 and 1 (stored as String literal) defining the order of Product Discounts to apply in case more than one is applicable and active. A Product Discount with a higher value is prioritized.</p>
     */

    public ProductDiscountBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>If <code>true</code> the Product Discount is applied to Products matching the <code>predicate</code>.</p>
     */

    public ProductDiscountBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     */

    public ProductDiscountBuilder references(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     */

    public ProductDiscountBuilder references(
            final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     */

    public ProductDiscountBuilder plusReferences(final com.commercetools.api.models.common.Reference... references) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.addAll(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     */

    public ProductDiscountBuilder plusReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References of all the resources that are addressed in the <code>predicate</code>.</p>
     */

    public ProductDiscountBuilder withReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.references = new ArrayList<>();
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective. Take Eventual Consistency into account for calculated discount values.</p>
     */

    public ProductDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective. Take Eventual Consistency into account for calculated undiscounted values.</p>
     */

    public ProductDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValue getValue() {
        return this.value;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public ProductDiscount build() {
        Objects.requireNonNull(id, ProductDiscount.class + ": id is missing");
        Objects.requireNonNull(version, ProductDiscount.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductDiscount.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductDiscount.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ProductDiscount.class + ": name is missing");
        Objects.requireNonNull(value, ProductDiscount.class + ": value is missing");
        Objects.requireNonNull(predicate, ProductDiscount.class + ": predicate is missing");
        Objects.requireNonNull(sortOrder, ProductDiscount.class + ": sortOrder is missing");
        Objects.requireNonNull(isActive, ProductDiscount.class + ": isActive is missing");
        Objects.requireNonNull(references, ProductDiscount.class + ": references is missing");
        return new ProductDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, predicate, sortOrder, isActive, references, validFrom, validUntil);
    }

    /**
     * builds ProductDiscount without checking for non null required values
     */
    public ProductDiscount buildUnchecked() {
        return new ProductDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, predicate, sortOrder, isActive, references, validFrom, validUntil);
    }

    public static ProductDiscountBuilder of() {
        return new ProductDiscountBuilder();
    }

    public static ProductDiscountBuilder of(final ProductDiscount template) {
        ProductDiscountBuilder builder = new ProductDiscountBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.predicate = template.getPredicate();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.references = template.getReferences();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
