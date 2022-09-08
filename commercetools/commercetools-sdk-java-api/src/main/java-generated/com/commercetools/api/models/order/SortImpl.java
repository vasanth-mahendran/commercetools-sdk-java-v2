package com.commercetools.api.models.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SortImpl implements Sort {
    private String field;
    private String order;

    public SortImpl(@JsonProperty("field") final String field, @JsonProperty("order") final String order) {
        this.field = field;
        this.order = order;
    }

    @Override public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
