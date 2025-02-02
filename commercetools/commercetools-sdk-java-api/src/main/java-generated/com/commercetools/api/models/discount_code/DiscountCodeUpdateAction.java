
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeUpdateAction discountCodeUpdateAction = DiscountCodeUpdateAction.changeCartDiscountsBuilder()
 *             plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl.class, name = DiscountCodeChangeCartDiscountsAction.CHANGE_CART_DISCOUNTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionImpl.class, name = DiscountCodeChangeGroupsAction.CHANGE_GROUPS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionImpl.class, name = DiscountCodeChangeIsActiveAction.CHANGE_IS_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionImpl.class, name = DiscountCodeSetCartPredicateAction.SET_CART_PREDICATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionImpl.class, name = DiscountCodeSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionImpl.class, name = DiscountCodeSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionImpl.class, name = DiscountCodeSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl.class, name = DiscountCodeSetMaxApplicationsAction.SET_MAX_APPLICATIONS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class, name = DiscountCodeSetMaxApplicationsPerCustomerAction.SET_MAX_APPLICATIONS_PER_CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl.class, name = DiscountCodeSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionImpl.class, name = DiscountCodeSetValidFromAction.SET_VALID_FROM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl.class, name = DiscountCodeSetValidFromAndUntilAction.SET_VALID_FROM_AND_UNTIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionImpl.class, name = DiscountCodeSetValidUntilAction.SET_VALID_UNTIL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = DiscountCodeUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = DiscountCodeUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountCodeUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<DiscountCodeUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionBuilder changeCartDiscountsBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionBuilder changeGroupsBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionBuilder changeIsActiveBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionBuilder setCartPredicateBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionBuilder setMaxApplicationsBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionBuilder setMaxApplicationsPerCustomerBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetNameActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetValidFromActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionBuilder.of();
    }

    public static com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilActionBuilder.of();
    }

    default <T> T withDiscountCodeUpdateAction(Function<DiscountCodeUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeUpdateAction>";
            }
        };
    }
}
