
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a payment by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentKeyReference paymentKeyReference = PaymentKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentKeyReferenceImpl.class)
public interface PaymentKeyReference extends KeyReference {

    String PAYMENT = "payment";

    public static PaymentKeyReference of() {
        return new PaymentKeyReferenceImpl();
    }

    public static PaymentKeyReference of(final PaymentKeyReference template) {
        PaymentKeyReferenceImpl instance = new PaymentKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentKeyReferenceBuilder builder() {
        return PaymentKeyReferenceBuilder.of();
    }

    public static PaymentKeyReferenceBuilder builder(final PaymentKeyReference template) {
        return PaymentKeyReferenceBuilder.of(template);
    }

    default <T> T withPaymentKeyReference(Function<PaymentKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentKeyReference>";
            }
        };
    }
}
