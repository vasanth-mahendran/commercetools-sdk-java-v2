package com.commercetools.api.models.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Sort {
    @JsonProperty("field") public String getField();

    @JsonProperty("order") public String getOrder();

    public static SortBuilder builder() {
        return SortBuilder.of();
    }
}
