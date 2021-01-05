package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ReviewRatingSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewRatingSetMessagePayloadImpl.class)
public interface ReviewRatingSetMessagePayload extends MessagePayload {

    
    
    @JsonProperty("oldRating")
    public Double getOldRating();
    
    
    @JsonProperty("newRating")
    public Double getNewRating();
    
    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();
    
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    public void setOldRating(final Double oldRating);
    
    public void setNewRating(final Double newRating);
    
    public void setIncludedInStatistics(final Boolean includedInStatistics);
    
    public void setTarget(final Reference target);

    public static ReviewRatingSetMessagePayload of(){
        return new ReviewRatingSetMessagePayloadImpl();
    }
    

    public static ReviewRatingSetMessagePayload of(final ReviewRatingSetMessagePayload template) {
        ReviewRatingSetMessagePayloadImpl instance = new ReviewRatingSetMessagePayloadImpl();
        instance.setOldRating(template.getOldRating());
        instance.setNewRating(template.getNewRating());
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static ReviewRatingSetMessagePayloadBuilder builder(){
        return ReviewRatingSetMessagePayloadBuilder.of();
    }
    
    public static ReviewRatingSetMessagePayloadBuilder builder(final ReviewRatingSetMessagePayload template){
        return ReviewRatingSetMessagePayloadBuilder.of(template);
    }
    

    default <T> T withReviewRatingSetMessagePayload(Function<ReviewRatingSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
