package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.cart.CartResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = CartResourceIdentifierImpl.class)
public interface CartResourceIdentifier extends ResourceIdentifier {


   
   public static CartResourceIdentifierImpl of(){
      return new CartResourceIdentifierImpl();
   }
   

   public static CartResourceIdentifierImpl of(final CartResourceIdentifier template) {
      CartResourceIdentifierImpl instance = new CartResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}