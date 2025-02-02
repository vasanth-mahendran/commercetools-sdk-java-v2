
package com.commercetools.importapi.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.customers.CustomerAddressBuilder;
import com.commercetools.importapi.models.customfields.CustomBuilder;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddressBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Address address = Address.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddressBuilder implements Builder<Address> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    @Nullable
    private String title;

    @Nullable
    private String salutation;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String streetName;

    @Nullable
    private String streetNumber;

    @Nullable
    private String additionalStreetInfo;

    @Nullable
    private String postalCode;

    @Nullable
    private String city;

    @Nullable
    private String region;

    @Nullable
    private String state;

    private String country;

    @Nullable
    private String company;

    @Nullable
    private String department;

    @Nullable
    private String building;

    @Nullable
    private String apartment;

    @Nullable
    private String pOBox;

    @Nullable
    private String phone;

    @Nullable
    private String mobile;

    @Nullable
    private String email;

    @Nullable
    private String fax;

    @Nullable
    private String additionalAddressInfo;

    @Nullable
    private String externalId;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *
     */

    public AddressBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public AddressBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public AddressBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *
     */

    public AddressBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *
     */

    public AddressBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *
     */

    public AddressBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *
     */

    public AddressBuilder streetName(@Nullable final String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     *
     */

    public AddressBuilder streetNumber(@Nullable final String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     *
     */

    public AddressBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
        return this;
    }

    /**
     *
     */

    public AddressBuilder postalCode(@Nullable final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     *
     */

    public AddressBuilder city(@Nullable final String city) {
        this.city = city;
        return this;
    }

    /**
     *
     */

    public AddressBuilder region(@Nullable final String region) {
        this.region = region;
        return this;
    }

    /**
     *
     */

    public AddressBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public AddressBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *
     */

    public AddressBuilder company(@Nullable final String company) {
        this.company = company;
        return this;
    }

    /**
     *
     */

    public AddressBuilder department(@Nullable final String department) {
        this.department = department;
        return this;
    }

    /**
     *
     */

    public AddressBuilder building(@Nullable final String building) {
        this.building = building;
        return this;
    }

    /**
     *
     */

    public AddressBuilder apartment(@Nullable final String apartment) {
        this.apartment = apartment;
        return this;
    }

    /**
     *
     */

    public AddressBuilder pOBox(@Nullable final String pOBox) {
        this.pOBox = pOBox;
        return this;
    }

    /**
     *
     */

    public AddressBuilder phone(@Nullable final String phone) {
        this.phone = phone;
        return this;
    }

    /**
     *
     */

    public AddressBuilder mobile(@Nullable final String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     *
     */

    public AddressBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *
     */

    public AddressBuilder fax(@Nullable final String fax) {
        this.fax = fax;
        return this;
    }

    /**
     *
     */

    public AddressBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
        return this;
    }

    /**
     *
     */

    public AddressBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>The custom fields for this Customer.</p>
     */

    public AddressBuilder custom(
            Function<CustomBuilder, CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields for this Customer.</p>
     */

    public AddressBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
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
    public String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    @Nullable
    public String getStreetName() {
        return this.streetName;
    }

    @Nullable
    public String getStreetNumber() {
        return this.streetNumber;
    }

    @Nullable
    public String getAdditionalStreetInfo() {
        return this.additionalStreetInfo;
    }

    @Nullable
    public String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public String getCity() {
        return this.city;
    }

    @Nullable
    public String getRegion() {
        return this.region;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getCompany() {
        return this.company;
    }

    @Nullable
    public String getDepartment() {
        return this.department;
    }

    @Nullable
    public String getBuilding() {
        return this.building;
    }

    @Nullable
    public String getApartment() {
        return this.apartment;
    }

    @Nullable
    public String getPOBox() {
        return this.pOBox;
    }

    @Nullable
    public String getPhone() {
        return this.phone;
    }

    @Nullable
    public String getMobile() {
        return this.mobile;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    @Nullable
    public String getFax() {
        return this.fax;
    }

    @Nullable
    public String getAdditionalAddressInfo() {
        return this.additionalAddressInfo;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public Address build() {
        Objects.requireNonNull(country, Address.class + ": country is missing");
        return new AddressImpl(id, key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId,custom);
    }

    /**
     * builds Address without checking for non null required values
     */
    public Address buildUnchecked() {
        return new AddressImpl(id, key, title, salutation, firstName, lastName, streetName, streetNumber,
            additionalStreetInfo, postalCode, city, region, state, country, company, department, building, apartment,
            pOBox, phone, mobile, email, fax, additionalAddressInfo, externalId,custom);
    }

    public static AddressBuilder of() {
        return new AddressBuilder();
    }

    public static AddressBuilder of(final Address template) {
        AddressBuilder builder = new AddressBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.title = template.getTitle();
        builder.salutation = template.getSalutation();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.streetName = template.getStreetName();
        builder.streetNumber = template.getStreetNumber();
        builder.additionalStreetInfo = template.getAdditionalStreetInfo();
        builder.postalCode = template.getPostalCode();
        builder.city = template.getCity();
        builder.region = template.getRegion();
        builder.state = template.getState();
        builder.country = template.getCountry();
        builder.company = template.getCompany();
        builder.department = template.getDepartment();
        builder.building = template.getBuilding();
        builder.apartment = template.getApartment();
        builder.pOBox = template.getPOBox();
        builder.phone = template.getPhone();
        builder.mobile = template.getMobile();
        builder.email = template.getEmail();
        builder.fax = template.getFax();
        builder.additionalAddressInfo = template.getAdditionalAddressInfo();
        builder.externalId = template.getExternalId();
        builder.custom = template.getCustom();
        return builder;
    }

}
