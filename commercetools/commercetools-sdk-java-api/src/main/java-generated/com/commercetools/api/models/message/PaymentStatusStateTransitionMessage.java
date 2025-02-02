
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
 * PaymentStatusStateTransitionMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusStateTransitionMessage paymentStatusStateTransitionMessage = PaymentStatusStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusStateTransitionMessageImpl.class)
public interface PaymentStatusStateTransitionMessage extends Message {

    String PAYMENT_STATUS_STATE_TRANSITION = "PaymentStatusStateTransition";

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

    public static PaymentStatusStateTransitionMessage of() {
        return new PaymentStatusStateTransitionMessageImpl();
    }

    public static PaymentStatusStateTransitionMessage of(final PaymentStatusStateTransitionMessage template) {
        PaymentStatusStateTransitionMessageImpl instance = new PaymentStatusStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static PaymentStatusStateTransitionMessageBuilder builder() {
        return PaymentStatusStateTransitionMessageBuilder.of();
    }

    public static PaymentStatusStateTransitionMessageBuilder builder(
            final PaymentStatusStateTransitionMessage template) {
        return PaymentStatusStateTransitionMessageBuilder.of(template);
    }

    default <T> T withPaymentStatusStateTransitionMessage(Function<PaymentStatusStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusStateTransitionMessage>";
            }
        };
    }
}
