
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPayment myPayment = MyPayment.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder)
 *             .plusTransactions(transactionsBuilder -> transactionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentBuilder implements Builder<MyPayment> {

    private String id;

    private Long version;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    private com.commercetools.api.models.common.TypedMoney amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the MyPayment.</p>
     */

    public MyPaymentBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public MyPaymentBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public MyPaymentBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public MyPaymentBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
     */

    public MyPaymentBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>How much money this payment intends to receive from the customer. The value usually matches the cart or order gross total.</p>
     */

    public MyPaymentBuilder amountPlanned(final com.commercetools.api.models.common.TypedMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>How much money this payment intends to receive from the customer. The value usually matches the cart or order gross total.</p>
     */

    public MyPaymentBuilder amountPlanned(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyPaymentBuilder paymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoBuilder, com.commercetools.api.models.payment.PaymentMethodInfoBuilder> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public MyPaymentBuilder paymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public MyPaymentBuilder transactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public MyPaymentBuilder transactions(
            final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public MyPaymentBuilder plusTransactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.addAll(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public MyPaymentBuilder plusTransactions(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public MyPaymentBuilder withTransactions(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        this.transactions = new ArrayList<>();
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MyPaymentBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyPaymentBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public com.commercetools.api.models.common.TypedMoney getAmountPlanned() {
        return this.amountPlanned;
    }

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public MyPayment build() {
        Objects.requireNonNull(id, MyPayment.class + ": id is missing");
        Objects.requireNonNull(version, MyPayment.class + ": version is missing");
        Objects.requireNonNull(amountPlanned, MyPayment.class + ": amountPlanned is missing");
        Objects.requireNonNull(paymentMethodInfo, MyPayment.class + ": paymentMethodInfo is missing");
        Objects.requireNonNull(transactions, MyPayment.class + ": transactions is missing");
        return new MyPaymentImpl(id, version, customer, anonymousId, amountPlanned, paymentMethodInfo, transactions,
            custom);
    }

    /**
     * builds MyPayment without checking for non null required values
     */
    public MyPayment buildUnchecked() {
        return new MyPaymentImpl(id, version, customer, anonymousId, amountPlanned, paymentMethodInfo, transactions,
            custom);
    }

    public static MyPaymentBuilder of() {
        return new MyPaymentBuilder();
    }

    public static MyPaymentBuilder of(final MyPayment template) {
        MyPaymentBuilder builder = new MyPaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.transactions = template.getTransactions();
        builder.custom = template.getCustom();
        return builder;
    }

}
