
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScoreShippingRateInput
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScoreShippingRateInput scoreShippingRateInput = ScoreShippingRateInput.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ScoreShippingRateInputImpl.class)
public interface ScoreShippingRateInput extends ShippingRateInput {

    String SCORE = "Score";

    /**
     *
     */
    @NotNull
    @JsonProperty("score")
    public Long getScore();

    public void setScore(final Long score);

    public static ScoreShippingRateInput of() {
        return new ScoreShippingRateInputImpl();
    }

    public static ScoreShippingRateInput of(final ScoreShippingRateInput template) {
        ScoreShippingRateInputImpl instance = new ScoreShippingRateInputImpl();
        instance.setScore(template.getScore());
        return instance;
    }

    public static ScoreShippingRateInputBuilder builder() {
        return ScoreShippingRateInputBuilder.of();
    }

    public static ScoreShippingRateInputBuilder builder(final ScoreShippingRateInput template) {
        return ScoreShippingRateInputBuilder.of(template);
    }

    default <T> T withScoreShippingRateInput(Function<ScoreShippingRateInput, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScoreShippingRateInput>() {
            @Override
            public String toString() {
                return "TypeReference<ScoreShippingRateInput>";
            }
        };
    }
}
