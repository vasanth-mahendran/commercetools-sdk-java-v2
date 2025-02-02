
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPropertyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPropertyChange addPropertyChange = AddPropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPropertyChangeBuilder implements Builder<AddPropertyChange> {

    private String change;

    private String path;

    private java.lang.Object nextValue;

    /**
     *  <p>Update action for <code>addProperty</code> on custom objects</p>
     */

    public AddPropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value path to the property that was added</p>
     */

    public AddPropertyChangeBuilder path(final String path) {
        this.path = path;
        return this;
    }

    /**
     *
     */

    public AddPropertyChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPath() {
        return this.path;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public AddPropertyChange build() {
        Objects.requireNonNull(change, AddPropertyChange.class + ": change is missing");
        Objects.requireNonNull(path, AddPropertyChange.class + ": path is missing");
        Objects.requireNonNull(nextValue, AddPropertyChange.class + ": nextValue is missing");
        return new AddPropertyChangeImpl(change, path, nextValue);
    }

    /**
     * builds AddPropertyChange without checking for non null required values
     */
    public AddPropertyChange buildUnchecked() {
        return new AddPropertyChangeImpl(change, path, nextValue);
    }

    public static AddPropertyChangeBuilder of() {
        return new AddPropertyChangeBuilder();
    }

    public static AddPropertyChangeBuilder of(final AddPropertyChange template) {
        AddPropertyChangeBuilder builder = new AddPropertyChangeBuilder();
        builder.change = template.getChange();
        builder.path = template.getPath();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
