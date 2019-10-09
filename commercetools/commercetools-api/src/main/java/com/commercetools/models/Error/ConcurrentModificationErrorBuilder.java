package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.ConcurrentModificationError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ConcurrentModificationErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private Long currentVersion;
   
   public ConcurrentModificationErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ConcurrentModificationErrorBuilder currentVersion(@Nullable final Long currentVersion) {
      this.currentVersion = currentVersion;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public Long getCurrentVersion(){
      return this.currentVersion;
   }

   public ConcurrentModificationError build() {
       return new ConcurrentModificationErrorImpl(message, currentVersion);
   }
   
   public static ConcurrentModificationErrorBuilder of() {
      return new ConcurrentModificationErrorBuilder();
   }
   
   public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
      ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
      builder.message = template.getMessage();
      builder.currentVersion = template.getCurrentVersion();
      return builder;
   }
   
}