
package com.commercetools.importapi.models.customers;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerImport customerImport = CustomerImport.builder()
 *             .key("{key}")
 *             .email("{email}")
 *             .password("{password}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerImportBuilder implements Builder<CustomerImport> {

    private String key;

    @Nullable
    private String customerNumber;

    private String email;

    private String password;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String middleName;

    @Nullable
    private String title;

    @Nullable
    private String salutation;

    @Nullable
    private String externalId;

    @Nullable
    private java.time.LocalDate dateOfBirth;

    @Nullable
    private String companyName;

    @Nullable
    private String vatId;

    @Nullable
    private Boolean isEmailVerified;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    private java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private String locale;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *
     */

    public CustomerImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.customerNumber</code>.</p>
     */

    public CustomerImportBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.email</code>.</p>
     */

    public CustomerImportBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.password</code>.</p>
     */

    public CustomerImportBuilder password(final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     */

    public CustomerImportBuilder stores(
            @Nullable final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     */

    public CustomerImportBuilder stores(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     */

    public CustomerImportBuilder plusStores(
            @Nullable final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     */

    public CustomerImportBuilder plusStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     */

    public CustomerImportBuilder withStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.firstName</code>.</p>
     */

    public CustomerImportBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.lastName</code>.</p>
     */

    public CustomerImportBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.middleName</code>.</p>
     */

    public CustomerImportBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.title</code>.</p>
     */

    public CustomerImportBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.salutation</code>.</p>
     */

    public CustomerImportBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.externalId</code>.</p>
     */

    public CustomerImportBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
     */

    public CustomerImportBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.companyName</code>.</p>
     */

    public CustomerImportBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.vatId</code>.</p>
     */

    public CustomerImportBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
     */

    public CustomerImportBuilder isEmailVerified(@Nullable final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Customer is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     */

    public CustomerImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Reference to the CustomerGroup with which the Customer is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     */

    public CustomerImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     */

    public CustomerImportBuilder addresses(
            final com.commercetools.importapi.models.customers.CustomerAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     */

    public CustomerImportBuilder addresses(
            final java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     */

    public CustomerImportBuilder plusAddresses(
            final com.commercetools.importapi.models.customers.CustomerAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     */

    public CustomerImportBuilder plusAddresses(
            Function<com.commercetools.importapi.models.customers.CustomerAddressBuilder, com.commercetools.importapi.models.customers.CustomerAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses
                .add(builder.apply(com.commercetools.importapi.models.customers.CustomerAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     */

    public CustomerImportBuilder withAddresses(
            Function<com.commercetools.importapi.models.customers.CustomerAddressBuilder, com.commercetools.importapi.models.customers.CustomerAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses
                .add(builder.apply(com.commercetools.importapi.models.customers.CustomerAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
     */

    public CustomerImportBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerImportBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerImportBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerImportBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
     */

    public CustomerImportBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerImportBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerImportBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerImportBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.locale</code>.</p>
     */

    public CustomerImportBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>The custom fields for this Customer.</p>
     */

    public CustomerImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields for this Customer.</p>
     */

    public CustomerImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> getStores() {
        return this.stores;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    @Nullable
    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    public java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public CustomerImport build() {
        Objects.requireNonNull(key, CustomerImport.class + ": key is missing");
        Objects.requireNonNull(email, CustomerImport.class + ": email is missing");
        Objects.requireNonNull(password, CustomerImport.class + ": password is missing");
        Objects.requireNonNull(addresses, CustomerImport.class + ": addresses is missing");
        return new CustomerImportImpl(key, customerNumber, email, password, stores, firstName, lastName, middleName,
            title, salutation, externalId, dateOfBirth, companyName, vatId, isEmailVerified, customerGroup, addresses,
            defaultBillingAddress, billingAddresses, defaultShippingAddress, shippingAddresses, locale, custom);
    }

    /**
     * builds CustomerImport without checking for non null required values
     */
    public CustomerImport buildUnchecked() {
        return new CustomerImportImpl(key, customerNumber, email, password, stores, firstName, lastName, middleName,
            title, salutation, externalId, dateOfBirth, companyName, vatId, isEmailVerified, customerGroup, addresses,
            defaultBillingAddress, billingAddresses, defaultShippingAddress, shippingAddresses, locale, custom);
    }

    public static CustomerImportBuilder of() {
        return new CustomerImportBuilder();
    }

    public static CustomerImportBuilder of(final CustomerImport template) {
        CustomerImportBuilder builder = new CustomerImportBuilder();
        builder.key = template.getKey();
        builder.customerNumber = template.getCustomerNumber();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.stores = template.getStores();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.middleName = template.getMiddleName();
        builder.title = template.getTitle();
        builder.salutation = template.getSalutation();
        builder.externalId = template.getExternalId();
        builder.dateOfBirth = template.getDateOfBirth();
        builder.companyName = template.getCompanyName();
        builder.vatId = template.getVatId();
        builder.isEmailVerified = template.getIsEmailVerified();
        builder.customerGroup = template.getCustomerGroup();
        builder.addresses = template.getAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.locale = template.getLocale();
        builder.custom = template.getCustom();
        return builder;
    }

}
