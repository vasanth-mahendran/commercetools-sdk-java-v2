
package com.commercetools.api.models.order;

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
 * OrderAddPaymentAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddPaymentActionImpl implements OrderAddPaymentAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    @JsonCreator
    OrderAddPaymentActionImpl(
            @JsonProperty("payment") final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        this.action = ADD_PAYMENT;
    }

    public OrderAddPaymentActionImpl() {
        this.action = ADD_PAYMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ResourceIdentifier to a Payment.</p>
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderAddPaymentActionImpl that = (OrderAddPaymentActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(payment, that.payment).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(payment).toHashCode();
    }

}
