package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListChangeNameActionImpl;

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
@JsonDeserialize(as = MyShoppingListChangeNameActionImpl.class)
public interface MyShoppingListChangeNameAction extends MyShoppingListUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static MyShoppingListChangeNameActionImpl of(){
      return new MyShoppingListChangeNameActionImpl();
   }
   

   public static MyShoppingListChangeNameActionImpl of(final MyShoppingListChangeNameAction template) {
      MyShoppingListChangeNameActionImpl instance = new MyShoppingListChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}