package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.me.MyCartAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartAddPaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public MyCartAddPaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public MyCartAddPaymentAction build() {
       return new MyCartAddPaymentActionImpl(payment);
   }
   
   public static MyCartAddPaymentActionBuilder of() {
      return new MyCartAddPaymentActionBuilder();
   }
   
   public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
      MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}