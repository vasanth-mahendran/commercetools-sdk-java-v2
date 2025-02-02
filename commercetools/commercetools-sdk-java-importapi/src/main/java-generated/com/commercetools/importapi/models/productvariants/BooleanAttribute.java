
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents an attribute whose value is either "true" or "false".</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanAttribute booleanAttribute = BooleanAttribute.builder()
 *             .value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BooleanAttributeImpl.class)
public interface BooleanAttribute extends Attribute {

    String BOOLEAN = "boolean";

    /**
     *
     */
    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    public void setValue(final Boolean value);

    public static BooleanAttribute of() {
        return new BooleanAttributeImpl();
    }

    public static BooleanAttribute of(final BooleanAttribute template) {
        BooleanAttributeImpl instance = new BooleanAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static BooleanAttributeBuilder builder() {
        return BooleanAttributeBuilder.of();
    }

    public static BooleanAttributeBuilder builder(final BooleanAttribute template) {
        return BooleanAttributeBuilder.of(template);
    }

    default <T> T withBooleanAttribute(Function<BooleanAttribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BooleanAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BooleanAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<BooleanAttribute>";
            }
        };
    }
}
