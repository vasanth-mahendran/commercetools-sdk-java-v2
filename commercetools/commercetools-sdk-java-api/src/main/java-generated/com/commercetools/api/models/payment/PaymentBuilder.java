
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Payment payment = Payment.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder)
 *             .paymentStatus(paymentStatusBuilder -> paymentStatusBuilder)
 *             .plusTransactions(transactionsBuilder -> transactionsBuilder)
 *             .plusInterfaceInteractions(interfaceInteractionsBuilder -> interfaceInteractionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentBuilder implements Builder<Payment> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private String interfaceId;

    private com.commercetools.api.models.common.TypedMoney amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private com.commercetools.api.models.payment.PaymentStatus paymentStatus;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    private java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the Payment.</p>
     */

    public PaymentBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public PaymentBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public PaymentBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public PaymentBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public PaymentBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public PaymentBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public PaymentBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public PaymentBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public PaymentBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public PaymentBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
     */

    public PaymentBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>The identifier that is used by the interface that manages the payment (usually the PSP). Cannot be changed once it has been set. The combination of this ID and the PaymentMethodInfo <code>paymentInterface</code> must be unique.</p>
     */

    public PaymentBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>How much money this payment intends to receive from the customer. The value usually matches the cart or order gross total.</p>
     */

    public PaymentBuilder amountPlanned(final com.commercetools.api.models.common.TypedMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>How much money this payment intends to receive from the customer. The value usually matches the cart or order gross total.</p>
     */

    public PaymentBuilder amountPlanned(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentBuilder paymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoBuilder, com.commercetools.api.models.payment.PaymentMethodInfoBuilder> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public PaymentBuilder paymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *
     */

    public PaymentBuilder paymentStatus(
            Function<com.commercetools.api.models.payment.PaymentStatusBuilder, com.commercetools.api.models.payment.PaymentStatusBuilder> builder) {
        this.paymentStatus = builder.apply(com.commercetools.api.models.payment.PaymentStatusBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentBuilder paymentStatus(final com.commercetools.api.models.payment.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentBuilder transactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentBuilder transactions(
            final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentBuilder plusTransactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.addAll(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentBuilder plusTransactions(
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

    public PaymentBuilder withTransactions(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        this.transactions = new ArrayList<>();
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Interface interactions can be requests sent to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentBuilder interfaceInteractions(
            final com.commercetools.api.models.type.CustomFields... interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
        return this;
    }

    /**
     *  <p>Interface interactions can be requests sent to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentBuilder interfaceInteractions(
            final java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
        return this;
    }

    /**
     *  <p>Interface interactions can be requests sent to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentBuilder plusInterfaceInteractions(
            final com.commercetools.api.models.type.CustomFields... interfaceInteractions) {
        if (this.interfaceInteractions == null) {
            this.interfaceInteractions = new ArrayList<>();
        }
        this.interfaceInteractions.addAll(Arrays.asList(interfaceInteractions));
        return this;
    }

    /**
     *  <p>Interface interactions can be requests sent to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentBuilder plusInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        if (this.interfaceInteractions == null) {
            this.interfaceInteractions = new ArrayList<>();
        }
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Interface interactions can be requests sent to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentBuilder withInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.interfaceInteractions = new ArrayList<>();
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public PaymentBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     */

    public PaymentBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    public com.commercetools.api.models.common.TypedMoney getAmountPlanned() {
        return this.amountPlanned;
    }

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public com.commercetools.api.models.payment.PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFields> getInterfaceInteractions() {
        return this.interfaceInteractions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public Payment build() {
        Objects.requireNonNull(id, Payment.class + ": id is missing");
        Objects.requireNonNull(version, Payment.class + ": version is missing");
        Objects.requireNonNull(createdAt, Payment.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Payment.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(amountPlanned, Payment.class + ": amountPlanned is missing");
        Objects.requireNonNull(paymentMethodInfo, Payment.class + ": paymentMethodInfo is missing");
        Objects.requireNonNull(paymentStatus, Payment.class + ": paymentStatus is missing");
        Objects.requireNonNull(transactions, Payment.class + ": transactions is missing");
        Objects.requireNonNull(interfaceInteractions, Payment.class + ": interfaceInteractions is missing");
        return new PaymentImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customer, anonymousId,
            interfaceId, amountPlanned, paymentMethodInfo, paymentStatus, transactions, interfaceInteractions, custom,
            key);
    }

    /**
     * builds Payment without checking for non null required values
     */
    public Payment buildUnchecked() {
        return new PaymentImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customer, anonymousId,
            interfaceId, amountPlanned, paymentMethodInfo, paymentStatus, transactions, interfaceInteractions, custom,
            key);
    }

    public static PaymentBuilder of() {
        return new PaymentBuilder();
    }

    public static PaymentBuilder of(final Payment template) {
        PaymentBuilder builder = new PaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.interfaceId = template.getInterfaceId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.paymentStatus = template.getPaymentStatus();
        builder.transactions = template.getTransactions();
        builder.interfaceInteractions = template.getInterfaceInteractions();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
