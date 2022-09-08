package com.commercetools.api.models.order;

import io.vrap.rmf.base.client.Builder;

public class SortBuilder implements Builder<Sort> {
    private String field;
    private String order;

    @Override public Sort build() {
        return new SortImpl(this.field,this.order);
    }

    public static SortBuilder of() {
        return new SortBuilder();
    }

    public SortBuilder field(String field){
        this.field=field;
        return this;
    }

    public SortBuilder order(String order){
        this.order=order;
        return this;
    }

}
