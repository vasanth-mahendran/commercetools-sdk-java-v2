package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetRatingActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ReviewSetRatingActionImpl.class)
public interface ReviewSetRatingAction extends ReviewUpdateAction {

   /**
   *  <p>Number between -100 and 100 included.
   *  If <code>rating</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
   @JsonProperty("rating")
   public Integer getRating();

   public void setRating(final Integer rating);
   
   public static ReviewSetRatingActionImpl of(){
      return new ReviewSetRatingActionImpl();
   }
   

   public static ReviewSetRatingActionImpl of(final ReviewSetRatingAction template) {
      ReviewSetRatingActionImpl instance = new ReviewSetRatingActionImpl();
      instance.setRating(template.getRating());
      return instance;
   }

}