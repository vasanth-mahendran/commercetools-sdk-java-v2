
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnItemBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnItemBuilder {

    public com.commercetools.api.models.order.CustomLineItemReturnItemBuilder customLineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.CustomLineItemReturnItemBuilder.of();
    }

    public com.commercetools.api.models.order.LineItemReturnItemBuilder lineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.LineItemReturnItemBuilder.of();
    }

    public static ReturnItemBuilder of() {
        return new ReturnItemBuilder();
    }
}
