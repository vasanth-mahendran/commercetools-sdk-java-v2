
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddShoppingListActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddShoppingListAction cartAddShoppingListAction = CartAddShoppingListAction.builder()
 *             .shoppingList(shoppingListBuilder -> shoppingListBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddShoppingListActionBuilder implements Builder<CartAddShoppingListAction> {

    private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p>ResourceIdentifier to a ShoppingList.</p>
     */

    public CartAddShoppingListActionBuilder shoppingList(
            Function<com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder, com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder> builder) {
        this.shoppingList = builder
                .apply(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a ShoppingList.</p>
     */

    public CartAddShoppingListActionBuilder shoppingList(
            final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
        this.shoppingList = shoppingList;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public CartAddShoppingListActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public CartAddShoppingListActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public CartAddShoppingListActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */

    public CartAddShoppingListActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList() {
        return this.shoppingList;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public CartAddShoppingListAction build() {
        Objects.requireNonNull(shoppingList, CartAddShoppingListAction.class + ": shoppingList is missing");
        return new CartAddShoppingListActionImpl(shoppingList, supplyChannel, distributionChannel);
    }

    /**
     * builds CartAddShoppingListAction without checking for non null required values
     */
    public CartAddShoppingListAction buildUnchecked() {
        return new CartAddShoppingListActionImpl(shoppingList, supplyChannel, distributionChannel);
    }

    public static CartAddShoppingListActionBuilder of() {
        return new CartAddShoppingListActionBuilder();
    }

    public static CartAddShoppingListActionBuilder of(final CartAddShoppingListAction template) {
        CartAddShoppingListActionBuilder builder = new CartAddShoppingListActionBuilder();
        builder.shoppingList = template.getShoppingList();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
