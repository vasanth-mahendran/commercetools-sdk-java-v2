
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCompanyNameSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCompanyNameSetMessage customerCompanyNameSetMessage = CustomerCompanyNameSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCompanyNameSetMessageImpl.class)
public interface CustomerCompanyNameSetMessage extends Message {

    String CUSTOMER_COMPANY_NAME_SET = "CustomerCompanyNameSet";

    /**
     *
     */

    @JsonProperty("companyName")
    public String getCompanyName();

    public void setCompanyName(final String companyName);

    public static CustomerCompanyNameSetMessage of() {
        return new CustomerCompanyNameSetMessageImpl();
    }

    public static CustomerCompanyNameSetMessage of(final CustomerCompanyNameSetMessage template) {
        CustomerCompanyNameSetMessageImpl instance = new CustomerCompanyNameSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    public static CustomerCompanyNameSetMessageBuilder builder() {
        return CustomerCompanyNameSetMessageBuilder.of();
    }

    public static CustomerCompanyNameSetMessageBuilder builder(final CustomerCompanyNameSetMessage template) {
        return CustomerCompanyNameSetMessageBuilder.of(template);
    }

    default <T> T withCustomerCompanyNameSetMessage(Function<CustomerCompanyNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCompanyNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCompanyNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCompanyNameSetMessage>";
            }
        };
    }
}
