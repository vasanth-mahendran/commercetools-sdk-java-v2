
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCartScoreShippingRateInputValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartScoreShippingRateInputValue setCartScoreShippingRateInputValue = SetCartScoreShippingRateInputValue.builder()
 *             .type("{type}")
 *             .score(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCartScoreShippingRateInputValueBuilder implements Builder<SetCartScoreShippingRateInputValue> {

    private String type;

    private Integer score;

    /**
     *
     */

    public SetCartScoreShippingRateInputValueBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *
     */

    public SetCartScoreShippingRateInputValueBuilder score(final Integer score) {
        this.score = score;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Integer getScore() {
        return this.score;
    }

    public SetCartScoreShippingRateInputValue build() {
        Objects.requireNonNull(type, SetCartScoreShippingRateInputValue.class + ": type is missing");
        Objects.requireNonNull(score, SetCartScoreShippingRateInputValue.class + ": score is missing");
        return new SetCartScoreShippingRateInputValueImpl(type, score);
    }

    /**
     * builds SetCartScoreShippingRateInputValue without checking for non null required values
     */
    public SetCartScoreShippingRateInputValue buildUnchecked() {
        return new SetCartScoreShippingRateInputValueImpl(type, score);
    }

    public static SetCartScoreShippingRateInputValueBuilder of() {
        return new SetCartScoreShippingRateInputValueBuilder();
    }

    public static SetCartScoreShippingRateInputValueBuilder of(final SetCartScoreShippingRateInputValue template) {
        SetCartScoreShippingRateInputValueBuilder builder = new SetCartScoreShippingRateInputValueBuilder();
        builder.type = template.getType();
        builder.score = template.getScore();
        return builder;
    }

}
