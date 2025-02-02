
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantChannelAvailabilityBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailability productVariantChannelAvailability = ProductVariantChannelAvailability.builder()
 *             .isOnStock(true)
 *             .restockableInDays(1)
 *             .availableQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantChannelAvailabilityBuilder implements Builder<ProductVariantChannelAvailability> {

    private Boolean isOnStock;

    private Integer restockableInDays;

    private Integer availableQuantity;

    /**
     *
     */

    public ProductVariantChannelAvailabilityBuilder isOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     *
     */

    public ProductVariantChannelAvailabilityBuilder restockableInDays(final Integer restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     *
     */

    public ProductVariantChannelAvailabilityBuilder availableQuantity(final Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    public Integer getRestockableInDays() {
        return this.restockableInDays;
    }

    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    public ProductVariantChannelAvailability build() {
        Objects.requireNonNull(isOnStock, ProductVariantChannelAvailability.class + ": isOnStock is missing");
        Objects.requireNonNull(restockableInDays,
            ProductVariantChannelAvailability.class + ": restockableInDays is missing");
        Objects.requireNonNull(availableQuantity,
            ProductVariantChannelAvailability.class + ": availableQuantity is missing");
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity);
    }

    /**
     * builds ProductVariantChannelAvailability without checking for non null required values
     */
    public ProductVariantChannelAvailability buildUnchecked() {
        return new ProductVariantChannelAvailabilityImpl(isOnStock, restockableInDays, availableQuantity);
    }

    public static ProductVariantChannelAvailabilityBuilder of() {
        return new ProductVariantChannelAvailabilityBuilder();
    }

    public static ProductVariantChannelAvailabilityBuilder of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityBuilder builder = new ProductVariantChannelAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
