
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Field type for LocalizedString values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedStringType customFieldLocalizedStringType = CustomFieldLocalizedStringType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldLocalizedStringTypeImpl.class)
public interface CustomFieldLocalizedStringType extends FieldType {

    String LOCALIZED_STRING = "LocalizedString";

    public static CustomFieldLocalizedStringType of() {
        return new CustomFieldLocalizedStringTypeImpl();
    }

    public static CustomFieldLocalizedStringType of(final CustomFieldLocalizedStringType template) {
        CustomFieldLocalizedStringTypeImpl instance = new CustomFieldLocalizedStringTypeImpl();
        return instance;
    }

    public static CustomFieldLocalizedStringTypeBuilder builder() {
        return CustomFieldLocalizedStringTypeBuilder.of();
    }

    public static CustomFieldLocalizedStringTypeBuilder builder(final CustomFieldLocalizedStringType template) {
        return CustomFieldLocalizedStringTypeBuilder.of(template);
    }

    default <T> T withCustomFieldLocalizedStringType(Function<CustomFieldLocalizedStringType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedStringType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedStringType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldLocalizedStringType>";
            }
        };
    }
}
