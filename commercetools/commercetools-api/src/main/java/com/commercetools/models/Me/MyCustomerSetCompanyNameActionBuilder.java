package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import com.commercetools.models.me.MyCustomerSetCompanyNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetCompanyNameActionBuilder {
   
   @Nullable
   private String companyName;
   
   public MyCustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   @Nullable
   public String getCompanyName(){
      return this.companyName;
   }

   public MyCustomerSetCompanyNameAction build() {
       return new MyCustomerSetCompanyNameActionImpl(companyName);
   }
   
   public static MyCustomerSetCompanyNameActionBuilder of() {
      return new MyCustomerSetCompanyNameActionBuilder();
   }
   
   public static MyCustomerSetCompanyNameActionBuilder of(final MyCustomerSetCompanyNameAction template) {
      MyCustomerSetCompanyNameActionBuilder builder = new MyCustomerSetCompanyNameActionBuilder();
      builder.companyName = template.getCompanyName();
      return builder;
   }
   
}