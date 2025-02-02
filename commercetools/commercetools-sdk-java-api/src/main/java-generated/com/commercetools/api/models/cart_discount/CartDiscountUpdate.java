
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountUpdate cartDiscountUpdate = CartDiscountUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountUpdateImpl.class)
public interface CartDiscountUpdate extends
        com.commercetools.api.models.ResourceUpdate<CartDiscountUpdate, CartDiscountUpdateAction, CartDiscountUpdateBuilder> {

    /**
     *  <p>Expected version of the CartDiscount on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CartDiscountUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CartDiscountUpdateAction... actions);

    public void setActions(final List<CartDiscountUpdateAction> actions);

    public static CartDiscountUpdate of() {
        return new CartDiscountUpdateImpl();
    }

    public static CartDiscountUpdate of(final CartDiscountUpdate template) {
        CartDiscountUpdateImpl instance = new CartDiscountUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CartDiscountUpdateBuilder builder() {
        return CartDiscountUpdateBuilder.of();
    }

    public static CartDiscountUpdateBuilder builder(final CartDiscountUpdate template) {
        return CartDiscountUpdateBuilder.of(template);
    }

    default <T> T withCartDiscountUpdate(Function<CartDiscountUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountUpdate>";
            }
        };
    }
}
