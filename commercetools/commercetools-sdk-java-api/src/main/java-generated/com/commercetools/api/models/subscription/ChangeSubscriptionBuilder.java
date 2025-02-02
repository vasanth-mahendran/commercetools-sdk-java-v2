
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeSubscriptionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSubscription changeSubscription = ChangeSubscription.builder()
 *             .resourceTypeId("{resourceTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeSubscriptionBuilder implements Builder<ChangeSubscription> {

    private String resourceTypeId;

    /**
     *
     */

    public ChangeSubscriptionBuilder resourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    public ChangeSubscription build() {
        Objects.requireNonNull(resourceTypeId, ChangeSubscription.class + ": resourceTypeId is missing");
        return new ChangeSubscriptionImpl(resourceTypeId);
    }

    /**
     * builds ChangeSubscription without checking for non null required values
     */
    public ChangeSubscription buildUnchecked() {
        return new ChangeSubscriptionImpl(resourceTypeId);
    }

    public static ChangeSubscriptionBuilder of() {
        return new ChangeSubscriptionBuilder();
    }

    public static ChangeSubscriptionBuilder of(final ChangeSubscription template) {
        ChangeSubscriptionBuilder builder = new ChangeSubscriptionBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        return builder;
    }

}
