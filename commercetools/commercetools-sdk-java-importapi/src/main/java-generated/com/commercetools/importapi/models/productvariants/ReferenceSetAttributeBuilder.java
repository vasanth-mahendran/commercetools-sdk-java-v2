
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceSetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceSetAttribute referenceSetAttribute = ReferenceSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferenceSetAttributeBuilder implements Builder<ReferenceSetAttribute> {

    @Nullable
    private String name;

    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public ReferenceSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     */

    public ReferenceSetAttributeBuilder value(final com.commercetools.importapi.models.common.KeyReference... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     */

    public ReferenceSetAttributeBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public ReferenceSetAttributeBuilder plusValue(
            final com.commercetools.importapi.models.common.KeyReference... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *
     */

    public ReferenceSetAttributeBuilder plusValue(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public ReferenceSetAttributeBuilder withValue(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue() {
        return this.value;
    }

    public ReferenceSetAttribute build() {
        Objects.requireNonNull(value, ReferenceSetAttribute.class + ": value is missing");
        return new ReferenceSetAttributeImpl(name, value);
    }

    /**
     * builds ReferenceSetAttribute without checking for non null required values
     */
    public ReferenceSetAttribute buildUnchecked() {
        return new ReferenceSetAttributeImpl(name, value);
    }

    public static ReferenceSetAttributeBuilder of() {
        return new ReferenceSetAttributeBuilder();
    }

    public static ReferenceSetAttributeBuilder of(final ReferenceSetAttribute template) {
        ReferenceSetAttributeBuilder builder = new ReferenceSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
