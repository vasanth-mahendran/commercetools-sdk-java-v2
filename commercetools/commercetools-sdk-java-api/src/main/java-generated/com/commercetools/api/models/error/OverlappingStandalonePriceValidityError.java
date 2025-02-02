
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OverlappingStandalonePriceValidityError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OverlappingStandalonePriceValidityError overlappingStandalonePriceValidityError = OverlappingStandalonePriceValidityError.builder()
 *             .message("{message}")
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OverlappingStandalonePriceValidityErrorImpl.class)
public interface OverlappingStandalonePriceValidityError extends ErrorObject {

    String OVERLAPPING_STANDALONE_PRICE_VALIDITY = "OverlappingStandalonePriceValidity";

    /**
     *  <p>Reference to a StandalonePrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingStandalonePrice")
    public StandalonePriceReference getConflictingStandalonePrice();

    /**
     *
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>ResourceIdentifier to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *
     */

    @JsonProperty("conflictingValidFrom")
    public ZonedDateTime getConflictingValidFrom();

    /**
     *
     */

    @JsonProperty("conflictingValidUntil")
    public ZonedDateTime getConflictingValidUntil();

    public void setConflictingStandalonePrice(final StandalonePriceReference conflictingStandalonePrice);

    public void setSku(final String sku);

    public void setCurrency(final String currency);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setConflictingValidFrom(final ZonedDateTime conflictingValidFrom);

    public void setConflictingValidUntil(final ZonedDateTime conflictingValidUntil);

    public static OverlappingStandalonePriceValidityError of() {
        return new OverlappingStandalonePriceValidityErrorImpl();
    }

    public static OverlappingStandalonePriceValidityError of(final OverlappingStandalonePriceValidityError template) {
        OverlappingStandalonePriceValidityErrorImpl instance = new OverlappingStandalonePriceValidityErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingStandalonePrice(template.getConflictingStandalonePrice());
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setConflictingValidFrom(template.getConflictingValidFrom());
        instance.setConflictingValidUntil(template.getConflictingValidUntil());
        return instance;
    }

    public static OverlappingStandalonePriceValidityErrorBuilder builder() {
        return OverlappingStandalonePriceValidityErrorBuilder.of();
    }

    public static OverlappingStandalonePriceValidityErrorBuilder builder(
            final OverlappingStandalonePriceValidityError template) {
        return OverlappingStandalonePriceValidityErrorBuilder.of(template);
    }

    default <T> T withOverlappingStandalonePriceValidityError(
            Function<OverlappingStandalonePriceValidityError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OverlappingStandalonePriceValidityError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OverlappingStandalonePriceValidityError>() {
            @Override
            public String toString() {
                return "TypeReference<OverlappingStandalonePriceValidityError>";
            }
        };
    }
}
