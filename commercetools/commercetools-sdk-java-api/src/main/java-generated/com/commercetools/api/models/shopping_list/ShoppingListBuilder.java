
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingList shoppingList = ShoppingList.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListBuilder implements Builder<ShoppingList> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    /**
     *  <p>Unique identifier of the ShoppingList.</p>
     */

    public ShoppingListBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The current version of the shopping list.</p>
     */

    public ShoppingListBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShoppingListBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShoppingListBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShoppingListBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public ShoppingListBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
     */

    public ShoppingListBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ShoppingList.</p>
     */

    public ShoppingListBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder lineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingListLineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder plusLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder withLineItems(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(
            builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related shopping list. Each slug is unique across a project, but a shopping list can have the same slug for different languages. The slug must match the pattern [a-zA-Z0-9_-]{2,256}.</p>
     */

    public ShoppingListBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related shopping list. Each slug is unique across a project, but a shopping list can have the same slug for different languages. The slug must match the pattern [a-zA-Z0-9_-]{2,256}.</p>
     */

    public ShoppingListBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder textLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        this.textLineItems = new ArrayList<>(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder textLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> textLineItems) {
        this.textLineItems = textLineItems;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder plusTextLineItems(
            @Nullable final com.commercetools.api.models.shopping_list.TextLineItem... textLineItems) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems.addAll(Arrays.asList(textLineItems));
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder plusTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemBuilder, com.commercetools.api.models.shopping_list.TextLineItemBuilder> builder) {
        if (this.textLineItems == null) {
            this.textLineItems = new ArrayList<>();
        }
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder withTextLineItems(
            Function<com.commercetools.api.models.shopping_list.TextLineItemBuilder, com.commercetools.api.models.shopping_list.TextLineItemBuilder> builder) {
        this.textLineItems = new ArrayList<>();
        this.textLineItems
                .add(builder.apply(com.commercetools.api.models.shopping_list.TextLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
     */

    public ShoppingListBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ShoppingListBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
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
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItem> getLineItems() {
        return this.lineItems;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shopping_list.TextLineItem> getTextLineItems() {
        return this.textLineItems;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public ShoppingList build() {
        Objects.requireNonNull(id, ShoppingList.class + ": id is missing");
        Objects.requireNonNull(version, ShoppingList.class + ": version is missing");
        Objects.requireNonNull(createdAt, ShoppingList.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ShoppingList.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ShoppingList.class + ": name is missing");
        return new ShoppingListImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, custom, customer,
            deleteDaysAfterLastModification, description, key, lineItems, name, slug, textLineItems, anonymousId,
            store);
    }

    /**
     * builds ShoppingList without checking for non null required values
     */
    public ShoppingList buildUnchecked() {
        return new ShoppingListImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, custom, customer,
            deleteDaysAfterLastModification, description, key, lineItems, name, slug, textLineItems, anonymousId,
            store);
    }

    public static ShoppingListBuilder of() {
        return new ShoppingListBuilder();
    }

    public static ShoppingListBuilder of(final ShoppingList template) {
        ShoppingListBuilder builder = new ShoppingListBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.custom = template.getCustom();
        builder.customer = template.getCustomer();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.description = template.getDescription();
        builder.key = template.getKey();
        builder.lineItems = template.getLineItems();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.textLineItems = template.getTextLineItems();
        builder.anonymousId = template.getAnonymousId();
        builder.store = template.getStore();
        return builder;
    }

}
