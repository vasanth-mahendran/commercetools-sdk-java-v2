package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.type.TypeResourceIdentifierImpl;

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
@JsonDeserialize(as = TypeResourceIdentifierImpl.class)
public interface TypeResourceIdentifier extends ResourceIdentifier {


   
   public static TypeResourceIdentifierImpl of(){
      return new TypeResourceIdentifierImpl();
   }
   

   public static TypeResourceIdentifierImpl of(final TypeResourceIdentifier template) {
      TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}