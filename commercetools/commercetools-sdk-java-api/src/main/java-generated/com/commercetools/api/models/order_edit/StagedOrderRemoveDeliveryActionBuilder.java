
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveDeliveryAction stagedOrderRemoveDeliveryAction = StagedOrderRemoveDeliveryAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveDeliveryActionBuilder implements Builder<StagedOrderRemoveDeliveryAction> {

    private String deliveryId;

    /**
     *
     */

    public StagedOrderRemoveDeliveryActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public StagedOrderRemoveDeliveryAction build() {
        Objects.requireNonNull(deliveryId, StagedOrderRemoveDeliveryAction.class + ": deliveryId is missing");
        return new StagedOrderRemoveDeliveryActionImpl(deliveryId);
    }

    /**
     * builds StagedOrderRemoveDeliveryAction without checking for non null required values
     */
    public StagedOrderRemoveDeliveryAction buildUnchecked() {
        return new StagedOrderRemoveDeliveryActionImpl(deliveryId);
    }

    public static StagedOrderRemoveDeliveryActionBuilder of() {
        return new StagedOrderRemoveDeliveryActionBuilder();
    }

    public static StagedOrderRemoveDeliveryActionBuilder of(final StagedOrderRemoveDeliveryAction template) {
        StagedOrderRemoveDeliveryActionBuilder builder = new StagedOrderRemoveDeliveryActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
