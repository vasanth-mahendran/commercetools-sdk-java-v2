package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeChangeCartDiscountsAction;
import com.commercetools.models.discount_code.DiscountCodeChangeGroupsAction;
import com.commercetools.models.discount_code.DiscountCodeChangeIsActiveAction;
import com.commercetools.models.discount_code.DiscountCodeSetCartPredicateAction;
import com.commercetools.models.discount_code.DiscountCodeSetCustomFieldAction;
import com.commercetools.models.discount_code.DiscountCodeSetCustomTypeAction;
import com.commercetools.models.discount_code.DiscountCodeSetDescriptionAction;
import com.commercetools.models.discount_code.DiscountCodeSetMaxApplicationsAction;
import com.commercetools.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction;
import com.commercetools.models.discount_code.DiscountCodeSetNameAction;
import com.commercetools.models.discount_code.DiscountCodeSetValidFromAction;
import com.commercetools.models.discount_code.DiscountCodeSetValidFromAndUntilAction;
import com.commercetools.models.discount_code.DiscountCodeSetValidUntilAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl.class, name = "changeCartDiscounts"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeChangeGroupsActionImpl.class, name = "changeGroups"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeChangeIsActiveActionImpl.class, name = "changeIsActive"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetCartPredicateActionImpl.class, name = "setCartPredicate"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl.class, name = "setMaxApplications"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class, name = "setMaxApplicationsPerCustomer"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetValidFromActionImpl.class, name = "setValidFrom"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl.class, name = "setValidFromAndUntil"),
   @JsonSubTypes.Type(value = com.commercetools.models.discount_code.DiscountCodeSetValidUntilActionImpl.class, name = "setValidUntil")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface DiscountCodeUpdateAction  {


   


}