
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionUpdateAction subscriptionUpdateAction = SubscriptionUpdateAction.changeDestinationBuilder()
 *             destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionImpl.class, name = SubscriptionChangeDestinationAction.CHANGE_DESTINATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetChangesActionImpl.class, name = SubscriptionSetChangesAction.SET_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetKeyActionImpl.class, name = SubscriptionSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.SubscriptionSetMessagesActionImpl.class, name = SubscriptionSetMessagesAction.SET_MESSAGES) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = SubscriptionUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = SubscriptionUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<SubscriptionUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionBuilder changeDestinationBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionChangeDestinationActionBuilder.of();
    }

    public static com.commercetools.api.models.subscription.SubscriptionSetChangesActionBuilder setChangesBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetChangesActionBuilder.of();
    }

    public static com.commercetools.api.models.subscription.SubscriptionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.subscription.SubscriptionSetMessagesActionBuilder setMessagesBuilder() {
        return com.commercetools.api.models.subscription.SubscriptionSetMessagesActionBuilder.of();
    }

    default <T> T withSubscriptionUpdateAction(Function<SubscriptionUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionUpdateAction>";
            }
        };
    }
}
