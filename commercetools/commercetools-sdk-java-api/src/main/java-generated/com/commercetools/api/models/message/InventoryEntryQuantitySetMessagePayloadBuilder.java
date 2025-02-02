
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryQuantitySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryQuantitySetMessagePayload inventoryEntryQuantitySetMessagePayload = InventoryEntryQuantitySetMessagePayload.builder()
 *             .oldQuantityOnStock(0.3)
 *             .newQuantityOnStock(0.3)
 *             .oldAvailableQuantity(0.3)
 *             .newAvailableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryQuantitySetMessagePayloadBuilder
        implements Builder<InventoryEntryQuantitySetMessagePayload> {

    private Long oldQuantityOnStock;

    private Long newQuantityOnStock;

    private Long oldAvailableQuantity;

    private Long newAvailableQuantity;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder oldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        return this;
    }

    /**
     *
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder newQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
        return this;
    }

    /**
     *
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder oldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
        return this;
    }

    /**
     *
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder newAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Channel.</p>
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public Long getOldQuantityOnStock() {
        return this.oldQuantityOnStock;
    }

    public Long getNewQuantityOnStock() {
        return this.newQuantityOnStock;
    }

    public Long getOldAvailableQuantity() {
        return this.oldAvailableQuantity;
    }

    public Long getNewAvailableQuantity() {
        return this.newAvailableQuantity;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    public InventoryEntryQuantitySetMessagePayload build() {
        Objects.requireNonNull(oldQuantityOnStock,
            InventoryEntryQuantitySetMessagePayload.class + ": oldQuantityOnStock is missing");
        Objects.requireNonNull(newQuantityOnStock,
            InventoryEntryQuantitySetMessagePayload.class + ": newQuantityOnStock is missing");
        Objects.requireNonNull(oldAvailableQuantity,
            InventoryEntryQuantitySetMessagePayload.class + ": oldAvailableQuantity is missing");
        Objects.requireNonNull(newAvailableQuantity,
            InventoryEntryQuantitySetMessagePayload.class + ": newAvailableQuantity is missing");
        return new InventoryEntryQuantitySetMessagePayloadImpl(oldQuantityOnStock, newQuantityOnStock,
            oldAvailableQuantity, newAvailableQuantity, supplyChannel);
    }

    /**
     * builds InventoryEntryQuantitySetMessagePayload without checking for non null required values
     */
    public InventoryEntryQuantitySetMessagePayload buildUnchecked() {
        return new InventoryEntryQuantitySetMessagePayloadImpl(oldQuantityOnStock, newQuantityOnStock,
            oldAvailableQuantity, newAvailableQuantity, supplyChannel);
    }

    public static InventoryEntryQuantitySetMessagePayloadBuilder of() {
        return new InventoryEntryQuantitySetMessagePayloadBuilder();
    }

    public static InventoryEntryQuantitySetMessagePayloadBuilder of(
            final InventoryEntryQuantitySetMessagePayload template) {
        InventoryEntryQuantitySetMessagePayloadBuilder builder = new InventoryEntryQuantitySetMessagePayloadBuilder();
        builder.oldQuantityOnStock = template.getOldQuantityOnStock();
        builder.newQuantityOnStock = template.getNewQuantityOnStock();
        builder.oldAvailableQuantity = template.getOldAvailableQuantity();
        builder.newAvailableQuantity = template.getNewAvailableQuantity();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
