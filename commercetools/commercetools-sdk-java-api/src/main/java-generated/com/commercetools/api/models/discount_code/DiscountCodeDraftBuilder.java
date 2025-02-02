
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeDraft discountCodeDraft = DiscountCodeDraft.builder()
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeDraftBuilder implements Builder<DiscountCodeDraft> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;

    @Nullable
    private String cartPredicate;

    @Nullable
    private Boolean isActive;

    @Nullable
    private Long maxApplications;

    @Nullable
    private Long maxApplicationsPerCustomer;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private java.util.List<String> groups;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Name of the DiscountCode.</p>
     */

    public DiscountCodeDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the DiscountCode.</p>
     */

    public DiscountCodeDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     */

    public DiscountCodeDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the DiscountCode.</p>
     */

    public DiscountCodeDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the DiscountCode that can be added to the Cart to apply the related CartDiscounts. It cannot be modified after the DiscountCode is created.</p>
     */

    public DiscountCodeDraftBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     */

    public DiscountCodeDraftBuilder cartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     */

    public DiscountCodeDraftBuilder cartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     */

    public DiscountCodeDraftBuilder plusCartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.addAll(Arrays.asList(cartDiscounts));
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     */

    public DiscountCodeDraftBuilder plusCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder> builder) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Specify what CartDiscounts the API applies when you add the DiscountCode to the Cart.</p>
     */

    public DiscountCodeDraftBuilder withCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder> builder) {
        this.cartDiscounts = new ArrayList<>();
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     */

    public DiscountCodeDraftBuilder cartPredicate(@Nullable final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Only active DiscountCodes can be applied to the Cart.</p>
     */

    public DiscountCodeDraftBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied.</p>
     */

    public DiscountCodeDraftBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer.</p>
     */

    public DiscountCodeDraftBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     */

    public DiscountCodeDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the DiscountCode.</p>
     */

    public DiscountCodeDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     */

    public DiscountCodeDraftBuilder groups(@Nullable final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     */

    public DiscountCodeDraftBuilder groups(@Nullable final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     *  <p>Groups to which the DiscountCode will belong to.</p>
     */

    public DiscountCodeDraftBuilder plusGroups(@Nullable final String... groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective. Must be earlier than <code>validUntil</code>.</p>
     */

    public DiscountCodeDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective. Must be later than <code>validFrom</code>.</p>
     */

    public DiscountCodeDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getCode() {
        return this.code;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts() {
        return this.cartDiscounts;
    }

    @Nullable
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    @Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    @Nullable
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public DiscountCodeDraft build() {
        Objects.requireNonNull(code, DiscountCodeDraft.class + ": code is missing");
        Objects.requireNonNull(cartDiscounts, DiscountCodeDraft.class + ": cartDiscounts is missing");
        return new DiscountCodeDraftImpl(name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, custom, groups, validFrom, validUntil);
    }

    /**
     * builds DiscountCodeDraft without checking for non null required values
     */
    public DiscountCodeDraft buildUnchecked() {
        return new DiscountCodeDraftImpl(name, description, code, cartDiscounts, cartPredicate, isActive,
            maxApplications, maxApplicationsPerCustomer, custom, groups, validFrom, validUntil);
    }

    public static DiscountCodeDraftBuilder of() {
        return new DiscountCodeDraftBuilder();
    }

    public static DiscountCodeDraftBuilder of(final DiscountCodeDraft template) {
        DiscountCodeDraftBuilder builder = new DiscountCodeDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.code = template.getCode();
        builder.cartDiscounts = template.getCartDiscounts();
        builder.cartPredicate = template.getCartPredicate();
        builder.isActive = template.getIsActive();
        builder.maxApplications = template.getMaxApplications();
        builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
        builder.custom = template.getCustom();
        builder.groups = template.getGroups();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
