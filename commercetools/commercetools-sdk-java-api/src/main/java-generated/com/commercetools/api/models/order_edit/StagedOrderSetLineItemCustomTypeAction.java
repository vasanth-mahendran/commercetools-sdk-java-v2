
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemCustomTypeAction stagedOrderSetLineItemCustomTypeAction = StagedOrderSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetLineItemCustomTypeAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the LineItem.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the LineItem.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetLineItemCustomTypeAction of() {
        return new StagedOrderSetLineItemCustomTypeActionImpl();
    }

    public static StagedOrderSetLineItemCustomTypeAction of(final StagedOrderSetLineItemCustomTypeAction template) {
        StagedOrderSetLineItemCustomTypeActionImpl instance = new StagedOrderSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetLineItemCustomTypeActionBuilder builder() {
        return StagedOrderSetLineItemCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetLineItemCustomTypeActionBuilder builder(
            final StagedOrderSetLineItemCustomTypeAction template) {
        return StagedOrderSetLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemCustomTypeAction(
            Function<StagedOrderSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemCustomTypeAction>";
            }
        };
    }
}
