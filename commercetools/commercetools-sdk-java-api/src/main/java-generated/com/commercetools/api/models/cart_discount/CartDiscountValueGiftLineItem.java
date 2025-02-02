
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueGiftLineItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueGiftLineItem cartDiscountValueGiftLineItem = CartDiscountValueGiftLineItem.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueGiftLineItemImpl.class)
public interface CartDiscountValueGiftLineItem extends CartDiscountValue {

    String GIFT_LINE_ITEM = "giftLineItem";

    /**
     *  <p>Reference to a Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>ProductVariant of the Product.</p>
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    public void setProduct(final ProductReference product);

    public void setVariantId(final Long variantId);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public void setDistributionChannel(final ChannelReference distributionChannel);

    public static CartDiscountValueGiftLineItem of() {
        return new CartDiscountValueGiftLineItemImpl();
    }

    public static CartDiscountValueGiftLineItem of(final CartDiscountValueGiftLineItem template) {
        CartDiscountValueGiftLineItemImpl instance = new CartDiscountValueGiftLineItemImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static CartDiscountValueGiftLineItemBuilder builder() {
        return CartDiscountValueGiftLineItemBuilder.of();
    }

    public static CartDiscountValueGiftLineItemBuilder builder(final CartDiscountValueGiftLineItem template) {
        return CartDiscountValueGiftLineItemBuilder.of(template);
    }

    default <T> T withCartDiscountValueGiftLineItem(Function<CartDiscountValueGiftLineItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueGiftLineItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueGiftLineItem>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueGiftLineItem>";
            }
        };
    }
}
