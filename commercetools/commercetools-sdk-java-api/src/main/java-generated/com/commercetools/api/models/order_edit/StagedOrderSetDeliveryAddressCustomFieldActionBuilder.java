
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressCustomFieldAction stagedOrderSetDeliveryAddressCustomFieldAction = StagedOrderSetDeliveryAddressCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryAddressCustomFieldActionBuilder
        implements Builder<StagedOrderSetDeliveryAddressCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public StagedOrderSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(deliveryId,
            StagedOrderSetDeliveryAddressCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, StagedOrderSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds StagedOrderSetDeliveryAddressCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder of(
            final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder = new StagedOrderSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
