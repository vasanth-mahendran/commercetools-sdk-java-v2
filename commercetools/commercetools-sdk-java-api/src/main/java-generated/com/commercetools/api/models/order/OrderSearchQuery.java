
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.Wildcard;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQuery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQuery orderSearchQuery = OrderSearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchQueryImpl.class)
public interface OrderSearchQuery {

    public static OrderSearchQuery of() {
        return new OrderSearchQueryImpl();
    }

    public static OrderSearchQuery of(final OrderSearchQuery template) {
        OrderSearchQueryImpl instance = new OrderSearchQueryImpl();
        return instance;
    }

    public static OrderSearchQueryBuilder builder() {
        return OrderSearchQueryBuilder.of();
    }

    public static OrderSearchQueryBuilder builder(final OrderSearchQuery template) {
        return OrderSearchQueryBuilder.of(template);
    }

    default <T> T withOrderSearchQuery(Function<OrderSearchQuery, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchQuery>";
            }
        };
    }
    public Wildcard getWildcard();
    public void setWildcard(Wildcard wildcard);

    public String getWhere();
    public void setWhere(String string);
}
