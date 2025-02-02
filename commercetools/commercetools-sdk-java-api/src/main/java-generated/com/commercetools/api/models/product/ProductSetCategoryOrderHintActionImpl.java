
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ProductSetCategoryOrderHintAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetCategoryOrderHintActionImpl implements ProductSetCategoryOrderHintAction, ModelBase {

    private String action;

    private String categoryId;

    private String orderHint;

    private Boolean staged;

    @JsonCreator
    ProductSetCategoryOrderHintActionImpl(@JsonProperty("categoryId") final String categoryId,
            @JsonProperty("orderHint") final String orderHint, @JsonProperty("staged") final Boolean staged) {
        this.categoryId = categoryId;
        this.orderHint = orderHint;
        this.staged = staged;
        this.action = SET_CATEGORY_ORDER_HINT;
    }

    public ProductSetCategoryOrderHintActionImpl() {
        this.action = SET_CATEGORY_ORDER_HINT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     *
     */

    public String getOrderHint() {
        return this.orderHint;
    }

    /**
     *
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setCategoryId(final String categoryId) {
        this.categoryId = categoryId;
    }

    public void setOrderHint(final String orderHint) {
        this.orderHint = orderHint;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetCategoryOrderHintActionImpl that = (ProductSetCategoryOrderHintActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(categoryId, that.categoryId)
                .append(orderHint, that.orderHint)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(categoryId)
                .append(orderHint)
                .append(staged)
                .toHashCode();
    }

}
