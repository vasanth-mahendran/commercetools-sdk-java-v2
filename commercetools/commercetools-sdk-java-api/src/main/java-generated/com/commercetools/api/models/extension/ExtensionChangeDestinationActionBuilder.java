
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionChangeDestinationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChangeDestinationAction extensionChangeDestinationAction = ExtensionChangeDestinationAction.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionChangeDestinationActionBuilder implements Builder<ExtensionChangeDestinationAction> {

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ExtensionChangeDestinationActionBuilder destination(
            final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ExtensionChangeDestinationActionBuilder destination(
            Function<com.commercetools.api.models.extension.ExtensionDestinationBuilder, Builder<? extends com.commercetools.api.models.extension.ExtensionDestination>> builder) {
        this.destination = builder.apply(com.commercetools.api.models.extension.ExtensionDestinationBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.extension.ExtensionDestination getDestination() {
        return this.destination;
    }

    public ExtensionChangeDestinationAction build() {
        Objects.requireNonNull(destination, ExtensionChangeDestinationAction.class + ": destination is missing");
        return new ExtensionChangeDestinationActionImpl(destination);
    }

    /**
     * builds ExtensionChangeDestinationAction without checking for non null required values
     */
    public ExtensionChangeDestinationAction buildUnchecked() {
        return new ExtensionChangeDestinationActionImpl(destination);
    }

    public static ExtensionChangeDestinationActionBuilder of() {
        return new ExtensionChangeDestinationActionBuilder();
    }

    public static ExtensionChangeDestinationActionBuilder of(final ExtensionChangeDestinationAction template) {
        ExtensionChangeDestinationActionBuilder builder = new ExtensionChangeDestinationActionBuilder();
        builder.destination = template.getDestination();
        return builder;
    }

}
