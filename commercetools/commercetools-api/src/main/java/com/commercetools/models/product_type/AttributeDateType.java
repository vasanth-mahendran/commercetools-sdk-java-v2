package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import com.commercetools.models.product_type.AttributeDateTypeImpl;

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
@JsonDeserialize(as = AttributeDateTypeImpl.class)
public interface AttributeDateType extends AttributeType {


   
   public static AttributeDateTypeImpl of(){
      return new AttributeDateTypeImpl();
   }
   

   public static AttributeDateTypeImpl of(final AttributeDateType template) {
      AttributeDateTypeImpl instance = new AttributeDateTypeImpl();
      return instance;
   }

}