
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentAddInterfaceInteractionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAddInterfaceInteractionAction paymentAddInterfaceInteractionAction = PaymentAddInterfaceInteractionAction.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentAddInterfaceInteractionActionBuilder implements Builder<PaymentAddInterfaceInteractionAction> {

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *
     */

    public PaymentAddInterfaceInteractionActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentAddInterfaceInteractionActionBuilder type(
            final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *
     */

    public PaymentAddInterfaceInteractionActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentAddInterfaceInteractionActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public PaymentAddInterfaceInteractionAction build() {
        Objects.requireNonNull(type, PaymentAddInterfaceInteractionAction.class + ": type is missing");
        return new PaymentAddInterfaceInteractionActionImpl(type, fields);
    }

    /**
     * builds PaymentAddInterfaceInteractionAction without checking for non null required values
     */
    public PaymentAddInterfaceInteractionAction buildUnchecked() {
        return new PaymentAddInterfaceInteractionActionImpl(type, fields);
    }

    public static PaymentAddInterfaceInteractionActionBuilder of() {
        return new PaymentAddInterfaceInteractionActionBuilder();
    }

    public static PaymentAddInterfaceInteractionActionBuilder of(final PaymentAddInterfaceInteractionAction template) {
        PaymentAddInterfaceInteractionActionBuilder builder = new PaymentAddInterfaceInteractionActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
