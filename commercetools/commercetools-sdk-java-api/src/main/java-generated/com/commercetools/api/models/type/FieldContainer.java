
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldContainer
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldContainer fieldContainer = FieldContainer.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FieldContainerImpl.class)
public interface FieldContainer {

    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    @JsonAnySetter
    public void setValue(String key, Object value);

    public static FieldContainer of() {
        return new FieldContainerImpl();
    }

    public static FieldContainer of(final FieldContainer template) {
        FieldContainerImpl instance = new FieldContainerImpl();
        return instance;
    }

    public static FieldContainerBuilder builder() {
        return FieldContainerBuilder.of();
    }

    public static FieldContainerBuilder builder(final FieldContainer template) {
        return FieldContainerBuilder.of(template);
    }

    default <T> T withFieldContainer(Function<FieldContainer, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FieldContainer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldContainer>() {
            @Override
            public String toString() {
                return "TypeReference<FieldContainer>";
            }
        };
    }
}
