
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MatchingPriceNotFoundError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MatchingPriceNotFoundError matchingPriceNotFoundError = MatchingPriceNotFoundError.builder()
 *             .message("{message}")
 *             .productId("{productId}")
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MatchingPriceNotFoundErrorImpl.class)
public interface MatchingPriceNotFoundError extends ErrorObject {

    String MATCHING_PRICE_NOT_FOUND = "MatchingPriceNotFound";

    /**
     *
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *
     */

    @JsonProperty("currency")
    public String getCurrency();

    /**
     *
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Reference to a Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    public void setProductId(final String productId);

    public void setVariantId(final Integer variantId);

    public void setCurrency(final String currency);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public static MatchingPriceNotFoundError of() {
        return new MatchingPriceNotFoundErrorImpl();
    }

    public static MatchingPriceNotFoundError of(final MatchingPriceNotFoundError template) {
        MatchingPriceNotFoundErrorImpl instance = new MatchingPriceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        return instance;
    }

    public static MatchingPriceNotFoundErrorBuilder builder() {
        return MatchingPriceNotFoundErrorBuilder.of();
    }

    public static MatchingPriceNotFoundErrorBuilder builder(final MatchingPriceNotFoundError template) {
        return MatchingPriceNotFoundErrorBuilder.of(template);
    }

    default <T> T withMatchingPriceNotFoundError(Function<MatchingPriceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MatchingPriceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MatchingPriceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<MatchingPriceNotFoundError>";
            }
        };
    }
}
