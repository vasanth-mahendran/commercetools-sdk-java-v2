package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import java.time.LocalDate;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerDateOfBirthSetMessageImpl.class)
public interface CustomerDateOfBirthSetMessage extends Message {

    
    @NotNull
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static CustomerDateOfBirthSetMessage of(){
        return new CustomerDateOfBirthSetMessageImpl();
    }
    

    public static CustomerDateOfBirthSetMessage of(final CustomerDateOfBirthSetMessage template) {
        CustomerDateOfBirthSetMessageImpl instance = new CustomerDateOfBirthSetMessageImpl();
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
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public static CustomerDateOfBirthSetMessageBuilder builder(){
        return CustomerDateOfBirthSetMessageBuilder.of();
    }
    
    public static CustomerDateOfBirthSetMessageBuilder builder(final CustomerDateOfBirthSetMessage template){
        return CustomerDateOfBirthSetMessageBuilder.of(template);
    }
    

    default <T> T withCustomerDateOfBirthSetMessage(Function<CustomerDateOfBirthSetMessage, T> helper) {
        return helper.apply(this);
    }
}
