
package com.commercetools.importapi.models.customers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Different from Address in that <code>key</code> is required and <code>id</code> is not supported.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddress customerAddress = CustomerAddress.builder()
 *             .key("{key}")
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressImpl.class)
public interface CustomerAddress {

    /**
     *  <p>User-defined identifier for the address. Must follow the pattern <code>[a-zA-Z0-9_\-]{2,256}</code> and must be unique per customer.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *
     */

    @JsonProperty("streetName")
    public String getStreetName();

    /**
     *
     */

    @JsonProperty("streetNumber")
    public String getStreetNumber();

    /**
     *
     */

    @JsonProperty("additionalStreetInfo")
    public String getAdditionalStreetInfo();

    /**
     *
     */

    @JsonProperty("postalCode")
    public String getPostalCode();

    /**
     *
     */

    @JsonProperty("city")
    public String getCity();

    /**
     *
     */

    @JsonProperty("region")
    public String getRegion();

    /**
     *
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *
     */

    @JsonProperty("company")
    public String getCompany();

    /**
     *
     */

    @JsonProperty("department")
    public String getDepartment();

    /**
     *
     */

    @JsonProperty("building")
    public String getBuilding();

    /**
     *
     */

    @JsonProperty("apartment")
    public String getApartment();

    /**
     *
     */

    @JsonProperty("pOBox")
    public String getPOBox();

    /**
     *
     */

    @JsonProperty("phone")
    public String getPhone();

    /**
     *
     */

    @JsonProperty("mobile")
    public String getMobile();

    /**
     *
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *
     */

    @JsonProperty("fax")
    public String getFax();

    /**
     *
     */

    @JsonProperty("additionalAddressInfo")
    public String getAdditionalAddressInfo();

    /**
     *
     */

    @JsonProperty("externalId")
    public String getExternalId();

    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setKey(final String key);

    public void setTitle(final String title);

    public void setSalutation(final String salutation);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setStreetName(final String streetName);

    public void setStreetNumber(final String streetNumber);

    public void setAdditionalStreetInfo(final String additionalStreetInfo);

    public void setPostalCode(final String postalCode);

    public void setCity(final String city);

    public void setRegion(final String region);

    public void setState(final String state);

    public void setCountry(final String country);

    public void setCompany(final String company);

    public void setDepartment(final String department);

    public void setBuilding(final String building);

    public void setApartment(final String apartment);

    public void setPOBox(final String pOBox);

    public void setPhone(final String phone);

    public void setMobile(final String mobile);

    public void setEmail(final String email);

    public void setFax(final String fax);

    public void setAdditionalAddressInfo(final String additionalAddressInfo);

    public void setExternalId(final String externalId);
    public void setCustom(final Custom custom);

    public static CustomerAddress of() {
        return new CustomerAddressImpl();
    }

    public static CustomerAddress of(final CustomerAddress template) {
        CustomerAddressImpl instance = new CustomerAddressImpl();
        instance.setKey(template.getKey());
        instance.setTitle(template.getTitle());
        instance.setSalutation(template.getSalutation());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setStreetName(template.getStreetName());
        instance.setStreetNumber(template.getStreetNumber());
        instance.setAdditionalStreetInfo(template.getAdditionalStreetInfo());
        instance.setPostalCode(template.getPostalCode());
        instance.setCity(template.getCity());
        instance.setRegion(template.getRegion());
        instance.setState(template.getState());
        instance.setCountry(template.getCountry());
        instance.setCompany(template.getCompany());
        instance.setDepartment(template.getDepartment());
        instance.setBuilding(template.getBuilding());
        instance.setApartment(template.getApartment());
        instance.setPOBox(template.getPOBox());
        instance.setPhone(template.getPhone());
        instance.setMobile(template.getMobile());
        instance.setEmail(template.getEmail());
        instance.setFax(template.getFax());
        instance.setAdditionalAddressInfo(template.getAdditionalAddressInfo());
        instance.setExternalId(template.getExternalId());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static CustomerAddressBuilder builder() {
        return CustomerAddressBuilder.of();
    }

    public static CustomerAddressBuilder builder(final CustomerAddress template) {
        return CustomerAddressBuilder.of(template);
    }

    default <T> T withCustomerAddress(Function<CustomerAddress, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddress> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddress>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddress>";
            }
        };
    }
}
