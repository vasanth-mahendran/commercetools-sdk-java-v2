
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeReference discountCodeReference = DiscountCodeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeReferenceBuilder implements Builder<DiscountCodeReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.discount_code.DiscountCode obj;

    /**
     *  <p>Unique identifier of the referenced DiscountCode.</p>
     */

    public DiscountCodeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded DiscountCode. Only present in responses to requests with Reference Expansion for DiscountCodes.</p>
     */

    public DiscountCodeReferenceBuilder obj(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded DiscountCode. Only present in responses to requests with Reference Expansion for DiscountCodes.</p>
     */

    public DiscountCodeReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.discount_code.DiscountCode obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.discount_code.DiscountCode getObj() {
        return this.obj;
    }

    public DiscountCodeReference build() {
        Objects.requireNonNull(id, DiscountCodeReference.class + ": id is missing");
        return new DiscountCodeReferenceImpl(id, obj);
    }

    /**
     * builds DiscountCodeReference without checking for non null required values
     */
    public DiscountCodeReference buildUnchecked() {
        return new DiscountCodeReferenceImpl(id, obj);
    }

    public static DiscountCodeReferenceBuilder of() {
        return new DiscountCodeReferenceBuilder();
    }

    public static DiscountCodeReferenceBuilder of(final DiscountCodeReference template) {
        DiscountCodeReferenceBuilder builder = new DiscountCodeReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
