
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CloudEventsFormat
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CloudEventsFormat cloudEventsFormat = CloudEventsFormat.builder()
 *             .cloudEventsVersion("{cloudEventsVersion}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CloudEventsFormatImpl.class)
public interface CloudEventsFormat extends DeliveryFormat {

    String CLOUD_EVENTS = "CloudEvents";

    /**
     *
     */
    @NotNull
    @JsonProperty("cloudEventsVersion")
    public String getCloudEventsVersion();

    public void setCloudEventsVersion(final String cloudEventsVersion);

    public static CloudEventsFormat of() {
        return new CloudEventsFormatImpl();
    }

    public static CloudEventsFormat of(final CloudEventsFormat template) {
        CloudEventsFormatImpl instance = new CloudEventsFormatImpl();
        instance.setCloudEventsVersion(template.getCloudEventsVersion());
        return instance;
    }

    public static CloudEventsFormatBuilder builder() {
        return CloudEventsFormatBuilder.of();
    }

    public static CloudEventsFormatBuilder builder(final CloudEventsFormat template) {
        return CloudEventsFormatBuilder.of(template);
    }

    default <T> T withCloudEventsFormat(Function<CloudEventsFormat, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CloudEventsFormat> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CloudEventsFormat>() {
            @Override
            public String toString() {
                return "TypeReference<CloudEventsFormat>";
            }
        };
    }
}
