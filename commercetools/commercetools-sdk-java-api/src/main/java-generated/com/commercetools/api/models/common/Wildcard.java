package com.commercetools.api.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Wildcard {
    @JsonProperty("caseInsensitive") public boolean getCaseInsensitive();

    @JsonProperty("field") public String getField();

    @JsonProperty("value") public String getValue();

    public void setCaseInsensitive(final boolean caseInsensitive);

    public void setField(final String field);

    public void setValue(final String value);

    public static WildcardBuilder builder() {
        return WildcardBuilder.of();
    }

}
