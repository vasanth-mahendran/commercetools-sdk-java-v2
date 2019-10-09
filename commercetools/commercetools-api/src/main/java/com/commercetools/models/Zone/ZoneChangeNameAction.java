package com.commercetools.models.zone;

import com.commercetools.models.zone.ZoneUpdateAction;
import com.commercetools.models.zone.ZoneChangeNameActionImpl;

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
@JsonDeserialize(as = ZoneChangeNameActionImpl.class)
public interface ZoneChangeNameAction extends ZoneUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   
   public static ZoneChangeNameActionImpl of(){
      return new ZoneChangeNameActionImpl();
   }
   

   public static ZoneChangeNameActionImpl of(final ZoneChangeNameAction template) {
      ZoneChangeNameActionImpl instance = new ZoneChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}