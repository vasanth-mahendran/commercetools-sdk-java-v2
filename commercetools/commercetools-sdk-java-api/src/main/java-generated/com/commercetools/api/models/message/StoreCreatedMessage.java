
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.ProductSelectionSetting;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCreatedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCreatedMessage storeCreatedMessage = StoreCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCreatedMessageImpl.class)
public interface StoreCreatedMessage extends Message {

    String STORE_CREATED = "StoreCreated";

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSetting> getProductSelections();

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSetting... productSelections);

    public void setProductSelections(final List<ProductSelectionSetting> productSelections);

    public void setCustom(final CustomFields custom);

    public static StoreCreatedMessage of() {
        return new StoreCreatedMessageImpl();
    }

    public static StoreCreatedMessage of(final StoreCreatedMessage template) {
        StoreCreatedMessageImpl instance = new StoreCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setProductSelections(template.getProductSelections());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreCreatedMessageBuilder builder() {
        return StoreCreatedMessageBuilder.of();
    }

    public static StoreCreatedMessageBuilder builder(final StoreCreatedMessage template) {
        return StoreCreatedMessageBuilder.of(template);
    }

    default <T> T withStoreCreatedMessage(Function<StoreCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCreatedMessage>";
            }
        };
    }
}
