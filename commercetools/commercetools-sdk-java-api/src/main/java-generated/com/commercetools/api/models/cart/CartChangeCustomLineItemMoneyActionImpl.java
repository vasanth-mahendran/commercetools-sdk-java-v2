
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CartChangeCustomLineItemMoneyAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemMoneyActionImpl implements CartChangeCustomLineItemMoneyAction, ModelBase {

    private String action;

    private String customLineItemId;

    private com.commercetools.api.models.common.Money money;

    @JsonCreator
    CartChangeCustomLineItemMoneyActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("money") final com.commercetools.api.models.common.Money money) {
        this.customLineItemId = customLineItemId;
        this.money = money;
        this.action = CHANGE_CUSTOM_LINE_ITEM_MONEY;
    }

    public CartChangeCustomLineItemMoneyActionImpl() {
        this.action = CHANGE_CUSTOM_LINE_ITEM_MONEY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setMoney(final com.commercetools.api.models.common.Money money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartChangeCustomLineItemMoneyActionImpl that = (CartChangeCustomLineItemMoneyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(money, that.money)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(money).toHashCode();
    }

}
