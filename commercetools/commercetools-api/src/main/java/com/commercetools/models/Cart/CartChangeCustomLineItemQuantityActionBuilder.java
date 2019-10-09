package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartChangeCustomLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeCustomLineItemQuantityActionBuilder {
   
   
   private String customLineItemId;
   
   
   private Integer quantity;
   
   public CartChangeCustomLineItemQuantityActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartChangeCustomLineItemQuantityActionBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }

   public CartChangeCustomLineItemQuantityAction build() {
       return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
   }
   
   public static CartChangeCustomLineItemQuantityActionBuilder of() {
      return new CartChangeCustomLineItemQuantityActionBuilder();
   }
   
   public static CartChangeCustomLineItemQuantityActionBuilder of(final CartChangeCustomLineItemQuantityAction template) {
      CartChangeCustomLineItemQuantityActionBuilder builder = new CartChangeCustomLineItemQuantityActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}