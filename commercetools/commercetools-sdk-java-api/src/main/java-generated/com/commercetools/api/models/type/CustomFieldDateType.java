
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for Date values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldDateType customFieldDateType = CustomFieldDateType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldDateTypeImpl.class)
public interface CustomFieldDateType extends FieldType {

    String DATE = "Date";

    public static CustomFieldDateType of() {
        return new CustomFieldDateTypeImpl();
    }

    public static CustomFieldDateType of(final CustomFieldDateType template) {
        CustomFieldDateTypeImpl instance = new CustomFieldDateTypeImpl();
        return instance;
    }

    public static CustomFieldDateTypeBuilder builder() {
        return CustomFieldDateTypeBuilder.of();
    }

    public static CustomFieldDateTypeBuilder builder(final CustomFieldDateType template) {
        return CustomFieldDateTypeBuilder.of(template);
    }

    default <T> T withCustomFieldDateType(Function<CustomFieldDateType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldDateType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldDateType>";
            }
        };
    }
}
