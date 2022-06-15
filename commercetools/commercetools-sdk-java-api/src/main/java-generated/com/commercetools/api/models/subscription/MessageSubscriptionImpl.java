
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>For supported resources and message types, see Message Types. Messages will be delivered even if the Messages Query HTTP API is not enabled.</p>
 *  <p>The MessageDeliveryPayload is delivered.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MessageSubscriptionImpl implements MessageSubscription, ModelBase {

    private String resourceTypeId;

    private java.util.List<String> types;

    @JsonCreator
    MessageSubscriptionImpl(@JsonProperty("resourceTypeId") final String resourceTypeId,
            @JsonProperty("types") final java.util.List<String> types) {
        this.resourceTypeId = resourceTypeId;
        this.types = types;
    }

    public MessageSubscriptionImpl() {
    }

    /**
     *
     */

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    /**
     *  <p>Must contain valid message types for the resource. For example, for resource type <code>product</code> the message type <code>ProductPublished</code> is valid. If no <code>types</code> of messages are given, the Subscription will receive all messages for this resource.</p>
     */

    public java.util.List<String> getTypes() {
        return this.types;
    }

    public void setResourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public void setTypes(final String... types) {
        this.types = new ArrayList<>(Arrays.asList(types));
    }

    public void setTypes(final java.util.List<String> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MessageSubscriptionImpl that = (MessageSubscriptionImpl) o;

        return new EqualsBuilder().append(resourceTypeId, that.resourceTypeId).append(types, that.types).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(resourceTypeId).append(types).toHashCode();
    }

}
