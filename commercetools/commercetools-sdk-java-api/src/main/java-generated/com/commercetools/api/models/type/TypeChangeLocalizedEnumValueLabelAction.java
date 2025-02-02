
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the <code>label</code> of a LocalizedEnumValue of a LocalizedEnumType FieldDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeLocalizedEnumValueLabelAction typeChangeLocalizedEnumValueLabelAction = TypeChangeLocalizedEnumValueLabelAction.builder()
 *             .fieldName("{fieldName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeLocalizedEnumValueLabelActionImpl.class)
public interface TypeChangeLocalizedEnumValueLabelAction extends TypeUpdateAction {

    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL = "changeLocalizedEnumValueLabel";

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldLocalizedEnumValue getValue();

    public void setFieldName(final String fieldName);

    public void setValue(final CustomFieldLocalizedEnumValue value);

    public static TypeChangeLocalizedEnumValueLabelAction of() {
        return new TypeChangeLocalizedEnumValueLabelActionImpl();
    }

    public static TypeChangeLocalizedEnumValueLabelAction of(final TypeChangeLocalizedEnumValueLabelAction template) {
        TypeChangeLocalizedEnumValueLabelActionImpl instance = new TypeChangeLocalizedEnumValueLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeChangeLocalizedEnumValueLabelActionBuilder builder() {
        return TypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }

    public static TypeChangeLocalizedEnumValueLabelActionBuilder builder(
            final TypeChangeLocalizedEnumValueLabelAction template) {
        return TypeChangeLocalizedEnumValueLabelActionBuilder.of(template);
    }

    default <T> T withTypeChangeLocalizedEnumValueLabelAction(
            Function<TypeChangeLocalizedEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeLocalizedEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeLocalizedEnumValueLabelAction>";
            }
        };
    }
}
