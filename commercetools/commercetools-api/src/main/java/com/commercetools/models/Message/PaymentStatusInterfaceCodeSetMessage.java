package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.message.PaymentStatusInterfaceCodeSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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
   
   public static PaymentStatusInterfaceCodeSetMessageImpl of(){
      return new PaymentStatusInterfaceCodeSetMessageImpl();
   }
   

   public static PaymentStatusInterfaceCodeSetMessageImpl of(final PaymentStatusInterfaceCodeSetMessage template) {
      PaymentStatusInterfaceCodeSetMessageImpl instance = new PaymentStatusInterfaceCodeSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setPaymentId(template.getPaymentId());
      instance.setInterfaceCode(template.getInterfaceCode());
      return instance;
   }

}