
package com.commercetools.api.models.standalone_price;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceUpdateActionBuilder {

    public com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionBuilder setDiscountedPriceBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionBuilder.of();
    }

    public static StandalonePriceUpdateActionBuilder of() {
        return new StandalonePriceUpdateActionBuilder();
    }
}
