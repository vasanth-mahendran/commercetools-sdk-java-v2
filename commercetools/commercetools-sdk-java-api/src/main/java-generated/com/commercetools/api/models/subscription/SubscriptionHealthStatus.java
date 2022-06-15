
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Types of current technical status of the Subscription.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionHealthStatus {

    /**
    	<p>Delivers messages as expected.</p>

    */
    SubscriptionHealthStatus HEALTHY = SubscriptionHealthStatusEnum.HEALTHY;
    /**
    	<p>Messages cannot be delivered with the current configuration. Common causes for the error are deleting the destination queue, deleting the access credentials, or removing the permission to push messages into the queue. The configuration can be fixed by re-creating the configuration on the destination side, or by setting a new configuration with the <a href="/../api/projects/subscriptions#change-destination">Change Destination</a> update action. If the configuration is fixed, undelivered messages will be delivered and the status will change to <code>Healthy</code>. <code>ConfigurationError</code> is automatically turned into <code>ConfigurationErrorDeliveryStopped</code> after some time. For more information, see <a href="#delivery-guarantees">Delivery Guarantees</a>.</p>

    */
    SubscriptionHealthStatus CONFIGURATION_ERROR = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR;
    /**
    	<p>Does not deliver messages with the current configuration and delivery of those is not attempted anymore. If the configuration is fixed in this status, undelivered messages are not retained and will not be delivered. The status will change to <code>Healthy</code> as soon as new messages can be delivered successfully again.</p>

    */
    SubscriptionHealthStatus CONFIGURATION_ERROR_DELIVERY_STOPPED = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR_DELIVERY_STOPPED;
    /**
    	<p>Does not deliver messages temporarily due to reasons other than the configuration. For example, the destination has a temporary outage.</p>

    */
    SubscriptionHealthStatus TEMPORARY_ERROR = SubscriptionHealthStatusEnum.TEMPORARY_ERROR;

    enum SubscriptionHealthStatusEnum implements SubscriptionHealthStatus {
        HEALTHY("Healthy"),

        CONFIGURATION_ERROR("ConfigurationError"),

        CONFIGURATION_ERROR_DELIVERY_STOPPED("ConfigurationErrorDeliveryStopped"),

        TEMPORARY_ERROR("TemporaryError");
        private final String jsonName;

        private SubscriptionHealthStatusEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static SubscriptionHealthStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SubscriptionHealthStatus() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<SubscriptionHealthStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static SubscriptionHealthStatus[] values() {
        return SubscriptionHealthStatusEnum.values();
    }
}
