package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageImpl;

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
@JsonDeserialize(as = PaymentStatusInterfaceCodeSetMessageImpl.class)
public interface PaymentStatusInterfaceCodeSetMessage extends Message {

    
    @NotNull
    @JsonProperty("paymentId")
    public String getPaymentId();
    
    @NotNull
    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    public void setPaymentId(final String paymentId);
    
    public void setInterfaceCode(final String interfaceCode);

    public static PaymentStatusInterfaceCodeSetMessage of(){
        return new PaymentStatusInterfaceCodeSetMessageImpl();
    }
    

    public static PaymentStatusInterfaceCodeSetMessage of(final PaymentStatusInterfaceCodeSetMessage template) {
        PaymentStatusInterfaceCodeSetMessageImpl instance = new PaymentStatusInterfaceCodeSetMessageImpl();
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
        instance.setPaymentId(template.getPaymentId());
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    public static PaymentStatusInterfaceCodeSetMessageBuilder builder(){
        return PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }
    
    public static PaymentStatusInterfaceCodeSetMessageBuilder builder(final PaymentStatusInterfaceCodeSetMessage template){
        return PaymentStatusInterfaceCodeSetMessageBuilder.of(template);
    }
    

    default <T> T withPaymentStatusInterfaceCodeSetMessage(Function<PaymentStatusInterfaceCodeSetMessage, T> helper) {
        return helper.apply(this);
    }
}
