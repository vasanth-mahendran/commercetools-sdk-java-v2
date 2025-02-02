
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemCustomFieldChange setTextLineItemCustomFieldChange = SetTextLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTextLineItemCustomFieldChangeBuilder implements Builder<SetTextLineItemCustomFieldChange> {

    private String change;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for <code>setTextLineItemCustomField</code></p>
     */

    public SetTextLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetTextLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public SetTextLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *
     */

    public SetTextLineItemCustomFieldChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public SetTextLineItemCustomFieldChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    /**
     *
     */

    public SetTextLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public SetTextLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetTextLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetTextLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetTextLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetTextLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemCustomFieldChange.class + ": textLineItem is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemCustomFieldChange.class + ": previousValue is missing");
        return new SetTextLineItemCustomFieldChangeImpl(change, name, customTypeId, textLineItem, nextValue,
            previousValue);
    }

    /**
     * builds SetTextLineItemCustomFieldChange without checking for non null required values
     */
    public SetTextLineItemCustomFieldChange buildUnchecked() {
        return new SetTextLineItemCustomFieldChangeImpl(change, name, customTypeId, textLineItem, nextValue,
            previousValue);
    }

    public static SetTextLineItemCustomFieldChangeBuilder of() {
        return new SetTextLineItemCustomFieldChangeBuilder();
    }

    public static SetTextLineItemCustomFieldChangeBuilder of(final SetTextLineItemCustomFieldChange template) {
        SetTextLineItemCustomFieldChangeBuilder builder = new SetTextLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
