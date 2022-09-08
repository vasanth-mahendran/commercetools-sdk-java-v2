package com.commercetools.api.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WildcardImpl implements Wildcard {

    private boolean caseInsensitive;
    private String field;
    private String value;

    public WildcardImpl(@JsonProperty("caseInsensitive") final boolean caseInsensitive,
            @JsonProperty("field") final String field, @JsonProperty("value") final String value) {
        this.caseInsensitive = caseInsensitive;
        this.field = field;
        this.value = value;
    }

    public boolean getCaseInsensitive() {
        return caseInsensitive;
    }

    @Override public void setCaseInsensitive(boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    @Override public String getField() {
        return field;
    }

    @Override public void setField(String field) {
        this.field = field;
    }

    @Override public String getValue() {
        return value;
    }

    @Override public void setValue(String value) {
        this.value = value;
    }
}
