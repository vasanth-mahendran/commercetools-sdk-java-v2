
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewRatingSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingSetMessagePayload reviewRatingSetMessagePayload = ReviewRatingSetMessagePayload.builder()
 *             .includedInStatistics(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewRatingSetMessagePayloadImpl.class)
public interface ReviewRatingSetMessagePayload extends MessagePayload {

    String REVIEW_RATING_SET = "ReviewRatingSet";

    /**
     *
     */

    @JsonProperty("oldRating")
    public Double getOldRating();

    /**
     *
     */

    @JsonProperty("newRating")
    public Double getNewRating();

    /**
     *
     */
    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    public void setOldRating(final Double oldRating);

    public void setNewRating(final Double newRating);

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    public void setTarget(final Reference target);

    public static ReviewRatingSetMessagePayload of() {
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

    public static ReviewRatingSetMessagePayloadBuilder builder() {
        return ReviewRatingSetMessagePayloadBuilder.of();
    }

    public static ReviewRatingSetMessagePayloadBuilder builder(final ReviewRatingSetMessagePayload template) {
        return ReviewRatingSetMessagePayloadBuilder.of(template);
    }

    default <T> T withReviewRatingSetMessagePayload(Function<ReviewRatingSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewRatingSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewRatingSetMessagePayload>";
            }
        };
    }
}
