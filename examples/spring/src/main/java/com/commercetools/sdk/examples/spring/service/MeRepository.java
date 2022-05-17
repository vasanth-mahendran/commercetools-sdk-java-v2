
package com.commercetools.sdk.examples.spring.service;

import java.util.Collections;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.me.MyCartAddLineItemActionBuilder;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import com.commercetools.api.models.me.MyCartUpdateBuilder;
import com.commercetools.api.models.me.MyLineItemDraftBuilder;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

public class MeRepository {
    private final ProjectApiRoot apiRoot;

    private final WebSession session;

    public static final String SESSION_CART = "ctp.session.cart";
    public static final String SESSION_CART_ITEMS = "ctp.session.cart_items";

    public MeRepository(ProjectApiRoot apiRoot, WebSession session) {
        this.apiRoot = apiRoot;
        this.session = session;
    }

    private Cart emptyCart() {
        return CartBuilder.of().lineItems(Collections.emptyList()).buildUnchecked();
    }

    public Mono<Cart> meCart() {
        Token t = NewRelic.getAgent().getTransaction().getToken();
        return meCart(t).doFinally(s -> t.expire());
    }

    @Trace(async = true)
    public Mono<Cart> meCart(Token t) {
        if (session.getAttribute(SESSION_CART) == null) {
            return Mono.just(emptyCart());
        }
        return Mono
                .fromFuture(apiRoot.me()
                        .activeCart()
                        .get()
                        .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                        .execute()
                        .thenApply(ApiHttpResponse::getBody))
                .doOnSuccess(cart -> {
                    session.getAttributes().put(SESSION_CART, cart.getId());
                    session.getAttributes().put(SESSION_CART_ITEMS, cart.getTotalLineItemQuantity());
                })
                .onErrorReturn(emptyCart());
    }

    @Trace(async = true)
    public Mono<Customer> me() {
        Token t = NewRelic.getAgent().getTransaction().getToken();
        return Mono
                .fromFuture(apiRoot.me()
                        .get()
                        .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                        .execute()
                        .thenApply(ApiHttpResponse::getBody)
                        .exceptionally(throwable -> null))
                .doFinally(s -> t.expire());
    }

    public Mono<Cart> addToCart(final String sku) {
        return addToCart(sku, 1);
    }

    @Trace(async = true)
    public Mono<Cart> addToCart(final String sku, final long quantity) {
        Token t = NewRelic.getAgent().getTransaction().getToken();
        return meCart(t).flatMap(cart -> {
            t.link();
            if (cart.getId() == null) {
                return Mono
                        .fromFuture(apiRoot.me()
                                .carts()
                                .post(MyCartDraftBuilder.of()
                                        .currency("EUR")
                                        .lineItems(MyLineItemDraftBuilder.of().sku(sku).quantity(quantity).build())
                                        .build())
                                .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                                .execute()
                                .thenApply(ApiHttpResponse::getBody))
                        .doOnSuccess(c -> {
                            session.getAttributes().put(SESSION_CART, c.getId());
                            session.getAttributes().put(SESSION_CART_ITEMS, c.getTotalLineItemQuantity());
                        })
                        .doFinally(s -> t.expire());
            }
            return Mono
                    .fromFuture(apiRoot.me()
                            .carts()
                            .withId(cart.getId())
                            .post(MyCartUpdateBuilder.of()
                                    .version(cart.getVersion())
                                    .actions(MyCartAddLineItemActionBuilder.of().sku(sku).quantity(quantity).build())
                                    .build())
                            .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                            .execute()
                            .thenApply(ApiHttpResponse::getBody))
                    .doFinally(s -> t.expire());
        });
    }

    @Trace(async = true)
    public Mono<Cart> removeFromCart(final String lineItemId) {
        Token t = NewRelic.getAgent().getTransaction().getToken();
        return meCart(t).flatMap(cart -> {
            t.link();
            if (cart.getId() == null) {
                return Mono.just(emptyCart());
            }
            return Mono
                    .fromFuture(apiRoot.me()
                            .carts()
                            .withId(cart.getId())
                            .post(MyCartUpdateBuilder.of()
                                    .version(cart.getVersion())
                                    .withActions(
                                        actionBuilder -> actionBuilder.removeLineItemBuilder().lineItemId(lineItemId))
                                    .build())
                            .withHttpRequest(apiHttpRequest -> apiHttpRequest.withContext(t))
                            .execute()
                            .thenApply(ApiHttpResponse::getBody))
                    .doFinally(s -> t.expire());
        });
    }
}
