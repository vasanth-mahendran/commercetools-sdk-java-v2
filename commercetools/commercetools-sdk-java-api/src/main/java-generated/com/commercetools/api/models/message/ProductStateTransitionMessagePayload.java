
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductStateTransitionMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductStateTransitionMessagePayload productStateTransitionMessagePayload = ProductStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductStateTransitionMessagePayloadImpl.class)
public interface ProductStateTransitionMessagePayload extends MessagePayload {

    String PRODUCT_STATE_TRANSITION = "ProductStateTransition";

    /**
     *  <p>Reference to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setForce(final Boolean force);

    public static ProductStateTransitionMessagePayload of() {
        return new ProductStateTransitionMessagePayloadImpl();
    }

    public static ProductStateTransitionMessagePayload of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadImpl instance = new ProductStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ProductStateTransitionMessagePayloadBuilder builder() {
        return ProductStateTransitionMessagePayloadBuilder.of();
    }

    public static ProductStateTransitionMessagePayloadBuilder builder(
            final ProductStateTransitionMessagePayload template) {
        return ProductStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withProductStateTransitionMessagePayload(Function<ProductStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductStateTransitionMessagePayload>";
            }
        };
    }
}
