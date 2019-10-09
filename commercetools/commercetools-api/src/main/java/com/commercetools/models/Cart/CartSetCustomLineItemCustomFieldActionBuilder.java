package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomLineItemCustomFieldActionBuilder {
   
   
   private String customLineItemId;
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public CartSetCustomLineItemCustomFieldActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartSetCustomLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CartSetCustomLineItemCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public CartSetCustomLineItemCustomFieldAction build() {
       return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
   }
   
   public static CartSetCustomLineItemCustomFieldActionBuilder of() {
      return new CartSetCustomLineItemCustomFieldActionBuilder();
   }
   
   public static CartSetCustomLineItemCustomFieldActionBuilder of(final CartSetCustomLineItemCustomFieldAction template) {
      CartSetCustomLineItemCustomFieldActionBuilder builder = new CartSetCustomLineItemCustomFieldActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}