
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueGiftLineItemChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueGiftLineItemChangeValue changeValueGiftLineItemChangeValue = ChangeValueGiftLineItemChangeValue.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueGiftLineItemChangeValueBuilder implements Builder<ChangeValueGiftLineItemChangeValue> {

    private com.commercetools.history.models.common.Reference product;

    private Integer variantId;

    @Nullable
    private com.commercetools.history.models.common.Reference supplyChannel;

    private com.commercetools.history.models.common.Reference distributionChannel;

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder product(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder product(
            final com.commercetools.history.models.common.Reference product) {
        this.product = product;
        return this;
    }

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            @Nullable final com.commercetools.history.models.common.Reference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            final com.commercetools.history.models.common.Reference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    @Nullable
    public com.commercetools.history.models.common.Reference getSupplyChannel() {
        return this.supplyChannel;
    }

    public com.commercetools.history.models.common.Reference getDistributionChannel() {
        return this.distributionChannel;
    }

    public ChangeValueGiftLineItemChangeValue build() {
        Objects.requireNonNull(product, ChangeValueGiftLineItemChangeValue.class + ": product is missing");
        Objects.requireNonNull(variantId, ChangeValueGiftLineItemChangeValue.class + ": variantId is missing");
        Objects.requireNonNull(distributionChannel,
            ChangeValueGiftLineItemChangeValue.class + ": distributionChannel is missing");
        return new ChangeValueGiftLineItemChangeValueImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * builds ChangeValueGiftLineItemChangeValue without checking for non null required values
     */
    public ChangeValueGiftLineItemChangeValue buildUnchecked() {
        return new ChangeValueGiftLineItemChangeValueImpl(product, variantId, supplyChannel, distributionChannel);
    }

    public static ChangeValueGiftLineItemChangeValueBuilder of() {
        return new ChangeValueGiftLineItemChangeValueBuilder();
    }

    public static ChangeValueGiftLineItemChangeValueBuilder of(final ChangeValueGiftLineItemChangeValue template) {
        ChangeValueGiftLineItemChangeValueBuilder builder = new ChangeValueGiftLineItemChangeValueBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
