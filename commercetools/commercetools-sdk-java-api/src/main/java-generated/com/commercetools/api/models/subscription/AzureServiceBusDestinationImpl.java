
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
 *  <p>Azure Service Bus can be used as a pull-queue with Queues, or to fan-out messages with Topics and Subscriptions.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AzureServiceBusDestinationImpl implements AzureServiceBusDestination, ModelBase {

    private String type;

    private String connectionString;

    @JsonCreator
    AzureServiceBusDestinationImpl(@JsonProperty("connectionString") final String connectionString) {
        this.connectionString = connectionString;
        this.type = AZURE_SERVICE_BUS;
    }

    public AzureServiceBusDestinationImpl() {
        this.type = AZURE_SERVICE_BUS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>SharedAccessKey is partially hidden on retrieval for security reasons.</p>
     */

    public String getConnectionString() {
        return this.connectionString;
    }

    public void setConnectionString(final String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AzureServiceBusDestinationImpl that = (AzureServiceBusDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(connectionString, that.connectionString).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(connectionString).toHashCode();
    }

}
