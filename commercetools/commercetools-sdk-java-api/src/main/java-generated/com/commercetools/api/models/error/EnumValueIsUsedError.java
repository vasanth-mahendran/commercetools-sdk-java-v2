
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumValueIsUsedError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumValueIsUsedError enumValueIsUsedError = EnumValueIsUsedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumValueIsUsedErrorImpl.class)
public interface EnumValueIsUsedError extends ErrorObject {

    String ENUM_VALUE_IS_USED = "EnumValueIsUsed";

    public static EnumValueIsUsedError of() {
        return new EnumValueIsUsedErrorImpl();
    }

    public static EnumValueIsUsedError of(final EnumValueIsUsedError template) {
        EnumValueIsUsedErrorImpl instance = new EnumValueIsUsedErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static EnumValueIsUsedErrorBuilder builder() {
        return EnumValueIsUsedErrorBuilder.of();
    }

    public static EnumValueIsUsedErrorBuilder builder(final EnumValueIsUsedError template) {
        return EnumValueIsUsedErrorBuilder.of(template);
    }

    default <T> T withEnumValueIsUsedError(Function<EnumValueIsUsedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EnumValueIsUsedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumValueIsUsedError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumValueIsUsedError>";
            }
        };
    }
}
