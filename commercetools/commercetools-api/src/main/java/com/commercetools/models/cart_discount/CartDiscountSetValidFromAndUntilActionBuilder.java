package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.models.cart_discount.CartDiscountSetValidFromAndUntilAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetValidFromAndUntilActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   public CartDiscountSetValidFromAndUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public CartDiscountSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }

   public CartDiscountSetValidFromAndUntilAction build() {
       return new CartDiscountSetValidFromAndUntilActionImpl(validUntil, validFrom);
   }
   
   public static CartDiscountSetValidFromAndUntilActionBuilder of() {
      return new CartDiscountSetValidFromAndUntilActionBuilder();
   }
   
   public static CartDiscountSetValidFromAndUntilActionBuilder of(final CartDiscountSetValidFromAndUntilAction template) {
      CartDiscountSetValidFromAndUntilActionBuilder builder = new CartDiscountSetValidFromAndUntilActionBuilder();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      return builder;
   }
   
}