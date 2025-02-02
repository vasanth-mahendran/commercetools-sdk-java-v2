
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateAction updateAction = UpdateAction.builder()
 *             .action("{action}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdateActionBuilder implements Builder<UpdateAction> {

    private String action;

    /**
     *
     */

    public UpdateActionBuilder action(final String action) {
        this.action = action;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public UpdateAction build() {
        Objects.requireNonNull(action, UpdateAction.class + ": action is missing");
        return new UpdateActionImpl(action);
    }

    /**
     * builds UpdateAction without checking for non null required values
     */
    public UpdateAction buildUnchecked() {
        return new UpdateActionImpl(action);
    }

    public static UpdateActionBuilder of() {
        return new UpdateActionBuilder();
    }

    public static UpdateActionBuilder of(final UpdateAction template) {
        UpdateActionBuilder builder = new UpdateActionBuilder();
        builder.action = template.getAction();
        return builder;
    }

}
