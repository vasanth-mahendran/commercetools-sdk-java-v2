
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with a time value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeField timeField = TimeField.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TimeFieldImpl.class)
public interface TimeField extends CustomField {

    String TIME = "Time";

    /**
     *
     */
    @NotNull
    @JsonProperty("value")
    public LocalTime getValue();

    public void setValue(final LocalTime value);

    public static TimeField of() {
        return new TimeFieldImpl();
    }

    public static TimeField of(final TimeField template) {
        TimeFieldImpl instance = new TimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static TimeFieldBuilder builder() {
        return TimeFieldBuilder.of();
    }

    public static TimeFieldBuilder builder(final TimeField template) {
        return TimeFieldBuilder.of(template);
    }

    default <T> T withTimeField(Function<TimeField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TimeField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeField>() {
            @Override
            public String toString() {
                return "TypeReference<TimeField>";
            }
        };
    }
}
