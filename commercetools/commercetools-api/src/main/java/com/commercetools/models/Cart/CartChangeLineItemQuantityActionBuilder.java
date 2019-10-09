package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart.CartChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeLineItemQuantityActionBuilder {
   
   
   private Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   @Nullable
   private com.commercetools.models.common.Money externalPrice;
   
   public CartChangeLineItemQuantityActionBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public CartChangeLineItemQuantityAction build() {
       return new CartChangeLineItemQuantityActionImpl(quantity, externalTotalPrice, lineItemId, externalPrice);
   }
   
   public static CartChangeLineItemQuantityActionBuilder of() {
      return new CartChangeLineItemQuantityActionBuilder();
   }
   
   public static CartChangeLineItemQuantityActionBuilder of(final CartChangeLineItemQuantityAction template) {
      CartChangeLineItemQuantityActionBuilder builder = new CartChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}