
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCustomFieldAction discountCodeSetCustomFieldAction = DiscountCodeSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetCustomFieldActionImpl.class)
public interface DiscountCodeSetCustomFieldAction extends DiscountCodeUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static DiscountCodeSetCustomFieldAction of() {
        return new DiscountCodeSetCustomFieldActionImpl();
    }

    public static DiscountCodeSetCustomFieldAction of(final DiscountCodeSetCustomFieldAction template) {
        DiscountCodeSetCustomFieldActionImpl instance = new DiscountCodeSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static DiscountCodeSetCustomFieldActionBuilder builder() {
        return DiscountCodeSetCustomFieldActionBuilder.of();
    }

    public static DiscountCodeSetCustomFieldActionBuilder builder(final DiscountCodeSetCustomFieldAction template) {
        return DiscountCodeSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetCustomFieldAction(Function<DiscountCodeSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetCustomFieldAction>";
            }
        };
    }
}
