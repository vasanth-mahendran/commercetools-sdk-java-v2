
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressCustomTypeAction cartSetBillingAddressCustomTypeAction = CartSetBillingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetBillingAddressCustomTypeActionBuilder implements Builder<CartSetBillingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     */

    public CartSetBillingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>billingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>billingAddress</code>.</p>
     */

    public CartSetBillingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     */

    public CartSetBillingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>billingAddress</code>.</p>
     */

    public CartSetBillingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CartSetBillingAddressCustomTypeAction build() {
        return new CartSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CartSetBillingAddressCustomTypeAction without checking for non null required values
     */
    public CartSetBillingAddressCustomTypeAction buildUnchecked() {
        return new CartSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    public static CartSetBillingAddressCustomTypeActionBuilder of() {
        return new CartSetBillingAddressCustomTypeActionBuilder();
    }

    public static CartSetBillingAddressCustomTypeActionBuilder of(
            final CartSetBillingAddressCustomTypeAction template) {
        CartSetBillingAddressCustomTypeActionBuilder builder = new CartSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
