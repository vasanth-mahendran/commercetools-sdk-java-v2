
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRemoveSupplyChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveSupplyChannelAction storeRemoveSupplyChannelAction = StoreRemoveSupplyChannelAction.builder()
 *             .supplyChannel(supplyChannelBuilder -> supplyChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveSupplyChannelActionBuilder implements Builder<StoreRemoveSupplyChannelAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreRemoveSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public StoreRemoveSupplyChannelActionBuilder supplyChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public StoreRemoveSupplyChannelAction build() {
        Objects.requireNonNull(supplyChannel, StoreRemoveSupplyChannelAction.class + ": supplyChannel is missing");
        return new StoreRemoveSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * builds StoreRemoveSupplyChannelAction without checking for non null required values
     */
    public StoreRemoveSupplyChannelAction buildUnchecked() {
        return new StoreRemoveSupplyChannelActionImpl(supplyChannel);
    }

    public static StoreRemoveSupplyChannelActionBuilder of() {
        return new StoreRemoveSupplyChannelActionBuilder();
    }

    public static StoreRemoveSupplyChannelActionBuilder of(final StoreRemoveSupplyChannelAction template) {
        StoreRemoveSupplyChannelActionBuilder builder = new StoreRemoveSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
