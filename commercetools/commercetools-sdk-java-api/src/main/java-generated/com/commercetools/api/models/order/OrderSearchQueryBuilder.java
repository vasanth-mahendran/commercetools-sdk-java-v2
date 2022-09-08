
package com.commercetools.api.models.order;

import java.util.*;

import com.commercetools.api.models.common.Wildcard;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQueryBuilder
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
public class OrderSearchQueryBuilder implements Builder<OrderSearchQuery> {

    private Wildcard wildcard;

    public OrderSearchQuery build() {
        return new OrderSearchQueryImpl(this.wildcard);
    }

    /**
     * builds OrderSearchQuery without checking for non null required values
     */
    public OrderSearchQuery buildUnchecked() {
        return new OrderSearchQueryImpl();
    }

    public static OrderSearchQueryBuilder of() {
        return new OrderSearchQueryBuilder();
    }

    public static OrderSearchQueryBuilder of(final OrderSearchQuery template) {
        OrderSearchQueryBuilder builder = new OrderSearchQueryBuilder();
        return builder;
    }

    public OrderSearchQueryBuilder withWildCard(Wildcard wildcard){
        this.wildcard=wildcard;
        return this;
    }
}
