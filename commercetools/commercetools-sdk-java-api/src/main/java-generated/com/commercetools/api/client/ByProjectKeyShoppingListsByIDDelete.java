
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .shoppingLists()
 *            .withId("{ID}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShoppingListsByIDDelete
        extends ApiMethod<ByProjectKeyShoppingListsByIDDelete, com.commercetools.api.models.shopping_list.ShoppingList>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShoppingListsByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShoppingListsByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyShoppingListsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyShoppingListsByIDDelete(ByProjectKeyShoppingListsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shopping-lists/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingList>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.shopping_list.ShoppingList.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set dataErasure with the specified value
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete withDataErasure(final TValue dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete addDataErasure(final TValue dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set dataErasure with the specified value
     */
    public ByProjectKeyShoppingListsByIDDelete withDataErasure(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("dataErasure", supplier.get());
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyShoppingListsByIDDelete addDataErasure(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("dataErasure", supplier.get());
    }

    /**
     * set dataErasure with the specified value
     */
    public ByProjectKeyShoppingListsByIDDelete withDataErasure(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("dataErasure", op.apply(new StringBuilder()));
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyShoppingListsByIDDelete addDataErasure(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("dataErasure", op.apply(new StringBuilder()));
    }

    /**
     * set dataErasure with the specified values
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete withDataErasure(final List<TValue> dataErasure) {
        return copy().withoutQueryParam("dataErasure")
                .addQueryParams(dataErasure.stream()
                        .map(s -> new ParamEntry<>("dataErasure", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dataErasure query parameters
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete addDataErasure(final List<TValue> dataErasure) {
        return copy().addQueryParams(
            dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set version with the specified value
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     */
    public ByProjectKeyShoppingListsByIDDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyShoppingListsByIDDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     */
    public ByProjectKeyShoppingListsByIDDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyShoppingListsByIDDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete withVersion(final List<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete addVersion(final List<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShoppingListsByIDDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShoppingListsByIDDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyShoppingListsByIDDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShoppingListsByIDDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyShoppingListsByIDDelete addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShoppingListsByIDDelete that = (ByProjectKeyShoppingListsByIDDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyShoppingListsByIDDelete copy() {
        return new ByProjectKeyShoppingListsByIDDelete(this);
    }
}
