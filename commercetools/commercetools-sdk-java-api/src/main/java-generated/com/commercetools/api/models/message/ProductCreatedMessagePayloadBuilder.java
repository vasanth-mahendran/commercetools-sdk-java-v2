
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCreatedMessagePayload productCreatedMessagePayload = ProductCreatedMessagePayload.builder()
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductCreatedMessagePayloadBuilder implements Builder<ProductCreatedMessagePayload> {

    private com.commercetools.api.models.product.ProductProjection productProjection;

    /**
     *
     */

    public ProductCreatedMessagePayloadBuilder productProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public ProductCreatedMessagePayloadBuilder productProjection(
            final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    public ProductCreatedMessagePayload build() {
        Objects.requireNonNull(productProjection,
            ProductCreatedMessagePayload.class + ": productProjection is missing");
        return new ProductCreatedMessagePayloadImpl(productProjection);
    }

    /**
     * builds ProductCreatedMessagePayload without checking for non null required values
     */
    public ProductCreatedMessagePayload buildUnchecked() {
        return new ProductCreatedMessagePayloadImpl(productProjection);
    }

    public static ProductCreatedMessagePayloadBuilder of() {
        return new ProductCreatedMessagePayloadBuilder();
    }

    public static ProductCreatedMessagePayloadBuilder of(final ProductCreatedMessagePayload template) {
        ProductCreatedMessagePayloadBuilder builder = new ProductCreatedMessagePayloadBuilder();
        builder.productProjection = template.getProductProjection();
        return builder;
    }

}
