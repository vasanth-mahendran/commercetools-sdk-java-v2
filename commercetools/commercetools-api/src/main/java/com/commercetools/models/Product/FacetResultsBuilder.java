package com.commercetools.models.product;


import com.commercetools.models.product.FacetResults;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FacetResultsBuilder {
   
   
   private Map<String, Object> values;
   
   public FacetResultsBuilder values( final Map<String, Object> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, Object> getValues(){
      return this.values;
   }

   public FacetResults build() {
       return new FacetResultsImpl(values);
   }
   
   public static FacetResultsBuilder of() {
      return new FacetResultsBuilder();
   }
   
   public static FacetResultsBuilder of(final FacetResults template) {
      FacetResultsBuilder builder = new FacetResultsBuilder();
      builder.values = template.values();
      return builder;
   }
   
}