
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePrice standalonePrice = StandalonePrice.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceImpl.class)
public interface StandalonePrice extends BaseResource, com.commercetools.api.models.DomainResource<StandalonePrice> {

    /**
     *  <p>Unique identifier of the StandalonePrice.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the StandalonePrice.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the StandalonePrice was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the StandalonePrice was last updated.</p>
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
     *  <p>User-defined unique identifier of the StandalonePrice.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>SKU of the ProductVariant to which this Price is associated.</p>
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Money value of this Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Country for which this Price is valid.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Product distribution Channel for which this Price is valid.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Date from which the Price is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date until the Price is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Price tiers if any are defined.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted price is rounded in favor of the customer with the half down rounding.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setSku(final String sku);

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setCustom(final CustomFields custom);

    public static StandalonePrice of() {
        return new StandalonePriceImpl();
    }

    public static StandalonePrice of(final StandalonePrice template) {
        StandalonePriceImpl instance = new StandalonePriceImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(template.getTiers());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StandalonePriceBuilder builder() {
        return StandalonePriceBuilder.of();
    }

    public static StandalonePriceBuilder builder(final StandalonePrice template) {
        return StandalonePriceBuilder.of(template);
    }

    default <T> T withStandalonePrice(Function<StandalonePrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePrice>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePrice>";
            }
        };
    }
}
