package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Wildcard;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * OrderSearchQuery
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen") public class OrderSearchQueryImpl
        implements OrderSearchQuery, ModelBase {
    @JsonProperty("wildcard") private Wildcard wildcard;

    @JsonProperty("where") private String where;

    @JsonCreator OrderSearchQueryImpl() {
    }

    public OrderSearchQueryImpl(@JsonProperty("wildcard") final Wildcard wildcard,@JsonProperty("where") final String where) {
        this.wildcard = wildcard;
        this.where = where;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSearchQueryImpl that = (OrderSearchQueryImpl) o;

        return new EqualsBuilder().isEquals();
    }

    @Override public int hashCode() {
        return new HashCodeBuilder(17, 37).toHashCode();
    }

    public Wildcard getWildcard() {
        return wildcard;
    }

    public void setWildcard(Wildcard wildcard) {
        this.wildcard = wildcard;
    }

    @Override public String getWhere() {
        return where;
    }

    @Override public void setWhere(String string) {
        this.where = where;
    }
}
