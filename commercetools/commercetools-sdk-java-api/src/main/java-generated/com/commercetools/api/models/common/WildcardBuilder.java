package com.commercetools.api.models.common;

import io.vrap.rmf.base.client.Builder;

public class WildcardBuilder implements Builder<Wildcard> {
    private boolean caseInsensitive;
    private String field;
    private String value;

    @Override public Wildcard build() {
        return new WildcardImpl(caseInsensitive, field, value);
    }

    public static WildcardBuilder of() {
        return new WildcardBuilder();
    }

    public WildcardBuilder caseInsensitive(boolean caseInsensitive){
        this.caseInsensitive=caseInsensitive;
        return this;
    }

    public WildcardBuilder field(String field){
        this.field=field;
        return this;
    }

    public WildcardBuilder value(String value){
        this.value=value;
        return this;
    }

}
