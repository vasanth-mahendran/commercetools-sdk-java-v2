
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCode
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCode discountCode = DiscountCode.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .code("{code}")
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .isActive(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .plusGroups(groupsBuilder -> groupsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeImpl.class)
public interface DiscountCode extends BaseResource, com.commercetools.api.models.DomainResource<DiscountCode>,
        com.commercetools.api.models.Referencable<DiscountCode>,
        com.commercetools.api.models.ResourceIdentifiable<DiscountCode>,
        com.commercetools.api.models.Customizable<DiscountCode> {

    /**
     *  <p>Unique identifier of the DiscountCode.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the DiscountCode.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the DiscountCode was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the DiscountCode was last updated.</p>
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
     *  <p>Name of the DiscountCode.</p>
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the DiscountCode.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>User-defined unique identifier of the DiscountCode added to the Cart to apply the related CartDiscounts.</p>
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Reference to CartDiscounts that can be applied to the Cart once the DiscountCode is applied.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountReference> getCartDiscounts();

    /**
     *  <p>DiscountCode can only be applied to Carts that match this predicate.</p>
     */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Indicates if the DiscountCode is active and can be applied to the Cart.</p>
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Array generated from the Cart predicate. It contains the references of all the resources that are addressed in the predicate.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("references")
    public List<Reference> getReferences();

    /**
     *  <p>Number of times the DiscountCode can be applied. DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
     *  <p>Number of times the DiscountCode can be applied per Customer (anonymous Carts are not supported). DiscountCode application is counted at the time of Order creation or edit. However, Order cancellation or deletion does not decrement the count.</p>
     */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    /**
     *  <p>Custom Fields of the DiscountCode.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Groups to which the DiscountCode belongs to.</p>
     */
    @NotNull
    @JsonProperty("groups")
    public List<String> getGroups();

    /**
     *  <p>Date and time (UTC) from which the DiscountCode is effective.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the DiscountCode is effective.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Used and managed by the API and must not be used in customer logic. The value can change at any time due to internal and external factors.</p>
     */

    @JsonProperty("applicationVersion")
    public Long getApplicationVersion();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setCode(final String code);

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountReference... cartDiscounts);

    public void setCartDiscounts(final List<CartDiscountReference> cartDiscounts);

    public void setCartPredicate(final String cartPredicate);

    public void setIsActive(final Boolean isActive);

    @JsonIgnore
    public void setReferences(final Reference... references);

    public void setReferences(final List<Reference> references);

    public void setMaxApplications(final Long maxApplications);

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setGroups(final String... groups);

    public void setGroups(final List<String> groups);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setApplicationVersion(final Long applicationVersion);

    public static DiscountCode of() {
        return new DiscountCodeImpl();
    }

    public static DiscountCode of(final DiscountCode template) {
        DiscountCodeImpl instance = new DiscountCodeImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setCode(template.getCode());
        instance.setCartDiscounts(template.getCartDiscounts());
        instance.setCartPredicate(template.getCartPredicate());
        instance.setIsActive(template.getIsActive());
        instance.setReferences(template.getReferences());
        instance.setMaxApplications(template.getMaxApplications());
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        instance.setCustom(template.getCustom());
        instance.setGroups(template.getGroups());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setApplicationVersion(template.getApplicationVersion());
        return instance;
    }

    public static DiscountCodeBuilder builder() {
        return DiscountCodeBuilder.of();
    }

    public static DiscountCodeBuilder builder(final DiscountCode template) {
        return DiscountCodeBuilder.of(template);
    }

    default <T> T withDiscountCode(Function<DiscountCode, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.discount_code.DiscountCodeReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCode> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCode>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCode>";
            }
        };
    }
}
