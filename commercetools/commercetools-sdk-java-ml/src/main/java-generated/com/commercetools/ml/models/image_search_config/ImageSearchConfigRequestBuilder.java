
package com.commercetools.ml.models.image_search_config;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchConfigRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchConfigRequest imageSearchConfigRequest = ImageSearchConfigRequest.builder()
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageSearchConfigRequestBuilder implements Builder<ImageSearchConfigRequest> {

    private java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions;

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     */

    public ImageSearchConfigRequestBuilder actions(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     */

    public ImageSearchConfigRequestBuilder actions(
            final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     */

    public ImageSearchConfigRequestBuilder plusActions(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     */

    public ImageSearchConfigRequestBuilder plusActions(
            Function<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder, Builder<? extends com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     */

    public ImageSearchConfigRequestBuilder withActions(
            Function<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder, Builder<? extends com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder.of())
                    .build());
        return this;
    }

    public java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> getActions() {
        return this.actions;
    }

    public ImageSearchConfigRequest build() {
        Objects.requireNonNull(actions, ImageSearchConfigRequest.class + ": actions is missing");
        return new ImageSearchConfigRequestImpl(actions);
    }

    /**
     * builds ImageSearchConfigRequest without checking for non null required values
     */
    public ImageSearchConfigRequest buildUnchecked() {
        return new ImageSearchConfigRequestImpl(actions);
    }

    public static ImageSearchConfigRequestBuilder of() {
        return new ImageSearchConfigRequestBuilder();
    }

    public static ImageSearchConfigRequestBuilder of(final ImageSearchConfigRequest template) {
        ImageSearchConfigRequestBuilder builder = new ImageSearchConfigRequestBuilder();
        builder.actions = template.getActions();
        return builder;
    }

}
