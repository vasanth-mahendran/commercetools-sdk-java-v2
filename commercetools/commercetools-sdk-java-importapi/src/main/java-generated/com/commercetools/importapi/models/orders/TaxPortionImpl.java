package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.TypedMoney;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxPortionImpl implements TaxPortion {

    private String name;
    
    private Double rate;
    
    private com.commercetools.importapi.models.common.TypedMoney amount;

    @JsonCreator
    TaxPortionImpl(@JsonProperty("name") final String name, @JsonProperty("rate") final Double rate, @JsonProperty("amount") final com.commercetools.importapi.models.common.TypedMoney amount) {
        this.name = name;
        this.rate = rate;
        this.amount = amount;
    }
    public TaxPortionImpl() {
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public Double getRate(){
        return this.rate;
    }
    
    
    public com.commercetools.importapi.models.common.TypedMoney getAmount(){
        return this.amount;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setRate(final Double rate){
        this.rate = rate;
    }
    
    public void setAmount(final com.commercetools.importapi.models.common.TypedMoney amount){
        this.amount = amount;
    }

}
